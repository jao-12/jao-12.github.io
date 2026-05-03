class Pessoa{
    String nome;
    int cpf;
    long fone;
    public Pessoa(String nome, int cpf, long fone){
        this.nome = nome;
        this.cpf = cpf;
        this.fone = fone;
    }
    public void Saudação(){
        System.out.println("Olá meu nome é " + this.nome + " meu cpf é " + this.cpf + " meu telefone é " + this.fone);
    }
}