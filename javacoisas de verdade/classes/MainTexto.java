public class MainTexto {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("joao", "123", "919182");
        Funcionario funcionario1 = new Funcionario("professor", "123", "pedro", "123", "91299");
        Aluno aluno1 = new Aluno("kaique", "123323", "19238", "25");
        Professor professor1 = new Professor("prof", "123", "01231", "Wendel");

        System.out.println(pessoa1.saudacao());
        System.out.println(funcionario1.desempenhaFuncao());
        System.out.println(aluno1.aprende());
        System.out.println(professor1.ensina());
        System.out.println(aluno1.saudacao());
        System.out.println(funcionario1.saudacao());
        System.out.println(professor1.saudacao());
    }
}
