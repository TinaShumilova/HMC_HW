public class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantityPurchasedItem;
    private int pricePerItem;

    public Invoice(String number, String desc, int quantity, int price) {
        partNumber = number;
        partDescription = desc;
        quantityPurchasedItem = isNotPositive(quantity);
        pricePerItem = isNotPositive(price);
    }

    public void setPartNumber(String number) {
        this.partNumber = number;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartDescription(String desc) {
        this.partDescription = desc;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setQuantityPurchasedItem(int quantity) {
            this.quantityPurchasedItem = isNotPositive(quantity);
    }

    public int getQuantityPurchasedItem() {
        return quantityPurchasedItem;
    }

    public void setPricePerItem(int price) {
        this.pricePerItem = isNotPositive(price);
    }

    public int getPricePerItem() {
        return pricePerItem;
    }

    public int getInvoiceAmount() {
        int amount = this.quantityPurchasedItem * this.pricePerItem;
        return amount;
    }

    public int isNotPositive(int a) {
        if (a < 0) {
            return 0;
        } else {
            return a;
        }
    }

}
