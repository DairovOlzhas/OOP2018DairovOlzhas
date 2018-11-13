package Task2Package;

import java.util.Date;

public class Visit {

    private Customer customer;
    private Date date;
    private double serviceExpense;
    private double productExpense;

    public Visit(Customer customer, Date date){
        this.customer = customer;
        this.date = date;
    }

    public double getServiceExpense() {
        if(!customer.isMember())
            return serviceExpense;
        return serviceExpense*(1 - DiscountRate.getServiceDiscountRate(customer.getMemberType()));
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    public double getProductExpense() {
        if(!customer.isMember())
            return productExpense;
        return productExpense*(1 - DiscountRate.getProductDiscountRate(customer.getMemberType()));
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }

    public double getTotalExpense(){
        return getProductExpense() + getServiceExpense();
    }

    @Override
    public String toString() {
        return "Visited data" + date;
    }
}
