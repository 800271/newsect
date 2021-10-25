/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package section1.pkg2;

/**
 *
 * @author hatem mostafa
 */
public class Section12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Account acc=new Account(2000,23000);
        acc.setAnnualInterestRate(5.1);
        acc.withdraw(4000.0);
        acc.deposit(3000.0);
        System.out.println("Balance :"+acc.getBalance());
        System.out.println("Data Created: "+acc.getDateCreated());
    }
    
}
