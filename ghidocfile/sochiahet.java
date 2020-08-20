package ghidocfile;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;



public class sochiahet {
    public static void main(final String[] args) {
        int k;
        
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("Nhập vào số k: ");
            k = scanner.nextInt();
        }while(k<2||k>9);
        try {
            Writer wr = new FileWriter("E:\\Java\\kq.txt");
            //100 so chia ket cho k
            int count = 0;
            for(int n=0;n<=1000;n++){
                if(count <= 100){
                    if(n%k==0){
                        wr.write(Integer.toString(n)+ " ");
                        count ++;
                    }
                }
            }
            wr.write("\n");
            //bang chu cai in hoa
            for(int i=65;i<=90;i++){
               
                wr.write(String.valueOf((char)i)+" ");
            }
            wr.write("\n");
            //bang chu cai in thuong
            for(int a=97;a<=122;a++){
                
                wr.write(String.valueOf((char)a)+" ");
            }

            wr.close();
            Reader g = new FileReader("E:\\Java\\kq.txt");
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