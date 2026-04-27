public class aluno {
    private String nome;
    private int mtr;
    private int dt_nascimento;
    private int telefone;
    private String nome_responsavel;
    public aluno(String nome, int mtr, int dt_nascimento, int telefone, String nome_responsavel ) {
        this.nome = nome;
        this.mtr = mtr;
        this.dt_nascimento = dt_nascimento;
        this.telefone = telefone;
        this.nome_responsavel = nome_responsavel;
    }
    public String apresenteSe() {
        return "Olá, eu sou " + this.nome + " minha matricula é " + this.mtr + " meu telefone é " + this.telefone + " eu nasci em " + this.dt_nascimento + " o nome do meu responsavel é " + this.nome_responsavel;
}
    public String Saudação() {
        return "Bom dia, " + this.nome;
    }
    public class test{
        public static void main(String[] args) {
            aluno andre = new aluno("joao", 23, 2009, 1592009, "marcos" );
            System.out.println(andre.apresenteSe());
            System.out.println(andre.Saudação());
        }
    }
}
