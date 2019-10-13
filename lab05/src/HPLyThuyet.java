
public class HPLyThuyet extends DiemHP{
	private int chuyenCan;
	private int giuaKy;
	private int cuoiKy;
	public HPLyThuyet(String tenHP,int stc,int cc,int gk,int ck) {
		super(tenHP,stc);
		chuyenCan=cc;
		giuaKy=gk;
		cuoiKy=ck;
	}
	public double tinhDiem() {
		return (chuyenCan*0.1)+(giuaKy*0.2)+(cuoiKy*0.7);
	}
}
