package model;

import model.Cliente;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.ArrayList;

public class TelaCadastroCliente extends JFrame {

    private JTextField tfNome;
    private JTextField tfCpf;
    private JTextField tfEndereco;
    private JTextField tfTelefone;
    private JTextField tfEmail;
    private JTextField tfNascimento;
    private JTextField tfSenha;

    private ArrayList<Cliente> clientesCadastrados;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TelaCadastroCliente().setVisible(true);
            }
        });
    }

    public TelaCadastroCliente() {
        clientesCadastrados = new ArrayList<>();
        setTitle("Cadastro de Cliente");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNome = new JLabel("Nome:");
        lblNome.setBounds(20, 20, 80, 20);
        contentPane.add(lblNome);

        tfNome = new JTextField();
        tfNome.setBounds(100, 20, 200, 20);
        contentPane.add(tfNome);

        JLabel lblCpf = new JLabel("CPF:");
        lblCpf.setBounds(20, 50, 80, 20);
        contentPane.add(lblCpf);

        tfCpf = new JTextField();
        tfCpf.setBounds(100, 50, 200, 20);
        contentPane.add(tfCpf);

        JLabel lblEndereco = new JLabel("Endereço:");
        lblEndereco.setBounds(20, 80, 80, 20);
        contentPane.add(lblEndereco);

        tfEndereco = new JTextField();
        tfEndereco.setBounds(100, 80, 200, 20);
        contentPane.add(tfEndereco);

        JLabel lblTelefone = new JLabel("Telefone:");
        lblTelefone.setBounds(20, 110, 80, 20);
        contentPane.add(lblTelefone);

        tfTelefone = new JTextField();
        tfTelefone.setBounds(100, 110, 200, 20);
        contentPane.add(tfTelefone);

        JLabel lblEmail = new JLabel("Email:");
        lblEmail.setBounds(20, 140, 80, 20);
        contentPane.add(lblEmail);

        tfEmail = new JTextField();
        tfEmail.setBounds(100, 140, 200, 20);
        contentPane.add(tfEmail);

        JLabel lblNascimento = new JLabel("Data de Nascimento:");
        lblNascimento.setBounds(20, 170, 150, 20);
        contentPane.add(lblNascimento);

        tfNascimento = new JTextField();
        tfNascimento.setBounds(160, 170, 140, 20);
        contentPane.add(tfNascimento);

        JLabel lblSenha = new JLabel("Senha:");
        lblSenha.setBounds(20, 200, 80, 20);
        contentPane.add(lblSenha);

        tfSenha = new JTextField();
        tfSenha.setBounds(100, 200, 200, 20);
        contentPane.add(tfSenha);

        JButton btnCadastrar = new JButton("Cadastrar");
        btnCadastrar.setBounds(150, 230, 100, 25);
        contentPane.add(btnCadastrar);

        btnCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadastrarCliente();
            }
        });
    }

    private void cadastrarCliente() {
        String nome = tfNome.getText();
        String cpf = tfCpf.getText();
        String endereco = tfEndereco.getText();
        String telefone = tfTelefone.getText();
        String email = tfEmail.getText();
        String nascimento = tfNascimento.getText();
        String senha = tfSenha.getText();

        try {
            Cliente cliente = new Cliente(nome);
            cliente.setCpf(cpf);
            cliente.setEndereco(endereco);
            cliente.setTelefone(telefone);
            cliente.setEmail(email);
            cliente.setNascimento(nascimento);
            cliente.setSenha(senha);

            clientesCadastrados.add(cliente);

            JOptionPane.showMessageDialog(this, "Cliente cadastrado com sucesso!");
            MainApp.cadastrarProduto(cliente);
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao cadastrar cliente: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}