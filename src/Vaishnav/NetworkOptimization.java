package Vaishnav;

import java.util.*;

public class NetworkOptimization {
    static class Edge {
        int to, cost;
        public Edge(int to, int cost) {
            this.to = to;
            this.cost = cost;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int C = sc.nextInt();
        List<Integer> clients = new ArrayList<>();
        for (int i = 0; i < C; i++) {
            clients.add(sc.nextInt() - 1); // Convert to 0-based index
        }

        int S = sc.nextInt();
        List<Integer> servers = new ArrayList<>();
        for (int i = 0; i < S; i++) {
            servers.add(sc.nextInt() - 1); // Convert to 0-based index
        }

        int M = sc.nextInt();
        List<Edge>[] graph = new ArrayList[N];
        for (int i = 0; i < N; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            int from = sc.nextInt() - 1; // Convert to 0-based index
            int to = sc.nextInt() - 1;   // Convert to 0-based index
            int cost = sc.nextInt();
            graph[from].add(new Edge(to, cost));
        }

        int upgradeCost = sc.nextInt();

        int[] minCostFromServers = new int[N];
        Arrays.fill(minCostFromServers, Integer.MAX_VALUE);
        for (int server : servers) {
            int[] dist = dijkstra(graph, N, server);
            for (int i = 0; i < N; i++) {
                minCostFromServers[i] = Math.min(minCostFromServers[i], dist[i]);
            }
        }

        int totalCost = 0;
        for (int client : clients) {
            totalCost += Math.min(minCostFromServers[client], upgradeCost);
        }

        for (int server : servers) {
            totalCost += minCostFromServers[server];
        }

        System.out.println(totalCost);
        sc.close();
    }

    private static int[] dijkstra(List<Edge>[] graph, int N, int start) {
        PriorityQueue<Edge> pq = new PriorityQueue<>(Comparator.comparingInt(e -> e.cost));
        int[] dist = new int[N];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[start] = 0;
        pq.add(new Edge(start, 0));

        while (!pq.isEmpty()) {
            Edge current = pq.poll();
            int u = current.to;

            for (Edge edge : graph[u]) {
                int v = edge.to;
                int newDist = dist[u] + edge.cost;
                if (newDist < dist[v]) {
                    dist[v] = newDist;
                    pq.add(new Edge(v, newDist));
                }
            }
        }

        return dist;
    }
}
