package test2;

import java.text.ParseException;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(stringToInt("123") );
	}
	
	/*public static void arrangeArray(int[] arr,int i) {
		
		if(arr.length==1 ){
			System.out.println("already sorted");
			
		}
		int[] arr2= new int[arr.length];
		for(int j=0; j<arr.length;j++) {
			if(arr[i]>) {
				
			}
		}
		
	}*/
	
	static long stringToInt(String s) {
		if(s==null) {
			throw new IllegalArgumentException("error in parsing");
		}
		char[] charArray = s.toCharArray();
		long value=0;
		long tenPower=Double.valueOf(Math.pow(10, charArray.length-1)).longValue();
		for(char c:charArray) {
			System.out.println(value);
			//System.out.println(tenPower);

			if(c<0&&c>9) {
				throw new IllegalArgumentException("error in parsing");
			}
			int digit = Character.digit(c,10);
			value=value+(tenPower*digit);
			tenPower/=10;
		}
		return value;
	}

}
