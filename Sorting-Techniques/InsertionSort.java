import java.util.*;

class Insertionsort
{
    static void sort(int arr[], int n)
    {
        for (int i=1;i<n;i++) {
            int key = arr[i];
            int j = i-1;
            while (j >= 0 && arr[j] > key)
            {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements:");
        for (int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        sort(arr, n);
        System.out.println("The sorted elements are:");
        for (int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
