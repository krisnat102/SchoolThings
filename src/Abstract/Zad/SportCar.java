package Abstract.Zad;

public class SportCar extends Vehicle {
    public float enginePower = 100f;
    public float speed;

    @Override
    public void Speed() {
        speed += enginePower/10;
    }
}