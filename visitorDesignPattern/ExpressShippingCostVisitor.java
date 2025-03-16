class ExpressShippingCostVisitor implements ShippingCostVisitor {
    private double distanceInKilometers;
    
    public ExpressShippingCostVisitor(double distanceInKilometers) {
        this.distanceInKilometers = distanceInKilometers;
    }
    
    @Override
    public double visit(Chair chair) {
        // Express shipping for chairs: 2x standard rate plus 20 pesos express fee
        return 2 * (15.0 + (.20 * chair.getWeight() * distanceInKilometers)) + 20.0;
    }
    
    @Override
    public double visit(Table table) {
        // Express shipping for tables: 2x standard rate plus 50 pesos express fee
        double standardCost = 20.0 + (.50 * table.getWeight() * distanceInKilometers);
        if (table.getArea() > 10) {
            standardCost += 50;
        }
        return 2 * standardCost + 40.0;
    }
    
    @Override
    public double visit(Sofa sofa) {
        // Express shipping for sofas: 2x standard rate plus 80 express fee
        double standardCost = 30.0 + (.70 * sofa.getWeight() * distanceInKilometers);
        if (sofa.isSecional()) {
            standardCost += 50.0;
        }
        return 2 * standardCost + 80.0;
    }
}