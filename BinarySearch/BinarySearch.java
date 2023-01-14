class BinarySearch{
	public int Search(int[] arr, int target)
	{
		int lindex = 0;
		int rindex = arr.length - 1;

		while(lindex < rindex)
		{
			//0   4   9
			//1   5   9
			int midIndex = left + (right - left) / 2;
			if(arr[midIndex] == target)
				return midIndex;
			else if(arr[midIndex] < target)
				left = midIndex + 1;
			else
				right = midIndex - 1;
		}
		return -1;
	}
}
