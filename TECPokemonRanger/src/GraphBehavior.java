package Structures;

import java.util.*;

/*
 *This interface contains the necessary methods to execute graphs
 */

public interface GraphBehavior<X> {
    public void executeGraph(X graph);

    public LinkedList<X> getRoadList(X pDestino);
}
