import java.io.*;
import java.util.*;
class SinhVien {
    private String hoTen;
    private int namSinh;
    private double dtb;
    public SinhVien(){
        hoTen="";
        namSinh=0;
        dtb=0;
    }
    public SinhVien(String ht, int ns, double d){
        hoTen=ht;
        namSinh=ns;
        dtb=d;
    }
    public void hienThi(){
        System.out.println(hoTen+"-"+namSinh+"-"+dtb);
    }
    public String toString(){
        return hoTen+"-"+namSinh+"-"+dtb;
    }
    public void ghiTep(String tenTep){
        try{
        FileOutputStream fo=new FileOutputStream(tenTep);
        PrintWriter pw=new PrintWriter(fo);
        pw.println(this);
        pw.close();
        }catch(IOException e){}
    }
    public void docTep(String tenTep){
        try{
        FileInputStream fi=new FileInputStream(tenTep);
        DataInputStream doc=new DataInputStream(fi);
        String s=doc.readLine();
        StringTokenizer st=new StringTokenizer(s,"-");
        hoTen=st.nextToken();
        namSinh=Integer.parseInt(st.nextToken());
        dtb=Double.parseDouble(st.nextToken());
        doc.close();
        }catch(IOException e){}
    }
}
