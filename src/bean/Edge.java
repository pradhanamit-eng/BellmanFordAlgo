package bean;

public class Edge {

	private double weight;
	private Vertex stratVertex;
	private Vertex targetVertex;

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public Vertex getStratVertex() {
		return stratVertex;
	}

	public void setStratVertex(Vertex stratVertex) {
		this.stratVertex = stratVertex;
	}

	public Vertex getTargetVertex() {
		return targetVertex;
	}

	public void setTargetVertex(Vertex targetVertex) {
		this.targetVertex = targetVertex;
	}

	public Edge(double weight, Vertex stratVertex, Vertex targetVertex) {
		this.weight = weight;
		this.stratVertex = stratVertex;
		this.targetVertex = targetVertex;
	}
	
	

}
