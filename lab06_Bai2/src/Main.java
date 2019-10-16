public class Main {
    public static void main(String[] args){
        TD tuDien=new TD();
        tuDien.them("Student",new Nghia("Học sinh","Danh từ","I'm a student"));
        tuDien.them("Sleep",new Nghia("Ngủ","Động từ","I'm sleeping"));
        tuDien.them("Beatiful",new Nghia("Xinh Đẹp","Tính từ","That girl is beautiful"));
        tuDien.them("Tree",new Nghia("Cây","Danh từ","Trees are vital"));
        
        System.out.println("Tra từ \"Student\":"+tuDien.tra("Student"));
        
        //Liệt kê toàn bộ các từ của từ điển
        System.out.println("Từ Điển Anh-Việt:");
        tuDien.hienThi();
    }
}
