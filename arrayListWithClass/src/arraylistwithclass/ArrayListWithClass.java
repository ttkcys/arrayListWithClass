package arraylistwithclass;

import java.util.ArrayList;

public class ArrayListWithClass {

    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>();

        customers.add(new Customer(1, "Yusufhan", "Keleş"));
        customers.add(new Customer(2, "Gözde", "Demir"));
        customers.add(new Customer(3, "Ceylin", "Keleş"));

        for (Customer customer : customers) {
            System.out.println(customer.id);
        }

    }

}
