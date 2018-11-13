package Task2Package;

import java.util.Date;

public interface Task2Test {


    public static void main(String [] args){

        Customer cust = new Customer("Olzhas");

        cust.setMemberType("Premium");

        System.out.println(cust);

        Visit vis = new Visit(cust, new Date());

        vis.setProductExpense(10000);
        vis.setServiceExpense(2000);
        System.out.println(vis);


        System.out.println(vis.getTotalExpense());
    }
}
