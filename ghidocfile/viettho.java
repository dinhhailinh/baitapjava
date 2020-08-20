package ghidocfile;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;

public class viettho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            Writer wr = new FileWriter("E:\\Java\\intho.txt");
            String c = "";
            int a;
            System.out.println("nhap so cau tho");
            a = sc.nextInt();
            System.out.println("bat dau nhap tho: ");
            for(int i = 0; i<=a;i++){
                c = sc.nextLine();
                wr.write(String.valueOf(c)+"\n");
            }wr.close();
            System.out.println("\nbai tho vua nhap:");
            Reader g = new FileReader("E:\\Java\\intho.txt");
            int data = g.read();
            while(data != -1){
                System.out.print((char) data);
                data = g.read();
            }
            g.close();
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e);
        }
    }
}