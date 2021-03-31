package calc;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.SystemColor;
import javax.swing.JTextArea;
import java.awt.Insets;

public class Calc extends JFrame {

	private JPanel contentPane;
	private JTextField txtTela;
	private JButton btnDois;
	private JButton btnTres;
	private JButton btnQuatro;
	private JButton btnCinco;
	private JButton btnSeis;
	private JButton btnSete;
	private JButton btnOito;
	private JButton btnNove;
	private JButton btnZero;
	private JButton btnLimpar;
	private JButton btnMais;
	private JButton btnResultado;

	/**
	 * Launch the application.
	 */
	double n1,n2,result; // Variaveis para receber o primeiro e segundo número para executar a conta
	int op,op2;  /* Op representa qual operação vamos efetuar. Op2 serve para verificar se a tela está com o resultado de uma operação ou não. Caso tenha um resultado sendo mostrado no display,
	 a calculadora é "reiniciada" no momento que o usuário apertar um novo número, para assim realizar uma nova operação.*/
	Calcular calc = new Calcular();
	
	
	
	private JButton btnMenos;
	private JButton btnMult;
	private JButton btnDiv;
	private JTextField txtOp;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calc frame = new Calc();
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
	public Calc() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setAutoRequestFocus(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Gui\\Desktop\\download.png"));
		setBounds(100, 100, 246, 329);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// BOTÃO 1
		JButton btnUm = new JButton("1");
		btnUm.setFocusable(false);
		btnUm.setFocusTraversalKeysEnabled(false);
		btnUm.setFocusPainted(false);
		btnUm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double tela = Double.parseDouble(txtTela.getText());
				
				if (tela==0 || op2==1) {
					txtTela.setText("1");
					op2=0;
				}
				else {
					txtTela.setText(txtTela.getText()+"1");
				}
			}
		});
		btnUm.setBounds(10, 99, 45, 37);
		contentPane.add(btnUm);
		
		// BOTÃO 2
		btnDois = new JButton("2");
		btnDois.setFocusable(false);
		btnDois.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double tela = Double.parseDouble(txtTela.getText());
				if (tela==0 || op2==1) {
					txtTela.setText("2");
					op2=0;
				}
				else {
					txtTela.setText(txtTela.getText()+"2");
				}
			}
		});
		btnDois.setBounds(65, 99, 45, 37);
		contentPane.add(btnDois);
		
		// BOTÃO 3		
		btnTres = new JButton("3");
		btnTres.setFocusable(false);
		btnTres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double tela = Double.parseDouble(txtTela.getText());
				if (tela==0 || op2==1) {
					txtTela.setText("3");
					op2=0;
				}
				else {
					txtTela.setText(txtTela.getText()+"3");
				}
			}
		});
		btnTres.setBounds(120, 99, 45, 37);
		contentPane.add(btnTres);
		
		
		// BOTÃO 4
		btnQuatro = new JButton("4");
		btnQuatro.setFocusable(false);
		btnQuatro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double tela = Double.parseDouble(txtTela.getText());
				if (tela==0 || op2==1) {
					txtTela.setText("4");
					op2=0;
				}
				else {
					txtTela.setText(txtTela.getText()+"4");
				}
			}
		});
		btnQuatro.setBounds(10, 147, 45, 37);
		contentPane.add(btnQuatro);
		
		
		// BOTÃO 5	
		btnCinco = new JButton("5");
		btnCinco.setFocusable(false);
		btnCinco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double tela = Double.parseDouble(txtTela.getText());
				if (tela==0 || op2==1) {
					txtTela.setText("5");
					op2=0;
				}
				else {
					txtTela.setText(txtTela.getText()+"5");
				}
			}
		});
		btnCinco.setBounds(65, 147, 45, 37);
		contentPane.add(btnCinco);
		
		
		// BOTÃO 6
		btnSeis = new JButton("6");
		btnSeis.setFocusable(false);
		btnSeis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double tela = Double.parseDouble(txtTela.getText());
				if (tela==0 || op2==1) {
					txtTela.setText("6");
					op2=0;
				}
				else {
					txtTela.setText(txtTela.getText()+"6");
				}
			}
		});
		btnSeis.setBounds(120, 147, 45, 37);
		contentPane.add(btnSeis);
		
		// BOTÃO 7
		btnSete = new JButton("7");
		btnSete.setFocusable(false);
		btnSete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double tela = Double.parseDouble(txtTela.getText());
				if (tela==0 || op2==1) {
					txtTela.setText("7");
					op2=0;
				}
				else {
					txtTela.setText(txtTela.getText()+"7");
				}
			}
		});
		btnSete.setBounds(10, 195, 45, 37);
		contentPane.add(btnSete);
		
		
		// BOTÃO 8
		btnOito = new JButton("8");
		btnOito.setFocusable(false);
		btnOito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double tela = Double.parseDouble(txtTela.getText());
				if (tela==0 || op2==1) {
					txtTela.setText("8");
					op2=0;
				}
				else {
					txtTela.setText(txtTela.getText()+"8");
				}
			}
		});
		btnOito.setBounds(65, 195, 45, 37);
		contentPane.add(btnOito);
		
		
		// BOTÃO 9
		btnNove = new JButton("9");
		btnNove.setFocusable(false);
		btnNove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double tela = Double.parseDouble(txtTela.getText());
				if (tela==0 || op2==1) {
					txtTela.setText("9");
					op2=0;
				}
				else {
					txtTela.setText(txtTela.getText()+"9");
				}
			}
		});
		btnNove.setBounds(120, 195, 45, 37);
		contentPane.add(btnNove);
		
		
		// BOTÃO 0
		btnZero = new JButton("0");
		btnZero.setFocusable(false);
		btnZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double tela = Double.parseDouble(txtTela.getText());
				if (tela==0 || op2==1) {
					txtTela.setText("0");
					op2=0;
				}
				else {
					txtTela.setText(txtTela.getText()+"0");
				}
			}
		});
		btnZero.setBounds(65, 243, 45, 37);
		contentPane.add(btnZero);
		
		
		// BOTÃO LIMPAR
		btnLimpar = new JButton("C");
		btnLimpar.setFocusable(false);
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtTela.setText("0");
				n1 = 0; n2 = 0; op = 0;
				btnResultado.setEnabled(false);
				btnMenos.setEnabled(true);
				btnMais.setEnabled(true);
				btnDiv.setEnabled(true);
				btnMult.setEnabled(true);
				txtOp.setText("");
			}
		});
		btnLimpar.setBounds(10, 243, 45, 37);
		contentPane.add(btnLimpar);
		
		
		// BOTÃO SOMA
		btnMais = new JButton("+");
		btnMais.setFocusable(false);
		btnMais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				n1 = Double.parseDouble(txtTela.getText());
				op = 1;
				txtTela.setText("0");
				btnResultado.setEnabled(true);
				btnMenos.setEnabled(false);
				btnMais.setEnabled(false);
				btnDiv.setEnabled(false);
				btnMult.setEnabled(false);
				txtOp.setText(n1+" +");
			}
		});
		btnMais.setBounds(175, 99, 45, 37);
		contentPane.add(btnMais);
		
		
		// BOTÃO SUBTRAÇÃO
		btnMenos = new JButton("-");
		btnMenos.setFocusable(false);
		btnMenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1 = Double.parseDouble(txtTela.getText());
				txtTela.setText("0");
				op = 2;
				
				btnResultado.setEnabled(true);
				btnMenos.setEnabled(false);
				btnMais.setEnabled(false);
				btnDiv.setEnabled(false);
				btnMult.setEnabled(false);
				txtOp.setText(n1+" -");
			}
		});
		btnMenos.setBounds(175, 147, 45, 37);
		contentPane.add(btnMenos);
		
		
		// BOTÃO MULTIPLICAÇÃO
		btnMult = new JButton("*");
		btnMult.setFocusable(false);
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1 = Double.parseDouble(txtTela.getText());
				txtTela.setText("0");
				op=3;
				btnResultado.setEnabled(true);
				btnMenos.setEnabled(false);
				btnMais.setEnabled(false);
				btnDiv.setEnabled(false);
				btnMult.setEnabled(false);
				txtOp.setText(n1+" *");
			}
		});
		btnMult.setBounds(175, 195, 45, 37);
		contentPane.add(btnMult);
		
		
		// BOTÃO DIVISÃO
		btnDiv = new JButton("/");
		btnDiv.setFocusable(false);
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1 = Double.parseDouble(txtTela.getText());
				txtTela.setText("0");
				op=4;
				btnResultado.setEnabled(true);
				btnMenos.setEnabled(false);
				btnMais.setEnabled(false);
				btnDiv.setEnabled(false);
				btnMult.setEnabled(false);
				txtOp.setText(n1+" /");
			}
		});
		btnDiv.setBounds(175, 243, 45, 37);
		contentPane.add(btnDiv);
		
		
		// BOTÃO RESULTADO
		btnResultado = new JButton("=");
		btnResultado.setEnabled(false);
		btnResultado.setFocusable(false);
		btnResultado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				op2=1;
				n2 = Double.parseDouble(txtTela.getText());
				txtTela.setText(String.valueOf((calc.Calcular(n1, n2, op))));
				n1 = 0; n2 = 0; op = 0;
				btnResultado.setEnabled(false);
				btnMenos.setEnabled(true);
				btnMais.setEnabled(true);
				btnDiv.setEnabled(true);
				btnMult.setEnabled(true);
				txtOp.setText("");
			}
		});
		btnResultado.setBounds(120, 243, 45, 37);
		contentPane.add(btnResultado);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 22, 210, 66);
		contentPane.add(panel);
		panel.setLayout(null);
		
		txtOp = new JTextField();
		txtOp.setSelectionColor(SystemColor.desktop);
		txtOp.setSelectedTextColor(SystemColor.desktop);
		txtOp.setBounds(10, 0, 200, 29);
		panel.add(txtOp);
		txtOp.setFocusable(false);
		txtOp.setBorder(null);
		txtOp.setHorizontalAlignment(SwingConstants.RIGHT);
		txtOp.setEnabled(false);
		txtOp.setBackground(SystemColor.menu);
		txtOp.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtOp.setColumns(10);
		
		
		// DISPLAY
		txtTela = new JTextField();
		txtTela.setBackground(SystemColor.menu);
		txtTela.setBounds(10, 27, 190, 24);
		panel.add(txtTela);
		txtTela.setMargin(new Insets(4, 4, 4, 10));
		txtTela.setBorder(null);
		txtTela.setFocusable(false);
		txtTela.setEnabled(false);
		txtTela.setFont(new Font("Arial", Font.BOLD, 20));
		txtTela.setText("0");
		txtTela.setHorizontalAlignment(SwingConstants.RIGHT);
		txtTela.setColumns(10);
	}
}
