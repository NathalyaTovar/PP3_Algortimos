package Pokemon;

public class Informacion {
    
    //Atributos
    private String especie;
    private String nombre;
    private String preevolucion;
    private String posibleEvolucion;
    private String padre;
    private String hijos;

    private int ataque;
    private int defensa;
    private int atacaEspecial;
    private int defensaEspecial;

    private double velocidad;
    
    //Constructor
    public Informacion(String especie, String nombre, String preevolucion, String posibleEvolucion, String padre, String hijos, int ataque, int defensa, int atacaEspecial, int defensaEspecial, double velocidad) {
        this.especie = especie;
        this.nombre = nombre;
        this.preevolucion = preevolucion;
        this.posibleEvolucion = posibleEvolucion;
        this.padre = padre;
        this.hijos = hijos;
        this.ataque = ataque;
        this.defensa = defensa;
        this.atacaEspecial = atacaEspecial;
        this.defensaEspecial = defensaEspecial;
        this.velocidad = velocidad;
    }
    
    //Metodos
    public String getEspecie() {
        return especie;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPreevolucion() {
        return preevolucion;
    }

    public String getPosibleEvolucion() {
        return posibleEvolucion;
    }

    public String getPadre() {
        return padre;
    }

    public String getHijos() {
        return hijos;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public int getAtacaEspecial() {
        return atacaEspecial;
    }

    public int getDefensaEspecial() {
        return defensaEspecial;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPreevolucion(String preevolucion) {
        this.preevolucion = preevolucion;
    }

    public void setPosibleEvolucion(String posibleEvolucion) {
        this.posibleEvolucion = posibleEvolucion;
    }

    public void setPadre(String padre) {
        this.padre = padre;
    }

    public void setHijos(String hijos) {
        this.hijos = hijos;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public void setAtacaEspecial(int atacaEspecial) {
        this.atacaEspecial = atacaEspecial;
    }

    public void setDefensaEspecial(int defensaEspecial) {
        this.defensaEspecial = defensaEspecial;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }
    
    
    
    
}
