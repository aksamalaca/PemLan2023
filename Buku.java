public class Buku {
    private String judul;
    private String kategori;
    private String penulis;
    private int tahun;

    public void setJudul(String judul){
        this.judul = judul;
    }
    public void setKategori(String kategori){
        this.kategori = kategori;
    }
    public void setPenulis(String penulis){
        this.penulis = penulis;
    }
    public void setTahun(int tahun){
        this.tahun = tahun;
    }
    public void display(){
        System.out.println();
        System.out.println("=========================================");
        System.out.println("1. Judul Buku           : " + judul);
        System.out.println("2. Kategori Buku        : " + kategori);
        System.out.println("3. Penulis Buku         : " + penulis);
        System.out.println("4. Tahun Terbit Buku    : " + tahun);
        System.out.println("=========================================");
        System.out.println();
    }
}

