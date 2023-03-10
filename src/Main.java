public class Main {
    public static void main(String[] args) {

        /*Task 1 ============================*/

        Invoice test1 = new Invoice("12345678", "Test 1", 10, 2 );
        String num = test1.getPartNumber();
        String desc = test1.getPartDescription();
        int quantity = test1.getQuantityPurchasedItem();
        int price = test1.getPricePerItem();
        int amount = test1.getInvoiceAmount();

        System.out.println("Part number = " + num +
                ", part description: "+ desc+
                "\n Quantity: " + quantity +
                "\n Price per item: " + price +
                "\n TOTAL: " + amount);

        test1.setPartNumber("0987654");
        test1.setPartDescription("Test 2");
        test1.setQuantityPurchasedItem(-5);
        test1.setPricePerItem(3);
        num = test1.getPartNumber();
        desc = test1.getPartDescription();
        quantity = test1.getQuantityPurchasedItem();
        price = test1.getPricePerItem();
        amount = test1.getInvoiceAmount();

        System.out.println("Part number = " + num +
                ", part description: "+ desc+
                "\n Quantity: " + quantity +
                "\n Price per item: " + price +
                "\n TOTAL: " + amount);

        test1.setPartNumber("56ssdths444");
        test1.setPartDescription("Test 3");
        test1.setQuantityPurchasedItem(5);
        test1.setPricePerItem(-3);
        num = test1.getPartNumber();
        desc = test1.getPartDescription();
        quantity = test1.getQuantityPurchasedItem();
        price = test1.getPricePerItem();
        amount = test1.getInvoiceAmount();
        System.out.println("Part number = " + num +
                ", part description: "+ desc+
                "\n Quantity: " + quantity +
                "\n Price per item: " + price +
                "\n TOTAL: " + amount);

        Invoice test2 = new Invoice("AW2345R", "Test 4", -1, 345);
        num = test2.getPartNumber();
        desc = test2.getPartDescription();
        quantity = test2.getQuantityPurchasedItem();
        price = test2.getPricePerItem();
        amount = test2.getInvoiceAmount();

        System.out.println("Part number = " + num +
                ", part description: "+ desc+
                "\n Quantity: " + quantity +
                "\n Price per item: " + price +
                "\n TOTAL: " + amount);

        Invoice test3 = new Invoice("AW2345R", "Test 5", 100, -1);
        num = test3.getPartNumber();
        desc = test3.getPartDescription();
        quantity = test3.getQuantityPurchasedItem();
        price = test3.getPricePerItem();
        amount = test3.getInvoiceAmount();

        System.out.println("Part number = " + num +
                ", part description: "+ desc+
                "\n Quantity: " + quantity +
                "\n Price per item: " + price +
                "\n TOTAL: " + amount);

        /*Task 2 ============================*/

        Car myHybrid = new Car(30);
        myHybrid.addFuel(20);
        myHybrid.drive(100);
        System.out.println(myHybrid.getFuelLevel());

        /*Task 3 ============================*/

        Countries[] countries = new Countries[]{
                new Countries(64589.15),
                new Countries(65302.40),
                new Countries(45339.84),
                new Countries(35476.85)
        };
        Countries maxArea = (Countries) maximum(countries);
        System.out.println("The largest area is: " + maxArea.getMeasure());

    }
    public static Measurable maximum(Measurable[] objects) {
        Measurable result = objects[0];
        for (int i = 0; i < objects.length; i++) {
            if (result.getMeasure() < objects[i].getMeasure()) {
                result = objects[i];
            }
        }
        return result;
    }

}