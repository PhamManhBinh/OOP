public class Main {
    public static void main(String[] args) {
	SinhVien sv[]=new SinhVien[3];
        sv[0]=new SinhVien("Nguyễn Văn A",
                        new HPLyThuyet("Pháp Luật Đại Cương",3,6,7,8),
			new HPThucHanh("Lập trình cơ bản",4,7,8,9));
	sv[1]=new SinhVien("Phan Thị Nở",
			new HPLyThuyet("Nhập môn cơ sở dữ liệu",3,7,6,7),
			new HPThucHanh("Tin học đại cương",3,7,4,5));
	sv[2]=new SinhVien("Huỳnh Chí Phèo",
			new HPLyThuyet("Tư tưởng Hồ Chí Minh",3,9,6,8),
			new HPThucHanh("Lắp ráp máy tính",2,9,9,9));
		
		System.out.println(sv[0]);
		System.out.println(sv[1]);
		System.out.println(sv[2]);
	}

}
