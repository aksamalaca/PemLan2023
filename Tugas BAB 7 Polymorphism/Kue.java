import java.text.DecimalFormat;
public abstract class Kue {
    private String nama;
    private double harga;

    public Kue(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public abstract double hitungHarga();

    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("#,###");
        return String.format("Nama kue: %s\nHarga kue: Rp %s", this.nama, decimalFormat.format(this.hitungHarga()));
    }
}