public class NhanVienParttime extends NhanVien {
	private float gioLamViec;

	public NhanVienParttime() {
		super();
		this.gioLamViec = 20;
	}

	public NhanVienParttime(String maNV, String hoTen, int tuoi, String soDT, String email,
	                        float gioLamViec) {
		super(maNV, hoTen, tuoi, soDT, email);
		this.gioLamViec = gioLamViec;
	}

	public float getGioLamViec() {
		return this.gioLamViec;
	}

	public void setGioLamViec(int gioLamViec) {
		this.gioLamViec = gioLamViec;
	}

	@Override
	public float tinhLuong() {
		return this.getGioLamViec() * 100000;
	}


}
