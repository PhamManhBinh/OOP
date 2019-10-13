import java.util.*;

public class Main {

    public static void main(String args[]) {
        DSSV danhsach = new DSSV(5);
        SV sv[] = new SV[5];
        //Tạo danh sách gồm 5 sinh viên
        sv[0] = new SV("Phạm Mạnh Bình", new Date(2000, 1, 8), 7);
        sv[1] = new SV("Nguyễn Thanh Phong", new Date(1999, 4, 5), 5);
        sv[2] = new SV("Nguyễn Quốc Hiếu",  new Date(1999, 11, 30), 8);
        sv[3] = new SV("Lê Thị Ngọc Hòa",  new Date(2000, 7, 8), 5.5);
        sv[4] = new SV("Phan Thị Tuyết Nga", new Date(2000, 9, 10), 6.2);
        
        for (int i = 0; i < 5; i++) {
            danhsach.them(sv[i]);
        }
        
        //Sắp xếp danh sách theo họ tên
        danhsach.sapHoTen();
        
        //Liệt kê những sinh viên giỏi
        danhsach.lietKeXepLoai("Giỏi");
        
        //Tìm sinh viên tên Nam
        if (danhsach.timTen("Nam") > 0) {
            System.out.println("Tìm thấy SV tên Nam ở vị trí " + danhsach.timTen("Nam"));
        } else {
            System.out.println("Không tìm thấy");
        }
        
        //Xóa sinh viên đầu tiên tên Hòa
        danhsach.xoa("Hòa");

        //Tính tuổi trung bình
        int tuoiTB = 0;
        for (int i = 0; i < 5; i++) {
            tuoiTB += sv[i].layTuoi();
        }
        System.out.println("Tuổi trung bình là: " + tuoiTB / 5);
        
        //Tăng DTB lên 0.5 cho những SV sinh trước năm 1980
        for (int i = 0; i < 5; i++) {
            if ((sv[i].layNgaySinh().getYear() + 1900) < 1980) {
                sv[i].ganDTB(sv[i].layDTB() + 0.5);
            }
        }
        

    }
}
