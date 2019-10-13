public class SVSP extends SV{
    protected String noiTT;
    protected double diemTT;
    public SVSP(String a,int b,double c,String d,double e){
        super(a,b,c);
        noiTT=d;
        diemTT=e;
    }
    public String loaiSV(){
        return "SP";
    }
    public void hienThi(){
        System.out.println(hoTen+", sinh năm: "+namSinh+",ĐTB: "+dtb);
        System.out.println("Nơi thực tập: "+noiTT+", Điểm TT: "+diemTT);
    }
    public boolean duocTN(){
        return dtb>=5 && diemTT>=7;
    }
    public boolean equals(Object s){
        if(s instanceof SVSP)
        {
            SVSP ss=(SVSP) s;
            return hoTen.equals(ss.hoTen)&& namSinh==ss.namSinh && dtb==ss.dtb 
                    && noiTT.equals(ss.noiTT) && diemTT==ss.diemTT;
        }
        else return false;
    }
}
