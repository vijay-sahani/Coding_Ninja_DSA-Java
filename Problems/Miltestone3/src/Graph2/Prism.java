package Graph2;

import java.util.*;

public class Prism {
    public static int findMinVertex(int[] weight,boolean []visited){
        int minV=-1;
        for (int i=0;i<weight.length;i++){
            if (!visited[i] && (minV== -1 || weight[minV]>weight[i])){
                minV=i;
            }
        }
        return minV;
    }
    public static void mst(int[][] edge){
        int n= edge.length;
        boolean[] visited=new boolean[n];
        int [] parent=new int[n];
        int[] weights=new int[n];
        weights[0]=0;
        parent[0]=-1;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.offer(0);
        for(int i=1;i<n;i++)weights[i]=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
//        while (!pq.isEmpty()){
            int minVertex=findMinVertex(weights,visited);
//            int minVertex=pq.poll();
            visited[minVertex]=true;
            for(int j=0;j<n;j++){
                if (edge[minVertex][j]!=0 && !visited[j]){
                    if (edge[minVertex][j]<weights[j]){
                        weights[j]=edge[minVertex][j];
                        parent[j]=minVertex;
//                        pq.offer();
                    }
                }
            }
        }
        print(weights,parent);
    }
    public static void print(int[] weight,int [] parent){
        for (int i=1;i<weight.length;i++){
            if (parent[i]<i){
                System.out.printf("%d %d %d\n",parent[i],i,weight[i]);
            }else System.out.printf("%d %d %d\n",i,parent[i],weight[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int e = sc.nextInt();
        int[][] edge=new int[v][v];
        for(int i=0;i<e;i++){
            int src= sc.nextInt();
            int des=sc.nextInt();
            int weight=sc.nextInt();
            edge[src][des]=weight;
            edge[des][src]=weight;
        }
        mst(edge);
    }
    public static void printTree(int[][] edge) {
        for (int i=0;i< edge.length;i++){
            for (int j=0;j<edge[i].length;j++){
                if (edge[i][j]>0){
                    System.out.printf("%d -> %d =%d\n",i,j,edge[i][j]);
                }
            }
        }
    }
}
/*
   2---9----3
4/ |        |
0  |3       2
6 \|        |
   1---8----4

 */
// Time Complexity O(e)+O(v^2)