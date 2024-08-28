package noya;

import java.util.Scanner;
public class Noya {

    public static void main(String[] args) {
        
        /* Grades grd = new Grades();
        grd.getGrades();
        */
        

        System.out.printf("%-10s %-10s %-10s %-10s %-10s\n", "Product ID", "Name", "Price", "Status", "TEP");
        Product pr = new Product();
        pr.addprod(1011, "Soap", 20, 10, 200);
        pr.viewprod();
        
        Product pr1 = new Product();
        pr1.addprod(1012, "Cards", 50, 0, 0);
        pr1.viewprod();
        
    }
    
}
