import java.io.*;
import java.util.Scanner;

class TepVanBan{
    public static void taoTep(){
        try{
        FileOutputStream fo=new FileOutputStream("D:/songuyen.txt");
        PrintWriter pw=new PrintWriter(fo);
        for(int i=1;i<=100;i++){
            pw.print(((int)(Math.random()*1000))+" ");
            if(i%10==0) pw.println();
        }
        pw.close();
        }catch(IOException e){}
    }
    public static void docTep(){
        try{
        FileInputStream fi=new FileInputStream("D:/songuyen.txt");
        FileOutputStream fo=new FileOutputStream("D:/sochan.txt");
        PrintWriter pw=new PrintWriter(fo);
        Scanner sc=new Scanner(fi);
        int d=0;
        while(sc.hasNextInt()){
            int k=sc.nextInt();
            if(k%2==0){
                pw.print(k+" ");
                d++;
                if(d%10==0) pw.println();
            }
        }
        pw.close();
        }catch(IOException e){System.out.println("Không tìm thấy tệp songuyen.txt");}
    }
    public static void ghepTep(String d1,String d2){
        try{
        FileOutputStream fo=new FileOutputStream("D:/tepghep.txt");
        PrintWriter pw=new PrintWriter(fo);
        Scanner sc=new Scanner(new FileInputStream(d1));
        while(sc.hasNextLine()){
            pw.print(sc.nextLine());
            pw.println();
        }
        sc=new Scanner(new FileInputStream(d2));
        while(sc.hasNextLine()){
            pw.print(sc.nextLine());
            pw.println();
        }
        pw.close();
        }catch(IOException e){}
    }
    public static void main(String[] args){
        taoTep();
        docTep();
        ghepTep("D:/songuyen.txt","D:/sochan.txt");
    }
}