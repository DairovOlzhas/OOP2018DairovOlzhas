package Task2Package;

public class DiscountRate {

    private static double serviceDiscountPremium = 0.2;
    private static double serviceDiscountGold = 0.15;
    private static double serviceDiscountSilver = 0.1;
    private static double productDiscountPremium = 0.1;
    private static double productDiscountGold = 0.1;
    private static double productDiscountSilver = 0.1;

    static public double getServiceDiscountRate(String type){
        if(type == "P")
            return serviceDiscountPremium;
        if(type == "G")
            return serviceDiscountGold;
        if(type == "S")
            return serviceDiscountSilver;
        return 0;
    }

    static public double getProductDiscountRate(String type){
        if(type == "P")
            return productDiscountPremium;
        if(type == "G")
            return productDiscountGold;
        if(type == "S")
            return productDiscountSilver;
        return 0;
    }
}
