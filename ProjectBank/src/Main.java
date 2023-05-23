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

        Account BrunoAccount = Bruno.CreateAccount(2000.0, Currencies.EUR);
        Account DiogoAccount = Diogo.CreateAccount(10.0, Currencies.EUR);
        Account LuisAccount = Luis.CreateAccount(1000.0, Currencies.EUR);

        UserReport  Bruno_UserReport = new UserReport(Bruno); //user report test
        System.out.println(Bruno_UserReport.getReportContent());

        AccountReport Diogo_AccountReport = new AccountReport(DiogoAccount); //account report test
        System.out.println(Diogo_AccountReport.getReportContent());

        BankReport Millenium_BankReport = new BankReport(Millenium); //bank report test
        System.out.println(Millenium_BankReport.getReportContent());

    }
}