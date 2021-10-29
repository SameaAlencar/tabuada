package br.senai.sp.jandira.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import br.senai.sp.jandira.model.ContaTabuada;

public class Tela {

	public void criarTela() {

		Font fontTitulo = new Font("Arial", Font.BOLD, 22);
		Font fontTexto = new Font("Arial", Font.PLAIN, 16);
		Font fontSubtitulo = new Font("Arial", Font.BOLD, 18);
		Font fontResultado = new Font("Arial", Font.BOLD, 14);

		Color azul = new Color(0, 0, 180);
		Color verde = new Color(0, 0, 128);

		JFrame tela = new JFrame();
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setSize(630, 530);
		tela.setTitle("Tabuada");
		tela.setLayout(null);

		JPanel header = new JPanel();
		header.setBounds(0, 0, 630, 70);
		header.setBackground(Color.pink);
		header.setLayout(null);

		JLabel lblTabuada = new JLabel();
		lblTabuada.setFont(fontTitulo);
		lblTabuada.setForeground(azul);
		lblTabuada.setText("TABUADA ");
		lblTabuada.setBounds(20, 10, 200, 40);

		JLabel lblMultiplicando = new JLabel();
		lblMultiplicando.setFont(fontTexto);
		lblMultiplicando.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMultiplicando.setText("Multiplicando: ");
		lblMultiplicando.setBounds(80, 85, 100, 40);

		JTextField txtMultiplicando = new JTextField();
		txtMultiplicando.setFont(fontTexto);
		txtMultiplicando.setBounds(178, 87, 100, 35);

		JLabel lblMaximo = new JLabel();
		lblMaximo.setFont(fontTexto);
		lblMultiplicando.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMaximo.setText("Máximo multiplicador: ");
		lblMaximo.setBounds(20, 140, 200, 40);

		JTextField txtMaximo = new JTextField();
		txtMaximo.setFont(fontTexto);
		txtMaximo.setBounds(178, 142, 100, 35);

		JButton btnCalcular = new JButton();
		btnCalcular.setText("Calcular");
		btnCalcular.setFont(fontSubtitulo);
		btnCalcular.setBackground(new Color(2, 209, 23));
		btnCalcular.setBounds(25, 220, 250, 45);

		JButton btnLimpar = new JButton();
		btnLimpar.setText("Limpar");
		btnLimpar.setFont(fontSubtitulo);
		btnLimpar.setBackground(new Color(242, 16, 0));
		btnLimpar.setBounds(25, 280, 250, 45);

		JLabel lblresultado = new JLabel();
		lblresultado.setText("Resultado: ");
		lblresultado.setBounds(360, 120, 150, 30);

		JScrollPane scroll = new JScrollPane();
		scroll.setBounds(360, 110, 200, 300);

		JList listTabuada = new JList();
		scroll.getViewport().add(listTabuada);

		DefaultListModel tabuadaModel = new DefaultListModel();
		
		listTabuada.setModel(tabuadaModel);

		tela.getContentPane().add(lblTabuada);
		tela.getContentPane().add(lblMultiplicando);
		tela.getContentPane().add(txtMultiplicando);
		tela.getContentPane().add(lblMaximo);
		tela.getContentPane().add(txtMaximo);
		tela.getContentPane().add(btnCalcular);
		tela.getContentPane().add(btnLimpar);
		tela.getContentPane().add(header);
		tela.getContentPane().add(scroll);
		tela.getContentPane().add(lblresultado);

		tela.setVisible(true);
		
		btnLimpar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				txtMaximo.setText("");
				txtMultiplicando.setText("");
				txtMultiplicando.requestFocus();
				
				tabuadaModel.clear();
				
				
			}
		});
		

		btnCalcular.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ContaTabuada tabuada = new ContaTabuada();
				
				int multiplicando = Integer.parseInt(txtMultiplicando.getText());
				int maximo = Integer.parseInt(txtMaximo.getText());
				
				tabuada.setMultiplicando(multiplicando);
				tabuada.setMaximoMultiplicador(maximo);
				
				String[] resultadoTabuada = tabuada.calcular();
				
				
				for (int i = 0; i < resultadoTabuada.length; i++) {
					tabuadaModel.addElement(resultadoTabuada[i]);
					
				
				}

			}
		});

	}

}
