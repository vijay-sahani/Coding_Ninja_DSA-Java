package Graph2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Edge {
    int source;
    int dest;
    int weight;

    Edge(int source, int dest, int weight) {
        this.source = source;
        this.dest = dest;
        this.weight = weight;
    }
}
/*
0----1
|    |
|    |
2----3
 */
public class Kruskals {

    public static int findParent(int v,int [] parent){
        if (parent[v]==v)return v;
        return findParent(parent[v],parent);
    }
    public static Edge[] mst(Edge[] edge,int v){
        Edge[] minTree=new Edge[v-1];
        int[] parent=new int[v];
        for (int i=0;i<parent.length;i++)parent[i]=i;
        int count=0;int i=0;
        while(count<v-1){
            Edge currentEdge=edge[i++];
            int sourceParent=findParent(currentEdge.source,parent);
            int destParent=findParent(currentEdge.dest,parent);
            if (sourceParent!=destParent){
                minTree[count++]=currentEdge;
                parent[sourceParent]=destParent;
            }
        }
        return minTree;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int e = sc.nextInt();
        Edge[] edge = new Edge[e];
        for (int i = 0; i < e; i++) {
            int src = sc.nextInt();
            int des = sc.nextInt();
            int weight = sc.nextInt();
            edge[i]= new Edge(src, des, weight);
        }
        Arrays.sort(edge, new Comparator<Edge>() {
            @Override
            public int compare(Edge e1, Edge e2) {
                return e1.weight-e2.weight ;
            }
        });

        printTree(edge);
        System.out.println("Minimum spanning tree-->");
        printTree(mst(edge,v));

    }
    public static void printTree(Edge[] edge){
        for (Edge value : edge) {
            System.out.printf("%d -> %d = %d\n", value.source, value.dest, value.weight);
        }
    }
}
