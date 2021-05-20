//author @diana

public class Dog extends Animal{

    //constructor
    public Dog(String name, String typeOfAnimal, String color, int age, 
                String favFood, boolean sleeping, boolean playing) {
        super(name, typeOfAnimal, color, age, favFood, sleeping, playing);
    }
    
    //method for if dog is awake and barking
    public void isBarking(boolean awake){
        if(awake == true){
            System.out.println("Bark bark!");
        }else
            System.out.println("Shhh! " + super.getName() + " is sleeping!");
    }
    
    //method for if dog is awake and playing
    public boolean isPlaying(boolean awake){
        if(awake == true){
            System.out.println(super.getName() + " is playing!");
        }else
            System.out.println("Shhh! " + super.getName() + " is sleeping!");
        
        return awake;
    }
    
     public void print(){
        System.out.println(super.getName() + " is a " + super.getTypeOfAnimal()
                            + ", his coat is " + super.getColor()+ ", and he is " + 
                            super.getAge()+ " years old. " + "His favorite food is " 
                            + super.getFavFood() + ".");
    }
}
