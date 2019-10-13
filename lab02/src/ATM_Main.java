public class ATM_Main {
    public static void main(String args[]) {
        ATM taikhoan[]=new ATM[5];
        taikhoan[0]=new ATM("1111111",500);
        taikhoan[1]=new ATM("2222222",850);
        taikhoan[2]=new ATM("3333333",1000);
        taikhoan[3]=new ATM("4444444",2500);
        taikhoan[4]=new ATM("5555555",100);
        
        taikhoan[0].napTien(1000);
        if(taikhoan[0].chuyenTien(taikhoan[1],500)){
            System.out.println("Chuyển tiền thành công");
        } else {
            System.out.println("Chuyển tiền không thành công");
        }
        
        if(taikhoan[1].rutTien(200)){
            System.out.println("Rút tiền thành công");
        } else {
            System.out.println("Rút tiền không thành công");
        }
        for(int i=0;i<5;i++)
            System.out.println(taikhoan[i]);
        
        int tong=0;
        for(int i=0;i<5;i++)
            tong+=taikhoan[i].laySoDu();
        
        System.out.println("Tổng số tiền của các tài khoản là: "+tong);
    }
    
}
