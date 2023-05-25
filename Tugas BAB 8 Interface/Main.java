import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama Anda                        : ");
        String nama = input.nextLine();
        System.out.print("Masukkan nomor registrasi pegawai         : ");
        int noRegis = input.nextInt();
        System.out.print("Masukkan gaji perbulan                    : ");
        int gaji = input.nextInt();
        System.out.print("Berapa banyak invoice yang Anda inginkan  : ");
        int invoice = input.nextInt();
        System.out.println();
        
        Employee e = new Employee(nama, noRegis, gaji, invoice);
        System.out.println("=============== KEBUTUHAN KARYAWAN ===============");
        for (int i = 0; i < invoice; i++){
            input.nextLine();
            System.out.print("Masukkan produk " + (i+1) + " Nama        : ");
            String namaProduk = input.nextLine();
            System.out.print("Masukkan produk " + (i+1) + " Kuantitas   : ");
            int kuantitas = input.nextInt();
            System.out.print("Masukkan produk " + (i+1) + " Harga       : ");
            int harga = input.nextInt();
            e.getInvoices()[i] = new Invoice(namaProduk, kuantitas, harga);
            System.out.println();
        }
        e.display();
    }
}