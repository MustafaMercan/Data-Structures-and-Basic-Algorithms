public class insertionSort
{
    public static void main(String[] args)
    {
        int [] nums = {5,3,2,7,8,10,9,12};
        int i = 1;
        int j;
        int currentItem;

        while(i < nums.length)
        {
            j = i - 1;
            currentItem = nums[i];
            while( j >= 0 && nums[j] > currentItem)
            {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = currentItem;
            i++;
        }

        i = 0;
        while(i < nums.length)
            System.out.println(nums[i++]);
    }
}