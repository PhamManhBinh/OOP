
public abstract class DiemHP {
	protected String tenHP;
	protected int soTinChi;
	public DiemHP(String t,int s) {
		tenHP=t;
		soTinChi=s;
	}
	public String layTenHP() {
		return tenHP;
	}
	public int laySoTinChi() {
		return soTinChi;
	}
	abstract double tinhDiem();
}
