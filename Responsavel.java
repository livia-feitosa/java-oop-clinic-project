public class Responsavel {
    private String nome;
    private int cpf;

    public Responsavel (String nome, int cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCPF() {
        return cpf;
    }

    public void setCPF(int cpf) {
        this.cpf = cpf;
    }
    public void mostrarDetalhes() {

        System.out.println("Responsável: " + nome + ", CPF: " + cpf);
    }    
}
