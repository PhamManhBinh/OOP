public class ThuNhap {
    private String hoTen;
    private double thuNhap;
    private boolean TNthuongXuyen;
    public ThuNhap(String hoTen,double thuNhap,boolean TX){
        this.hoTen=hoTen;
        this.thuNhap=thuNhap;
        TNthuongXuyen=TX;
    }
    public String getHoTen(){
        return hoTen;
    }
    public double getThuNhap(){
        return thuNhap;
    }
    public boolean getTNTX(){
        return TNthuongXuyen;
    }

    public void setHoTen(String ht){
        hoTen=ht;
    }
    public void setThuNhap(double tn){
        thuNhap=tn;
    }
    public void setTNTX(boolean tx){
        TNthuongXuyen=tx;
    }
    public double tinhThue(){
        if(!TNthuongXuyen)
                return thuNhap*5/100;
        else
            if(thuNhap>5000000)
                return thuNhap*10/100;
            else return 0;
    }
}
