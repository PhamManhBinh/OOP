public class SV {
    protected String hoTen;
    protected int namSinh;
    protected double dtb;
    public SV(String a,int b,double c){
        hoTen=a;
        namSinh=b;
        dtb=c;
    }
    public String layHoTen(){
        return hoTen;
    }
    public String loaiSV(){
        return "";
    }
    public void hienThi(){
        System.out.println(hoTen+", sinh năm: "+namSinh+",ĐTB: "+dtb);
    }
    public boolean duocTN(){
        return true;
    };
    public boolean equals(Object s){
        if(s instanceof SV)
        {
            SV ss=(SV) s;
            return hoTen.equals(ss.hoTen)&& namSinh==ss.namSinh && dtb==ss.dtb;
        }
        else return false;
    }
}
