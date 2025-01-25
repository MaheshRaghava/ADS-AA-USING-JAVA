import java.util.*;
class Mergesort
{
    private static int[] b; 
    public static void mergesort(int a[], int low, int high)
    {
        if (low < high)
        {
            int mid = (low + high)/ 2;
            mergesort(a, low, mid);
            mergesort(a, mid + 1, high); 
            merge(a, low, mid, high);
        }
    }

    public static void merge(int a[], int low, int mid, int high)
    {
        int i = low, j = mid + 1, k = low;

        while (i <= mid && j <= high)
        {
            if (a[i] <= a[j])
            {
                b[k++] = a[i++];
            } else
            {
                b[k++] = a[j++];
            }
        }

      
        while (i <= mid)
        {
            b[k++] = a[i++];
        }

 
        while (j <= high)
        {
            b[k++] = a[j++];
        }
        for (int h = low; h <= high; h++)
        {
            a[h] = b[h];
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of your array: ");
        int n = sc.nextInt();
        
        int[] array = new int[n];
        b = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++)
        {
            array[i] = sc.nextInt();
        }
        mergesort(array, 0, array.length - 1);

        System.out.println("Sorted array: ");
        for (int num : array)
        {
            System.out.print(num + " ");
        }
        System.out.println();
   }
}











