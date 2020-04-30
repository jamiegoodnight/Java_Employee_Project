package employeeApp;

public class Main 
{
    // fieds - information
    // methods - behaviors, equivalent to JS functions

    public static void main(String[] args)
    {
        System.out.println("Hello");
        Healthplan h1 = new Healthplan("My Health 1");
        Healthplan h2 = new Healthplan("My Health 2");
        
        Company c1 = new Company("Company A", 100);
        Company c2 = new Company("Company B", 100);

        Employee emp1 = new Employee("Steve", "Green", 45000, true, c1.id, h1.getId());
        Employee emp2 = new Employee("May", "Ford", 80000, true, c1.id, h2.getId());

        System.out.println("*** Query Data ***");
        System.out.println(emp1);
        System.out.println();
        System.out.println(c1.debt);
        c1.debt = -c1.debt;
        System.out.println(c1.debt);

    } 
    // Every Java program has a public static void main
}


// $ javac employeeApp/*.java -- generated/compiled bytecode. The Java runtime env interprets bytecode for 
// each system

// cat employeeApp/Main.class -- so we can see Main.class

//  jar cvfe EmpApp.jar employeeApp.Main employeeApp/*.class Java archive file, combines class files 

//  java -jar EmpApp.jar

//  ^^virtual machine / what kind of file / the file we're running 

