import java.awt.event.ActionListener;

//import swing for components to build interface
import javax.swing.*;

public class CalculatorView extends JFrame {

  //build interface with components
	private JTextField firstNumber  = new JTextField(10);
	private JLabel additionLabel = new JLabel("+");
	private JTextField secondNumber = new JTextField(10);
	private JButton calculateButton = new JButton("Calculate");
	private JTextField calcSolution = new JTextField(10);


	//set up the view and add components
  CalculatorView(){

    //add interface panel
		JPanel calcPanel = new JPanel();

    //close panel by clicking x
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    //set panel size
		this.setSize(600, 200);

    //add components to panel
		calcPanel.add(firstNumber);
		calcPanel.add(additionLabel);
		calcPanel.add(secondNumber);
		calcPanel.add(calculateButton);
		calcPanel.add(calcSolution);

    //add panel to view
		this.add(calcPanel);
	}

  //access inputs - parse to int as entered as string from JTextField
  public int getFirstNumber(){
		return Integer.parseInt(firstNumber.getText());
	}

	public int getSecondNumber(){
		return Integer.parseInt(secondNumber.getText());
	}

	public int getCalcSolution(){
		return Integer.parseInt(calcSolution.getText());
	}

	public void setCalcSolution(int solution){
		calcSolution.setText(Integer.toString(solution));
	}

  //add listener to calc button
  void addCalculateListener(ActionListener listenForCalcButton){
    calculateButton.addActionListener(listenForCalcButton);
  }

  //add error message
  void displayErrorMessage(String errorMessage){
    JOptionPane.showMessageDialog(this, errorMessage);
  }

}
