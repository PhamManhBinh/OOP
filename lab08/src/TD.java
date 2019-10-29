import java.util.*;
import java.io.*;
public class TD {
private Hashtable td;
public TD(String tenTep){
td = new Hashtable();
try {
FileInputStream f=new FileInputStream(tenTep);
DataInputStream d=new DataInputStream(f);
while(d.available()>0) {
String s=d.readLine();
StringTokenizer ss=new StringTokenizer(s,":-");
String ta=ss.nextToken();
String pl=ss.nextToken();
String n =ss.nextToken();
String vdu=ss.nextToken();
Nghia ng=new Nghia(n,pl,vdu);
td.put(ta,ng);
}
d.close();
}catch(Exception e) {}
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
    public void luuTD(String tenTep) {
    try {
    FileOutputStream f=new FileOutputStream(tenTep);
    PrintWriter d=new PrintWriter(f);
Enumeration e=td.keys();
    while(e.hasMoreElements()) {
    String tu=(String)e.nextElement();
    Nghia ng=(Nghia)td.get(tu);
    d.println(tu+": "+ng);
    }
    d.close();
    }catch(IOException e) {}
    }
}