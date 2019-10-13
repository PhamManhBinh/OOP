public class Main {
public static void main(String[] args) {
    SinhVien[] sv = new SinhVien[3];
    Diem[] monhoc = new Diem[6];
    monhoc[0]= new Diem("Giải tích",3,8,7,6);
    monhoc[1]= new Diem("Mác - Lênin",3,7,5,8);
    monhoc[2]= new Diem("Tư tưởng HCM",3,4,1,5);
    monhoc[3]= new Diem("Lập trình cơ bản",3,9,9,7);
    monhoc[4]= new Diem("Toán Logic",3,8,7,6);
    monhoc[5]= new Diem("Đại số tuyến tính",3,7,8,5);
    sv[0]= new SinhVien("Phạm Mạnh Bình",monhoc[0],monhoc[1]);
    sv[1]= new SinhVien("Nguyễn Hồng Phong",monhoc[2],monhoc[3]);
    sv[2]= new SinhVien("Kim Luyện",monhoc[4],monhoc[5]);
    
    for(int i=0;i<3;i++)
        System.out.println(sv[i]);
    }

    
}
