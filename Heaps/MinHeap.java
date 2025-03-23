public class MinHeap {
    int arr[];
    int MaxSize, HeapSize;

    MinHeap(int MaxSize) {
        this.MaxSize = MaxSize;
        HeapSize = 0;
        arr = new int[MaxSize];
    }

    int curSize() {
        return HeapSize;
    }

    int getMin() {
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

    void MinHeapify(int i) {
        int l = Lchild(i);
        int r = Rchild(i);
        int smallest = i;
        
        if (l < HeapSize && arr[l] < arr[smallest]) {
            smallest = l;
        }
        if (r < HeapSize && arr[r] < arr[smallest]) {
            smallest = r;
        }
        if (smallest != i) {
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
            MinHeapify(smallest);
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
        
        while (i != 0 && arr[i] < arr[parent(i)]) {
            int temp = arr[parent(i)];
            arr[parent(i)] = arr[i];
            arr[i] = temp;
            i = parent(i);
        }
    }

    void removeMin() {
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
        MinHeapify(0);
    }

    public static void main(String args[]) {
        MinHeap h = new MinHeap(24);
        int a[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        
        for (int x : a) {
            h.insert(x);
        }
        
        System.out.println("The Current Size of MinHeap: " + h.curSize());
        System.out.println("The Minimum Element of MinHeap is: " + h.getMin());
        
        h.removeMin();
        h.insert(110);
        h.insert(120);
        
        System.out.println("The current size of MinHeap is: " + h.curSize());
        System.out.println("The Minimum of MinHeap is: " + h.getMin());
    }
}
