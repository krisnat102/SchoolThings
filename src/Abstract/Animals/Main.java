package Abstract.Animals;



public class Main {
    public static void main(String[] args) {
        int posX = 5, posY = 10;
        Duck duck = new Duck();
        Pig pig = new Pig();
        duck.MakeNoise();
        pig.MakeNoise();
    }
}