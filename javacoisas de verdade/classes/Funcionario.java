class Funcionario extends Pessoa{
    String cod;
    String funcao;

    public Funcionario(String funcao, String cod, String nome, String cpf, String fone){
        super(nome, cpf, fone);
        this.cod = cod;
        this.funcao = funcao;
    }

    public String desempenhaFuncao(){
        return this.nome + " está desempenhando sua função de " + this.funcao + " e seu cod é " + this.cod;
    }
}
