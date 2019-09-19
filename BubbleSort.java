public class BubbleSort implements SortingAlgorithm
{
	int[] arr;

	public void sort(int[] a) {
		arr = a;
		int count = arr.length-1;
		for (int i=0; i<arr.length-1; i++) {
			for (int j=0; j<count; j++) {
				if (arr[j] > arr[j+1]) {
					swap(j, j+1);
				}
			}
			count--;
		}
	}

	public void swap(int first, int second) {
		int temp = arr[second];
		arr[second] = arr[first];
		arr[first] = temp;
	}
}