package _therad;

public class UseMainThread {
    public static void main(String[] args) {

        Runnable rn = () -> {
            try {

                Action ac1 = new Action("1.jpg");
                ac1.start();
                ac1.join();

                Action ac2 = new Action("2.jpg");
                ac2.start();
                ac2.join();

                Action ac3 = new Action("3.jpg");
                ac3.start();
                ac3.join();
            }catch (Exception ex) {}
        };
        new Thread(rn).start();

        System.out.println("This Line Call");

    }
}
