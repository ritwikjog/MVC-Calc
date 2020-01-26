import java.util.Scanner;

class CMDView{
    int firstNumber;
    int secondNumber;
    Scanner sc = new Scanner(System.in);

    public int getFirstNumber(){
        System.out.println("Enter the first number");
        firstNumber = sc.nextInt();
        return firstNumber;
    }

    public int getSecondNumber(){
        System.out.println("Enter the second number");
        secondNumber = sc.nextInt();
        return secondNumber;
    }

    public int[] seeResult(){
        int[] res = new int[2];
        res[0] = firstNumber + secondNumber;
        res[1] = firstNumber - secondNumber;
        return res;
    }
}