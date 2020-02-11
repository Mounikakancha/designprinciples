package calculator;
import java.io.IOException;
import calculator.Setvariable;
class MathematicsOperation extends Setvariable{
	MathematicsOperation(int num1, int num2, char c) {
		super(num1, num2, c);
		// TODO Auto-generated constructor stub
	}

	int result;
	void result(int a, int b,char c) throws IOException {
        int result;
        switch(c)
        {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            default:
                System.out.printf("Error! operator is not correct");
                return;
        }
        this.result = result;
        super.setResult(result);
        System.out.printf("%.1d %c %.1d = %.1d", a, c, b, result);
    }
		
}
	
	
	



