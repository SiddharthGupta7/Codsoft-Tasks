import java.util.Scanner;

class atm {
    @SuppressWarnings("static-access")
    public static void show(user obj) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        while (exit == false) {
            System.out.println("ATM Menu:");
            System.out.println("Choose an option from the following: ");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Deposit Money");
            System.out.println("4. Exit");

            int opt = sc.nextInt();
            switch (opt) {
                case 1:
                    obj.getBalance();
                    break;
                case 2:
                    System.out.println("Enter the amount: ");
                    int w = sc.nextInt();
                    obj.withdraw(w);
                    break;
                case 3:
                    System.out.println("Enter the amount: ");
                    int d = sc.nextInt();
                    obj.deposit(d);
                    break;
                case 4:
                    exit = true;
                    System.out.println("Thank You for using the ATM.");
                    break;
            }

        }
        sc.close();
    }

}

class user {
    private static int balance;

    @SuppressWarnings("static-access")
    public user(int initialBalance) {
        this.balance = initialBalance;
    }

    public static void getBalance() {
        System.out.println("Your current balance is: " + balance);
    }

    public static void withdraw(int a) {
        if (a <= balance && a > 0) {
            balance -= a;
            System.out.println("Withdrawl Successful");
            System.out.println("Remaning amount: " + balance);
        } else if (a <= 0) {
            System.out.println("Invalid Amount");
        } else {
            System.out.println("Insufficent Balance");
        }
    }

    public static void deposit(int a) {
        balance += a;
        System.out.println("Deposit Successful");
    }
}

public class AtmInterface {
    public static void main(String[] args) {
        System.out.println("Welcome to the ATM");
        user user = new user(1000);
        atm.show(user);
        
    }
}
