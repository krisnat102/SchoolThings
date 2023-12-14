package Abstract.Uni;

public class Teacher extends Person {
    @Override
    public void WelcomeMessage() {
        System.out.println("hello " + getName());
    }
}
