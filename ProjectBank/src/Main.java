import Classes.*;
import Classes.Enum.*;
import Classes.Report.AccountReport;
import Classes.Report.BankReport;
import Classes.Report.UserReport;

public class Main {
    public static void main(String[] args) {

        Bank Millenium = new Bank("Millenium");
        Users Bruno = Millenium.CreateUser("Bruno", 919917503, "bruno@oficial.com");
        Users Diogo = Millenium.CreateUser("Diogo", 910788933, "diogo@email.com");
        Users Luis = Millenium.CreateUser("Luis", 967269754, "luis@gmail.com");

        Account BrunoAccount = Bruno.createAccount_WithCard(2000.0, Currencies.EUR);
        Account DiogoAccount = Diogo.createAccount_Standard(10.0, Currencies.EUR);
        Account LuisAccount = Luis.createAccount_WithCard(1000.0, Currencies.EUR);

        System.out.println("Account Diogo: "+ DiogoAccount);
        System.out.println("Account Bruno: "+ BrunoAccount);

    }
}