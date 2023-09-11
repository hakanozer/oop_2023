package inheritance;

public class C extends Base{

    public C() {
        System.out.println("C Call");
    }

    @Override
    public void call() {
        action(400, 500);
    }
}
