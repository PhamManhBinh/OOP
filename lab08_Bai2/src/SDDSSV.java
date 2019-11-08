public class SDDSSV {
    public static void main(String args[]){
        DSSV d1=new DSSV(100);
        SinhVien sv1=new SinhVien("Nguyen Van A",2000,8.5);
        SinhVien sv2=new SinhVien("Nguyen Van B",1999,7);
        d1.them(sv1);
        d1.them(sv2);
        d1.ghiTep("E:/dssv.dat");
        DSSV d2=new DSSV(100);
        d2.docTep("E:/dssv.dat");
        d2.hienThi();
              
    }
    
}
