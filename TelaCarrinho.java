package model;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class TelaCarrinho extends JFrame {

	private JPanel contentPane;
	private JComboBox<String> comboBoxProduto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCarrinho frame = new TelaCarrinho();
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
	public TelaCarrinho() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(64, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Victor Store");
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 34));
		lblNewLabel.setBounds(161, 11, 119, 31);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Produto");
		lblNewLabel_1.setBounds(10, 90, 46, 14);
		contentPane.add(lblNewLabel_1);

		comboBoxProduto = new JComboBox<String>();
		comboBoxProduto.setModel(new DefaultComboBoxModel<String>(new String[] { "Celular", "Tablet", "TV", "Video Game", "Computadores" }));
		comboBoxProduto.setBounds(77, 86, 100, 22);
		contentPane.add(comboBoxProduto);

		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.setBounds(187, 85, 100, 23);
		contentPane.add(btnAdicionar);
	}
}
