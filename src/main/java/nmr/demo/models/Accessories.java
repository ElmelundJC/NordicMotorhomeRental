package nmr.demo.models;

public class Accessories {
    private static int accessory_id;
    private String accessoryType;
    private double price;


    public Accessories() {
    }

    public Accessories(int accessory_id,String accessoryType, double price) {
        this.accessory_id = accessory_id;
        this.accessoryType = accessoryType;
        this.price = price;
    }

    public static int getAccessory_id() {
        return accessory_id;
    }

    public void setAccessory_id(int accessory_id) {
        this.accessory_id = accessory_id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public  String getAccessoriesType() {
        return accessoryType;
    }

    public void setType(String accessoriesType) {
        this.accessoryType = accessoriesType;
    }
}
