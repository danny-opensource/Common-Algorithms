package mg.bfs;

public class Node {

	Node[] child;
	int childCount = 0;
	public State state;
	String vertex;

	public Node(String vertex) {
		this.vertex = vertex;
	}

	public Node(String vertex, int children) {
		this.vertex = vertex;
		childCount = 0;
		child = new Node[children];
	}

	public void addChildNode(Node adj) {
		adj.state = State.Unvisited;
		child[childCount] = adj;
		childCount++;
	}

	public Node[] getChildren() {
		return child;
	}

	public String getVertex() {
		return vertex;
	}

}
