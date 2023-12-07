import java.util.Scanner;

public class FungsiNilai06 {
    static Scanner scanner = new Scanner(System.in);
    static String[] mahasiswa = { "Sari", "Rina", "Yani", "Dwi", "Lusi" };
    static int[][] nilaiMahasiswa = new int[mahasiswa.length][7];

    // Fungsi untuk input nilai mahasiswa
    public static void inputNilaiMahasiswa() {
        for (int i = 0; i < mahasiswa.length; i++) {
            System.out.println("Masukkan nilai untuk mahasiswa " + mahasiswa[i] + ":");
            for (int j = 0; j < 7; j++) {
                System.out.print("Minggu ke " + (j + 1) + ": ");
                nilaiMahasiswa[i][j] = scanner.nextInt();
            }
        }
    }

    // Fungsi untuk menampilkan seluruh nilai mahasiswa dari minggu 1 hingga 7
    public static void tampilkanNilaiMahasiswa() {
        System.out.println("Nilai seluruh mahasiswa dari minggu 1 hingga 7:");
        for (int i = 0; i < mahasiswa.length; i++) {
            System.out.print(mahasiswa[i] + " ");
            for (int j = 0; j < 7; j++) {
                System.out.print(nilaiMahasiswa[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Fungsi untuk mencari hari keberapa nilai tertinggi dari seluruh mahasiswa
    public static int cariHariNilaiTertinggi() {
        int[] totalNilai = new int[7];
        for (int i = 0; i < 7; i++) {
            int maxNilai = 0;
            for (int j = 0; j < mahasiswa.length; j++) {
                if (nilaiMahasiswa[j][i] > maxNilai) {
                    maxNilai = nilaiMahasiswa[j][i];
                }
            }
            totalNilai[i] = maxNilai;
        }

        int hariTertinggi = 0;
        int nilaiTertinggi = totalNilai[0];
        for (int i = 1; i < 7; i++) {
            if (totalNilai[i] > nilaiTertinggi) {
                nilaiTertinggi = totalNilai[i];
                hariTertinggi = i;
            }
        }
        return hariTertinggi + 1; // Karena indeks dimulai dari 0, tambahkan 1 untuk mengembalikan hari yang benar
    }

    // Fungsi untuk menampilkan mahasiswa dengan nilai tertinggi
    public static void tampilkanMahasiswaNilaiTertinggi() {
        int nilaiTertinggi = 0;
        int indexMahasiswa = 0;
        int mingguKe = 0;

        for (int i = 0; i < mahasiswa.length; i++) {
            for (int j = 0; j < 7; j++) {
                if (nilaiMahasiswa[i][j] > nilaiTertinggi) {
                    nilaiTertinggi = nilaiMahasiswa[i][j];
                    indexMahasiswa = i;
                    mingguKe = j + 1;
                }
            }
        }

        System.out.println("Mahasiswa dengan nilai tertinggi adalah " + mahasiswa[indexMahasiswa] +
                " dengan nilai " + nilaiTertinggi + " dari minggu ke-" + mingguKe);
    }

    public static void main(String[] args) {
        inputNilaiMahasiswa();
        tampilkanNilaiMahasiswa();

        int hariTertinggi = cariHariNilaiTertinggi();
        System.out.println("Hari ke-" + hariTertinggi
                + " memiliki nilai tertinggi dibandingkan hari lain dari keseluruhan mahasiswa");

        tampilkanMahasiswaNilaiTertinggi();
    }
}