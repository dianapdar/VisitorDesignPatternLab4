class Chair implements Furniture {
    private String model;
    private double weight;
    private double height;
    
    public Chair(String model, double weight, double height) {
        this.model = model;
        this.weight = weight;
        this.height = height;
    }
    
    public String getModel() {
        return model;
    }
    
    public double getWeight() {
        return weight;
    }
    
    public double getHeight() {
        return height;
    }
    
    @Override
    public double accept(ShippingCostVisitor visitor) {
        return visitor.visit(this);
    }
}