import java.util.*;

class DFSAdjMatrix {
    private int[][] adj;
    private int v;

    DFSAdjMatrix(int v) {
        this.v = v;
        adj = new int[v][v];
    }

    public void DFS(int start) {
        if (start < 0 || start >= v) {
            System.out.println("Enter a valid starting vertex!");
            return;
        }

        boolean[] visited = new boolean[v];
        Stack<Integer> stack = new Stack<>();
        stack.push(start);
        visited[start] = true;

        System.out.print("DFS Traversal: ");
        while (!stack.isEmpty()) {
            int vis = stack.pop();
            System.out.print(vis + " ");

            for (int i = v - 1; i >= 0; i--) { 
                if (!visited[i] && adj[vis][i] == 1) {
                    stack.push(i);
                    visited[i] = true;
                }
            }
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of vertices: ");
        int v = sc.nextInt();

        DFSAdjMatrix graph = new DFSAdjMatrix(v);
        System.out.println("Enter the adjacency matrix: ");

        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                graph.adj[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter the starting vertex: ");
        int start = sc.nextInt();

        graph.DFS(start);
        sc.close();
    }
}
