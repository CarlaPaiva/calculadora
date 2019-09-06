package calculadora;

import java.awt.Component;
import java.awt.Image;

import javax.swing.*;

public class calcTela extends JFrame {
	public calcTela() {
		super("Calculadora");
		try {
			//componentes
			add(txtExibeEpressao());
			add(btnLimpar());
			add(btn7());
			add(btn8());
			add(btn9());
			add(btnDividir());
			
			//configs tela
			setLayout(null);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setLocationRelativeTo(null);
			setSize(305, 400);
			Image img =  Image("icone.png");
			set(img);
			setVisible(true);
		}
		catch (Exception e) {
			
		}
	}
	
	private Image Image(String string) {
		// TODO Auto-generated method stub
		return null;
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
	
	private JButton btnLimpar() {
		JButton btn = new JButton();
		btn.setName("btnLimpar");
		btn.setText("APAGAR");
		btn.setSize(270, 25);
		btn.setLocation(10, 35);
		return btn;
	}
	
	private JButton btn7() {
		JButton btn = new JButton();
		btn.setName("btn7");
		btn.setText("7");
		btn.setSize(60, 60);
		btn.setLocation(10, 70);
		return btn;
	}
	
	private JButton btn8() {
		JButton btn = new JButton();
		btn.setName("btn8");
		btn.setText("8");
		btn.setSize(60, 60);
		btn.setLocation(80, 70);
		return btn;
	}
	
	private JButton btn9() {
		JButton btn = new JButton();
		btn.setName("btn9");
		btn.setText("9");
		btn.setSize(60, 60);
		btn.setLocation(150, 70);
		return btn;
	}
	
	private JButton btnDividir() {
		JButton btn = new JButton();
		btn.setName("btnDividir");
		btn.setText("/");
		btn.setSize(60, 60);
		btn.setLocation(220, 70);
		return btn;
	}
}
