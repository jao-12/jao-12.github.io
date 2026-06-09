import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class Main {
    public static void main(String[] args) {
        String nome = null;
        try{
        nome = JOptionPane.showInputDialog("Qual seu nome");
        }
        catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
        String cpf = null;
        try {
            cpf = JOptionPane.showInputDialog("Digite seu cppf");
        } catch (RuntimeException e2) {
            System.out.println(e2.getMessage());
        }
        String fone = null;
        try {
            fone = JOptionPane.showInputDialog("Digite seu número de telefone");
        } catch (RuntimeException e3) {
            System.out.println(e3.getMessage());
        }
        Pessoa pessoa2 = new Pessoa(nome, nome, nome);
        Pessoa pessoa1 = new Pessoa("joao", "123", "919182");
        Funcionario funcionario1 = new Funcionario("professor", "123", "pedro", "123", "91299");
        Aluno aluno1 = new Aluno("kaique", "123323", "19238", "25");
        Professor professor1 = new Professor("prof", "123", "01231", "Wendel");

        StringBuilder texto = new StringBuilder();
        texto.append(pessoa1.saudacao()).append("\n");
        texto.append(funcionario1.desempenhaFuncao()).append("\n");
        texto.append(aluno1.aprende()).append("\n");
        texto.append(professor1.ensina()).append("\n");
        texto.append(aluno1.saudacao()).append("\n");
        texto.append(funcionario1.saudacao()).append("\n");
        texto.append(professor1.saudacao()).append("\n");
        texto.append(pessoa1.saudacao()).append("\n");

        JFrame frame = new JFrame("JANELA ");
        JTextArea area = new JTextArea(texto.toString());
        area.setEditable(false);
        frame.add(new JScrollPane(area));
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}