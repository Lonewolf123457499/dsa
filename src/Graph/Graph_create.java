package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph_create
{
    static class Edge
    {
        int src;
        int dest;
        int weight;
        public  Edge(int src,int dest,int weight)
        {
            this.src=src;
            this.dest=dest;
            this.weight=weight;
        }
        public  void bfsTraversal(ArrayList<Edge>[] graph)
        {
            Queue<Integer> q=new LinkedList<>();
            boolean visited[]=new boolean[7];
            q.add(0);
            while(!q.isEmpty())
            {
                int node=q.poll();
                System.out.print(node+" ");
                for(int i=0;i<graph[node].size();i++)
                {
                    if(visited[i]==false)
                    {
                        visited[i]=true;
                        Edge dest=graph[node].get(i);
                        //q.add(dest);
                    }

                }
            }
        }

        public static void main(String[] args) {
            int v=7;
            ArrayList<Edge> [] graph=new ArrayList[v];
            for (int i = 0; i < v; i++) {
                graph[i] = new ArrayList<>();

            }
            graph[0].add(new Edge(0, 1, 5));
            graph[1].add(new Edge(1, 0, 5));

            graph[1].add(new Edge(1, 2, 1));
            graph[1].add(new Edge(1, 3, 3));

            graph[2].add(new Edge(2, 1, 1));
            graph[2].add(new Edge(2, 3, 1));
            graph[2].add(new Edge(2, 4, 4));

            graph[3].add(new Edge(3, 1, 53));
            graph[3].add(new Edge(3, 2, 1));
            graph[4].add(new Edge(4, 2, 2));

            // for neighbour's
            for(int i=0;i<graph[2].size();i++)
            {
                Edge e=graph[2].get(i);
                System.out.println(e.dest);
            }


        }
    }
}
