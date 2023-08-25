import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double balance = 237.8;

        System.out.println("Por favor, digite o número da conta:");
        int numberAccount = sc.nextInt();
        System.out.println("Por favor digite a Agência:");
        sc.nextLine();
        String agency = sc.nextLine();
        System.out.println("Digite seu nome completo: ");
        String name = sc.nextLine();
        
        System.out.println("Olá! "+name+ " obrigado por criar uma conta em nosso banco, sua agência é "+
        agency+" conta "+numberAccount+ " e seu saldo é "+balance);
    }
}
