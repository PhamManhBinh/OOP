import java.util.*;
public class DSSV {
    private Vector ds;
    public DSSV(){
        ds=new Vector();
    }
    public void them(SV a){
        if(ds.contains(a)==false)
        ds.addElement(a);
    }
    public void lietKe(){
        for(int i=0;i<ds.size();i++)
            ((SV)ds.elementAt(i)).hienThi();
    }
    public void lietKe(String s){
        for(int i=0;i<ds.size();i++)
            if(((SV)ds.elementAt(i)).loaiSV().equals(s)){
                ((SV)ds.elementAt(i)).hienThi();
            }
        
    }
    public void dsTN(){
        System.out.println("Danh sách SV được tốt nghiệp: ");
        for(int i=0;i<ds.size();i++)
            if(((SV)ds.elementAt(i)).duocTN()){
                ((SV)ds.elementAt(i)).hienThi();
            }
    }
    public SV tim(String ht){
        for(int i=0;i<ds.size();i++)
            if(((SV)ds.elementAt(i)).layHoTen().equals(ht)){
               return (SV)ds.elementAt(i);
            }
        return null;
    }
    public void xoa(String ht){
        for(int i=0;i<ds.size();i++)
            if(((SV)ds.elementAt(i)).layHoTen().equals(ht)){
                ds.removeElementAt(i);
                return;
            }
    }
}
