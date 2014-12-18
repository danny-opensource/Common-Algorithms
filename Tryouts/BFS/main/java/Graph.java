package main.java;
public class Graph {
  
  public int count; // Number of vertices
  private Node[] vertices;
  
  public Graph()
    {
    vertices = new Node[8];
    count = 0;
  }
  
  public void addNode(Node n)
    {
    if(count < 10)
      {
      vertices[count] = n;
      count++;
    }
    else
      {
      System.out.println("Cannot add any more nodes");
    }
  }
  
  public Node[] getNode()
    {
    return vertices;
  }
}
