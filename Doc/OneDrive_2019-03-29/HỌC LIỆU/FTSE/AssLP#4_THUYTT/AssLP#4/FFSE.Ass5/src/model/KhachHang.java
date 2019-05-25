package model;

public class KhachHang {

	private int chisoMoi, chisoCu;
	private String maKH, maCT, tenKH, diachiKH; 
	
	public KhachHang() {}
	public KhachHang(String maKH, String tenKH, String diachiKH, String maCT) {
		this.maKH = maKH;
		this.maCT = maCT;
		this.tenKH = tenKH;
		this.diachiKH = diachiKH;
	}
	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}
	public String getMaKH() {
		return maKH;
	}
	
	public void setTenKH(String tenKH) {
		this.tenKH = tenKH;
	}
	public String getTenKH() {
		return tenKH;
	}
	
	public void setDiachiKH(String diachiKH) {
		this.diachiKH = diachiKH;
	}
	public String getDiachiKH() {
		return diachiKH;
	}
	
	public void setMaCT(String maCT) {
		this.maCT = maCT;
	}
	public String getMaCT() {
		return maCT;
	}
	
}
