import java.util.*;

class Selectionsort
{
    static void sort(int a[], int n)
    {
        for (int i=0;i<n-1;i++)
        {
            int minIndex=i;
            for (int j=i+1;j<n;j++)
            {
                if (a[j]<a[minIndex])
                {
                    minIndex = j;
                }
            }
            int temp = a[minIndex];
            a[minIndex] = a[i];
            a[i] = temp;
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter array elements:");
        for (int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        sort(a,n);
        System.out.println("The sorted elements are:");
        for (int i=0;i<n;i++) {
            System.out.println(a[i]);
        }
    }
}
