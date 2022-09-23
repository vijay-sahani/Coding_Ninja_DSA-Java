package Graph2;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Dijkstra {
    public static void minDistance(int[][] edge) {
        int v = edge.length;
        boolean[] visited = new boolean[v];
        int[] parent = new int[v];
        int[] distance = new int[v];
        for (int i = 0; i < v; i++) distance[i] = Integer.MAX_VALUE;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(0);
        distance[0] = 0;
        parent[0] = -1;
        while (!pq.isEmpty()) {
            int minVertex = pq.poll();
            visited[minVertex] = true;
            for (int i = 0; i < v; i++) {
                if (edge[minVertex][i] != 0 && !visited[i] ) {
                    int curr_dis = distance[minVertex] + edge[minVertex][i];
                    if (curr_dis < distance[i]) {
                        distance[i] = curr_dis;
                        parent[i] = minVertex;
                        pq.offer(i);
                    }
                }
            }
        }
        System.out.println("Parents---->");
        print(parent);
        System.out.println("Distance----->");
        print(distance);
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d -> %d\n", i, arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int e = sc.nextInt();
        int[][] edge = new int[v][v];
        for (int i = 0; i < e; i++) {
            int src = sc.nextInt();
            int des = sc.nextInt();
            int weight = sc.nextInt();
            edge[src][des] = weight;
            edge[des][src] = weight;
        }
        minDistance(edge);
    }
}
/*
      2-------5-------3
    / |             / |
  4   |           /   |
 /    |         /     |
0     2      5        4
  \   |    /          |
   8  |  /            |
    \ |/              |
      1------9--------4
Data to input--->
5 7
0 1 4
0 2 8
1 3 4
1 2 2
2 3 5
2 4 9
3 4 4
 */