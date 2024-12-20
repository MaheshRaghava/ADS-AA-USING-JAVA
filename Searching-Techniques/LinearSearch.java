import java.util.*;
class LinearSearch
{

    public static int linearSearch(int[] arr, int search)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == search) {
                return i;
            }
        }
        return -1;
    }
    public static int[] getInputArray(Scanner sc, int n) {
        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = getInputArray(sc, n);

        System.out.println("Enter the element to search: ");
        int search = sc.nextInt();

        int index = linearSearch(arr, search);

        if (index != -1)
        {
            System.out.println("Element found at " + index + " index");
        } else
        {
            System.out.println("Element not found");
        }
    }
}
