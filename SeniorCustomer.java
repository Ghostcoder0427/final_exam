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

public class SeniorCustomer extends Customer {
	public static final double DISCOUNT = 0.20;

	public SeniorCustomer(String name, double amount) {
		super(name, amount);
                
	}
	
        @Override
	public double calculateBill() {
		return (amount-(amount * DISCOUNT));
	}
}
