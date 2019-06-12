package Structures;

/*
 * This class contains the necessary methods to use edges of a graph
 */

public class Edge<X> {
    private String id_edge;
	private Vertice<X> startingPoint;
	private Vertice<X> arrivalPoint;
	private double length;

	//Constructor
	public Edge(String id_edge, Vertice<X> startingPoint, Vertice<X> arrivalPoint, double length) {
		this.id_edge = id_edge;
		this.startingPoint = startingPoint;
		this.arrivalPoint = arrivalPoint;
		this.length = length;
	}
	
        //Getters and Setter
        //Return the id_edge
	public String getId_edge() {
		return id_edge;
	}
        
        //Set the id_edge
	public void setId_edge(String id_edge) {
		this.id_edge = id_edge;
	}
        
        //Return the startingPoint 
	public Vertice<X> getStartingPoint() {
		return startingPoint;
	}
        
        //Set the startingPoint
	public void setStartingPoint(Vertice<X> startingPoint) {
		this.startingPoint = startingPoint;
	}
        
        //Return the arrivalPoint
	public Vertice<X> getArrivalPoint() {
		return arrivalPoint;
	}
        
        //Set the arrivalPoint
	public void setArrivalPoint(Vertice<X> arrivalPoint) {
		this.arrivalPoint = arrivalPoint;
	}
        
        //Return the length
	public double getLength() {
		return length;
	}
        
        //Set the length
	public void setLongitud(int length) {
		this.length = length;
	}
	
        //Method to obtain the representation in string of the edges
	public String toString() {
		String msj = "";
		msj += "ID: " + id_edge + "\n";
		msj += "Starting edge: \n";
		msj += startingPoint.toString();
		msj += arrivalPoint.toString();
		msj += "Length: " + length;
		return msj;
	}
}
