import Classes.*;
import Classes.Enum.*;
import Classes.Report.AccountReport;
import Classes.Report.BankReport;
import Classes.Report.UserReport;

public class Main {
    public static void main(String[] args) {

        //AFTER FACADE IMPLEMENTATION
        Facade_Loan loanFacade = new Facade_Loan("Millenium","Bruno",919917503,
                "bruno@oficial.com",3000,Currencies.USD,"new Work Done",
                100000.0,"2024-08-07",0.01);
        System.out.println(loanFacade.getAccount());

    }
}