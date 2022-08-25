package Graph;

import java.util.Scanner;

public class CreateGraphWithMatrix {
    static void constructGraph(int[][] Graph,Global G,Scanner in){
        for(int i = 0; i < G.edge; i++){
            G.u = in.nextInt();
            G.v = in.nextInt();
            if(G.status == 1){
                Graph[G.u][G.v] = 1;
            }else if(G.status == 2){
                Graph[G.u][G.v] = 1;
                Graph[G.v][G.u] = 1;
            }
        }
    }
    public static void printGraph(int[][] Graph,Global G){
        for(int i = 0; i < G.vertex; i++){
            for(int j = 0; j < G.vertex; j++){
                System.out.print(Graph[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Global G = new Global();
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter vertex and edge : ");
        G.vertex = in.nextInt();
        G.edge = in.nextInt();
        System.out.println("Enter 1 for directed or 2 for undirected graph : ");
        G.status = in.nextInt();
        System.out.println("Enter two adjacency vertex : ");
        constructGraph(G.matrix,G,in);
        printGraph(G.matrix,G);
    }
    public static class Global{
         int vertex,edge,u,v,status;
         int[][] matrix = new int[10][10];
    }
}
