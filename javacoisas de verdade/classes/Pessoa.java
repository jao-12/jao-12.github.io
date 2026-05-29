class Pessoa{
    String nome;
    String cpf;
    String fone;

    public Pessoa(String nome, String cpf, String fone){
        this.nome = nome;
        this.cpf = cpf;
        this.fone = fone;
    }

    public String saudacao(){
        return "Olá, meu nome é " + this.nome + ", meu cpf é " + this.cpf + " e meu telefone é " + this.fone;
    }
}
