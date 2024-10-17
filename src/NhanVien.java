public abstract class NhanVien implements Comparable<NhanVien> {
	private String maNV;
	private String hoTen;
	private int tuoi;
	private String soDT;
	private String email;

	public NhanVien() {
		this.maNV = "1234";
		this.hoTen = "Nhan Vien";
		this.tuoi = 25;
		this.soDT = "0123456789";
		this.email = "nhanvien@gmail.com";
	}

	public NhanVien(String maNV, String hoTen, int tuoi, String soDT, String email) {
		this.maNV = maNV;
		this.hoTen = hoTen;
		this.tuoi = tuoi;
		this.soDT = soDT;
		this.email = email;
	}

	public String getMaNV() {
		return this.maNV;
	}

	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}

	public String getHoTen() {
		return this.hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public int getTuoi() {
		return this.tuoi;
	}

	public void setTuoi(short tuoi) {
		this.tuoi = tuoi;
	}

	public String getSoDT() {
		return this.soDT;
	}

	public void setSoDT(String soDT) {
		this.soDT = soDT;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return this.getMaNV() + " - " + this.getHoTen();
	}

	public abstract float tinhLuong();

	@Override
	public int compareTo(NhanVien nhanVien) {
		return Float.compare(this.tinhLuong(), nhanVien.tinhLuong());
	}
}
