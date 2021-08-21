package lista2.academico;

public class aluno {
    

private float p1 , p2 ;
private int idade;
private String nome;
private int numeroAluno;

public aluno(){

}
public aluno(String nome,int numeroAluno,int idade,float p1,float p2){
    this.setNome(nome);
    this.setNumeroAluno(numeroAluno);
    this.setIdade(idade);
    this.setP1(p1);
    this.setP2(p2);
}

public final void setNome(String nome){
    if(nome.length()<= 30){
        this.nome = nome;
    }
    else{
        System.out.println("Nome do aluno nao pode ser muito grande");
    }
}
public final void setIdade(int idade){
 if(idade >= 0){
     this.idade = idade;
 }
}

public final void setNumeroAluno(int numeroAluno){
String numeroAlunoString = String.valueOf(numeroAluno);
    if (numeroAlunoString.length() == 6){
        this.numeroAluno = numeroAluno;
    }
    else{
        System.out.println("Número do aluno não pode ser negativo");
    }
}

public final void setP1(float p1){
    if (p1 >= 0){
        this.p1 = p1;
    }
    else {
        System.out.println("nota P1 não pode ser negativa");
    }
}

public final void setP2(float p2){
    if (p2 >= 0){
        this.p2 = p2;
    }
    else {
        System.out.println("nota P2 não pode ser negativa");
    }
}

//getters

public int getIdade(){
    return this.idade;
}

public float getP1(){
    return this.p1;
}

public float getP2(){
    return this.p2;
}

public String getNome(){
    return this.nome;
}

public int getNumeroAluno(){
    return this.numeroAluno;
}

public String toString(){
        return "número do aluno" + this.numeroAluno + "Nome" + this.nome + "p1" + this.p1 + "p2" + this.p2 + "idade" + this.idade + "Nota final" + this.notaFinal();
}

public float notaFinal(){
    return (this.p1 + this.p2 );
}}