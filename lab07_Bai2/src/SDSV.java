class SDSV {
    public static void main(String[] args){
        SinhVien s=new SinhVien("Pham Manh Binh",2000,7.5);
        s.ghiTep("D:/sv.txt");
        SinhVien s2=new SinhVien();
        s2.docTep("D:/sv.txt");
        s2.hienThi();
    }
}
