//author @diana

public class Cat extends Animal{

    //constructor
    public Cat(String name, String typeOfAnimal, String color, int age, 
                String favFood, boolean sleeping, boolean playing) {
        super(name, typeOfAnimal, color, age, favFood, sleeping, playing);
    }
    
    //method for if cat is awake and meowing
    public void isMeowing(boolean awake){
        if(awake == true){
            System.out.println("Meow meow!");
        }else
            System.out.println("Shhh! " + super.getName() + " is sleeping!");
    }
    
    //method for if cat is awake and playing
    public boolean isPlaying(boolean awake){
        if(awake == true){
            System.out.println(super.getName() + " is playing!");
        }else
            System.out.println("Shhh! " + super.getName() + " is sleeping!");
        
        return awake;
    }
}
