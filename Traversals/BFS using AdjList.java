import java.util.*;

public class BFSAdjList {
    private List<List<Integer>> adj;
    private int v;

    public BFSAdjList(int v) {
        this.v = v;
        adj = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }
    }

    public void addEdge(int src, int dest) {
        adj.get(src).add(dest);
        adj.get(dest).add(src);
    }

    public void BFS(int start) {
        if (start < 0 || start >= v) {
            System.out.println("Invalid start vertex!");
            return;
        }

        boolean[] visited = new boolean[v];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;

        System.out.print("BFS Traversal: ");
        while (!queue.isEmpty()) {
            int vis = queue.poll();
            System.out.print(vis + " ");

            for (int neighbor : adj.get(vis)) {
                if (!visited[neighbor]) {
                    queue.add(neighbor);
                    visited[neighbor] = true;
                }
            }
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of vertices: ");
        int v = sc.nextInt();

        BFSAdjList graph = new BFSAdjList(v);

        System.out.print("Enter the number of edges: ");
        int e = sc.nextInt();

        System.out.println("Enter the source and destination for " + e + " edges:");
        for (int i = 0; i < e; i++) {
            int src = sc.nextInt();
            int dest = sc.nextInt();
            graph.addEdge(src, dest);
        }

        System.out.print("Enter the starting vertex: ");
        int start = sc.nextInt();

        graph.BFS(start);
        sc.close();
    }
}
