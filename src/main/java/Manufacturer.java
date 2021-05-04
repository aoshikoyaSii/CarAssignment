public class Manufacturer {
    private String model;
    private String type;

    public Manufacturer(String model, String type) {
        this.model = model;
        this.type = type;
    }

    public String getModel() {
        return model;
    }
    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Manufacturer{" +
                "model='" + model + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
