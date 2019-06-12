package Structures;

import java.util.List;

/**
 * This class allows to generate the links between a vertice and an edge
 * 
 * @author AARON RM
 *
 */

public class Graph<X> {
    private List<Vertice<X>> vertices;
    private List<Edge> edges;

    /**
     * Constructor
     * 
     * @param vertices
     * @param edges
     */
    public Graph(List<Vertice<X>> vertices, List<Edge> edges) {
        this.vertices = vertices;
        this.edges = edges;
    }
    
    // Getters and Setters
    
    //Rerturn the list of vertices
    public List<Vertice<X>> getVertices() {
        return vertices;
    }

    //Set the list of vertices
    public void setVertices(List<Vertice<X>> vertices) {
        this.vertices = vertices;
    }

    //Return the list of edges
    public List<Edge> getEdges(){
        return edges;
    }

    //Set the list of edges
    public void setEdges(List<Edge> edges) {
        this.edges = edges;
    }

    @Override
    /**
     * Method to return the variables in string
     */
    public String toString() {
        String msj = "";
        msj += vertices.toString();
        msj += edges.toString();
        return msj;
	}
}
