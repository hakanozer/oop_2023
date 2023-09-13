package _therad;

public class Action extends Thread {

    private String path = "";
    public Action(String path) {
        this.path = path;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                Thread.sleep(500);
                System.out.println("Image Upload - " + this.path);
            }
        }catch (Exception ex) {}
    }

}
