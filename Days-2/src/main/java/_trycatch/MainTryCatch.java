package _trycatch;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MainTryCatch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen Boyunuz Giriniz");
        String boy = scanner.nextLine();
        System.out.println("Lütfen Kilonuzu Giriniz");
        String kilo = scanner.nextLine();

        try {
            double dBoy = Double.parseDouble(boy);
            double dKilo = Double.parseDouble(kilo);
            double end = dBoy / dKilo;
            System.out.println("Vücut Oranınız: " + end);
        }catch (Exception ex) {
            // System.err.println(ex);
            System.err.println("Lütfen sadece sayıdal değerler giriniz!");
        }
        System.out.println("This line call");


        File file = new File("sample.txt");
        try {
            file.createNewFile();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        Action action = new Action();
        try {
            boolean status = action.userControl("ali100");
            System.out.println( status );
        }catch (Exception ex) {
            System.err.println("UserID Error");
        }


    }

}
