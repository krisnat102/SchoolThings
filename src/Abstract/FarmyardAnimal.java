package Abstract;

abstract class FarmyardAnimal {
    public abstract void MakeNoise();

    private int posX, posY;
    public void SetMove(int newX, int newY) {
        posX = newX;
        posY = newY;
    }
}


