package ghidocfile;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;

public class nhapsothuc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            //ghi file
            Writer wr = new FileWriter("E:\\Java\\sothuc.txt");
            int n;
            do {
                System.out.println("Nhập n số thực :");
                n = sc.nextInt();
            } while (n < 1 || n > 100);
            int[] a = new int[n]; 
            for (int i=0;i<n;i++) {
                System.out.print("So thu "+(i+1)+": ");
                a[i] = sc.nextInt();
                wr.write(String.valueOf(a[i])+" ");
            }
            wr.close();
            //doc file
            Reader r = new FileReader("E:\\Java\\sothuc.txt");
            int data = r.read();
            while (data != -1) {
                System.out.print((char) data);
                data = r.read();
            } r.close();
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e);
        }
    }
}