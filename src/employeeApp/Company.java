package employeeApp;

public class Company 
{
    public static int maxId = 0;
    public final static double match401k = 0.05;
    public int id;
    public String name;
    public int debt;

    public Company(String name, int debt)
    {
        maxId++;
        id = maxId;
        this.name = name;
        this.debt = debt;
    }
}