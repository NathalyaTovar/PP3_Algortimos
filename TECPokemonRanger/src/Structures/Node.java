
package Structures;

/**
 *
 * @author fredy-18
 */
public class Node {
   private int name ;
   private boolean visitated ;
   private boolean label;
   private int accumulated; // lleva el acoulado de cada nodo
   private Node Predecessor;
   
   public Node(){
       this.name = -1;
       this.visitated = false;
       this.label = false;
       this.Predecessor  = null;
       this.accumulated=0;       

   }

     public int getName() {
        return name;
    }

    public boolean isVisitated() {
        return visitated;
    }

    public boolean isLabel() {
        return label;
    }

    public int getAccumulated() {
        return accumulated;
    }

    public Node getPredecessor() {
        return Predecessor;
    }

    public void setName(int name) {
        this.name = name;
    }

    public void setVisitated(boolean visitated) {
        this.visitated = visitated;
    }

    public void setLabel(boolean label) {
        this.label = label;
    }

    public void setAccumulated(int acomulado) {
        this.accumulated = acomulado;
    }

    public void setPredecessor(Node Predecessor) {
        this.Predecessor = Predecessor;
    }
}
