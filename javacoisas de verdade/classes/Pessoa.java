class Pessoa{
    String nome;
    String cpf;
    String fone;

    public Pessoa(String nome, String cpf, String fone){
        if (!nome.matches("[a-zA-Z]+")){
            throw new RuntimeException("Nome deve ser apenas letras");
        }
        else if (!cpf.matches("\\d+")){
            throw new RuntimeException("CPF deve conter apenas dígitos");
        }
        else if (!fone.matches("\\d+")){
            throw new RuntimeException("Telefone deve conter apenas dígitos");
        }
        this.nome = nome;
        this.cpf = cpf;
        this.fone = fone;
    }

    public String saudacao(){
        return "Olá, meu nome é " + this.nome + ", meu cpf é " + this.cpf + " e meu telefone é " + this.fone;
    }
}
