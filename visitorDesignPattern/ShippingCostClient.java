public class ShippingCostClient {
    public static void main(String[] args) {

        //visitor
        double shippingDistance = 50.0; // km
        ShippingCostVisitor standardShipping = new StandardShippingCostVisitor(shippingDistance);
        ShippingCostVisitor expressShipping = new ExpressShippingCostVisitor(shippingDistance);

        // chair 
        Furniture officeChair = new Chair("Ergonomic Office Chair", 15.5, 3.5);

        // calculate standard shipping costs for chair
        System.out.println("Standard Shipping Costs: ");
        System.out.println("Office Chair: " + String.format("%.2f", officeChair.accept(standardShipping)));

        // calculate express shipping costs for chair
        System.out.println("Express Shipping Costs: ");
        System.out.println("Office Chair: " + String.format("%.2f", officeChair.accept(expressShipping)));

        //table
        Furniture diningTable = new Table("Oak Dining Table", 35.0, 15.0);

        // calculate standard shipping costs for table
        System.out.println("\nStandard Shipping Costs:");
        System.out.println("Dining Table: " + String.format("%.2f", diningTable.accept(standardShipping)));

        // calculate express shipping costs for table
        System.out.println("Express Shipping Costs:");
        System.out.println("Dining Table: " + String.format("%.2f", diningTable.accept(expressShipping)));

        //sofa
        Furniture cornerSofa = new Sofa("L-shaped Corner Sofa", 45.0, 7.5, true);

        // calculate standard shipping costs for sofa
        System.out.println("\nStandard Shipping Costs: ");
        System.out.println("Corner Sofa: " + String.format("%.2f", cornerSofa.accept(standardShipping)));

        // calculate express shipping costs for sofa
        System.out.println("Express Shipping Costs:");
        System.out.println("Corner Sofa: " + String.format("%.2f", cornerSofa.accept(expressShipping)));

        
        
        
        
        
    }
}