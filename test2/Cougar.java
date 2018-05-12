package test2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Feline {
	 public String type = "f ";
	 public Feline() {
	 System.out.print("feline ");
	 }
	}
	public class Cougar extends Feline {
		public String type = "f ";
	 public Cougar() {
	 System.out.print("cougar ");
	 }
	 void go() {
	 type = "c ";
	 System.out.print(this.type + super.type);
	 }
	 public static void main(String[] args) {
	 new Cougar().go();
	 Integer[] primes = {2, 7, 5, 3};
	 MySort ms = new MySort();
	 Arrays.sort(primes, ms);
	 for (Integer p2 : primes) {
	 System.out.print(p2 + " ");
	 }
	 main2();
	 }
	 
	 public static void main2() {
		List<?>[] obj=new ArrayList<?>[6];
		
		List<Integer> intList=new ArrayList();
		Object[] array = intList.toArray();
		intList.add(22);
	 
	}
	
	}
	class MySort implements Comparator<Integer> {
		 public int compare(Integer x, Integer y) {
		 return y.compareTo(x);
		 }
		}