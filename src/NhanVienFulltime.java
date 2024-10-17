public class NhanVienFulltime extends NhanVien {
	private float luongCung;
	private float tienThuong;
	private float tienPhat;

	public NhanVienFulltime() {
		super();
		this.luongCung = 20000000;
		this.tienThuong = 5000000;
		this.tienPhat = 3000000;
	}

	public NhanVienFulltime(String maNV, String hoTen, int tuoi, String soDT, String email,
	                        float luongCung, float tienThuong, float tienPhat) {
		super(maNV, hoTen, tuoi, soDT, email);
		this.luongCung = luongCung;
		this.tienThuong = tienThuong;
		this.tienPhat = tienPhat;
	}

	public float getLuongCung() {
		return this.luongCung;
	}

	public void setLuongCung(float luongCung) {
		this.luongCung = luongCung;
	}

	public float getTienPhat() {
		return this.tienPhat;
	}

	public void setTienPhat(float tienPhat) {
		this.tienPhat = tienPhat;
	}

	public float getTienThuong() {
		return this.tienThuong;
	}

	public void setTienThuong(float tienThuong) {
		this.tienThuong = tienThuong;
	}

	@Override
	public float tinhLuong() {
		return this.getLuongCung() + this.getTienThuong() - this.getTienPhat();
	}
}
