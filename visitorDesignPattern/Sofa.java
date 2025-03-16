class Sofa implements Furniture {
    private String model;
    private double weight;
    private double length;
    private boolean isSecional;
    
    public Sofa(String model, double weight, double length, boolean isSecional) {
        this.model = model;
        this.weight = weight;
        this.length = length;
        this.isSecional = isSecional;
    }
    
    public String getModel() {
        return model;
    }
    
    public double getWeight() {
        return weight;
    }
    
    public double getLength() {
        return length;
    }
    
    public boolean isSecional() {
        return isSecional;
    }
    
    @Override
    public double accept(ShippingCostVisitor visitor) {
        return visitor.visit(this);
    }
}
