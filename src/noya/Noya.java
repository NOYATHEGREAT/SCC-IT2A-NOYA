package noya;

import java.util.Scanner;
public class Noya {

    public static void main(String[] args) {
        
        /* Grades grd = new Grades();
        grd.getGrades();
        
        

        System.out.printf("%-10s %-10s %-10s %-10s %-10s\n", "Product ID", "Name", "Price", "Status", "TEP");
        Product pr = new Product();
        pr.addprod(1011, "Soap", 20, 10, 200);
        pr.viewprod();
        
        Product pr1 = new Product();
        pr1.addprod(1012, "Cards", 50, 0, 0);
        pr1.viewprod(); 
        
        Product [] pr = new Product[100];
        int i ;
        System.out.println("Enter number of details : ");
        int nprod = s.nextInt();
        
        for (i = 0; i < nprod; i++){
            System.out.println("Enter no. of details: "+( i + 1 ) + ": ");
            System.out.println("ID: ");
            int id = s.nextInt();
            System.out.println("Name: ");
            int name = s.nextInt();
            System.out.println("Price: ");
            double p = s.nextDouble();
            System.out.println("Stock: ");
            int st = s.nextInt();
            System.out.println("Sold: ");
            int sold = s.nextInt();
            pr[i] = new Product();
            pr[i].addprod(id, name, p, s,sold);
            
            
        }
        
        for (i = 0; i < nprod; i++)
            pr[1].viewprod();
            */
         Scanner s = new Scanner(System.in);
        Accounts[] acc = new Accounts[100];
       
        int no, i, id;

        System.out.print("Enter number of Accounts: ");
        no = s.nextInt();

        for (i = 0; i < no; i++) {
            acc[i] = new Accounts();
         
            boolean identi;
            boolean email1;
            boolean username;
           
            System.out.println("Enter account Details " + (i + 1) + ": ");
            while (true) {
                System.out.print("Enter ID: ");
                id = s.nextInt();
                identi = false;

               
                for (int x = 0; x < i; x++) {
                    if (acc[x] != null && acc[x].id == id) {
                        identi = true;
                        break;
                    }
                }

                if (identi) {
                    System.out.println(" - ID already exists. Try again -");
                } else {
                   
                    acc[i].id = id;
                    break;
                }
            }
           
            System.out.print("First Name: ");
            String fname = s.next();
            System.out.print("Last Name: ");
            String lname = s.next();
           
             while (true) {
                System.out.print("Email: ");
                String email = s.next();
                email1 = false;

               
                for (int x = 0; x < i; x++) {
                    if (acc[x] != null && acc[x].email.equals(email)) {
                        email1 = true;
                        break;
                    }
                }

                if (email1) {
                    System.out.println(" - Email already exists. Try again -");
                } else {
                   
                    acc[i].email = email;
                    break;
                }
            }
           
             while (true) {
                System.out.print("Username: ");
                String user = s.next();
                username = false;

               
                for (int x = 0; x < i; x++) {
                    if (acc[x] != null && acc[x].username.equals(user)) {
                        username = true;
                        break;
                    }
                }

                if (username) {
                    System.out.println(" - Username already exists. Try again -");
                } else {
                   
                    acc[i].username = user;
                    break;
                }
            }
           
            boolean passValid = false;
           
            while (!passValid) {
                System.out.print("Password: ");
                String password = s.next();

                if (acc[i].passwordVerify(password)) {
                    acc[i].addAccount(acc[i].id, fname, lname, acc[i].email, acc[i].username, password);
                    passValid = true;  
                } else {
                    System.out.println(" - Invalid password - , Try Again ");
                }
            }
            System.out.println("");
       

        }
        System.out.println("Account Details: ");
         System.out.printf("%-10s %-10s %-10s %-20s %-13s %-10s\n","ID", "FirstName", "LastName", "Email", "Username", "Password");
         System.out.println("---------------------------------------------------------------------------------");
        for (i = 0; i < no; i++) {
            if(acc[i] != null){
            acc[i].viewAccount();
            System.out.println("");
        }
        }
    }
}
        
    
    

