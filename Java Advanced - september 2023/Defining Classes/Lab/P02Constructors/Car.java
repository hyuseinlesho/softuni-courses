package P02Constructors;

public class Car {
    private String brand;
    private String model;
    private int horsePower;

    public String carInfo() {
        return String.format("The car is: %s %s - %d HP.", brand, model, horsePower);
    }

    public Car(String brand) {
        this(brand, "unknown", -1);
    }

    public Car(String brand, String model, int horsePower) {
        setBrand(brand);
        setModel(model);
        setHorsePower(horsePower);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
}