import java.util.*;
class SV {
    private String hoTen;
    private Date ngaySinh;
    private double dtb;
    public SV(String ht,Date ns,double dtb){
        hoTen=ht;
        ngaySinh=ns;
        this.dtb=dtb;
    }
    public String layHoTen(){
        return hoTen;
    }
    public void ganHoTen(String ht){
        hoTen=ht;
    }
    public Date layNgaySinh(){
        return ngaySinh;
    }
    public void ganNgaySinh(Date ns){
        ngaySinh=ns;
    }
    public double layDTB(){
        return dtb;
    }
    public void ganDTB(double dtb){
        this.dtb=dtb;
    }
    public void hienThi(){
        System.out.println(hoTen+", Ngày sinh: "+ngaySinh.getDate()+"/"+ngaySinh.getMonth()+"/"+ngaySinh.getYear()+", điểm TB: "+dtb);
    }
    public String layHo(){
        String a=this.layHoTen();
        return a.split(" ")[0];
    }
    public String layDem(){
        StringTokenizer a=new StringTokenizer(this.layHoTen());
        int dem=a.countTokens()-1;
        String s="";
        for(int i=1;i<dem;i++){
            s=s.concat(this.layHoTen().split(" ")[i]);
            if(i!=dem-1){
                s=s.concat(" ");
            }
        }
        return s;
        
    }
    public String layTen(){
        StringTokenizer a=new StringTokenizer(this.layHoTen());
        return this.layHoTen().split(" ")[a.countTokens()-1];
    }
    public int layTuoi(){
        Date ngayht=new Date();
        return (ngayht.getYear()+1900)-this.ngaySinh.getYear();
    }
    public String layXepLoai(){
        if(dtb<5){
            return "Yếu";
        } else {
           if(dtb<7){
               return "Trung bình";
           } else {
               if(dtb<8){
                   return "Khá";
               } else {
                   return "Giỏi";
               }
               
           }
        }
        
    }
}