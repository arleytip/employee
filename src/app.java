public class app {

    public String name;
    public double gSalary;
    public double tax;
    public double percentage;

    public double upSalary(){
        return (((percentage / 100) * gSalary) + gSalary) - tax;
    }
    public double salary(){
        return  gSalary - tax;
    }

    public String toString(){
        return "Employee: "
                + name
                + " "
                + "$ "
                + String.format("%.2f", salary());
    }

}
