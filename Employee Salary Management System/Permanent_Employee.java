public class Permanent_Employee implements Employee 
{
    private String name;
    private double basicPay;
    private double bonus;

    public Permanent_Employee(String name, double basicPay, double bonus) 
    {
        this.name = name;
        this.basicPay = basicPay;
        this.bonus = bonus;
    }
    @Override
    public double calculateSalary() {
        return basicPay + bonus;
    }
    @Override
    public String getDetails() {
        return "Permanent Employee: " + name + ", Salary: " + calculateSalary();
    }
}