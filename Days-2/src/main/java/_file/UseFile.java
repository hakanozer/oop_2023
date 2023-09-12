package _file;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UseFile {

    private String fileName = "";
    private File file;

    public UseFile( String fileName ) {
        this.fileName = fileName;
        this.fileName = this.fileName + ".txt";
        file = new File( this.fileName );
    }

    public void write( String line ) {
        try {
            FileWriter fileWriter = new FileWriter(file, true);
            fileWriter.write(line);
            fileWriter.write(System.lineSeparator());
            fileWriter.close();
        }catch (Exception ex) {
            System.err.println("Write Error : " + ex);
        }
    }

    public List<String> read() {
        List<String> list = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
               String line = scanner.nextLine();
               list.add(line);
            }
        }catch (Exception ex) {
            System.err.println("read Error : " + ex);
        }
        return list;
    }


}
