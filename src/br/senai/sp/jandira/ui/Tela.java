package br.senai.sp.jandira.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Tela {

	public void criarTela() {
		
		Font fontTitulo = new Font("Arial", Font.BOLD, 22);
		Font fontTexto = new Font("Arial", Font.PLAIN, 16);
		Font fontSubtitulo = new Font("Arial", Font.BOLD, 18);
		Font fontResultado = new Font("Arial", Font.BOLD, 14);
		
		Color azul = new Color(0, 0, 180);
		Color verde = new Color (0, 0, 128);
		
		
		JFrame tela = new JFrame();
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setSize(630, 530);
		tela.setTitle("Tabuada");
		tela.setLayout(null); 
		
		JPanel pnlBranco = new JPanel();
		pnlBranco.setBounds(0, 0, 630, 530);
		pnlBranco.setLayout(null);
		
		
		JLabel lblTabuada = new JLabel();
		lblTabuada.setFont(fontTitulo);
		lblTabuada.setForeground(azul);
		lblTabuada.setText("TABUADA ");
		lblTabuada.setBounds(20, 10, 200, 40);
		
		JLabel lblMultiplicando = new JLabel();
		lblMultiplicando.setFont(fontTexto);
		lblMultiplicando.setText("Multiplicando: ");
		lblMultiplicando.setBounds(80, 85, 100, 40);
		
		JTextField txtMultiplicando = new JTextField();
		txtMultiplicando.setFont(fontTexto);
		txtMultiplicando.setBounds(178, 87, 100, 35);
		
		JLabel lblMaximo = new JLabel();
		lblMaximo.setFont(fontTexto);
		lblMaximo.setText("Máximo multiplicador: ");
		lblMaximo.setBounds(20, 140, 200, 40);
		
		JTextField txtMaximo = new JTextField();
		txtMaximo.setFont(fontTexto);
		txtMaximo.setBounds(178, 142, 100, 35);
		
		JButton btnCalcular = new JButton();
		btnCalcular.setText("Calcular");
		btnCalcular.setFont(fontSubtitulo);
        btnCalcular.setBounds(25, 220, 250, 45);
		
		JButton btnLimpar = new JButton();
		btnLimpar.setText("Limpar");
		btnLimpar.setFont(fontSubtitulo);
		btnLimpar.setBounds(25, 280, 250, 45);
		
		
		
		
		
		
		tela.getContentPane().add(lblTabuada);
		tela.getContentPane().add(lblMultiplicando);
		tela.getContentPane().add(txtMultiplicando);
		tela.getContentPane().add(lblMaximo);
		tela.getContentPane().add(txtMaximo);
		tela.getContentPane().add(btnCalcular);
		tela.getContentPane().add(btnLimpar);
		tela.getContentPane().add(pnlBranco);
		
		
		
		tela.setVisible(true);
  
	   btnCalcular.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			Tela tela = new Tela();
			
			
		}
	});
		
		
		
	}
	
	
}
