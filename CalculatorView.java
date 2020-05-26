import java.awt.event.ActionListener;

//import swing components to build interface
import javax.swing.*;

public class CalculatorView extends JFrame {

  //use components to build interface
	private JTextField firstNumber  = new JTextField(10);
	private JLabel additionLabel = new JLabel("+");
	private JTextField secondNumber = new JTextField(10);
	private JButton calculateButton = new JButton("Calculate");
	private JTextField calcSolution = new JTextField(10);


	//set up the view by adding components
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

}
