public class MVCCalculator {
    
    public static void main(String[] args) {
    	
    	JFView theView = new JFView();
        
    	CalculatorModel theModel = new CalculatorModel();

        CMDView cmdView = new CMDView();

        HTMLView htmlView = new HTMLView();
        
        CalculatorController theController = new CalculatorController(theView,theModel, cmdView, htmlView);
        
    }
}