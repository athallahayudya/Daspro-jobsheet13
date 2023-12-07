import java.util.Scanner;
public class Kubus06 {
    
    //Fungsi untuk menghitung Volume Kubus
    static int hitungVolume(int s){
       int volume = s*s*s;
        return volume;
    }

    //Fungsi untuk menghitung Luas Permukaan Kubus
    static int hitungLuasPermukaan(int r){
        int lp = 6*r*r;
        return lp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, vol, Lp;
        
        System.out.println("Masukkan rusuk");
        a = sc.nextInt();

        //Pemanggilan fungsi hitungVolume
        vol= hitungVolume(a);
        System.out.println("Volume kubus berusuk "+a+" adalah "+vol);
        //Pemanggilan fungsi hitungLuasPermukaan
        Lp = hitungLuasPermukaan(a);
        System.out.println("Luas permukaan kubus berusuk "+a+" adalah "+Lp);

    }
}
