package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class graph {
    static class Edge
    {
        int  src;
        int dest;
        int weight;
        public Edge(int src, int dest)
        {
          this.src=src;
          this.dest=dest;

        }
    }
    public  static void createGraph(ArrayList[] graph)
    {
        for (int i=0;i<graph.length;i++)
        {
            // now very arraylist is not null.
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,3));
        graph[1].add(new Edge(1,0));


        graph[2].add(new Edge(2,3));
        graph[2].add(new Edge(2,3));

        graph[3].add(new Edge(3,2));
        graph[3].add(new Edge(3,1));
    }

    // Breadth First Search
    public static void bfs(ArrayList[] graph)
    {
        Queue<Integer> q=new LinkedList<>();
        q.add(0);
        while (!q.isEmpty())
        {

        }
    }

    public static void main(String[] args) {
        int V=5 ;// v represent  number of vertices
        ArrayList[]graph=new ArrayList[V];
        createGraph(graph);
        for (int i=0;i<graph[2].size();i++)
        {
            Edge e= (Edge) graph[0].get(i);
            System.out.println(e.src +" "+e.dest);
        }


    }
}
