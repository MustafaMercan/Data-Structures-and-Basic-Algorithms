// INSERTION SORT IMPLEMENT IN JS//
/*
This function takes an array as an argument and returns a new sorted array. It iterates through the array, starting from the second element, and compares each element with the ones before it.If an element is found to be smaller than the one before it,it is shifted to the left until it is in the correct position.This process continues until all elements have benn considered and the correct ordering has been achieved.
*/

const insertionSort = (array) =>{
    for(let i = 1; i < array.length; i++)
    {
        let current = array[i];
        let j = i - 1;
        while(j >= 0 && array[j] > current)
        {
            array[j + 1] = array[j];
            j--;
        }
        array[j + 1] = current;
    }
    return array;
}
console.log(insertionSort([4,1,2,7,2,13,241,5,11233,214,124154,123124]));
