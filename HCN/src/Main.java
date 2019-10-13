public class Main {

	public static void main(String[] args) {
		//Tạo mảng chứa 5 hình chữ nhật
		HCN hinh[]=new HCN[5];
		hinh[0]=new HCN(new Diem(1,2),new Diem(4,5));
		hinh[1]=new HCN(new Diem(3,4),new Diem(6,8));
		hinh[2]=new HCN(new Diem(7,9),new Diem(1,0));
		hinh[3]=new HCN(new Diem(5,5),new Diem(0,0));
		hinh[4]=new HCN(new Diem(12,2),new Diem(2,3));
		
		//Sắp xếp theo thứ tự tăng của diện tích
		for(int i=0;i<4;i++)
			for(int j=i+1;j<5;j++)
				if(hinh[i].dienTich()>hinh[j].dienTich()) {
					HCN tg=hinh[i];
					hinh[i]=hinh[j];
					hinh[j]=tg;
				}
		//Hiển thị
		for(int i=0;i<5;i++) {
			System.out.println(hinh[i]);
			System.out.print("Chu vi: "+hinh[i].chuVi()+",");
			System.out.print("Diện tích: "+hinh[i].dienTich()+"\n");
		}
	}

}
