package fibonacci;

import java.math.BigInteger;

public class FibData {
	
	private BigInteger arr[] = new BigInteger[200];
	
	public FibData() {
		// TODO Auto-generated constructor stub
		
		arr[0] = new BigInteger("1");
		arr[1] = new BigInteger("1");
		
		for (int i = 2; i < arr.length; i++) {
			arr[i] = arr[i-2].add(arr[i-1]);
		}
	}
	
	public BigInteger disp(int index){
		return arr[index];		
	}
}
