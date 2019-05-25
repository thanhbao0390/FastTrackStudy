package model;

public class BienLai extends KhachHang {
	public int ChisoDauKy;
	public int ChisoCuoiKy;
	public int Thang;
	public int Nam;
	
	public BienLai() {
		
	}
	public BienLai(String maKH, String tenKH, String diachiKH, String maCT, int ChisoDauky, int ChissoCuoiKy, int thang, int nam) {
		super(maKH,tenKH,diachiKH,maCT);
		this.ChisoDauKy = ChisoDauKy;
		this.ChisoCuoiKy = ChissoCuoiKy;
		this.Thang = thang;
		this.Nam = nam;
	}

	
	public int getThang() {
		return Thang;
	}
	public void setThang(int thang) {
		Thang = thang;
	}
	public int getNam() {
		return Nam;
	}
	public void setNam(int nam) {
		Nam = nam;
	}
	public int getChisoDauKy() {
		return ChisoDauKy;
	}
	public void setChisoDauKy(int chisoDauKy) {
		ChisoDauKy = chisoDauKy;
	}
	public int getChisoCuoiKy() {
		return ChisoCuoiKy;
	}
	public void setChisoCuoiKy(int chisoCuoiKy) {
		ChisoCuoiKy = chisoCuoiKy;
	}
	
	
	public int tienDien() {
		return (this.ChisoCuoiKy - this.ChisoDauKy)*3000;
	}
	

}
