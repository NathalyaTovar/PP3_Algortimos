/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Management;

/**
 *
 * @author crisg
 */
public class PuntoDeInteres {
    
    
    double LatitudY, LongitudX;
    
    String Tipo, Nombre;
    
    public PuntoDeInteres(double LatitudY, double LongitudX, String Tipo, String Nombre) {
        this.LatitudY =  LatitudY;
        this.LongitudX = LongitudX;
        this.Tipo = Tipo;
        this.Nombre=Nombre;
    }

    public double getLatitudY() {
        return LatitudY;
    }

    public void setLatitudY(long LatitudY) {
        this.LatitudY = LatitudY;
    }

    public double getLongitudX() {
        return LongitudX;
    }

    public void setLongitudX(long LongitudX) {
        this.LongitudX = LongitudX;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
    
    
}
