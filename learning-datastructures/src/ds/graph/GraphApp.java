package ds.graph;

import java.util.Iterator;

public class GraphApp {

	public static void main(String[] args) {
		GraphUsingLinkedList graph = new GraphUsingLinkedList(5, "undirected");
		graph.addVertex("NB");
		graph.addVertex("GB");
		graph.addVertex("JB");
		graph.addVertex("IB");
		graph.addVertex("EB");
		
		graph.addEdge("NB","JB");
		graph.addEdge("NB","GB");
		graph.addEdge("IB","JB");
		graph.addEdge("GB","EB");
		graph.addEdge("EB","JB");
		
		graph.print();		
		
//		Object [] values = graph.findAdj(4);
//		for (Object val : values) {
//			System.out.println(val);
//		}
	}

}
