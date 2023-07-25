package model;

import model.Carrinho;
import model.Produto;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class TelaCarrinho extends JFrame {

    private JComboBox<Produto> cbProdutos;
    private JTextField tfQuantidade;
    private JButton btnAdicionar;
    private JButton btnRemover;

    private Carrinho carrinho;
    private List<Produto> produtosDisponiveis;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                TelaCarrinho telaCarrinho = new TelaCarrinho(null);
                telaCarrinho.setVisible(true);
            }
        });
    }

    	public TelaCarrinho(Cliente cliente) {
            carrinho = new Carrinho(cliente);
            produtosDisponiveis = new ArrayList<>();

            setTitle("Cadastro de Produtos no Carrinho");
            setSize(400, 250);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JPanel contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblProduto = new JLabel("Produto:");
        lblProduto.setBounds(20, 20, 80, 20);
        contentPane.add(lblProduto);

        cbProdutos = new JComboBox<>();
        cbProdutos.setBounds(100, 20, 200, 20);
        contentPane.add(cbProdutos);

        JLabel lblQuantidade = new JLabel("Quantidade:");
        lblQuantidade.setBounds(20, 50, 80, 20);
        contentPane.add(lblQuantidade);

        tfQuantidade = new JTextField();
        tfQuantidade.setBounds(100, 50, 100, 20);
        contentPane.add(tfQuantidade);

        btnAdicionar = new JButton("Adicionar ao Carrinho");
        btnAdicionar.setBounds(60, 100, 180, 25);
        contentPane.add(btnAdicionar);

        btnAdicionar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adicionarProdutoAoCarrinho();
            }
        });

        btnRemover = new JButton("Remover do Carrinho");
        btnRemover.setBounds(240, 100, 180, 25);
        contentPane.add(btnRemover);

        btnRemover.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                removerProdutoDoCarrinho();
            }
        });
    }

    private void adicionarProdutoAoCarrinho() {
        Produto produtoSelecionado = (Produto) cbProdutos.getSelectedItem();
        int quantidade = Integer.parseInt(tfQuantidade.getText());

        try {
            carrinho.adicionarProduto(produtoSelecionado, quantidade);
            JOptionPane.showMessageDialog(this, "Produto adicionado ao carrinho com sucesso!");
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao adicionar produto ao carrinho: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void removerProdutoDoCarrinho() {
        Produto produtoSelecionado = (Produto) cbProdutos.getSelectedItem();
        int quantidade = Integer.parseInt(tfQuantidade.getText());

        try {
            carrinho.removerProduto(produtoSelecionado, quantidade);
            JOptionPane.showMessageDialog(this, "Produto removido do carrinho com sucesso!");
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao remover produto do carrinho: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
