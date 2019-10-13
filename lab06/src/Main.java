public class Main {

    public static void main(String[] args) {
        DSSV ds=new DSSV();
        SVSP sv1=new SVSP("Bình",2000,7,"QN",7);
        SVSP sv2=new SVSP("Huy",1999,8,"SG",5);
        ds.them(sv1);
        ds.them(sv2);
        ds.lietKe("SP");
        ds.dsTN();
    }
    
}
