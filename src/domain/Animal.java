package domain;

public class Animal {
    
    protected String name;
    
    protected int age;
    
    protected int weight;
    
    public Animal()     {
        name = "Elephant";
        age = 3;
        weight = 1000;  
    }
    
    public void eat() {
        System.out.println("Animal is eating");
    } 
    
    public void breathe() {
        System.out.println("Animal is breathing");
    }
        
    public void sleep() {
        System.out.println("Animal is sleeping");
    }

    @Override
    public String toString() {
        return "Animal: " + "\nName=" + name + "\nAge=" + age + "\nWeight=" + weight + "\n";
    }
    
    }
