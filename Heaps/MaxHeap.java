public class MaxHeap {
    int arr[];
    int MaxSize, HeapSize;

    MaxHeap(int MaxSize) {
        this.MaxSize = MaxSize;
        HeapSize = 0;
        arr = new int[MaxSize];
    }

    int curSize() {
        return HeapSize;
    }

    int getMax() {
        return arr[0];
    }

    int parent(int i) {
        return (i - 1) / 2;
    }

    int Lchild(int i) {
        return 2 * i + 1;
    }

    int Rchild(int i) {
        return 2 * i + 2;
    }

    void MaxHeapify(int i) {
        int l = Lchild(i);
        int r = Rchild(i);
        int largest = i;
        
        if (l < HeapSize && arr[l] > arr[largest]) {
            largest = l;
        }
        if (r < HeapSize && arr[r] > arr[largest]) {
            largest = r;
        }
        if (largest != i) {
            int temp = arr[largest];
            arr[largest] = arr[i];
            arr[i] = temp;
            MaxHeapify(largest);
        }
    }

    void insert(int key) {
        if (HeapSize == MaxSize) {
            System.out.println("Heap is full - cannot insert new element");
            return;
        }
        
        int i = HeapSize;
        arr[i] = key;
        HeapSize++;
        
        while (i != 0 && arr[i] > arr[parent(i)]) {
            int temp = arr[parent(i)];
            arr[parent(i)] = arr[i];
            arr[i] = temp;
            i = parent(i);
        }
    }

    void removeMax() {
        if (HeapSize == 0) {
            System.out.println("The Heap is empty");
            return;
        }
        if (HeapSize == 1) {
            HeapSize--;
            return;
        }
        
        arr[0] = arr[HeapSize - 1];
        HeapSize--;
        MaxHeapify(0);
    }

    public static void main(String args[]) {
        MaxHeap h = new MaxHeap(24);
        int a[] = {100, 90, 80, 70, 60, 50, 40, 30, 20, 10};
        
        for (int x : a) {
            h.insert(x);
        }
        
        System.out.println("The Current Size of MaxHeap: " + h.curSize());
        System.out.println("The Maximum Element of MaxHeap is: " + h.getMax());
        
        h.removeMax();
        h.insert(110);
        h.insert(120);
        
        System.out.println("The current size of MaxHeap is: " + h.curSize());
        System.out.println("The Maximum of MaxHeap is: " + h.getMax());
    }
}
