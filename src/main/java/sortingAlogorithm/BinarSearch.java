package sortingAlogorithm;

public class BinarSearch {
	public static void main(String[] args) {
		int[] array = {1,2,4,5,6,8,9,10,11};
		int low = 0;
		int search = 4;
		int high = array.length-1;
		int mid = low+high/2;
		while(low<=high)
		{
			if(array[mid]==search)
			{
				System.out.println("ELEMENTS FOUND AT THE POSITON" +array[mid]);
				break;
			}
			else if(array[mid]<=search)
			{
				low = mid+1;
			}
			else
			{
				high = mid-1;
			}
			mid = low+high/2;
		}
	}
	

}
