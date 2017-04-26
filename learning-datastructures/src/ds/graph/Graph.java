package ds.graph;

import java.util.ArrayList;

public class Graph {
	private int verticesCount;
	private int edgeCount;
	
	private ArrayList[] adj;

	public Graph(int i) {
		this.verticesCount = i;
		this.edgeCount =0;
		adj = new ArrayList [verticesCount];
		
		for (int j = 0; j < verticesCount; j++) {
			adj[j] = new ArrayList();
		}
	}
	
	public int getVerticesCount() {
		return verticesCount;
	}

	public int getEdgeCount() {
		return edgeCount;
	}

	public void addEdge(int i, int j) {
		adj[i].add(j);
		edgeCount++;
	}

	public Object[] findAdj(int i) {
		// TODO Auto-generated method stub
		return adj[i].toArray();
	}

}
