package model;

import javax.swing.*;

public class MainApp {

    public static void main(String[] args) {
        TelaCadastroCliente telaCadastroCliente = new TelaCadastroCliente();
        telaCadastroCliente.setVisible(true);
    }

    // Método para abrir a tela de cadastro de produto com o cliente cadastrado
    public static void cadastrarProduto(Cliente cliente) {
        TelaCadastroProduto telaCadastroProduto = new TelaCadastroProduto(cliente);
        telaCadastroProduto.setVisible(true);
    }

    // Método para abrir a tela de carrinho com o cliente cadastrado
    public static void abrirTelaCarrinho(Cliente cliente) {
        TelaCarrinho telaCarrinho = new TelaCarrinho(cliente);
        telaCarrinho.setVisible(true);
    }
}
