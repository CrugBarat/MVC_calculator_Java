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
	}

}
