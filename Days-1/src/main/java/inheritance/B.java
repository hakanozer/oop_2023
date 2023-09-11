package inheritance;

public class B extends Base{

    public B() {
        System.out.println("B Call");
    }

    @Override
    public void call() {
        action(300,400);
    }
}
