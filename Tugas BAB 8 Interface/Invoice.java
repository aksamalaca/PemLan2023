public class Invoice implements Payable{
    private String productName;
    private int quantity;
    private int pricePerItem;

    public Invoice(String productName, int quantity, int pricePerItem){
        this.productName = productName;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }
    public void setProductName(String productName){
        this.productName = productName;
    }
    public String getProductName(){
        return productName;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public int getQuantity(){
        return quantity;
    }
    public void setPricePerItem(int pricePerItem){
        this.pricePerItem = pricePerItem;
    }
    public int getPricePerItem(){
        return pricePerItem;
    }
    public int getPayableAmount(){
        return quantity * pricePerItem;
    }
}