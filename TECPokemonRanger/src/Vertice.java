package Structures;

/**
 * This class is to creat the graphs vertices 
 */

public class Vertice<X> {
    private String id_vertice;
	private X internalNode;

	//Constructor
	public Vertice(String id_vertice, X internalNode) {
            this.id_vertice = id_vertice;
            this.internalNode = internalNode;
	}
        
	//Getters and Setters
        
        //Return the id of a vertice
	public String getId() {
            return id_vertice;
	}

        //Set the id of a vertice
	public void setId(String id_vertice) {
            this.id_vertice = id_vertice;
	}

        //Return the internal node 
	public X getInternalNode() {
		return internalNode;
	}

        //Set the internal Node
	public void setInternalNode(X internalNode) {
		this.internalNode = internalNode;
	}

	@Override
        /*
         * Method that returns the string representation of vertices
         */
	public String toString() {
		String msj = "";
		msj += "Place (Id):" + id_vertice + " ";
		msj += internalNode.toString();
		return msj;
	}
}
