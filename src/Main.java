import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    static String canh1, canh2, canh3;
    static int n;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i;

        List<KhachHang> khachHangList = new ArrayList<>();
        while (true) {
            System.out.println("1. nhap khach hang nuoc ngoai");
            System.out.println("2. nhap khach hang viet nam");
            System.out.println("3. xuat hoa don ngay 012019");
            System.out.print("ban chon: ");
            i = scanner.nextInt();
            if (i == 1) {
                thuTuc();
                KhachHangVietNam khachHangVietNam = new KhachHangVietNam(canh1, canh2, canh3, n);
                khachHangList.add(khachHangVietNam);
                xuatHoaDon(khachHangVietNam);
            } else if (i == 2) {
                thuTuc();
                KhachHangNuocNgoai khachHangNuocNgoai = new KhachHangNuocNgoai(canh1, canh2, canh3, n);
                khachHangList.add(khachHangNuocNgoai);
                xuatHoaDon(khachHangNuocNgoai);
            } else if (i == 3) {
                List<KhachHang> kh = khachHangList.stream()
                        .filter(e -> e.getNgayRaHoaDon().equals("012019"))
                        .collect(Collectors.toList());

                kh.forEach(e -> xuatHoaDon(e));
            }
        }
    }

    public static void xuatHoaDon(KhachHang khachHang) {
        System.out.println("ma khach hang: " + khachHang.maKhachHang + ", hoten: " + khachHang.hoTen
                + ", ngay ra hoa don: " + khachHang.ngayRaHoaDon + ", soluong: " + khachHang.soLuong);
        System.out.println("thanh tien cua khach hang:" + khachHang.inThanhTien());
    }

    public static void thuTuc() {
        System.out.print("nhap maKhachHang: ");
        canh1 = scanner.next();
        System.out.print("nhap hoTen: ");
        canh2 = scanner.next();
        System.out.print("nhap ngayRaHoaDon: ");
        canh3 = scanner.next();
        System.out.print("nhap so luong: ");
        n = scanner.nextInt();
    }
}
