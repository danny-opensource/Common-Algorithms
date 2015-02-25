package mg.bfs;

public class Graph {

	Node[] vertices;
	int count;

	public Graph() {
		vertices = new Node[8];
	}

	public void addNode(Node n) {
		vertices[count] = n;
		count++;
	}

	public Node[] getVertices() {
		return vertices;
	}

}
