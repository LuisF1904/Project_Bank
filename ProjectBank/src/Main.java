import Classes.*;
import Classes.Enum.*;
import Classes.Report.AccountReport;
import Classes.Report.BankReport;
import Classes.Report.ReportFactory;
import Classes.Report.UserReport;

public class Main {
    public static void main(String[] args) {

        Bank Millenium = new Bank("Millenium");
        Bank BES = new Bank("BES");
        Users Bruno = Millenium.CreateUser("Bruno", 919917503, "bruno@oficial.com");
        Users Diogo = Millenium.CreateUser("Diogo", 910788933, "diogo@email.com");
        Users Luis = Millenium.CreateUser("Luis", 967269754, "luis@gmail.com");

        Account BrunoAccount = Bruno.CreateAccount(2000.0, Currencies.EUR);
        Account DiogoAccount = Diogo.CreateAccount(10.0, Currencies.EUR);
        Account LuisAccount = Luis.CreateAccount(1000.0, Currencies.EUR);

        System.out.println("Bruno Balance: " + BrunoAccount.getTotalBalance());
        System.out.println("Diogo Balance: " + DiogoAccount.getTotalBalance());

        BrunoAccount.Deposit(3500,Currencies.PLN);
        BrunoAccount.Withdraw(500,Currencies.PLN);
        BrunoAccount.Withdraw(500,Currencies.EUR);
        BrunoAccount.OpenLoan(2000,"Loan for buying house","2023-06-28" , 0.01 );

        BrunoAccount.createCard();
        System.out.println("Bruno Balance: " + BrunoAccount.getTotalBalance());
        System.out.println("Diogo Balance: " + DiogoAccount.getTotalBalance());
        DiogoAccount.Transfer(3000,Currencies.PLN,BrunoAccount);

        System.out.println(new ReportFactory().getReport("BANK",Millenium).getReportContent());
        System.out.println(new ReportFactory().getReport("USER",Bruno).getReportContent());
        System.out.println(new ReportFactory().getReport("ACCOUNT",BrunoAccount).getReportContent());
        
    }
}