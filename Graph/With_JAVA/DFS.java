package Graph;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class DFS {
    int vertex;
    LinkedList<Integer> adj[];
    Stack<Integer> stk ;

    public DFS(int vertex){
        this.vertex = vertex;
        adj = new LinkedList[vertex];
        for(int i = 0; i < vertex; i++){
            adj[i] = new LinkedList<Integer>();
        }
        stk = new Stack<Integer>();
    }
    public void createGraph(int u,int v){
        adj[u].add(v);
    }

    public void dfs(int n){
        boolean[] visited = new boolean[vertex];
        int a = 0;
        visited[n] = true;
        stk.push(n);
        System.out.printf("DFS traversal for the graph is : ");
        while(!stk.empty()){
            n = stk.peek();
            System.out.printf(n+" ");
            stk.pop();
            for (int i = 0; i < adj[n].size(); i++){
                a = adj[n].get(i);
                if(!visited[a]){
                    visited[a] = true;
                    stk.push(a);
                }
            }

        }
    }
    public static void main(String[] args) {

        int vertex,edge,u,v,source;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of vertex : ");
        vertex = in.nextInt();
        System.out.print("Enter number of edge : ");
        edge = in.nextInt();

        DFS graph = new DFS(vertex);
        System.out.println("Enter two adjacency vertex : ");
        for(int i = 0; i < edge; i++){
            u = in.nextInt();
            v = in.nextInt();
            graph.createGraph(u,v);
        }
        System.out.printf("Enter source node : ");
        source = in.nextInt();
        graph.dfs(source);
    }
}

/*
Enter number of vertex : 6
Enter number of edge : 8
Enter two adjacency vertex : 
0 1
0 2
1 3
2 4
4 3
3 5
5 2
5 0
Enter source node : 0
DFS traversal for the graph is : 0 2 4 3 5 1 
 */
