class Diem {
    private String tenHocPhan;
    private int soTinChi;
    private int chuyenCan,GiuaKy,CuoiKy;
    public int laySTC(){
    return soTinChi;
    }
    public Diem(String thp,int stc,int cc,int gk,int ck){
        tenHocPhan=thp;
        soTinChi=stc;
        chuyenCan=cc;
        GiuaKy=gk;
        CuoiKy=ck;
    }
    public double tinhDiem(){
        return 0.1*chuyenCan+0.2*GiuaKy+0.7*CuoiKy;
    }
}
