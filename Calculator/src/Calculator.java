
/**
 * 
 * @author prudhvir3ddy
 *
 */
public class Calculator {

	public int Addition(int x , int y) {
		return x+y;
	}
	public int Multiplication(int x , int y) {
		return x*y;
	}
	public int Division(int x, int y) {
		if(y==0)
			throw new ArithmeticException("Cannot divide by zero");
		else
			return x/y;
	}
}
