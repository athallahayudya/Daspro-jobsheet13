import java.util.Scanner;
public class Ucapan06_1 {

    public static String PenerimaUcapan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan Nama orang yang ingin Anda beri ucapan: ");
        String namaOrang = sc.nextLine();
        System.out.println("Ucapan diterima untuk: " + namaOrang); // Menambahkan System.out.println di dalam fungsi dengan nilai kembalian
        sc.close();
        return namaOrang;
    }
    public static void main(String[] args){
        // Memanggil fungsi tanpa menyimpan nilai kembalian dalam variabel
        System.out.println("Thank you " + PenerimaUcapan() + "\nMay the force be with you.");
    }
}

