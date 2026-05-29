public class Professor extends Pessoa{
    String titulo;

    public Professor(String titulo, String cpf, String fone, String nome){
        super(nome, cpf, fone);
        this.titulo = titulo;
    }

    public String ensina(){
        return "O professor " + this.nome + " está ensinando";
    }
}
