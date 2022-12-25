#include <stdio.h>
// INSERTION SORT IMPLEMENT IN C//
/*
This function takes an array as an argument and returns a new sorted array. It iterates through the array, starting from the second element, and compares each element with the ones before it.If an element is found to be smaller than the one before it,it is shifted to the left until it is in the correct position.This process continues until all elements have benn considered and the correct ordering has been achieved.
*/
void insertionShort(int *arr,int arrLength)
{
    int i = 1;
    int j = 0;
    int currentItem = 0;
    while( i < arrLength)
    {
        j = i - 1;
        currentItem = arr[i];
        while(j >= 0 && arr[j] > currentItem)
        {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = currentItem;
        i++;
    }
}
void print_list(int *arr,int arrLength)
{
    int i = 0;
    while(i < arrLength)
        printf("%d ",arr[i++]);
    printf("\n");
}
int main()
{
    int test[] = {7,8,2,5,7,8,11,12,4,1,23,4};
    insertionShort(test,12);
    print_list(test,12);


    return 0;
}