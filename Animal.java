//author @diana

public class Animal {
    private String name;
    private String typeOfAnimal;
    private String color;
    private int age;
    private String favFood;
    private boolean sleeping;
    private boolean playing;

    //constructor
    public Animal(String name, String typeOfAnimal, String color, int age, 
                    String favFood, boolean sleeping, boolean playing) {
        this.name = name;
        this.typeOfAnimal = typeOfAnimal;
        this.color = color;
        this.age = age;
        this.favFood = favFood;
        this.sleeping = sleeping;
        this.playing = playing;
    }

    //the following methods are getters and setters for related variables
    //name, typeOfAnimal, getColor, getAge, and getColor do not have setters
    //because that data I do not want to be accessable in main, only their getters
    
    public String getName() {
        return name;
    }

    public String getTypeOfAnimal() {
        return typeOfAnimal;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public String getFavFood(){
        return favFood;
    }
    
    public boolean isSleeping() {
        return sleeping;
    }

    public void setSleeping(boolean sleeping) {
        this.sleeping = sleeping;
    }
    
    public boolean isPlaying() {
        return playing;
    }

    public void setPlaying(boolean playing) {
        this.playing = playing;
    }
}
