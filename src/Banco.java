package src;

/**
 * 13.Escreva uma aplicação que demonstre o uso de instâncias da classe Con-
 * taBancariaSimplificada implementada na seção 3.6.3. Crie um método
 *
 * “transfere” do tipo booleano que tenha como parâmetros dois objetos
 * do tipo Conta e o valor a ser transferido de uma conta para outra. Esse
 * método deverá utilizar os métodos deposita e retira da classe. O tipo
 *
 * booleano de retorno do método é para sinalizar se a operação de trans-
 * ferência de valores foi realizada com sucesso, ou seja, se o valor a ser
 *
 * transferido da conta de origem for menor ou igual ao saldo dessa conta.
 */

public class Banco {
    public static void main(String[] args) {
        ContaBancariaSimplificada conta1 = new ContaBancariaSimplificada("Diego Sousa");
        ContaBancariaSimplificada conta2 = new ContaBancariaSimplificada("Silvania");
        conta1.deposita(38);
        transfere(20, conta1, conta2);
        System.out.println(conta1.toString() + "\n\n" + conta2.toString());
    }
    public static boolean transfere(float valor, ContaBancariaSimplificada contaEnvio,
                                    ContaBancariaSimplificada contaRecebe){
        if (valor <= contaEnvio.saldo){
            contaEnvio.retirada(valor);
            contaRecebe.deposita(valor);
            return true;
        }
        return false;
    }
}
