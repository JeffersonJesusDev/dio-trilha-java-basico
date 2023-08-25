public class CaixaEletronico {
    public static void main(String[] args) throws Exception {
       
        double saldo = 25.0;
        double valorSolicitado = 26.0;

        if(valorSolicitado < saldo){
            saldo -= valorSolicitado;
            System.out.println(saldo);
        }
        else{
            System.out.println("Saldo insuficiente!");
        }
    }
}
