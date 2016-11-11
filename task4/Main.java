package task4;

/**
 * Created by vadim on 11.11.2016.
 */
public class Main {
    public static void main(String[] args) {
        User user = new User("Vadim", "Dolar", "BBC", 1000, 3, 5000);

        user.paySalary();
        user.withdraw(333);
        user.monthIncreaser(12);
        System.out.println("Length of company is " + user.companyNameLength());
    }
}
