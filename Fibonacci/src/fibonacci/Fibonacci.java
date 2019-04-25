package fibonacci;
import java.math.BigInteger;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BigInteger arr[] = new BigInteger[200];
		
		arr[0] = new BigInteger("1");
		arr[1] = new BigInteger("1");
		
		for (int i = 2; i < arr.length; i++) {
			arr[i] = arr[i-2].add(arr[i-1]);
			System.out.println((i+1) + " : " + arr[i]);
		}
	}

}
