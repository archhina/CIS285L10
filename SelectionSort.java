package lab9package;
public class SelectionSort {
	private int temp;
	/** Creates a new instance of SelectionSort */
		public SelectionSort() {
		}
		/* A simple SelectionSort algorithm
		* pre-condition:
		* post-condition:
		* inputs:
		* outputs:
		* special conditions:
		*/
		public int[] basicSelectionSort(int[] x) {
			for (int i = 0; i < x.length-1; i++) {
				int index = i;
				for (int j= i+1; j < x.length; j++) {
					if (x[index] > x[j]) {
						index = j;
					}
				} // end of inner for loop
				int smallerNum = x[index];
				x[index] = x[i];
				x[i] = smallerNum;
			} // end of outer for loop
			return x;
		} // end of basicSelectionSort method
}
