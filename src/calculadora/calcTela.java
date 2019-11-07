package calculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


@SuppressWarnings("serial")
public class calcTela extends JFrame implements ActionListener {
	
	private JButton btnLimpar;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btnDividir;
	private JButton btn4; 
	private JButton btn5;
	private JButton btn6;
	private JButton btnMultiplica;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btnSubtrai;
	private JButton btn0;
	private JButton btnPonto;
	private JButton btnResultado;
	private JButton btnSoma;
	private JTextField txtExp;
	private JMenuItem padrao;
	private JMenuItem cientifica;
	private JMenuItem sair;
	private JButton btnAoQuadrado;
	private JButton btnPotencia;
	
	public calcTela() {
		super("Calculadora");
		try {
			//componentes
			txtExp = txtExibeEpressao();
			add(txtExp);
			
			btnLimpar = btnGenerico("btnLimpar", "APAGAR", 270, 25, 10, 40);
			add(btnLimpar);
			
			btn7 = btnGenerico("btn7", "7", 60, 60, 10, 70);
			add(btn7);
			
			btn8 = btnGenerico("btn8", "8", 60, 60, 80, 70);
			add(btn8);
			
			btn9 = btnGenerico("btn9", "9", 60, 60, 150, 70);
			add(btn9);
			
			btnDividir = btnGenerico("btnGenerico", "/", 60, 60, 220, 70);
			add(btnDividir);
			
			btn4 = btnGenerico("btn4", "4", 60, 60, 10, 140);
			add(btn4);
			
			btn5 = btnGenerico("btn5", "5", 60, 60, 80, 140);
			add(btn5);
			
			btn6 = btnGenerico("btn6", "6", 60, 60, 150, 140);
			add(btn6);
			
			btnMultiplica = btnGenerico("btnMultiplica", "X", 60, 60, 220, 140);
			add(btnMultiplica);
			
			btn1 = btnGenerico("btn1", "1", 60, 60, 10, 210);
			add(btn1);
			
			btn2 = btnGenerico("btn2", "2", 60, 60, 80, 210);
			add(btn2);
			
			btn3 = btnGenerico("btn3", "3", 60, 60, 150, 210);
			add(btn3);
			
			btnSubtrai = btnGenerico("btnSubtrai", "-", 60, 60, 220, 210);
			add(btnSubtrai);
			
			btn0 = btnGenerico("btn0", "0", 60, 60, 10, 280);
			add(btn0);
			
			btnPonto = btnGenerico("btnPonto", ".", 60, 60, 80, 280);
			add(btnPonto);
			
			btnResultado = btnGenerico("btnResultado", "=", 60, 60, 150, 280);
			add(btnResultado);
			
			btnSoma = btnGenerico("btnSoma", "+", 60, 60, 220, 280);
			add(btnSoma);
			
			btnAoQuadrado = btnGenerico("btnAoQuadrado", "x²", 60, 60, 290, 70);
			add(btnAoQuadrado);
			
			btnPotencia = btnGenerico("btnPotencia", "^", 60, 60, 290, 140);
			add(btnPotencia);
			
			//Menu
			JMenu menu = new JMenu("Menu");
			menu.add(padrao = new JMenuItem("Padrão"));
			menu.add(cientifica = new JMenuItem("Científica"));
			menu.addSeparator();
			menu.add(sair = new JMenuItem("Sair"));
			JMenuBar bar = new JMenuBar();
			bar.add(menu);
			
			padrao.addActionListener(this);
			cientifica.addActionListener(this);
			sair.addActionListener(this);
			
			setJMenuBar(bar);
			
			//Fim menu
			
			btn0.addActionListener(this);
			btn1.addActionListener(this);
			btn2.addActionListener(this);
			btn3.addActionListener(this);
			btn4.addActionListener(this);
			btn5.addActionListener(this);
			btn6.addActionListener(this);
			btn7.addActionListener(this);
			btn8.addActionListener(this);
			btn9.addActionListener(this);
			btnLimpar.addActionListener(this);
			btnDividir.addActionListener(this);
			btnMultiplica.addActionListener(this);
			btnSubtrai.addActionListener(this);
			btnSoma.addActionListener(this);
			btnPonto.addActionListener(this);
			btnResultado.addActionListener(this);
			btnAoQuadrado.addActionListener(this);
			btnPotencia.addActionListener(this);
			
			//configs tela
			setLayout(null);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setLocationRelativeTo(null);
			setResizable(false);
			setSize(295, 410);
			setVisible(true);
		}
		catch (Exception e) {
			
		}
	}

	private JTextField txtExibeEpressao() {
		JTextField txt = new JTextField();
		txt.setName("txtExibeEpressao");
		txt.setSize(270, 25);
		txt.setLocation(10, 5);
		txt.setHorizontalAlignment(JTextField.RIGHT);
		txt.setEditable(false);
		return txt;
	}
	
	private JButton btnGenerico(String name, String text, int largura, int altura, int x, int y) {
		JButton btn = new JButton();
		btn.setName(name);
		btn.setText(text);
		btn.setSize(largura, altura);
		btn.setLocation(x, y);
		return btn;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String expr = "";
		try {
			if (e.getSource() == btnLimpar) {
				expr = "";
			}
			else if (e.getSource() == btn7) {
				expr = txtExp.getText() + "7";
			}
			else if (e.getSource() == btn8) {
				expr = txtExp.getText() + "8";
			}
			else if (e.getSource() == btn9) {
				expr = txtExp.getText() + "9";
			}
			else if (e.getSource() == btnDividir) {
				expr = txtExp.getText() + " / ";
			}
			else if (e.getSource() == btn4) {
				expr = txtExp.getText() + "4";
			}
			else if (e.getSource() == btn5) {
				expr = txtExp.getText() + "5";
			}
			else if (e.getSource() == btn6) {
				expr = txtExp.getText() + "6";
			}
			else if (e.getSource() == btnMultiplica) {
				expr = txtExp.getText() + "*";
			}
			else if (e.getSource() == btn1) {
				expr = txtExp.getText() + "1";
			}
			else if (e.getSource() == btn2) {
				expr = txtExp.getText() + "2";
			}
			else if (e.getSource() == btn3) {
				expr = txtExp.getText() + "3";
			}
			else if (e.getSource() == btnSubtrai) {
				expr = txtExp.getText() + "-";
			}
			else if (e.getSource() == btn0) {
				expr = txtExp.getText() + "0";
			}
			else if (e.getSource() == btnPonto) {
				expr = txtExp.getText() +".";
			}
			else if (e.getSource() == btnResultado) {
				expr = fazConta(txtExp.getText());
			}
			else if (e.getSource() == btnSoma) {
				expr = txtExp.getText() + "+";
			}
			else if (e.getSource() == btnAoQuadrado) {
				expr = txtExp.getText() + "^2";
			}
			else if (e.getSource() == btnPotencia) {
				expr = txtExp.getText() + "^";
			}
			else if (e.getSource() == padrao) {
				MontaPadrao();
			}
			else if (e.getSource() == cientifica) {
				MontaCientifica();
			}
			else if (e.getSource() == sair) {
				dispose();
			}
		}
		catch (Exception ex) {
			expr = "ERROR";
		}
		txtExp.setText(expr);
	}
	
	public String fazConta(String expressao) throws Exception {
        RealizaCalculos conta = new RealizaCalculos();
        return conta.calcula(expressao);
    }
	
	private void MontaPadrao() {
		setSize(295, 410);
		btnLimpar.setSize(270, 25);
		txtExp.setSize(270, 25);
	}
	
	private void MontaCientifica() {
		setSize(365, 410);
		//btnLimpar.setSize(350, 25);
		//txtExp.setSize(350, 25);
	}
}
