import java.awt.event.ActionListener;

import javax.swing.*;

public class JFView extends JFrame{

	private JTextField firstNumber  = new JTextField(10);
	private JLabel additionLabel = new JLabel("+");
	private JTextField secondNumber = new JTextField(10);
	private JButton calculateButton = new JButton("Calculate");
	private JTextField calcSolution = new JTextField(10);

	private JTextField firstNumber2  = new JTextField(10);
	private JLabel subtractionLabel = new JLabel("-");
	private JTextField secondNumber2 = new JTextField(10);
	private JButton calculateButton2 = new JButton("Calculate");
	private JTextField calcSolution2 = new JTextField(10);

	JFView(){

		// Sets up the view and adds the components

		JPanel calcPanel = new JPanel();

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 200);

		calcPanel.add(firstNumber);
		calcPanel.add(additionLabel);
		calcPanel.add(secondNumber);
		calcPanel.add(calculateButton);
		calcPanel.add(calcSolution);

		calcPanel.add(firstNumber2);
		calcPanel.add(subtractionLabel);
		calcPanel.add(secondNumber2);
		calcPanel.add(calculateButton2);
		calcPanel.add(calcSolution2);

		this.add(calcPanel);


		// End of setting up the components --------

	}

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

	public int getFirstNumber2(){

		return Integer.parseInt(firstNumber2.getText());

	}

	public int getSecondNumber2(){

		return Integer.parseInt(secondNumber2.getText());

	}

	public int getCalcSolution2(){

		return Integer.parseInt(calcSolution2.getText());

	}

	public void setCalcSolution2(int solution){

		calcSolution2.setText(Integer.toString(solution));

	}
	// If the calculateButton is clicked execute a method
	// in the Controller named actionPerformed

	void addCalculateListener(ActionListener listenForCalcButton){

		calculateButton.addActionListener(listenForCalcButton);

	}

	void subCalculateListener(ActionListener listenForCalcButton){

		calculateButton2.addActionListener(listenForCalcButton);

	}

	// Open a popup that contains the error message passed

	void displayErrorMessage(String errorMessage){

		JOptionPane.showMessageDialog(this, errorMessage);

	}

}