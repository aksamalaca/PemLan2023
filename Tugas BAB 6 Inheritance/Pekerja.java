import java.time.LocalDate;

public class Pekerja extends Manusia{
    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;

    public Pekerja(double gaji, int tahunMasukTahun, int tahunMasukBulan, int tahunMasukHari, int jumlahAnak, String nama, String nik, boolean jenisKelamin, boolean menikah){
        super(nama, nik, jenisKelamin, menikah);
        this.gaji = gaji;
        this.tahunMasuk = LocalDate.of(tahunMasukTahun, tahunMasukBulan, tahunMasukHari);
        this.jumlahAnak = jumlahAnak;
    }
    public void setGaji(double gaji){
        this.gaji = gaji;
    }
    public double getGaji(){
        return gaji;
    }
    public void setTahunMasuk(int tahunMasukTahun, int tahunMasukBulan, int tahunMasukHari){
        this.tahunMasuk = LocalDate.of(tahunMasukTahun, tahunMasukBulan, tahunMasukHari);
    }
    public LocalDate getTahunMasuk(){
        return tahunMasuk;
    }
    public void setJumlahAnak(int jumlahAnak){
        this.jumlahAnak =  jumlahAnak;
    }
    public int getJumlahAnak(){
        return jumlahAnak;
    }
    public double getBonus(){
        int lamaKerja = LocalDate.now().getYear() - tahunMasuk.getYear();
        if(lamaKerja >= 0 && lamaKerja <= 5){
            return gaji * 0.05;
        } else if (lamaKerja > 5 && lamaKerja <= 10){
            return gaji * 0.1;
        } else {
            return gaji * 0.15;
        }
    }
    public double getTunjangan(){
        return jumlahAnak * 20;
    }
    public String toString(){
        return super.toString() + String.format("\nTahun masuk: " + tahunMasuk.getYear() + " "+ tahunMasuk.getMonthValue() + " "+ tahunMasuk.getDayOfMonth() + "\nJumlah anak: " + jumlahAnak + "\nGaji: " + gaji);
    }
}