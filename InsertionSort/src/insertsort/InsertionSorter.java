package insertsort;

import java.util.Random;

public class InsertionSorter{
	public static void insertionSorter(int[ ] data, int answer) {
		Random rand = new Random();
		switch(answer) {//using switch for the different functions to use
			case 1:
				int n = data.length;
				for (int k = 0; k < n; k++) { // begin with second character
					int cur = data[k]; // time to insert cur=data[k]
					int j = k; // find correct index j for cur
					while (j > 0 && data[j-1] > cur) { // thus, data[j-1] must go after cur
						data[j] = data[j-1]; // slide data[j-1] rightward
						j--; // and consider previous j for cur
					}
					data[j] = cur; // this is the proper place for cur
					}
				break;
			case 2:
				int s = data.length;
				for (int k = 0; k < s; k++) { // begin with second character
					int cur = data[k]; // time to insert cur=data[k]
					int j = k; // find correct index j for cur
					while (j > 0 && data[j-1] < cur) { // thus, data[j-1] must go after cur
						data[j] = data[j-1]; // slide data[j-1] 
						j--; // and consider previous j for cur
					}
					data[j] = cur; // this is the proper place for cur
					}
				break;
			case 3:
				for(int k = data.length - 1; k>0; k--) {
					int id = rand.nextInt(k);
					int temporary = data[k];
			/**
			 * starts with the last value in the array and then switches it 
			 * with a random value in the array and goes through the array until all values have been swapped 	
			 */
					data[k] = data[id];
					data[id] = temporary;
				}
				break;
			case 4: 
				for(int l = 0; l<data.length; l++) {
					data[l] = rand.nextInt(100);
				}		
				break;
		}	
	}
}
