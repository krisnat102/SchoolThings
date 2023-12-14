package Abstract.Uni;

public class Student extends Person {
    public int getFn() {
        return fn;
    }

    public void setFn(int fn) {
        this.fn = fn;
    }

    private int fn;

    @Override
    public void WelcomeMessage() {
        System.out.println("hello " + getName());
    }
}
