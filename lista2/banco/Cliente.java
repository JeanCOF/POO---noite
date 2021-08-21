package lista2.banco;

public class Cliente {
    private String numeroConta, numeroAgencia;
    private float saldo;
    private String nome;

    public Cliente(){

    }
    public Cliente(String numeroConta, String numeroAgencia, float saldo, String nome){
        this.setNumeroConta(numeroConta);
    }

    public final void setNumeroConta(String numeroConta){
        if ((numeroConta.length() == 8) && (numeroConta.charAt(numeroConta.length()-2) == '-')){
            this.numeroConta = numeroConta;
        }
        else {
            System.out.println("Número de conta inválido");
        }
    }


public final void setNumeroAgencia(String numeroAgencia){
    if ((numeroAgencia.length() == 6) && (numeroAgencia.charAt(4) == '-')){
        this.numeroAgencia = numeroAgencia;
    }
    else {
        System.out.println("Número da agência inválido");
    }
}


public final void setSaldo(float x){
  if (x >= 0){
      this.saldo = this.saldo ;
  }
  else {
      System.out.println("Saldo não pode fiar negativo");
  }
}

public final void setNome(String nome){
    if( nome.length() <=30){
        this.nome = nome;

    }
    else{
        System.out.println("tamanho do nome é muito grande");
    }
}

public String getNome(){
    return this.nome;
}

public float getSaldo(){
    return this.saldo;
}

public String toString(){// Converte o objeto em uma string
    return "Número da conta " + this.numeroConta + " Número de agêngia " + this.numeroAgencia + " Nome " + this.nome + "Saldo" + this.saldo;
}

public void realizarDeposito(float x){
    if( x >=0){
        this.saldo += x;
    }
}


public void realizarSaque(float x){
    if( x >=0){
        this.setSaldo(this.saldo - x);
    }
}}