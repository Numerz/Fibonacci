package fibonacci;
import java.math.BigInteger;

public class Fibonacci {

	private static FibData fibData = new FibData();
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 1; i <= 200; i++) {
			System.out.println(i + " : " + Fibonacci.of(i));
		}
		
	}
	
	
	
	public static BigInteger of(int index){		
		return fibData.disp(index-1);
	}

}
