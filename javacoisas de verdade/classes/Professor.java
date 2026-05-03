public class Professor extends Pessoa{
    String titulo;
    public Professor(String titulo, long fone, int cpf, String nome){
        super(nome, cpf, fone);
        this.titulo = titulo;
    }
    public void ensina(){
        System.out.println("O professor " + this.nome + " esta ensinando");
    }
}
