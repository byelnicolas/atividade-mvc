package mvc.view;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AlunoMediaView extends JFrame{

	private JTextField nota1 = new JTextField(10);
	private JTextField nota2 = new JTextField(10);
	private JTextField nota3 = new JTextField(10);
	private JLabel rotuloSoma = new JLabel("+");
	private JLabel rotuloDivisao = new JLabel("/");
	private JTextField nota4 = new JTextField(10);
	private JButton botaoCalcular = new JButton("caucular");
	private JTextField resultado = new JTextField(20);

	public AlunoMediaView() {
		JPanel calcPanel = new JPanel();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 200);
		calcPanel.add(nota1);
		calcPanel.add(nota2);
		calcPanel.add(nota3);
		calcPanel.add(nota4);
		calcPanel.add(rotuloSoma);
		calcPanel.add(rotuloDivisao);
		calcPanel.add(botaoCalcular);
		calcPanel.add(resultado);
		this.add(calcPanel);
	}
	public int getNota1() {
		return Integer.parseInt(nota1.getText());
	}

	public int getNota2() {
		return Integer.parseInt(nota2.getText());
	}
	public int getNota3() {
		return Integer.parseInt(nota3.getText());
	}
	public int getNota4() {
		return Integer.parseInt(nota4.getText());
	}

	public int getResultado() {
		return Integer.parseInt(resultado.getText());
	}

	public void setResultado(int solution) {
		resultado.setText(Integer.toString(solution));
	}

	// ActionListener, responsável pelo evento do botão
	public void AlunoMediaListener(ActionListener eventoBotaoCalcular) {
		botaoCalcular.addActionListener(eventoBotaoCalcular);
	}

	// Erro ao calcular
	public void displayErrorMessage(String mensagemErro) {
		JOptionPane.showMessageDialog(this, mensagemErro);
	}
}
