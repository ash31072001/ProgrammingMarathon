
public class ArmstrongNum {
	public int armstrongNum(int num) {
		
		int originalNum ;
		int rem;
		int res = 0;
		originalNum = num;
		
		
			
			rem = originalNum %10;
			res = res + (int)Math.pow(rem, 3);
			originalNum = originalNum/10;
		
		return res;
	}

}
