public class Main { 
    public static void main(String[] args) {
        //dog object
        Dog pet1 = new Dog("Alucard", "Doberman", "Black", 10, "T-Bone", 
                                    false, true);
        
        System.out.println(pet1.getName() + " is a " + pet1.getTypeOfAnimal()
                            + ", his coat is " + pet1.getColor()+ ", and he is " + 
                            pet1.getAge()+ " years old. " + "His favorite food is " 
                            + pet1.getFavFood() + ".");
        pet1.isBarking(true);
        pet1.isPlaying(true);
        
        //cat object
        Cat pet2 = new Cat("Seras", "British Shorthair", "Grey", 3, "Tuna",
                                false, true);
        System.out.println("");
        
        System.out.println(pet2.getName() + " is a " + pet2.getTypeOfAnimal()
                            + ", her coat is " + pet2.getColor()+ ", and she is " + 
                            pet2.getAge()+ " years old. " + "Her favorite food is " 
                            + pet2.getFavFood() + ".");
        pet2.isMeowing(true);
        pet2.isPlaying(true);
    }
}
