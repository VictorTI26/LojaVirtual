package model;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    private Cliente cliente;
    private List<ItemCarrinho> itens;

    public Carrinho(Cliente cliente) {
        this.cliente = cliente;
        this.itens = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto, int quantidade) {
        if (produto == null || quantidade <= 0) {
            throw new IllegalArgumentException("Produto inválido ou quantidade inválida.");
        }

        if (produto.getQuantidadeEstoque() < quantidade) {
            throw new IllegalArgumentException("Quantidade indisponível em estoque.");
        }

        ItemCarrinho itemExistente = encontrarItemNoCarrinho(produto);
        if (itemExistente != null) {
            int novaQuantidade = itemExistente.getQuantidade() + quantidade;
            if (produto.getQuantidadeEstoque() >= novaQuantidade) {
                itemExistente.setQuantidade(novaQuantidade);
            } else {
                throw new IllegalArgumentException("Quantidade indisponível em estoque.");
            }
        } else {
            itens.add(new ItemCarrinho(produto, quantidade));
        }
    }

    public void removerProduto(Produto produto, int quantidade) {
        if (produto == null || quantidade <= 0) {
            throw new IllegalArgumentException("Produto inválido ou quantidade inválida.");
        }

        ItemCarrinho itemExistente = encontrarItemNoCarrinho(produto);
        if (itemExistente != null) {
            int quantidadeAtual = itemExistente.getQuantidade();
            if (quantidade >= quantidadeAtual) {
                itens.remove(itemExistente);
            } else {
                itemExistente.setQuantidade(quantidadeAtual - quantidade);
            }
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemCarrinho item : itens) {
            total += item.getProduto().getPreco() * item.getQuantidade();
        }
        return total;
    }

    private ItemCarrinho encontrarItemNoCarrinho(Produto produto) {
        for (ItemCarrinho item : itens) {
            if (item.getProduto().equals(produto)) {
                return item;
            }
        }
        return null;
    }

    public class ItemCarrinho {
        private Produto produto;
        private int quantidade;

        public ItemCarrinho(Produto produto, int quantidade) {
            this.produto = produto;
            this.quantidade = quantidade;
        }

        public Produto getProduto() {
            return produto;
        }

        public int getQuantidade() {
            return quantidade;
        }

        public void setQuantidade(int quantidade) {
            this.quantidade = quantidade;
        }
    }
}
