package Abstract.Interface;

public class Mammal implements Animal{
    public void MakeNoise(){
        System.out.println("noise");
    }
    public void Move(){
        System.out.println("moves");
    }

    public static void main(String[] args) {
        Mammal mammal = new Mammal();
        mammal.MakeNoise();
        mammal.Move();
    }
}
