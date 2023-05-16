import java.text.DecimalFormat;
public class Main {
    public static void main(String[] args) {
        Kue[] kue = new Kue[20];
        // kue pesanan
        kue[0] = new KuePesanan("Bikang Ambon", 400, 120);
        kue[1] = new KuePesanan("Donat", 600, 5);
        kue[2] = new KuePesanan("Martabak Manis", 40, 500);
        kue[3] = new KuePesanan("Nastar", 130, 450);
        kue[4] = new KuePesanan("Kue Lapis", 120, 365);
        kue[5] = new KuePesanan("Risol Mayo", 500, 5);
        kue[6] = new KuePesanan("Gethuk", 300, 15);
        kue[7] = new KuePesanan("Pisang Goreng", 200, 5);
        kue[8] = new KuePesanan("Onde-Onde", 500, 7);
        kue[9] = new KuePesanan("Kue Sus", 500, 8);

        //kue jadi
        kue[10] = new KueJadi("Lemper", 3000, 10);
        kue[11] = new KueJadi("Molen", 1500, 10);
        kue[12] = new KueJadi("Bakpao", 3500, 5);
        kue[13] = new KueJadi("Brem", 10000, 2);
        kue[14] = new KueJadi("Putu", 2000, 9);
        kue[15] = new KueJadi("Kucur", 2000, 15);
        kue[16] = new KueJadi("Lumpia", 2500, 20);
        kue[17] = new KueJadi("Klepon", 1000, 20);
        kue[18] = new KueJadi("Kue Lumpur", 3000, 4);
        kue[19] = new KueJadi("Pastel", 4000, 8);

        System.out.println("=============================================");
        System.out.println("================ Kue Pesanan ================");
        System.out.println("=============================================");
        System.out.println();
        for (int i = 0; i < 20; i++) {
            if (i == 10) {
                System.out.println("============================================");
                System.out.println("================= Kue Jadi =================");
                System.out.println("============================================");
                System.out.println();
            }
            System.out.println(kue[i].toString());
            System.out.println();
        }
        double totalHarga = 0;
        for (int i = 0; i < 20; i++) {
            totalHarga += kue[i].hitungHarga();
        }
        double hargaPesanan = 0;
        double beratPesanan = 0;
        for (int i = 0; i < 10; i++) {
            hargaPesanan += kue[i].hitungHarga();
            if (kue[i] instanceof KuePesanan) {
                KuePesanan pesanan = (KuePesanan) kue[i];
                beratPesanan += pesanan.getBerat();
            }
        }
        double hargaJadi = 0;
        double jumlahJadi = 0;
        for (int i = 10; i < 20; i++) {
            hargaJadi += kue[i].hitungHarga();
            if (kue[i] instanceof KueJadi) {
                KueJadi jadi = (KueJadi) kue[i];
                jumlahJadi += jadi.getJumlah();
            }
        }
        double harga[] = new double[20];
        for (int i = 0; i < 20; i++) {
            harga[i] = kue[i].hitungHarga();
        }
        String termahal = "";
        double tertinggi = getTertinggi(harga);
        for (int j = 0; j < 20; j++) {
            if (kue[j].hitungHarga() == tertinggi) {
                termahal = kue[j].getNama();
            }
        }

        DecimalFormat decimalFormat = new DecimalFormat("#,###");

        System.out.println("============================================");
        System.out.println("Total Harga Kue\t\t: Rp " + decimalFormat.format(totalHarga));
        System.out.println("Total Harga Kue Pesanan\t: Rp " + decimalFormat.format(hargaPesanan));
        System.out.println("Total Berat Kue Pesanan\t: " + decimalFormat.format(beratPesanan) + " gram");
        System.out.println("Total Harga Kue Jadi\t: Rp " + decimalFormat.format(hargaJadi));
        System.out.println("Total Jumlah Kue Jadi\t: " + decimalFormat.format(jumlahJadi) + " buah");
        System.out.println("Kue Termahal\t\t: " + termahal);                
        System.out.println("Harga Kue Termahal\t: Rp " + decimalFormat.format(tertinggi));
        System.out.println("============================================");
    }

    public static double getTertinggi(double[] inputArray) {
        double nilaiTertinggi = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] > nilaiTertinggi) {
                nilaiTertinggi = inputArray[i];
            }
        }
        return nilaiTertinggi;
    }
}