import java.util.Scanner;

public class UcapanTerimakasih06_1 {

    public static String PenerimaUcapan(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan NAMA orang yang ingin Anda beri ucapan : ");
        String namaOrang = sc.nextLine();
        sc.close();
        return namaOrang;
    }
    public static void UcapanTerimaKasih() {
        String nama = PenerimaUcapan();
        System.out.println("Thank you "+nama+ " for being the best teacher in the world.\n"+
        "You inspired in me a love for learning and made me feel like I could ask you everything");
    }
    //Menambahkan fungsi untuk ucapan tambahan
    public static void UcapanTambahan(String tambahan){
        System.out.println(tambahan);
    }
    public static void main(String[] args) {
        UcapanTerimaKasih();
        String tambahUcapan = "Never give up";
        UcapanTambahan(tambahUcapan);
    }
}
