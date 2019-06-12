package Pokemon;

public class Information {
    //Attributes
    private String species;
    private String name;
    private String preevolution;
    private String possibleEvolution;
    private String parent;
    private String children;

    private int attack;
    private int defense;
    private int specialAttack;
    private int specialDefense;

    private double speed;
    
    //Constructor
    public Information(String especie, String nombre, String preevolucion, String posibleEvolucion, String padre, String hijos, int ataque, int defensa, int atacaEspecial, int defensaEspecial, double velocidad) {
        this.species = especie;
        this.name = nombre;
        this.preevolution = preevolucion;
        this.possibleEvolution = posibleEvolucion;
        this.parent = padre;
        this.children = hijos;
        this.attack = ataque;
        this.defense = defensa;
        this.specialAttack = atacaEspecial;
        this.specialDefense = defensaEspecial;
        this.speed = velocidad;
    }
    
    //Getters and Setters
    //Return the species of a pokemon
    public String getSpecies() {
        return species;
    }

    //Return the name of a pokemon
    public String getName() {
        return name;
    }

    //Return the preevolution of a pokemon
    public String getPreevolution() {
        return preevolution;
    }

    //Return the possible evolution of a pokemon
    public String getPossibleEvolution() {
        return possibleEvolution;
    }

    //Return the parent of a pokemon
    public String getParent() {
        return parent;
    }

    //Return the children of a pokemon
    public String getChildren() {
        return children;
    }

    //Return the attack of a pokemon
    public int getAttack() {
        return attack;
    }

    //Return the defense of a pokemon
    public int getDefense() {
        return defense;
    }

    //Return the specialAttack of a pokemon
    public int getSpecialAttack() {
        return specialAttack;
    }

    //Return the specialDefense of a pokemon
    public int getSpecialDefense() {
        return specialDefense;
    }

    //Return the speed of a pokemon
    public double getSpeed() {
        return speed;
    }

    //Set the species of a pokemon
    public void setSpecies(String species) {
        this.species = species;
    }

    //Set the name of a pokemon
    public void setName(String name) {
        this.name = name;
    }

    //Set the perevolution of a pokemon
    public void setPreevolution(String preevolution) {
        this.preevolution = preevolution;
    }

    //Set the possibleEvolution of a pokemon
    public void setPossibleEvolution(String possibleEvolution) {
        this.possibleEvolution = possibleEvolution;
    }

    //Set the parent of a pokemon
    public void setParent(String parent) {
        this.parent = parent;
    }

    //Set the children of a pokemon
    public void setChildren(String children) {
        this.children = children;
    }

    //Set the attack of a pokemon
    public void setAttack(int attack) {
        this.attack = attack;
    }

    //Set the defense of a pokemon
    public void setDefense(int defense) {
        this.defense = defense;
    }

    //Set the special attack of a pokemon
    public void setSpecialAttack(int specialAttack) {
        this.specialAttack = specialAttack;
    }

    //Set the defense of a pokemon
    public void setSpecialDefense(int specialDefense) {
        this.specialDefense = specialDefense;
    }

    //Set the speed of a pokemon
    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
