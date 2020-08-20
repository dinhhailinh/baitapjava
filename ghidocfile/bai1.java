package ghidocfile;

import java.io.File;

public class bai1 {
    public static void main(final String[] args) {
        File fil = null;
        try {
            fil = new File("E:\\Java\\test");
            if(fil.isFile()){
                System.out.println(fil.getName());
                System.out.println(fil.length());
            }
            
            else if (fil.isDirectory()) {
                System.out.println("la file");
                System.out.println(fil.getName());
                System.out.println(fil.length());
            }
            else{
                System.out.println("xxxxx");
            }
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e);
        }
    }
}