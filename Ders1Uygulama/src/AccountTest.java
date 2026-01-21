public class AccountTest {

    public static void main(String[] args) {
        Account account1= new Account("Ayşenur Navruz", 50.00);
        Account account2= new Account("John Blue", -7.53);

        System.out.printf("%s balance:  $%.2f%n", account1.getName(),account1.getBalance());
        System.out.printf("%s balance:  $%.2f%n", account2.getName(),account2.getBalance());

    }

}

