package task4;

public class User {
    private static final int COMMISSION = 5;
    private String name;
    private String currency;
    private String companyName;
    private int balance;
    private int monthsOfEmployment;
    private int salary;

    public User(String name, String currency, String companyName,
                int balance, int monthsOfEmployment, int salary) {
        this.name = name;
        this.currency = currency;
        this.companyName = companyName;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.salary = salary;
    }

    public void paySalary() {
        this.balance += this.salary;
        System.out.println("Your salary is " + this.salary + "\nYour balance has updated! Now your balance is " + this.balance);
    }

    public void withdraw(int amount) {
        if (this.checkBalance(amount)) {
            this.balance = this.balance - (this.getCommission(amount) + amount);
            System.out.println("Commission of " + amount + " is " + this.getCommission(amount) + " Your balance after transaction is " + this.balance);
        } else {
            System.out.println("Enter the amount of money! Yor balance is " + this.balance);
        }
    }

    private int getCommission(int amount) {
        int commission = 0;
        if (amount < 1000) {
            commission = amount * 5 / 100;
            return commission;
        }
        commission = amount * 10 / 100;
        return commission;
    }

    private boolean checkBalance(int amount) {
        if (this.balance > 0) {
            int commission = this.getCommission(amount);
            int balance = this.balance - (commission + amount);
            return balance >= 0;
        }
        return false;
    }

    public int companyNameLength() {
        return this.companyName.length();
    }

    public void monthIncreaser(int addMonth) {
        this.monthsOfEmployment *= addMonth;
        System.out.println("Months of employment is" + this.monthsOfEmployment);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getMonthsOfEmployment() {
        return monthsOfEmployment;
    }

    public void setMonthsOfEmployment(int monthsOfEmployment) {
        this.monthsOfEmployment = monthsOfEmployment;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
