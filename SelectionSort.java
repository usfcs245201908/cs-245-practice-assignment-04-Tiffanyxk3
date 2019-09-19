public class SelectionSort implements SortingAlgorithm
{
	int[] arr;

	public void sort(int[] a) {
		arr = a;
		for (int i=0; i<arr.length-1; i++) {
			int smallest = arr[i];
			int where = i;
			for (int j=i+1; j<arr.length; j++) {
				if (arr[j] < smallest) {
					smallest = arr[j];
					where = j;
				}
			}
			swap(where, i);
		}
	}


	public void swap(int first, int second) {
		int temp = arr[second];
		arr[second] = arr[first];
		arr[first] = temp;
	}
}