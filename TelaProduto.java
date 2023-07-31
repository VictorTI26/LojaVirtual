package model;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaProduto extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JComboBox<String> comboBoxCategoria;
	private JComboBox<Integer> comboBoxAvaliacao;
	private JComboBox<String> comboBoxProduto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaProduto frame = new TelaProduto();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaProduto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(64, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Nome produto");
		lblNewLabel.setBounds(10, 76, 96, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Preço");
		lblNewLabel_1.setBounds(10, 101, 96, 14);
		contentPane.add(lblNewLabel_1);

		comboBoxCategoria = new JComboBox<String>();
		comboBoxCategoria.addItem("Hardware");
		comboBoxCategoria.addItem("Periféricos");
		comboBoxCategoria.addItem("Computadores");
		comboBoxCategoria.addItem("Outros");
		comboBoxCategoria.setBounds(105, 122, 100, 22);
		contentPane.add(comboBoxCategoria);

		JLabel lblNewLabel_2 = new JLabel("Categoria");
		lblNewLabel_2.setBounds(10, 126, 96, 14);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Avaliação");
		lblNewLabel_3.setBounds(10, 151, 96, 14);
		contentPane.add(lblNewLabel_3);

		comboBoxAvaliacao = new JComboBox<Integer>();
		for (int i = 1; i <= 10; i++) {
			comboBoxAvaliacao.addItem(i);
		}
		comboBoxAvaliacao.setBounds(105, 147, 63, 22);
		contentPane.add(comboBoxAvaliacao);

		textField = new JTextField();
		textField.setBounds(105, 73, 63, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(105, 98, 63, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("Modelo");
		lblNewLabel_4.setBounds(10, 176, 96, 14);
		contentPane.add(lblNewLabel_4);

		textField_2 = new JTextField();
		textField_2.setBounds(361, 123, 63, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);

		JLabel lblNewLabel_5 = new JLabel("Marca");
		lblNewLabel_5.setBounds(10, 201, 96, 14);
		contentPane.add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("Cor");
		lblNewLabel_6.setBounds(10, 226, 96, 14);
		contentPane.add(lblNewLabel_6);

		JLabel lblNewLabel_7 = new JLabel("Quant Estoque");
		lblNewLabel_7.setBounds(255, 126, 96, 14);
		contentPane.add(lblNewLabel_7);

		JLabel lblNewLabel_8 = new JLabel("Limite compra");
		lblNewLabel_8.setBounds(255, 176, 96, 14);
		contentPane.add(lblNewLabel_8);

		textField_3 = new JTextField();
		textField_3.setBounds(105, 173, 63, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);

		textField_4 = new JTextField();
		textField_4.setBounds(105, 198, 63, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);

		textField_5 = new JTextField();
		textField_5.setBounds(105, 223, 63, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);

		textField_6 = new JTextField();
		textField_6.setBounds(361, 173, 63, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);

		JLabel lblNewLabel_9 = new JLabel("Victor Store");
		lblNewLabel_9.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 34));
		lblNewLabel_9.setBounds(157, 11, 150, 30);
		contentPane.add(lblNewLabel_9);

		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String produto = textField.getText();
				comboBoxProduto.addItem(produto);
			}
		});
		btnSalvar.setBounds(10, 251, 89, 23);
		contentPane.add(btnSalvar);

		comboBoxProduto = new JComboBox<String>();
		comboBoxProduto.setBounds(105, 251, 100, 22);
		contentPane.add(comboBoxProduto);
	}
}
