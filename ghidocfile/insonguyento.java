package ghidocfile;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;

public class insonguyento {
    public static boolean sonuyento(int n){
        if(n < 2){
            return false;
        }
        for(int i=2; i<=Math.sqrt(n);i++){
            if(n % i == 0){
                return false;
            }
        } return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            Writer wr = new FileWriter("E:\\Java\\snt.txt");
            int n;
            System.out.print("nhap so chu so: ");
            n = sc.nextInt();
            for (int i=0;i<=n;i++){
                if(sonuyento(i)){
                    wr.write(Integer.toString(i) + " ");
                }
            } wr.close();
            Reader g = new FileReader("E:\\Java\\snt.txt");
            int data = g.read();
            while(data != -1){
                System.out.print((char) data);
                data = g.read();
            }
            g.close();
        }
        catch (Exception e) {
            //TODO: handle exception
            System.out.println(e);
        }
    }
}