package Tree;

import javagla.A;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph1
{
  static class Edge
  {
    int src;
    int dest;
    int weight;
    public Edge(int src,int dest ,int weight)
    {
      this.src=src;
      this.dest=dest;
      this.weight=weight;

    }
  }
  public  static void createGraph(ArrayList<Edge> [] graph)
  {
    for (int i=0;i< graph.length;i++)
    {
      graph[i]=new ArrayList<>();
    }
    graph[0].add(new Edge(0,1,5));
    graph[0].add(new Edge(0,2,3));
    graph[0].add(new Edge(0,3,9));

    graph[1].add(new Edge(1,3,2));
    graph[1].add(new Edge(1,0,5));

    graph[2].add(new Edge(2,3,1));
    graph[2].add(new Edge(2,0,3));

    graph[3].add(new Edge(3,1,2));
    graph[3].add(new Edge(3,2,1));
    graph[3].add(new Edge(3,0,9));

  }
  public static void main(String[] args) {
    int V=6;
    ArrayList <Edge>[] graph=new ArrayList[V];
    // suppose we have to find the neighbour of edge3
    for (int i=0;i<graph[0].size();i++) {
      Edge e = (Edge) graph[2].get(i);


      System.out.println(e.dest);
    }
  }
}
