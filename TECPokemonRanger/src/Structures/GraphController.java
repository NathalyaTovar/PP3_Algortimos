package Structures;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * This class is to control a created graph
 */

public class GraphController<X> {
    private List<Vertice<X>> vertices;
    private List<Edge> edges;
    private LinkedList<Vertice<X>> stroke;

    //Constructor
    public GraphController() {
            this.vertices = new ArrayList<>();
            this.edges = new ArrayList<>();
            this.stroke = new LinkedList<>();
    }
    
    //Return the vertice stroke
    public LinkedList<Vertice<X>> getStroke() {
            return stroke;
    }

    //Set a stroke
    public void setStroke(LinkedList<Vertice<X>> stroke) {
            this.stroke = stroke;
    }

    //Return the list of vertices
    public List<Vertice<X>> getVertices() {
            return vertices;
    }

    //Set vertices
    public void setVertices(List<Vertice<X>> vertices) {
            this.vertices = vertices;
    }
    
    //Return the list of edges
    public List<Edge> getEdges() {
            return edges;
    }

    //Set edges
    public void setEdges(List<Edge> edges) {
            this.edges = edges;
    }

    /**
     * Creates a new edge in the graph
     * 
     * @param id_edge 
     * @param startingPoint
     * @param arrivalPoint
     * @param routeDistance
     */
    
    public void newEdge(String id_edge, int startingPoint, int arrivalPoint, double routeDistance) {
        Edge edge = new Edge(id_edge, vertices.get(startingPoint), vertices.get(arrivalPoint), routeDistance);
        edges.add(edge);
    }

    /**
     * Creates a new vertice in the graph
     * 
     * @param id_vertice 
     * @param externalNode
     */
    
    public void newVertice(String id_vertice, X externalNode) {
        Vertice<X> vertice = new Vertice<X>(id_vertice, externalNode);
        vertices.add(vertice);
    }

    //Returns the i of a vertice
    public Vertice<X> getVerticeByID(String id_vertice) {
            Vertice<X> newVertice = null;
            for (Vertice<X> nestedVertice : vertices) {
                    if (nestedVertice.getId().equals(id_vertice)) {
                            newVertice = nestedVertice;
                            return newVertice;
                    }
            }
            return null;
    }
}
