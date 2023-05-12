public class Manager extends Pekerja{
    private String departemen;

    public Manager(String departemen, double gaji, int tahunMasukTahun, int tahunMasukBulan, int tahunMasukHari, int jumlahAnak, String nama, String nik, boolean jenisKelamin, boolean menikah){
        super(gaji, tahunMasukTahun, tahunMasukBulan, tahunMasukHari, jumlahAnak, nama, nik, jenisKelamin, menikah);
        this.departemen = departemen;
    }
    public void setDepartemen(String departemen){
        this.departemen = departemen;
    }
    public String getDepartemen(){
        return departemen;
    }
    public double getTunjangan(){
        return super.getTunjangan() + 0.1 * getGaji();
    }
    public String toString(){
        return super.toString() + String.format("\nDepartemen: " + departemen);
    }
}