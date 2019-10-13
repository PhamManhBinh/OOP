public class SVTH extends SV{
    protected String tenDT;
    protected double diemDT;
    public SVTH(String a,int b,double c,String d,double e){
        super(a,b,c);
        tenDT=d;
        diemDT=e;
    }
    public String loaiSV(){
        return "TH";
    }
    public void hienThi(){
        System.out.println(hoTen+", sinh năm: "+namSinh+",ĐTB: "+dtb);
        System.out.println("Tên DT: "+tenDT+", Điểm DT: "+diemDT);
    }
    public boolean duocTN(){
        return dtb>=5 && diemDT>=7;
    }
    public boolean equals(Object s){
        if(s instanceof SVTH)
        {
            SVTH ss=(SVTH) s;
            return hoTen.equals(ss.hoTen)&& namSinh==ss.namSinh && dtb==ss.dtb 
                    && tenDT.equals(ss.tenDT) && diemDT==ss.diemDT;
        }
        else return false;
    }
}
