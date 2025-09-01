import java.util.*;
class LinearSearch {
    static int linearSearch(int a[], int n, int key) {
        int pos = -1;
        for (int i = 0; i < n; i++) {
            if (a[i] == key) {
                pos = i + 1;
                break;
            }
        }
        if (pos > 0) {
            System.out.println("Key is found at " + pos);
        } else {
            System.out.println("Key is not found");
        }
        return pos;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter elements in array: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.printf("Enter a key to search: ");
        int key = sc.nextInt();
        linearSearch(a, n, key);
    }
}
