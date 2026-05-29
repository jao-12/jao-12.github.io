public class Aluno extends Pessoa {
    String mtr;

    public Aluno(String nome, String cpf, String fone, String mtr){
        super(nome, cpf, fone);
        this.mtr = mtr;
    }

    public String aprende(){
        return "O aluno " + this.nome + " está aprendendo";
    }
}
