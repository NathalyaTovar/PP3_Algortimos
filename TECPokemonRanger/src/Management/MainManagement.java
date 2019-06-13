/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Management;

import Pokemon.Pokemon;
import Structures.Graph;
import java.io.IOException;
import java.util.*;

/**
 *
 * @author crisg
 */
public class MainManagement {
    
    ////En este grafo se almacenan los lugares o puntos de interes
    public static Graph <PuntoDeInteres>grafo =new Graph<>(new LinkedList() {},new LinkedList());
    
    
    //////En este grafo se guardan los pokemon
    public static Graph <Pokemon> grafo2=new Graph<>(new LinkedList(),new LinkedList());
    
    //////En esta lista se guardaran los pokemon
    public boolean asignarPaternidad(String Padre,String Hijo){
    return grafo2.nuevaPokeArista("", Padre, Hijo, 0);
    }
    
    /*public boolean anadirPokemon(){
        
    }*/

}
