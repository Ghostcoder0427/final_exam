/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final_exam;

/**
 *
 * @author Best Friend
 */

public class Main {
	public static void main(String[] args) {
		Customer customer;
                String SenCustomerName = "Raul Villarin";
                String RegCustomerName = "Ronald Reforma";
                
               
		RegularCustomer regularCustomer = new RegularCustomer(RegCustomerName, 5000);
            
		SeniorCustomer seniorCustomer = new SeniorCustomer(SenCustomerName, 5000);

		customer = regularCustomer;
		System.out.println(customer.getName()+" " +customer.calculateBill());

		customer = seniorCustomer;
		System.out.println(customer.getName()+" "+customer.calculateBill());
	}
}
