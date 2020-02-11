package calculator;
import java.io.IOException;
import java.util.Scanner;
import calculator.MathematicsOperation;; 

public class UserInput extends MathematicsOperation{

	private static Scanner sc;

	UserInput(int a, int b, char c) {
		super(a, b, c);
	}
	void result(int a,int b,char c) throws IOException {
		super.result(a, b, c);
	}
	public static void main(String[] args) throws IOException {
        sc= new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.print("Enter +, -, *, /");
        char operator = sc.next().charAt(0);
        UserInput c = new UserInput(num1,num2,operator);
        c.result(num1,num2,operator);
        
	}

}