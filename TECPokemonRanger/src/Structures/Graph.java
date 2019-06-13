package Structures;

import Pokemon.Pokemon;
import java.util.LinkedList;
import java.util.List;

/**
 * This class allows to generate the links between a vertice and an edge
 * 
 * @author Cris
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

    
	public void nuevaArista(String id_arista, int id_lista_vertices_A, int id_lista_vertices_B,double distanciaTrayecto) {

		Edge arista = new Edge(id_arista, vertices.get(id_lista_vertices_A),
				vertices.get(id_lista_vertices_B), distanciaTrayecto);
		edges.add(arista);
	}	
        
        
        public boolean nuevaPokeArista(String NombreArista, String Padre, String Hijo,double distanciaTrayecto) {
        int var1=-1;
        int var2=-1;
       
        for (int i=0; i<this.vertices.size();i++){
                Vertice<Pokemon> y=(Vertice<Pokemon>) this.vertices.get(i);
                if (y.getId()==Padre){
                   System.out.println(y.getId());
                   var1=i; 
                    System.out.println(var1);

                }
                if (y.getId()==Hijo){
                    System.out.println(y.getId());
                    var2=i;
                    System.out.println(var2);
                }
        }
        if (var1==-1 || var2==-1){return false;}
        
        Edge arista = new Edge(NombreArista, vertices.get(var1),vertices.get(var2), distanciaTrayecto);
        edges.add(arista);
        return true;  
        
	}

        
        
       public Pokemon conocerPadre(String Nombre){
        int var1=-1;
       
        for (int i=0; i<this.vertices.size();i++){
                Vertice<Pokemon> y=(Vertice<Pokemon>) this.vertices.get(i);
                if (y.getId().equals(Nombre)){
                    var1=i; 
                    System.out.println(var1);
                }
        }
            Vertice <Pokemon>aux=(Vertice <Pokemon>) this.vertices.get(var1);
            
            return (Pokemon) aux.getInternalNode();
        }
        

        public LinkedList conocerHijosaux(String Nombre){
        int var1=-1;
        LinkedList <Edge> lista=new LinkedList();
        
        for (int i=0; i<this.edges.size();i++){
                Edge y=this.edges.get(i);
                if (y.getId_edge()==Nombre){
                    lista.add(y);
                }
        }
        return lista;
        }
        
        
        public void conocerHijos(String Nombre){
        LinkedList<Edge> aux= conocerHijosaux(Nombre);
        
        for (int i =0; i<aux.size();i++){
            Edge arista= aux.get(i);
            Vertice<Pokemon> hijo = arista.getArrivalPoint();
            System.out.println(hijo.getId());
        }
            
        }
	/**
	 * Permite generar nuevos vértices para ser utilizados dentro del grafo
	 * 
	 * @param id_vertice  ID del vértice que se desea cear
	 * @param nodoExterno Objeto externo que se desea insertar dentro del vértice
	 */
	public boolean nuevoVertice(String id_vertice, X nodoExterno) {
            for (int i=0; i<vertices.size();i++){
                Vertice<X> y=vertices.get(i);
                if (y.getId()==id_vertice){
                    return false;
                }    
            }
		Vertice<X> vertice = new Vertice<X>(id_vertice, nodoExterno);
		vertices.add(vertice);
                return true;
	}
	@Override
	/**
	 * método para obtener las variables en string
	 */
	public String toString() {
		String msj = "";
		msj += vertices.toString();
		msj += edges.toString();
		return msj;
	}
}
