abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public abstract double calculateTotalPrice();

    public String getItemDetails() {
        return "Item: " + itemName + ", Price: " + price + ", Quantity: " + quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }
}

interface Discountable {
    double applyDiscount();
    String getDiscountDetails();
}

class VegItem extends FoodItem implements Discountable {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.10;
    }

    @Override
    public String getDiscountDetails() {
        return "10% discount applied on Veg Items.";
    }
}

class NonVegItem extends FoodItem implements Discountable {
    private static final double NON_VEG_CHARGE = 50.0;

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + NON_VEG_CHARGE;
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.05;
    }

    @Override
    public String getDiscountDetails() {
        return "5% discount applied on Non-Veg Items.";
    }
}

public class OrderProcessor {
    public static void processOrder(FoodItem item) {
        System.out.println(item.getItemDetails());
        System.out.println("Total Price: " + item.calculateTotalPrice());

        if (item instanceof Discountable) {
            Discountable discountItem = (Discountable) item;
            double discount = discountItem.applyDiscount();
            System.out.println(discountItem.getDiscountDetails());
            System.out.println("Final Price after discount: " + (item.calculateTotalPrice() - discount));
        }
        System.out.println("------------------------------------");
    }

    public static void main(String[] args) {
        FoodItem vegBurger = new VegItem("Veg Burger", 100, 2);
        FoodItem chickenPizza = new NonVegItem("Chicken Pizza", 200, 1);

        processOrder(vegBurger);
        processOrder(chickenPizza);
    }
}
