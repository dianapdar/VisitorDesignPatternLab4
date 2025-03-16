class Table implements Furniture {
    private String model;
    private double weight;
    private double area;
    
    public Table(String model, double weight, double area) {
        this.model = model;
        this.weight = weight;
        this.area = area;
    }
    
    public String getModel() {
        return model;
    }
    
    public double getWeight() {
        return weight;
    }
    
    public double getArea() {
        return area;
    }
    
    @Override
    public double accept(ShippingCostVisitor visitor) {
        return visitor.visit(this);
    }
}