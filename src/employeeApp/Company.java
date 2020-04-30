package employeeApp;

public class Company 
{
    private static int maxId = 0;
    private final static double match401k = 0.05;
    private int id;
    private String name;
    private int debt;

    public Company(String name, int debt)
    {
        maxId++;
        id = maxId;
        this.name = name;
        this.debt = debt;
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getDebt()
    {
        return debt;
    }

    public void setDebt(int debt)
    {
        this.debt = debt;
    }
}