import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		NhanVien[] list = new NhanVien[5];
		list[0] = new NhanVienFulltime();
		list[1] = new NhanVienFulltime("0001", "Nguyen A", 26, "029378423", "a.nguyen@gmail.com",
				12000000, 8000000, 2000000);
		list[2] = new NhanVienFulltime("0002", "Nguyen B", 27, "04444333334", "b.nguyen@gmail.com",
				13000000, 7000000, 1000000);
		list[3] = new NhanVienParttime("0003", "Nguyen C", 28, "088888888", "c.nguyen@gmail.com", 80);
		list[4] = new NhanVienParttime("0004", "Nguyen D", 29, "088888999", "d.nguyen@gmail.com", 85);

		float luongTB = tinhLuongTB(list);
		System.out.println("\nLuong trung binh: " + luongTB / 1000000 + " trieu VND");

		System.out.println("\nNhan vien fulltime co muc luong thap hon trung binh: ");
		inNVFulltimeLuongThap(list, luongTB);

		System.out.println("\nTong luong phai tra cho nhan vien parttime: "
				+ tongLuongParttime(list)/1000000 + " trieu VND");

		System.out.println("\nDanh sach nhan vien fulltime theo muc luong tang dan:");
		inNVFulltime(list);
	}

	public static float tinhLuongTB(NhanVien[] list) {
		float sum = 0;
		for (NhanVien nhanVien : list) {
			sum += nhanVien.tinhLuong();
		}
		return sum / list.length;
	}

	public static void inNVFulltimeLuongThap(NhanVien[] list, float luongTB) {
		for (NhanVien nhanVien : list) {
			if (nhanVien instanceof NhanVienFulltime) {
				if (nhanVien.tinhLuong() < luongTB) {
					System.out.println("\t" + nhanVien);
				}
			}
		}
	}

	public static float tongLuongParttime(NhanVien[] list) {
		float sum = 0;
		for (NhanVien nhanVien : list) {
			if (nhanVien instanceof NhanVienParttime) {
				sum += nhanVien.tinhLuong();
			}
		}
		return sum;
	}

	public static void inNVFulltime(NhanVien[] list) {
		NhanVien[] array = new NhanVien[list.length];
		int index = 0;
		for (NhanVien nhanVien : list) {
			if (nhanVien instanceof NhanVienFulltime) {
				array[index] = nhanVien;
				index++;
			}
		}
		NhanVien[] clean_array = new NhanVien[index];
		System.arraycopy(array, 0, clean_array, 0, index);

		Arrays.sort(clean_array);
		// In ra danh sach da sap xep
		for (int i = 0; i < index; i++) {
			System.out.println("\t" + clean_array[i]);
		}
	}

//	public static void sortArray(NhanVien[] array, int n) {
//		for (int i = 0; i < n; i++) {
//			float min = array[i].tinhLuong();
//			int ind = i;
//			for (int j = i + 1; j < n; j++) {
//				if (array[j].tinhLuong() < min) {
//					min = array[j].tinhLuong();
//					ind = j;
//				}
//			}
//			if (ind > i) {
//				NhanVien temp = array[i];
//				array[i] = array[ind];
//				array[ind] = temp;
//			}
//		}
//	}
}

