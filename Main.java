public class Main { 
    public static void main(String[] args) {
        //dog object
        Dog pet1 = new Dog("Alucard", "Doberman", "Black", 10, "T-Bone", 
                                    false, true);
        pet1.printAnimal();
        pet1.isBarking(true);
        pet1.isPlaying(true);
        
        //cat object
        Cat pet2 = new Cat("Seras", "British Shorthair", "Grey", 3, "Tuna",
                                false, true);
        System.out.println("");
        
        pet2.printAnimal();
        pet2.isMeowing(true);
        pet2.isPlaying(true);
    }
}
