package javapractices;

import java.util.Arrays;
import java.util.Iterator;

public class Reversearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {1,2,3,4,5,6,7,8,9,};
		System.out.println("array :"+Arrays.toString(array));
		for (int i = 0; i < array.length/2; i++) {
				int temp =  array[i];
				array[i]=array[array.length - i -1];
				array[array.length -i -1] = temp;
				
			
		}
		System.out.println("Reverse array :"+ Arrays.toString(array));

}
}