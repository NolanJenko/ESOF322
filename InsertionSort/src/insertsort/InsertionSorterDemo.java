package insertsort;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import insertsort.InsertionSorter;

public class InsertionSorterDemo {
	public static void main(String[ ] args) {
		Scanner S = new Scanner(System.in);
		int in = 0;
		System.out.println("Enter length of array: ");
		int data[] = new int[S.nextInt()];
		Random rand = new Random( ); // a pseudo-random number generator
		rand.setSeed(System.currentTimeMillis( )); // use current time as a seed
		// fill the data array with pseudo-random numbers from 0 to 99, inclusive
		for (int i = 0; i < data.length; i++)
			data[i] = rand.nextInt(100); // the next pseudo-random number
		int[ ] orig = Arrays.copyOf(data, data.length); // make a copy of the data array
		System.out.println(Arrays.toString(orig));
		/**
		 * while loop that continues until you want to quit
		 */
		while(in != 5) {			
			System.out.println("1. Sort Ascending");
			System.out.println("2. Sort Descending");
			System.out.println("3. Shuffle");
			System.out.println("4. Fill array with new random values");
			System.out.println("5. Quit");
			/**
			 * gets a new integer to input in the insertion sorter
			 * which is then output
			 */
			in = S.nextInt();
			InsertionSorter.insertionSorter(data, in);
			System.out.println(Arrays.toString(data));
		}
		
		System.out.println("<end>");
		}
	
}
