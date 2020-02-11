package calculator;
import calculator.Variable;
import java.io.FileWriter;
import java.io.IOException;

class Setvariable extends Variable{
	char ch;
	int result;
	private FileWriter fw;

	Setvariable(int a, int b,char c) {
		super(a,b);
		this.ch = c;
	}
	 void setResult(int result) throws IOException
	 {
		 this.result = result;
		 fw = new FileWriter("answer.txt");
		 fw.append(ch);
		 fw.append((char)super.a);
		 fw.append((char)super.b);
		 fw.append("result=");
		 fw.append((char)result);
	 }
}
	