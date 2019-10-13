class SinhVien {
    private String hoTen;
    private double dm1,dm2;
    public SinhVien(String ten,Diem x,Diem y){
       hoTen=ten;
       dm1=x.tinhDiem();
       dm2=y.tinhDiem();
    }
    public double tinhDTB(){
        return (dm1+dm2)/2;
    }
    public String toString(){
        return "Họ tên Sinh Viên: "+hoTen+"\nĐiểm trung bình: "+tinhDTB();
    }
}
