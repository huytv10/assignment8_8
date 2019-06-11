public class KhachHangNuocNgoai extends KhachHang {
    public KhachHangNuocNgoai(String a, String b, String c, int n) {
        super(a, b, c, n);
    }

    String quocTich;

    public int inThanhTien() {
        thanhTien = 2000 * soLuong;
        return  thanhTien;
    }
}
