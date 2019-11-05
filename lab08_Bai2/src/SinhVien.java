public class SinhVien {
    private String hoTen;
    private int namSinh;
    private double dtb;
    public SinhVien(){
        hoTen=null;
        namSinh=0;
        dtb=0;
    }
    public SinhVien(String ht,int ns,double d){
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
}
