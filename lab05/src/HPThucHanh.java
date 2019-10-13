
public class HPThucHanh extends DiemHP{
	private float db1;
	private float db2;
	private float db3;
	public HPThucHanh(String tenHP,int stc,float b1,float b2,float b3) {
		super(tenHP,stc);
		db1=b1;
		db2=b2;
		db3=b3;
	}
	public double tinhDiem() {
		return (db1+db2+db3)/3;
	}
}
