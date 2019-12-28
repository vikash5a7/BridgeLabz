package sortingAlogorithm;

public class BinarSearch {
	public static void main(String[] args) {
		int[] array = {1,2,4,5,6,8,9,10,11};
		int low = 0;
		int search = 4;
		int high = array.length-1;
		int mid = (low+high)/2;
		while(low<=high)
		{
			
			if (array[mid] < search)
				low = mid + 1;
			else if (array[mid] == search) {
				System.out.println(search + " found at location " + (mid + 1) + ".");
				break;
			} else {
				high = mid - 1;
			}
			mid = (low + high) / 2;
		}
		if (low > high)
			System.out.println(" is not found.\n");
	}
}
