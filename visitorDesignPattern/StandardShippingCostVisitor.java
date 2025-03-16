class StandardShippingCostVisitor implements ShippingCostVisitor {
    private double distanceInKilometers;
    
    public StandardShippingCostVisitor(double distanceInKilometers) {
        this.distanceInKilometers = distanceInKilometers;
    }
    
    @Override
    public double visit(Chair chair) {
        // For chairs: flat rate of 15 pesos plus .20 pesos per pound per km
        return 15.0 + (.20 * chair.getWeight() * distanceInKilometers);
    }
    
    @Override
    public double visit(Table table) {
        // For tables: flat rate of 20 pesos plus .50 pesos per pound per km
        // Additional 5 pesos charge for large tables (area > 10 square feet)
        double cost = 20.0 + (.50 * table.getWeight() * distanceInKilometers);
        if (table.getArea() > 10) {
            cost += 50.0;
        }
        return cost;
    }
    
    @Override
    public double visit(Sofa sofa) {
        // For sofas: flat rate of 30 pesos plus .70 pesos per pound per mile
        // Additional 50 charge for sectional sofas
        double cost = 30.0 + (.70 * sofa.getWeight() * distanceInKilometers);
        if (sofa.isSecional()) {
            cost += 50;
        }
        return cost;
    }
}