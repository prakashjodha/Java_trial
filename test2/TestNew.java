package test2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class TestNew {
	
	 static void printLargest(List<String> arr){
	     
	        Collections.sort(arr, new Comparator<String>(){
	 
	        // A comparison function which is used by 
	        // sort() in printLargest()
	        @Override
	        public int compare(String X, String Y) {
	         
	        // first append Y at the end of X
	        String XY=X + Y;
	         
	        // then append X at the end of Y
	        String YX=Y + X;
	         System.out.println(XY+"   "+YX);
	        // Now see which of the two formed numbers 
	        // is greater
	        return XY.compareTo(YX) > 0 ? -1:1;
	    }
	    });
	         
	    Iterator it = arr.iterator();
	 
	    while(it.hasNext())
	        System.out.print(it.next());
	     
	    }
	 
	 public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        int size=sc.nextInt();
	        String[] strArr=new String[size];
	        for(int i=0;i<size;i++){
	            strArr[i]=String.valueOf(sc.nextInt());
	        }
	        for(String st:strArr) {
				System.out.print(st+" ");
			}
	        
	    }

	public static void main2(String[] args) {
		int data[]=new int[]{99,8,76,45,66,9,7,33,5,42};
		String []strArr=new String[data.length];
		List<String> list=new ArrayList<>();
		int i=0;
		for(int a:data) {
			strArr[i]=a+"";
			list.add(String.valueOf(a));
			i++;
		}
		printLargest(list);
		Arrays.sort(strArr,Collections.reverseOrder());
		for(String st:strArr) {
			System.out.print(st+" ");
		}
			
		try {
			Foo f1=new Foo(1);
			Foo f2=new Foo(4);
			Foo f3=new Foo(3);
			Foo []fooArr=new Foo[] {f1,f2,f3};
			for(Foo fo:fooArr) {
				System.out.println(fo.getCode());
			}
			System.out.println("result  ");
			Arrays.sort(fooArr);
			for(Foo fo:fooArr) {
				System.out.print(fo.getCode()+" ");
			}
			Map<Foo,String> map=new HashMap<>();
			map.put(f1, "1");
			map.put(f2, "2");
			map.put(f3, "3");
			System.out.println(map.get(f3));
			return;
		} finally {
			System.out.println("gatattt");
		}

	}

}

class Foo implements Comparable<Foo>{
	int code;
	
	public int getCode() {
		return code;
	}

	public Foo(int code) {
	this.code=code;	
	}
	
	public int hashCode() {
		return Double.valueOf(Math.random()*100).intValue();
	}
	
	public boolean equals(Object obj) {
		System.out.println("called"+obj.hashCode());
		System.out.println("called"+this.hashCode());
		return false;
	}

	@Override
	public int compareTo(Foo o) {
				return o.code-this.code;
	}
 
	/*@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + code;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Foo other = (Foo) obj;
		if (code != other.code)
			return false;
		return true;
	}*/
}