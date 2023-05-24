import Classes.*;
import Classes.Enum.*;
import Classes.Report.AccountReport;
import Classes.Report.BankReport;
import Classes.Report.UserReport;

public class Main {
    public static void main(String[] args) {

        IBPA ibpa = IBPA.getInstance(); //Singleton Usage
        Bank Millenium = new Bank("Millenium");
        Bank BES = new Bank("BES");

        ibpa.bankList.add(Millenium);
        ibpa.bankList.add(BES);

        Users Bruno = Millenium.CreateUser("Bruno", 919917503, "bruno@oficial.com");
        Users Diogo = BES.CreateUser("Diogo", 910788933, "diogo@email.com");

        Account acc_Bruno = Bruno.CreateAccount(1500,Currencies.EUR);
        Account acc_Diogo = Diogo.CreateAccount(900,Currencies.EUR);

        System.out.println("BEFORE: \nBalance of Bruno: "+ acc_Bruno.getTotalBalance()+" \nBalance of Diogo: "+ acc_Diogo.getTotalBalance());
        ibpa.InterbankPayment(acc_Bruno,acc_Diogo,200,Currencies.EUR);
        System.out.println("AFTER: \nBalance of Bruno: "+ acc_Bruno.getTotalBalance()+" \nBalance of Diogo: "+ acc_Diogo.getTotalBalance());

    }
}