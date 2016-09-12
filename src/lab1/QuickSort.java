
package lab1;


public class QuickSort {
    private int[] numbers;
    private int number;
    public void sort(int arr[]){
        if(arr == null || arr.length == 0)
            return;
        numbers = arr;
        number = arr.length;
        quicksort(0, arr.length -1);
    }
    
    private void quicksort(int lowerIndex, int higherIndex){
        int i = lowerIndex, j = higherIndex;
        int pivot = numbers[lowerIndex + (higherIndex - lowerIndex)/2];       
 
        while(i<=j){
            while (numbers[i]<pivot){
                i++;
            }
            
            while(numbers[j]>pivot){
                j--;
            }
            if(i<=j){
                int temp = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] =  temp;
                i++;
                j--;
            }
            
            if(lowerIndex < j)
                quicksort(lowerIndex, j);
            if(i < higherIndex)
                quicksort(i, higherIndex);
        }
    }
    
}
