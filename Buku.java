public class Buku {
    private String judul;
    private String kategori;
    private String penulis;
    private String sinopsis;
    private int tahun;
    private int sama;

    // constructor dengan objek Buku dengan parameter judul, kategori, penulis, sinopsis, dan tahun
    public Buku(String judul, String kategori, String penulis, String sinopsis, int tahun){
        this.judul = judul;
        this.kategori = kategori;
        this.penulis = penulis;
        this.sinopsis = sinopsis;
        this.tahun = tahun;
    }
    public void setJudul(String judul){
        this.judul = judul;
    }
    public void setKategori(String kategori){
        this.kategori = kategori;
    }
    public void setPenulis(String penulis){
        this.penulis = penulis;
    }
    public void setSinopsis(String sinopsis){
        this.sinopsis = sinopsis;
    }
    public void setTahun(int tahun){
        this.tahun = tahun;
    }
    public int panjangKata(String sinopsis){
        String[] panjang = sinopsis.split("\\s+");
        int kata = panjang.length;
        return kata;
    }
    public void copy(Buku a){
        judul = a.judul;
        penulis = a.penulis;
        kategori = a.kategori;
        sinopsis = a.sinopsis;
        tahun = a.tahun;
        display();
    }
    public void display(){
        System.out.println();
        System.out.println("=========================================");
        System.out.println("1. Judul Buku           : " + judul);
        System.out.println("2. Kategori Buku        : " + kategori);
        System.out.println("3. Penulis Buku         : " + penulis);
        System.out.println("4. Sinopsis             : " + sinopsis);
        System.out.println("5. Tahun Terbit Buku    : " + tahun);
        System.out.println("6. Jumlah Kata Sinopsis : " + panjangKata(sinopsis));
        System.out.println("=========================================");
        System.out.println();
    }
}
