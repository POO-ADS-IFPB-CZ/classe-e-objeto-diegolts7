package src;

public class ContaBancariaSimplificada {
    String nomeCorrentista;
    float saldo;
    boolean isSpecial;

    public ContaBancariaSimplificada(String nome){
        this.nomeCorrentista = nome;

    }

    void inicializaConta(){
        this.saldo = 0;
        this.isSpecial = false;
    }

    void deposita(float valor){
        this.saldo+=valor;
    }

    boolean retirada(float valor){
        if (!this.isSpecial){
            if (valor <= this.saldo){
                this.saldo -= valor;
                return true;
            }
            return false;
        }else {
            this.saldo -= valor;
            return true;
        }

    }

    @Override
    public String toString() {
        return "ContaBancariaSimplificada{" +
                "nomeCorrentista=" + this.nomeCorrentista + "," +
                "saldo=" + this.saldo + "," +
                "isSpecial=" + this.isSpecial +
                "}";
    }
}
