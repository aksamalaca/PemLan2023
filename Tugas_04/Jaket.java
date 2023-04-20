import java.util.Scanner;
public class Jaket {
    private final static int JaketA = 100000;
    private final static int JaketB = 125000;
    private final static int JaketC = 175000;
    static int jumlahJaketA, jumlahJaketB, jumlahJaketC;

    public static void menu(){
        Scanner input = new Scanner(System.in);
        byte pilih;
        System.out.println("\nMenu");
        System.out.println("1. Tampilkan barang yang dijual");
        System.out.println("2. Lakukan transaksi");
        System.out.print("Masukkan pilihan : ");
        pilih = input.nextByte();

        if (pilih == 1){
            daftarbarang();
        } else if (pilih == 2){
            transaksi();
        } else {
            System.out.println("Pilihan tidak tersedia");
    }
}
    static void daftarbarang(){
        Scanner input = new Scanner(System.in);
        System.out.println("\nDapatkan diskon tiap pembelian jaket sebanyak 100 biji");
        System.out.printf("| %-10s| %-12s| %-20s| \n", "Jenis", "Harga/biji", "Harga Diskon/biji");
        System.out.println("-------------------------------------------------");
        System.out.printf("| %-10s| %-12s| %-20s| \n", "Jaket A", "Rp100.000", "Rp95.000");
        System.out.printf("| %-10s| %-12s| %-20s| \n", "Jaket B", "Rp125.000", "Rp120.000");
        System.out.printf("| %-10s| %-12s| %-20s| \n", "Jaket C", "Rp175.000", "Rp160.000");
        System.out.print("Pilih tipe jaket yang akan dipesan (ya/tidak)? ");
        String yt = input.nextLine();
        System.out.println();
        if (yt.equalsIgnoreCase("ya")){
            transaksi();
        } else if (yt.equalsIgnoreCase("tidak")){
            System.out.println("TERIMA KASIH TELAH BERKUNJUNG");
    }
}
    static void transaksi(){
        Scanner input = new Scanner(System.in);
        byte pilih = 1;
        do {
            System.out.print("Masukkan jenis jaket yang akan Anda beli (A/B/C) : ");
            char tipeJaket = input.next().toUpperCase().charAt(0);
            if (String.valueOf(tipeJaket).hashCode() > 67){
                System.out.println("Jaket " + tipeJaket + " tidak tersedia.\n");
            } else {
                System.out.print("Masukkan jumlah jaket " + tipeJaket + ": ");
                if (tipeJaket == 'A'){
                    jumlahJaketA += input.nextInt();
                } else if (tipeJaket == 'B'){
                    jumlahJaketB += input.nextInt();
                } else if (tipeJaket == 'C'){
                    jumlahJaketC += input.nextInt();
                } 
                System.out.println("\n1. Lanjutkan berbelanja");
                System.out.println("2. Menuju pembayaran");
                System.out.print("Masukkan pilihan : ");
                pilih = input.nextByte();
                if (pilih == 2){
                    pembayaran();
                } else if (pilih > 2){
                    input.nextByte();
                }
            }
        } while (pilih == 1);
    }
    private static void pembayaran(){
        int totalA = 0, totalB = 0, totalC = 0;
        int hargaA = 100000, hargaB = 125000, hargaC = 175000;
        int diskonA = 5000, diskonB = 5000, diskonC = 15000;

        if (jumlahJaketA > 100){
            totalA += jumlahJaketA * (hargaA - diskonA);
        } else {
            totalA += jumlahJaketA * hargaA;
        }
        if (jumlahJaketA > 100){
            totalB += jumlahJaketB * (hargaB - diskonB);
        } else {
            totalB += jumlahJaketB * hargaB;
        }
        if (jumlahJaketC > 100){
            totalC += jumlahJaketC * (hargaC - diskonC);
        } else {
            totalC += jumlahJaketC * hargaC;
        }
        int total = totalA + totalB + totalC;

        System.out.println("===========================================================");
        System.out.println("                      BUKTI PEMBAYARAN                     ");
        System.out.println("                       CV. LABKOMDAS                       ");
        System.out.println("===========================================================");
        System.out.printf("| %-10s| %-10s| %-10s| %-10s|\n", "Tipe", "Harga/biji", "Jumlah", "Total");
        System.out.println("-----------------------------------------------------------");
        System.out.printf("| %-10s| %-10s| %-10d| %-10d|", "Jaket A", JaketA, jumlahJaketA, totalA);
        if (jumlahJaketA > 100) System.out.print(" diskon 5000/biji");
        System.out.println();
        System.out.printf("| %-10s| %-10s| %-10d| %-10d|", "Jaket B", JaketB, jumlahJaketB, totalB);
        if (jumlahJaketB > 100) System.out.print(" diskon 5000/biji");
        System.out.println();
        System.out.printf("| %-10s| %-10s| %-10d| %-10d|", "Jaket C", JaketC, jumlahJaketC, totalC);
        if (jumlahJaketC > 100) System.out.print(" diskon 15000/biji");
        System.out.println();
        System.out.println("Total harga jaket yang harus dibayar = Rp" + total);
        System.out.println("TERIMA KASIH TELAH BERBELANJA DI CV. LABKOMDAS\n");
    }
}
