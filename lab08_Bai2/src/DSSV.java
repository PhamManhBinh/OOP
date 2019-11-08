import java.io.*;
import java.util.*;
public class DSSV {
    private SinhVien ds[];
    private int soSV;
    public DSSV(int n){
        ds=new SinhVien[n];
        soSV=0;
    }
    public void them(SinhVien sv){
        ds[soSV++]=sv;
    }
    public void docTep(String link){
        try{
        FileInputStream f=new FileInputStream(link);
        Scanner sc=new Scanner(f);
        int i=0;
       while(sc.hasNextLine()){
            String s=sc.nextLine();
            StringTokenizer st=new StringTokenizer(s,"-");
            String ht=st.nextToken();
            int ns=Integer.parseInt(st.nextToken());
            double d=Double.parseDouble(st.nextToken());
            ds[soSV]=new SinhVien(ht,ns,d);
            soSV++;
        }
        sc.close(); f.close();
        }catch(IOException e){System.out.println("có lỗi đọc file");}
        
    }
    public void ghiTep(String link){
        try{
        FileOutputStream f=new FileOutputStream(link);
        PrintWriter pw=new PrintWriter(f);
        for(int i=0;i<soSV;i++){
            pw.println(ds[i]);
        }
        pw.close(); f.close();
        }catch(IOException e){System.out.println("có lỗi ghi file");}
    }
    public void hienThi(){
        for(int i=0;i<soSV;i++)
            ds[i].hienThi();
    }
}
