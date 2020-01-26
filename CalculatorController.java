import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

// The Controller coordinates interactions
// between the View and Model

public class CalculatorController {

	private JFView theView;
	private CalculatorModel theModel;
    private CMDView cmdView;
    private HTMLView htmlView;

	public CalculatorController(JFView theView, CalculatorModel theModel, CMDView cmdView, HTMLView htmlView) {
		
		this.theModel = theModel;
        Scanner sc = new Scanner(System.in);

        System.out.println("Select your choice of Input: \n1. Via JFrame. \n2.Via the CommandLine.\n3.Via a web application.");
        int opt = sc.nextInt();

        if(opt==1){
            this.theView = theView;
            this.theView.addCalculateListener(new CalculateListener());
		    this.theView.subCalculateListener(new CalculateListener2());
            theView.setVisible(true);
        }
        else if(opt==2){
            this.cmdView = cmdView;
            this.cmdView.getFirstNumber();
            this.cmdView.getSecondNumber();
            int[] res = this.cmdView.seeResult();
            System.out.println(this.cmdView.firstNumber + " + " + this.cmdView.secondNumber + " = " + res[0]);
            System.out.println(this.cmdView.firstNumber + " - " + this.cmdView.secondNumber + " = " + res[1]);
        }
        else{
            this.htmlView = htmlView;
            this.htmlView.loadPage();
        }

		
	}


	class CalculateListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {

			int firstNumber, secondNumber = 0;

			// Surround interactions with the view with
			// a try block in case numbers weren't
			// properly entered

			try{

				firstNumber = theView.getFirstNumber();
				secondNumber = theView.getSecondNumber();

				theModel.addTwoNumbers(firstNumber, secondNumber);

				theView.setCalcSolution(theModel.getCalculationaddValue());

			}

			catch(NumberFormatException ex){

				System.out.println(ex);

				theView.displayErrorMessage("You Need to Enter 2 Integers");

			}

		}

	}


	class CalculateListener2 implements ActionListener{

		public void actionPerformed(ActionEvent e) {

			int firstNumber2, secondNumber2 = 0;

			// Surround interactions with the view with
			// a try block in case numbers weren't
			// properly entered

			try{

				firstNumber2 = theView.getFirstNumber2();
				secondNumber2 = theView.getSecondNumber2();

				theModel.subTwoNumbers(firstNumber2, secondNumber2);

				theView.setCalcSolution2(theModel.getCalculationsubValue());


			}

			catch(NumberFormatException ex){

				System.out.println(ex);

				theView.displayErrorMessage("You Need to Enter 2 Integers");

			}

		}

	}

}