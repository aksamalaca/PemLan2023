public class MahasiswaFILKOM extends Manusia{
    private String nim;
    private double ipk;

    public MahasiswaFILKOM(String nim, double ipk, String nama, String nik, boolean jenisKelamin, boolean menikah){
        super(nama, nik, jenisKelamin, menikah);
        this.nim = nim;
        this.ipk = ipk;
    }
    public void setNim(String nim){
        this.nim = nim;
    }
    public String getNim(){
        return nim;
    }
    public void setIpk(double ipk){
        this.ipk = ipk;
    }
    public double getIpk(){
        return ipk;
    }
    public String getStatus(){
        String angkatan = "20" + nim.substring(0, 2);
        String prodi = "";
        int kodeProdi = Integer.parseInt(nim.substring(6, 7));
        switch (kodeProdi) {
            case 2:
                prodi = "Teknik Informatika";
                break;
            
            case 3:
                prodi = "Teknik Komputer";
                break;
            
            case 4:
                prodi = "Sistem Informasi";
                break;

            case 6:
                prodi = "Pendidikan Teknologi Informasi";
                break;

            case 7:
                prodi = "Teknologi Informasi";
                break;
        }
        return prodi + ", " + angkatan;
    }
    public double getBeasiswa(){
        double beasiswa = 0;
        if(ipk >= 3.0 && ipk <= 3.5){
            beasiswa = 50;
        } else if (ipk > 3.5 && ipk <= 4.0){
            beasiswa = 75;
        }
        return beasiswa;
    }
    public String toString(){
        return super.toString() + String.format("\nNIM: " + nim + "\nIPK: " + ipk + "\nStatus: " + getStatus());
    }
}