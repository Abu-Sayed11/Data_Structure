package Graph;

import java.util.*;

public class GraphTraversing {

    int vertex;
    
    LinkedList<Integer> adj[];
    Queue<Integer> Q;
    Stack<Integer> stk;

    public GraphTraversing(int vertex){
        this.vertex = vertex;
        adj = new LinkedList[vertex];
        for (int i = 0; i < vertex; i++){
            adj[i] = new LinkedList<Integer>();
        }
        Q = new LinkedList<Integer>();
        stk = new Stack<Integer>();
    }

    public void constructGraph(int u,int v){
        adj[u].add(v);
    }

    public void dfs(int n ){
        boolean [] visited = new boolean[vertex];
        visited[n] = true;
        int item = 0;
        stk.push(n);
        System.out.printf("Graph traversing with DFS : ");
        while(!stk.empty()){
            n = stk.peek();
            stk.pop();
            System.out.printf(n+" ");
            for (int i = 0; i < adj[n].size(); i++){
                item = adj[n].get(i);
                if(!visited[item]){
                    visited[item] = true;
                    stk.push(item);
                }
            }
        }
    }

    public void bfs(int n ){
        boolean[] visited = new boolean[vertex];
        int item = 0;
        visited[n] = true;
        Q.add(n);
        System.out.printf("Graph traversing with BFS : ");
        while(!Q.isEmpty()){
            n = Q.poll();
            System.out.printf(n+" ");
            for (int i = 0; i < adj[n].size(); i++){
                item = adj[n].get(i);
                if(!visited[item]){
                    visited[item] = true;
                    Q.add(item);
                }
            }
        }
    }

    public static void main(String[] args) {

        int vertex,edge,u,v,source;
        Scanner in = new Scanner(System.in);

        System.out.printf("Enter number of node : ");
        vertex = in.nextInt();
        System.out.printf("Enter number of edge : ");
        edge = in.nextInt();

        GraphTraversing graph = new GraphTraversing(vertex);

        System.out.println("Enter two adjacency node : ");

        for (int i = 0; i < edge; i++){
            u = in.nextInt();
            v = in.nextInt();
            graph.constructGraph(u,v);
        }

        System.out.printf("Enter source node : ");
        source = in.nextInt();

        graph.dfs(source);
        System.out.println();
        graph.bfs(source);

    }
}

/*
Enter number of node : 6
Enter number of edge : 8
Enter two adjacency node : 
0 1
0 2
1 3
2 4
4 3
3 5
5 2
5 0
Enter source node : 0
Graph traversing with DFS : 0 2 4 3 5 1 
Graph traversing with BFS : 0 1 2 3 4 5 
 */
