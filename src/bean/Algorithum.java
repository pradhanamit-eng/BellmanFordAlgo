package bean;

import java.util.List;

public class Algorithum {
	
	private List<Vertex> vertexList;
	private List<Edge> edgeList;
	public Algorithum(List<Vertex> vertexList, List<Edge> edgeList) {
		this.vertexList = vertexList;
		this.edgeList = edgeList;
	}
	
	public void shortestPath(Vertex sourceVertex,Vertex targetVertex)
	{
		sourceVertex.setMinDistance(0);
		
		for(int i=0;i<this.vertexList.size()-1;i++)
		{
			for(Edge edge:this.edgeList)
			{
				if(edge.getStratVertex().getMinDistance() == Double.MAX_VALUE) continue; 
				Vertex v = edge.getStratVertex();
				Vertex u = edge.getTargetVertex();
				
				double newDistance = v.getMinDistance() + edge.getWeight();
				
				if(newDistance < u.getMinDistance())
				{
					u.setMinDistance(newDistance);
					u.setPreviousVertex(v);
				}
				
			}
		}
		for(Edge edge:this.edgeList)
		{
			if(edge.getStratVertex().getMinDistance() != Double.MAX_VALUE)
			{
				if(hasCycle(edge))
				{
					System.out.println("This is Negative Cycle...");
				}
			}
		}
		
	}

	private boolean hasCycle(Edge edge) {
		return (edge.getStratVertex().getMinDistance() + edge.getWeight()) <edge.getTargetVertex().getMinDistance();
	}

}
