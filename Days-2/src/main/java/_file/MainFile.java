package _file;

import java.util.List;

public class MainFile {
    public static void main(String[] args) {

        UseFile file = new UseFile("Log");
        file.write("log line code -" + Math.random());
        List<String> list = file.read();
        System.out.println(list);

    }
}
