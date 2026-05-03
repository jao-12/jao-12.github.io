class Funcionario extends Pessoa{
    int cod;
    String funcao;
    public Funcionario(String funcao, int cod, String nome, int cpf, long fone){
        super(nome, cpf, fone);
        this.cod = cod;
        this.funcao = funcao;
    }
    public void desempenhaFuncao(){
        System.out.println(this.nome + " esta desempenhando sua função de " + this.funcao + " e seu cod é " + this.cod);
    }
}