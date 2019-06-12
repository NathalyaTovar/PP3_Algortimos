package Estructuras;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import static javafx.scene.input.KeyCode.X;

/**
 * clase para controlar el grafo
 */
public class ControladorGrafo<X> {
	private List<Vertice<X>> vertices;
	private List<Arista> aristas;
	private LinkedList<Vertice<X>> trazo;

	/**
	 * Al generar el contructor se inicializan y se crean objetos de las 3 listas
	 * necesarias.
	 */
	public ControladorGrafo() {
		this.vertices = new ArrayList<Vertice<X>>();
		this.aristas = new ArrayList<Arista>();
		this.trazo = new LinkedList<Vertice<X>>();
	}

	/**
	 * método para obtener el trazo del grafo
	 * 
	 * @return trazo con camino
	 */
	public LinkedList<Vertice<X>> getTrazo() {
		return trazo;
	}

	/**
	 * método para ingresar nuevo trazo
	 * 
	 * @param trazo trazo por ingresar
	 */
	public void setTrazo(LinkedList<Vertice<X>> trazo) {
		this.trazo = trazo;
	}

	/**
	 * método para obtener vertices
	 * 
	 * @return vertices del grafo
	 */
	public List<Vertice<X>> getVertices() {
		return vertices;
	}

	/**
	 * método para configurar vertices
	 * 
	 * @param vertices vertices nuevas para el grafo
	 */
	public void setVertices(List<Vertice<X>> vertices) {
		this.vertices = vertices;
	}

	/**
	 * método para obtener aristas
	 * 
	 * @return aristas
	 */
	public List<Arista> getAristas() {
		return aristas;
	}

	/**
	 * MÉtodo para ingresar aristas al grafo
	 * 
	 * @param aristas nuevas aristas
	 */
	public void setAristas(List<Arista> aristas) {
		this.aristas = aristas;
	}

	/**
	 * Permite generar relaciones entre los v�rtices (que deben ser existentes) y
	 * las aristas
	 * 
	 * @param id_arista           ID que se le dará a las aristas
	 * @param id_lista_vertices_A ID del vértice del cuál se parte
	 * @param id_lista_vertices_B ID del vértice de llegada
	 * @param distanciaTrayecto   La distancia que hay entre el Vértice de partida
	 *                            y el v�rtice de llegada
	 */
	public void nuevaArista(String id_arista, int id_lista_vertices_A, int id_lista_vertices_B,
			double distanciaTrayecto) {

		Arista arista = new Arista(id_arista, vertices.get(id_lista_vertices_A),
				vertices.get(id_lista_vertices_B), distanciaTrayecto);
		aristas.add(arista);
	}

	/**
	 * Permite generar nuevos vértices para ser utilizados dentro del grafo
	 * 
	 * @param id_vertice  ID del vértice que se desea cear
	 * @param nodoExterno Objeto externo que se desea insertar dentro del vértice
	 */
	public void nuevoVertice(String id_vertice, X nodoExterno) {
		Vertice<X> vertice = new Vertice<X>(id_vertice, nodoExterno);
		vertices.add(vertice);
	}

	/**
	 * método para obtener el id según el string de un vértice
	 * 
	 * @param id_vertice id del vértice buscado
	 * @return vértice con el valor buscado
	 */
	public Vertice<X> obtenerVerticePorID(String id_vertice) {
		Vertice<X> verticeNuevo = null;
		for (Vertice<X> verticeAnidado : vertices) {
			if (verticeAnidado.getId().equals(id_vertice)) {
				verticeNuevo = verticeAnidado;
				return verticeNuevo;
			}
		}
		return null;
	}
}
