public class Main 
{
    public static void main(String[] args) 
    {
        logger logger = new logger();
        Payment pay = new Payment(logger);

        Employee emp1 = new PermanentEmployee("Chahak", 50000, 3000);
        Employee emp2 = new ContractEmployee("Chandragupt", 500, 5000);

        pay.addEmployee(emp1);
        pay.addEmployee(emp2);
        pay.generatePayment();
    }
}