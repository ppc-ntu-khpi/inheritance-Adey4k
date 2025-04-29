package domain;

public class Elephant extends Mammal{
    
    private String habitat;
    
    public Elephant(String name, int age, int weight, String habitat){
        this.name=name;
        this.age=age;
        this.weight=weight;
        this.habitat=habitat;
    }
    
        public Elephant(){
        this("John", 4, 1000, "forest");
    }
    
    public Elephant(String name){
        this(name, 4, 1000, "forest");
    }    
    
    public void draw() {
        System.out.println("Elephant drawing");
    }    

    @Override
    public void move() {
        System.out.println("Elephant moving somewhere");
    }

    @Override
    public String toString() {
        return super.toString()+"Habitat:" + this.habitat + "\n"; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void sleep() {
        System.out.println("Elephant sleeping");
    }

    @Override
    public void breathe() {
        System.out.println("Elephant toook a deep breathe");
    }

    @Override
    public void eat() {
        System.out.println("Elephant eating");
    }
    
}
