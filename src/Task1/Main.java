package Task1;


import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //Min ArrayList til at kunne holde mine objekter
        ArrayList<Customer> customers = new ArrayList<>();

        //Mine objekter som laves og derefter addes
        Customer c1 = new Customer("Seif", "Ahmad", "BridtsgGD");
        Customer c2 = new Customer("Omed", "Tamar", "Omedkillsyou");
        customers.add(c1);
        customers.add(c2);

        //Her kalder jeg på printcustomers
        printCustomers(customers);
        }
        //
        public static void  printCustomers(ArrayList<Customer> customers){
        //Min for loop som går igennem hver Customer objekt jeg har lavet
        for (Customer customer : customers){
            System.out.println(customer);
        }


        }


    }



class Customer {
   private  String firstName;
   private String lastName;
   private String userName;
   private  int id;
   private static int counter;
//
    public Customer(String lastName, String firstName, String userName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.userName = userName;
        counter++;
        this.id = counter;


    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getId() {
        return id;
    }

    public static int getCounter() {
        return counter;
    }
    @Override
    public String toString(){
        return "Customer ID: " + id + "\n" + "Name: "
                + firstName + " " + lastName + "\n" + "Username: " + userName + "\n";


    }


}

