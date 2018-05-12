package test2;
import java.util.*;

public class Test3 {
	 
		
	    public static void main(String args[] ) throws Exception {
	 
	        Scanner scan=new Scanner(System.in);
	        int n=scan.nextInt();
	        
	        if(n<=3)
	        {
	        if(n==1||n==0)	
	        System.out.println("0");
	        else
	        {
	        	if(n==2)
	        	System.out.println("1");
	        	else
	        	System.out.println(n);
	        }
	        }
	        else
	        {
	        long[] arr=new long[n+1];
	        arr[0]=0;
	        arr[1]=1;
	        arr[2]=2;
	        arr[3]=3;
	        
	        long count=2;
	        for(int i=4; i<=n;i++)
	        {
	        	if(find_prime_num(i))
	        	{
	        	  count=count*2;
	        	}
	        	arr[i]=arr[i-1]+count;	
	        }
	        
	        
	        System.out.println(arr[n]);	
	        }
	        
	        
	    }
	    
	    	static boolean find_prime_num(int num)
		{
		 int sq_root=(int)Math.sqrt(num)+1;
		 
		 for(int i=2; i<sq_root; i++)
		 {
		 	if(num%i==0)
		 	return false;
		 }
		 
		 return true;
		}
	

}
