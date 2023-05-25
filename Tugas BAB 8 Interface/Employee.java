public class Employee implements Payable{
    private int registrationNumber;
    private String name;
    private int salaryPerMonth;
    private Invoice[] invoices;

    public Employee(String name, int registrationNumber, int salaryPerMonth, int totalInvoice){
        this.name = name;
        this.registrationNumber = registrationNumber;
        this.salaryPerMonth = salaryPerMonth;
        this.invoices = new Invoice[totalInvoice];
    }
    public Invoice[] getInvoices(){
        return invoices;
    }
    @Override
    public int getPayableAmount(){
        int payableamount = 0;
        for (Invoice invoice : invoices){
            payableamount += invoice.getPayableAmount();
        }
        return salaryPerMonth - payableamount;
    }
    public void display(){
        System.out.println("========== INFORMASI KARYAWAN =========");
        System.out.println("Nama                        : " + name);
        System.out.println("Nomor registrasi            : " + registrationNumber);
        System.out.println("Gaji perbulan               : " + salaryPerMonth);
        System.out.println("Sisa gaji setelah hutang    : " + getPayableAmount());
        System.out.println();
        System.out.println("========== RINCIAN BELANJA ==========");
        int i = 1;
        for(Invoice invoice : invoices){
            System.out.println("Invoice " + i);
            System.out.println("Produk          : " + invoice.getProductName());
            System.out.println("Jumlah          : " + invoice.getQuantity());
            System.out.println("Harga per Item  : " + invoice.getPricePerItem());
            System.out.println("Total Harga     : " + invoice.getPayableAmount());
            System.out.println("------------------------");
            i++;
        }
    }
}