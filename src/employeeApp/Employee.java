package employeeApp;

public class Employee {
    // ------- fields
    // base types in Java are lowercase. Strings are classes dervied from char
    // and capitalized 

    private static int maxId = 0;
    private int id;
    private String fname;
    private String lname;
    private double salary;

    // doubles are real numbers / floats 

    private boolean has401k;
    private int companyId;
    private int healthPlanId;

    // constructor -- instatiates the state of object

    public Employee(String fname, String lname, double salary, boolean has401k, int companyId, int healthPlanId)
    {   
        maxId++;
        id=maxId;
        this.fname = fname;
        this.lname = lname;
        this.salary = salary;
        this.has401k = has401k;
        this.companyId = companyId;
        this.healthPlanId = healthPlanId;
    }

    // ------ methods - getters and setters
    // Look into switch?
    public int getId()
    {
        return id;
    }

    public void setFname(String fname)
    {
        this.fname = fname;
    }

    // void means nothing is returned

    public String getFname()
    {
        return fname;
    }

    public void setLname(String lname)
    {
        this.lname = lname;
    }

    public String getLname()
    {
        return lname;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    public double getSalary()
    {
        return salary;
    }

    public void setHas401k(boolean has401k)
    {
        this.has401k = has401k;
    }

    public boolean getHas401k()
    {
        return has401k;
    }

    public void setCompanyId(int companyId)
    {
        this.companyId = companyId;
    }

    public int getCompanyId()
    {
        return companyId;
    }

    public void setHealthPlanId(int healthPlanId)
    {
        this.healthPlanId = healthPlanId;
    }

    public int getHealthPlanId()
    {
        return healthPlanId;
    }

    // ------- other methods 

    public String getName()
    {
        return fname + " " + lname;
    }
}