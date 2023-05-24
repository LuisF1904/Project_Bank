import Classes.*;
import Classes.Enum.*;

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

        // Chain Of Responsibility Usage
        var transfer = new Transfer(1000,Currencies.EUR,BrunoAccount,DiogoAccount);
        VerificationParameter issamebankParameter = new VerificationParameter.isInSameBank();
        VerificationParameter currencyParameter = new VerificationParameter.currencyVerifier();
        VerificationParameter amountParameter = new VerificationParameter.amountVerifier();

        issamebankParameter.SetNextVerificator(currencyParameter);
        currencyParameter.SetNextVerificator(amountParameter);

        System.out.println("BEFORE: \nBalance of Diogo: "+ DiogoAccount.getTotalBalance()+" \nBalance of Bruno: "+ BrunoAccount.getTotalBalance());
        issamebankParameter.ProcessVerification(transfer); // Triggers Operation
        System.out.println("AFTER: \nBalance of Diogo: "+ DiogoAccount.getTotalBalance()+" \nBalance of Bruno: "+ BrunoAccount.getTotalBalance());

    }
}