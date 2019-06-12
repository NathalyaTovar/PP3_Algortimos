package Structures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * This class allows to implement a Djistra
 */
public class Dijkstra<X> {
    private List<Vertice<X>> vertices;
    private List<Edge> edges;
    private Set<Vertice<X>> controlledVertice;
    private Set<Vertice<X>> nonControlledVertice;
    private Map<Vertice<X>, Vertice<X>> predecessors;
    private Map<Vertice<X>, Double> distances;

    //Contructor
    public Dijkstra(Graph graph) {
        this.vertices = new ArrayList<Vertice<X>>(graph.getVertices());
        this.edges = new ArrayList<Edge>(graph.getEdges());
    }

    //Getters and Setters
    
    //Return the list vertices
    public List<Vertice<X>> getVertices() {
        return vertices;
	}

    //Set the list of vertices
    public void setVertices(List<Vertice<X>> vertices) {
        this.vertices = vertices;
    }

    //Return the list edges
    public List<Edge> getEdges() {
        return edges;
    }

    //Set the list edges
    public void setEdges(List<Edge> edges) {
        this.edges = edges;
    }

    //Return the controlled vertice
    public Set<Vertice<X>> getControlledVertice() {
        return controlledVertice;
    }

    //Set the controlled vertice
    public void setControlledVertice(Set<Vertice<X>> controlledVertice) {
        this.controlledVertice = controlledVertice;
    }

    //Return the non controlle vertice
    public Set<Vertice<X>> getNonControlledVertice() {
        return nonControlledVertice;
    }

    //Set the non controlled vertice
    public void setNonControlledVertice(Set<Vertice<X>> nonControlledVertice) {
        this.nonControlledVertice = nonControlledVertice;
    }

    //Return the predessors
    public Map<Vertice<X>, Vertice<X>> getPredecessors() {
        return predecessors;
    }

    //Set the predecessors
    public void setPredecessors(Map<Vertice<X>, Vertice<X>> predecessors) {
        this.predecessors = predecessors;
    }

    //Return the distances
    public Map<Vertice<X>, Double> getDistances() {
        return distances;
    }

    //Set the disctances
    public void setDistances(Map<Vertice<X>, Double> distances) {
        this.distances= distances;
    }

    //Returns true if the vertice is already counted
    private boolean isControlled(Vertice<X> vertice) {
        return controlledVertice.contains(vertice);
    }

    //Return of the route to the specified destination
    private double getShorterDistance(Vertice<X> destination) {
        Double distance = distances.get(destination);
        if (distance == null){
            return Double.MAX_VALUE;}
        return distance;
    }

    //Return the shorter distance between a vertice
    private Vertice<X> getMinimum(Set<Vertice<X>> vertices) {
        Vertice<X> minimum = null;
        for (Vertice<X> vertice : vertices){
            if (minimum == null){
                minimum = vertice;
            }else{
                if (getShorterDistance(vertice) < getShorterDistance(minimum))
                    minimum = vertice;
            }
        }
        return minimum;
    }

    //Return the neighbors of a vertice in a route 
    private List<Vertice<X>> getNeighbors(Vertice<X> Vertice) {
        List<Vertice<X>> neighbors = new ArrayList<Vertice<X>>();
        for (Edge edge : edges){
            if (edge.getStartingPoint().equals(Vertice) && !isControlled(edge.getArrivalPoint())){
                neighbors.add(edge.getArrivalPoint());
            }
        }
        return neighbors;
    }

    //Return the distance between two vertices
    private double getDistance(Vertice<X> starting, Vertice<X> arrival) {
            for (Edge edge : edges) {
                if (edge.getStartingPoint().equals(starting) && edge.getArrivalPoint().equals(arrival)){
                    return edge.getLength();
                }
            }
            throw new RuntimeException("This vertices does not have union with each other");
    }

    //Return the minimun distance between two vertices
    private void getMinimunDistance(Vertice<X> Vertice) {
        List<Vertice<X>> neighborVertices = getNeighbors(Vertice);
        for (Vertice<X> destinationVertice : neighborVertices) {
            if (getShorterDistance(destinationVertice) > getShorterDistance(Vertice) + getDistance(Vertice, destinationVertice)){
                    distances.put(destinationVertice,getShorterDistance(Vertice) + getDistance(Vertice, destinationVertice));
                    predecessors.put(destinationVertice, Vertice);
                    nonControlledVertice.add(destinationVertice);
            }
        }
    }

    /**
     * This method allows to generate a general mapping from a vertice.
     * This method must be run before getting GetListPath()
     * @param Vertice
     */
    public void executeGraph(Vertice<X> Vertice) {
        controlledVertice = new HashSet<>();
        nonControlledVertice = new HashSet<>();
        distances = new HashMap<>();
        predecessors = new HashMap<>();
        distances.put(Vertice, 0.0);
        nonControlledVertice.add(Vertice);

        while(nonControlledVertice.size() > 0) {
            Vertice<X> vertice = getMinimum(nonControlledVertice);
            controlledVertice.add(vertice);
            nonControlledVertice.remove(vertice);
            getMinimunDistance(vertice);
        }
    }

    /**
     * It allows to generate a list of nodes through which it is directed to the destination by a shorter distance
     * This method must be executed after executingGraph ();
     * 
     * @param Destino
     * @return 
     */
    public LinkedList<Vertice<X>> getListPath(Vertice<X> Destino) {
            LinkedList<Vertice<X>> DijkstraPath = new LinkedList<>();
            Vertice<X> stroke = Destino;
            if (predecessors.get(stroke) == null){
                    return null;
            }
            DijkstraPath.add(stroke);
            while (predecessors.get(stroke) != null) {
                    stroke = predecessors.get(stroke);
                    DijkstraPath.add(stroke);
            }                
            Collections.reverse(DijkstraPath);
            return DijkstraPath;
    }
}
