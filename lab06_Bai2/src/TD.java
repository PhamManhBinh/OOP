import java.util.*;
public class TD {
    private Hashtable td;
    public TD(){
        td=new Hashtable();
    }
    public void them(String tu,Nghia ng){
        td.put(tu,ng);
    }
    public Nghia tra(String tu){
        return (Nghia)td.get(tu);
    }
    public void hienThi(){
        Enumeration e=td.keys();
        while(e.hasMoreElements()){
            String tu=(String)e.nextElement();
            Nghia ng=(Nghia)td.get(tu);
            System.out.println(tu+":"+ng);
        }
    }
}
