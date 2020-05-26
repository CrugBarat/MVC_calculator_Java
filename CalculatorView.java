import java.awt.event.ActionListener;

import javax.swing.*; //for swing components to build interface

public class CalculatorView extends JFrame {

  //build interface
	private JTextField firstNumber  = new JTextField(10);
	private JLabel additionLabel = new JLabel("+");
	private JTextField secondNumber = new JTextField(10);
	private JButton calculateButton = new JButton("Calculate");
	private JTextField calcSolution = new JTextField(10);

}
