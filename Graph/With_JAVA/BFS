package Graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS {

    private int vertex;
    LinkedList<Integer> adjList[];
    Queue<Integer> Q;

    BFS(int vertex){
        this.vertex = vertex;
        adjList = new LinkedList[vertex];
        for(int i = 0; i < vertex; i++){
            adjList[i] = new LinkedList<>();
        }
        Q = new LinkedList<Integer>();
    }

    void addEdge(int u,int v){
        adjList[u].add(v);
    }

    void bfs(int n){
        boolean [] visited = new boolean[vertex];
        visited[n] = true;
        int x = 0;
        Q.add(n);
        System.out.printf("BFS traversal for the graph is : ");
        while(!Q.isEmpty()){
            n = Q.poll();
            System.out.print(n+" ");
            for(int i = 0; i < adjList[n].size(); i++){
                x = adjList[n].get(i);
                if(!visited[x]){
                    visited[x] = true;
                    Q.add(x);
                }
            }
        }

    }

    public static void main(String[] args) {
        int vertex,edge,v,u,source;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of vertex : ");
        vertex = in.nextInt();
        BFS graph = new BFS(vertex);
        System.out.print("Enter number of edge : ");
        edge = in.nextInt();
        System.out.println("Enter two adjcency vertex : ");
        for(int i = 0; i < edge; i++){
            u = in.nextInt();
            v = in.nextInt();
            graph.addEdge(u,v);
        }
        System.out.println("Enter source node : ");
        source = in.nextInt();
        graph.bfs(source);
    }
}
/*
  Vertex : 4
  Edge : 5
  Adjacency node are : 0 1
                       0 3
                       1 3
                       1 2
                       2 3

   source node : 1
   Output : BFS traversal for the graph is : 1 2 3 .
 */
