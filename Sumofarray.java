package javapractices;

import java.util.Iterator;

public class Sumofarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int array[]= {10,20,30,40,50,60,70,80,90};
			int sum= 0;
			for(int i:array) 
				sum+=i;
			System.out.println("sum of array:"+sum);
	}

}
