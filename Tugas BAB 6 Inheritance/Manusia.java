public class Manusia{
    private String nama;
    private boolean jenisKelamin;
    private String nik;
    private boolean menikah;

    public Manusia(String nama, String nik, boolean jenisKelamin, boolean menikah){
        this.nama = nama;
        this.nik = nik;
        this.jenisKelamin = jenisKelamin;
        this.menikah = menikah;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getNama(){
        return nama;
    }
    public void setNik(String nik){
        this.nik = nik;
    }
    public String getNik(){
        return nik;
    }
    public void setJenisKelamin(boolean jenisKelamin){
        this.jenisKelamin = jenisKelamin;
    }
    public String getJenisKelamin(){
        return jenisKelamin ? "Laki-laki" : "Perempuan";
    }
    public void setMenikah(boolean menikah){
        this.menikah = menikah;
    }
    public boolean getMenikah(){
        return menikah;
    }
    public double getTunjangan(){
        if(menikah){
            if(jenisKelamin){
                return 25.0;
            } else {
                return 20.0;
            }
        } else {
            return 15.0;
        }
    }
    public double getPendapatan(){
        return getTunjangan();
    }
    public String toString(){
        return String.format("\nNama: "+ nama + "\nNIK: " + nik + "\nJenis kelamin: " + getJenisKelamin() + "\nPendapatan: " + getPendapatan());    
    }
}