import java.util.Scanner;

public class  ContaBanco{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        String agencia, nomeDoCliente;
        double saldo;

        System.out.print("Por favor, digite o número da agência: ");
        agencia = sc.next();

        System.out.print("Por favor, digite o número da conta: ");
        numero = sc.nextInt();

        System.out.print("Por favor, digite o seu nome: ");
        nomeDoCliente = sc.next();

        System.out.print("Por favor, digite o seu saldo: ");
        saldo = sc.nextDouble();
    

        System.out.println(
        "Olá " + nomeDoCliente + ", Obrigado por criar uma conta conosco, sua agência é:" + agencia +
        " conta "+ numero +" e seu saldo é:"+ saldo+ " já disponível para saque");
    }
}
