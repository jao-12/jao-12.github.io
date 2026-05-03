public class Aluno extends Pessoa {
    int mtr;
    public Aluno(String nome, int cpf, long fone, int mtr){
        super(nome, cpf, fone);
        this.mtr = mtr;
    }
    public void aprende(){
        System.out.println("O aluno " + this.nome + " está aprendendo");
    }
}
