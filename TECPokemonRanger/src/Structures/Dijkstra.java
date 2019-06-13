package Structures;

import static GUI.PrincipalMenu.jPanel1;
import static GUI.PrincipalMenu.R_repaint;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author fredy-18
 */
public class Dijkstra {
   private  Trees trees;
   private int subTop;
   private Node aux=null;
   private int accumulatedAux; 
   private int subAccumulated;
   private Node node[]; 
   private int top;
   private int permanent;     
   private int endNode; 
   
   
    public Dijkstra (Trees trees, int top, int permanent, int endNode){
        this.trees = trees;        
        this.top = top;
        this.node= new Node[top]; 
        this.permanent = permanent;
        this.endNode = endNode;
        
    }

    public int getAccumulated(){
        return node[endNode].getAccumulated(); 
    }
        
    public void dijkstra(){ 
         for (int i = 0; i < top; i++)
            node[i]= new Node(); 
         
        if(permanent != endNode){
             jPanel1.paint(jPanel1.getGraphics());
             R_repaint(top, trees);   
             Paint.clickOnNode(jPanel1.getGraphics(), trees.getXcoordenate(permanent), trees.getYcoordenate(permanent), null,Color.GREEN); 
            
        
            node[permanent].setVisitated(true);        
            node[permanent].setName(permanent);       
            
            do{            
              subAccumulated=0;
              accumulatedAux = 2000000000; // lo igualamos a esta cifra ya q el acomulado de los nodos, supuestamente  nunca sera mayor 
              node[permanent].setLabel(true); 
              for (int j = 0; j < top; j++) {
                  if(trees.getMadjacency(j, permanent)==1){
                        subAccumulated= node[permanent].getAccumulated()+trees.getMcoefficient(j, permanent);                                 
                        if(subAccumulated <= node[j].getAccumulated()&& node[j].isVisitated()==true && node[j].isLabel()== false){
                            node[j].setAccumulated(subAccumulated);
                            node[j].setVisitated(true);
                            node[j].setName(j);
                            node[j].setPredecessor(node[permanent]);
                        }
                        else if( node[j].isVisitated()==false){
                            node[j].setAccumulated(subAccumulated);
                            node[j].setVisitated(true);
                            node[j].setName(j);
                            node[j].setPredecessor(node[permanent]); 
                       }
                 }
              }
              for (int i = 0; i <top; i++) { // buscamos cual de los nodos visitado tiene el acomulado menor par escogerlo como permanente 
                if(node[i].isVisitated()== true && node[i].isLabel()== false){
                   if(node[i].getAccumulated()<=accumulatedAux){
                       permanent= node[i].getName();
                       accumulatedAux= node[i].getAccumulated();
                   }
                }               
             }
            subTop++;                
          }while(subTop<top+1);          
           aux= node[endNode]; 
           if(aux.getPredecessor() == null )
             JOptionPane.showMessageDialog(null,"Could not reach the node "+endNode);          
          while(aux.getPredecessor() != null){           
              Paint.paintPath(jPanel1.getGraphics(), trees.getXcoordenate(aux.getName()), trees.getYcoordenate(aux.getName()), trees.getXcoordenate(aux.getPredecessor().getName()), trees.getYcoordenate(aux.getPredecessor().getName()),Color.GREEN);
              Paint.clickOnNode(jPanel1.getGraphics(), trees.getXcoordenate(aux.getName()), trees.getYcoordenate(aux.getName()), null,Color.GREEN);
             aux=aux.getPredecessor();              
          }  
         Paint.clickOnNode(jPanel1.getGraphics(), trees.getXcoordenate(endNode), trees.getYcoordenate(endNode), null,Color.GREEN);     
       }
       else Paint.clickOnNode(jPanel1.getGraphics(), trees.getXcoordenate(endNode), trees.getYcoordenate(endNode), null,Color.GREEN);    
    }
}
