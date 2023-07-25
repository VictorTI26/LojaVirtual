package model;

import model.Produto;

import javax.swing.*;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class TelaCadastroProduto extends JFrame {

    private JPanel contentPane;
    private JTextField tfNome;
    private JTextField tfPreco;
    private JComboBox<String> cbCategorias; // Novo JComboBox para as categorias
    private JTextField tfAvaliacao;
    private JTextField tfModelo;
    private JTextField tfMarca;
    private JTextField tfCor;
    private JTextField tfQuantidadeEstoque;
    private JTextField tfDescricao;
    private JTextField tfFoto;
    private JTextField tfLimiteCompra;
    private ArrayList<Produto> produtosDisponiveis;

    /**
     * Create the frame.
     */
    public TelaCadastroProduto(Cliente cliente) {
        produtosDisponiveis = new ArrayList<>();

        setTitle("Cadastro de Produto");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        contentPane = new JPanel();
        contentPane.setLayout(null);
        setContentPane(contentPane);

        JLabel lblNome = new JLabel("Nome:");
        lblNome.setBounds(20, 20, 80, 20);
        contentPane.add(lblNome);

        tfNome = new JTextField();
        tfNome.setBounds(100, 20, 200, 20);
        contentPane.add(tfNome);

        JLabel lblPreco = new JLabel("Preço:");
        lblPreco.setBounds(20, 50, 80, 20);
        contentPane.add(lblPreco);

        tfPreco = new JTextField();
        tfPreco.setBounds(100, 50, 100, 20);
        contentPane.add(tfPreco);

        JLabel lblCategoria = new JLabel("Categoria:");
        lblCategoria.setBounds(20, 80, 80, 20);
        contentPane.add(lblCategoria);

        cbCategorias = new JComboBox<>(); // Criando o JComboBox
        cbCategorias.setBounds(100, 80, 200, 20);
        contentPane.add(cbCategorias);

        // Adicionando as categorias pré-definidas ao JComboBox
        String[] categorias = {"Eletrônicos", "Roupas", "Acessórios", "Outros"};
        cbCategorias.setModel(new DefaultComboBoxModel<>(categorias));

        JLabel lblAvaliacao = new JLabel("Avaliação:");
        lblAvaliacao.setBounds(20, 110, 80, 20);
        contentPane.add(lblAvaliacao);

        tfAvaliacao = new JTextField();
        tfAvaliacao.setBounds(100, 110, 100, 20);
        contentPane.add(tfAvaliacao);

        JLabel lblModelo = new JLabel("Modelo:");
        lblModelo.setBounds(20, 140, 80, 20);
        contentPane.add(lblModelo);

        tfModelo = new JTextField();
        tfModelo.setBounds(100, 140, 200, 20);
        contentPane.add(tfModelo);

        JLabel lblMarca = new JLabel("Marca:");
        lblMarca.setBounds(20, 170, 80, 20);
        contentPane.add(lblMarca);

        tfMarca = new JTextField();
        tfMarca.setBounds(100, 170, 200, 20);
        contentPane.add(tfMarca);

        JLabel lblCor = new JLabel("Cor:");
        lblCor.setBounds(20, 200, 80, 20);
        contentPane.add(lblCor);

        tfCor = new JTextField();
        tfCor.setBounds(100, 200, 100, 20);
        contentPane.add(tfCor);

        JLabel lblQuantidadeEstoque = new JLabel("Quantidade Estoque:");
        lblQuantidadeEstoque.setBounds(20, 230, 150, 20);
        contentPane.add(lblQuantidadeEstoque);

        tfQuantidadeEstoque = new JTextField();
        tfQuantidadeEstoque.setBounds(160, 230, 100, 20);
        contentPane.add(tfQuantidadeEstoque);

        JLabel lblDescricao = new JLabel("Descrição:");
        lblDescricao.setBounds(20, 260, 80, 20);
        contentPane.add(lblDescricao);

        tfDescricao = new JTextField();
        tfDescricao.setBounds(100, 260, 200, 20);
        contentPane.add(tfDescricao);

        JLabel lblFoto = new JLabel("Foto:");
        lblFoto.setBounds(20, 290, 80, 20);
        contentPane.add(lblFoto);

        tfFoto = new JTextField();
        tfFoto.setBounds(100, 290, 200, 20);
        contentPane.add(tfFoto);

        JLabel lblLimiteCompra = new JLabel("Limite de Compra:");
        lblLimiteCompra.setBounds(20, 320, 120, 20);
        contentPane.add(lblLimiteCompra);

        tfLimiteCompra = new JTextField();
        tfLimiteCompra.setBounds(140, 320, 100, 20);
        contentPane.add(tfLimiteCompra);

        JButton btnCadastrar = new JButton("Cadastrar");
        btnCadastrar.setBounds(150, 350, 100, 25);
        contentPane.add(btnCadastrar);

        // Adicionando um ActionListener para o botão "Cadastrar"
        btnCadastrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cadastrarProduto();
            }
        });
    }

    // Método para cadastrar o produto com os valores fornecidos pelo usuário
    private void cadastrarProduto() {
        try {
            String nome = tfNome.getText();
            double preco = Double.parseDouble(tfPreco.getText());
            String categoria = cbCategorias.getSelectedItem().toString(); // Obtendo a categoria selecionada
            double avaliacao = Double.parseDouble(tfAvaliacao.getText());
            String modelo = tfModelo.getText();
            String marca = tfMarca.getText();
            String cor = tfCor.getText();
            int quantidadeEstoque = Integer.parseInt(tfQuantidadeEstoque.getText());
            String descricao = tfDescricao.getText();
            String foto = tfFoto.getText();
            int limiteCompra = Integer.parseInt(tfLimiteCompra.getText());

            // Criando o novo produto e adicionando-o à lista de produtos disponíveis
            Produto novoProduto = new Produto(foto, avaliacao, limiteCompra);
            novoProduto.setNome(nome);
            novoProduto.setPreco(preco);
            novoProduto.setCategoria(categoria);
            novoProduto.setAvaliacao(avaliacao);
            novoProduto.setModelo(modelo);
            novoProduto.setMarca(marca);
            novoProduto.setCor(cor);
            novoProduto.setQuantidadeEstoque(quantidadeEstoque);
            novoProduto.setDescricao(descricao);
            novoProduto.setFoto(foto);
            novoProduto.setLimiteCompra(limiteCompra);

            produtosDisponiveis.add(novoProduto);

            // Exibindo mensagem de sucesso
            JOptionPane.showMessageDialog(this, "Produto cadastrado com sucesso!");
            MainApp.abrirTelaCarrinho(null);
            
            // Limpando os campos após o cadastro
            limparCampos();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro ao cadastrar produto: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Método para limpar os campos após o cadastro
    private void limparCampos() {
        tfNome.setText("");
        tfPreco.setText("");
        cbCategorias.setSelectedIndex(0); // Selecionando a primeira categoria por padrão
        tfAvaliacao.setText("");
        tfModelo.setText("");
        tfMarca.setText("");
        tfCor.setText("");
        tfQuantidadeEstoque.setText("");
        tfDescricao.setText("");
        tfFoto.setText("");
        tfLimiteCompra.setText("");
    }

    // ... (código anterior)

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    TelaCadastroProduto frame = new TelaCadastroProduto(null);
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
