public class KhachHangVietNam extends KhachHang {
    String doiTuong;


    public KhachHangVietNam(String a, String b, String c, int n) {
        super(a, b, c, n);
    }

    public int inThanhTien() {
        if (soLuong <= 50) {
            thanhTien = soLuong * 1000;
        } else if (soLuong > 50 || soLuong <= 100) {
            thanhTien = 50 * 1000 + (soLuong - 50) * 1200;
        } else if (soLuong > 100 || soLuong <= 200) {
            thanhTien = 50 * 1000 + 50 * 1200 + (soLuong - 100) * 1500;
        } else {
            thanhTien = 50 * 1000 + 50 * 1200 + 100 * 1500 + (soLuong - 200) * 2000;
        }
        return  thanhTien;
    }

}
