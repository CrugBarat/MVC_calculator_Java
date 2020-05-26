import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {

  //set model and view vars
	private CalculatorView theView;
	private CalculatorModel theModel;

  //pass vars to constructor
	public CalculatorController(CalculatorView theView, CalculatorModel theModel) {
		this.theView = theView;
		this.theModel = theModel;

		//calc listener
		this.theView.addCalculateListener(new CalculateListener());
	}

  //add calc listener inner class
	class CalculateListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {

			int firstNumber, secondNumber = 0;

	    //add try block for improper number entry
			try{

				firstNumber = theView.getFirstNumber();
				secondNumber = theView.getSecondNumber();

				theModel.add(firstNumber, secondNumber);
				theView.setCalcSolution(theModel.getResult());
			}

			catch(NumberFormatException ex){
				System.out.println(ex);
				theView.displayErrorMessage("You Need to Enter 2 Numbers");
			}

		}

	}

}
