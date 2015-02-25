package mg.bfs;

import java.util.LinkedList;
import java.util.Queue;

public class BFSImpl {

	public Graph createGraph() {
		Graph g = new Graph();
		Node[] temp = new Node[8];
		temp[0] = new Node("A", 2);
		temp[1] = new Node("B", 2);
		temp[2] = new Node("C", 2);
		temp[3] = new Node("D", 0);
		temp[4] = new Node("E", 1);
		temp[5] = new Node("F", 0);
		temp[6] = new Node("G", 0);
		temp[7] = new Node("H", 0);

		temp[0].addChildNode(temp[1]);
		temp[0].addChildNode(temp[2]);
		temp[1].addChildNode(temp[3]);
		temp[1].addChildNode(temp[4]);
		temp[2].addChildNode(temp[5]);
		temp[2].addChildNode(temp[6]);
		temp[4].addChildNode(temp[7]);

		for (int i = 0; i < 8; i++) {
			g.addNode(temp[i]);
		}
		return g;
	}

	public void bfs(Node root) {
		if (null == root)
			return;

		Queue<Node> queue = new LinkedList<Node>();

		root.state = State.Visited;
		queue.add(root);

		while (!queue.isEmpty()) {
			Node r = queue.remove();
			System.out.print(r.getVertex() + "\t");
			r.state = State.Visited;

			for (Node n : r.getChildren()) {
				if (n.state == State.Unvisited) {
					queue.add(n);
					n.state = State.Visited;
				}
			}
		}
	}

	public static void main(String[] args) {
		BFSImpl impl = new BFSImpl();
		Graph g = impl.createGraph();
		impl.bfs(g.getVertices()[0]);
	}

}
