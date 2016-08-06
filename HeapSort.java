
/**
 * Write a description of class HeapSort here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HeapSort<E extends Comparable<E>> implements Sorting<E>
{
    public static int N;
    /**
     * Constructor for objects of class HeapSort
     */
    public HeapSort()
    {
        // initialise instance variables
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public class E extends Comparable<E>
    {
        public int compareTo(E other)
        {
            return 0;
        }
    }
    public <E> E[] sort(E[] arr)
    {
        // put your code here
        N = arr.length;
        heapify(arr);        
        for (int i = N; i > 0; i--)
        {
            swap(arr,0, i);
            N = N-1;
            maxheap(arr, 0);
        }
        
        return arr;
    }
         
    /* Function to build a heap */   
    public static <E> void heapify(E arr[])
    {
        N = arr.length-1;
        for (int i = N/2; i >= 0; i--)
            maxheap(arr, i);        
    }
    /* Function to swap largest element in heap */        
    public static <E> void maxheap(E arr[], int i)
    { 
        int left = 2*i ;
        int right = 2*i + 1;
        int max = i;
        if (left <= N && arr[left].compareTo(arr[i]) > 0)
            max = left;
        if (right <= N && arr[right].compareTo(arr[max]) > 0)        
            max = right;
 
        if (max != i)
        {
            swap(arr, i, max);
            maxheap(arr, max);
        }
    }    
    /* Function to swap two numbers in an array */
    public static <E> void swap(E arr[], int i, int j)
    {
        E tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp; 
    }    
}
