package Estructuras;

/**
 * Los v�rtices del Dijkstra son sus nodos de información, por lo que estos
 * pueden generar dependencia con otros objetos que se deseen ubicar al grafo.
 *
 * @param <objetoGenerico>
 */
public class Vertice<X> {
	private String id_vertice;
	private X nodoInterno;

	// CONSTRUCTOR
	public Vertice(String pId, X pNodoInterno) {
		this.id_vertice = pId;
		this.nodoInterno = pNodoInterno;
	}
	// GETTERS Y SETTERS

	public String getId() {
		return id_vertice;
	}

	public void setId(String id) {
		this.id_vertice = id;
	}

	public X getNodoInterno() {
		return nodoInterno;
	}

	public void setNodoInterno(X nodoInterno) {
		this.nodoInterno = nodoInterno;
	}

	@Override
        /**
         * método para obtener variables en string
         */
	public String toString() {
		String msj = "";
		msj += "Place: ID:" + id_vertice + " ";
		msj += nodoInterno.toString();
		return msj;
	}
}
