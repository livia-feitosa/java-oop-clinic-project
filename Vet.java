public class Vet {
    private String nome;
    private int crmv;
    private String especialidade;

    public Vet(String nome, int crmv, String especialidade) {
        this.nome = nome;
        this.crmv = crmv;
        this.especialidade = especialidade;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCRMV() {
        return crmv;
    }
    public void setCRMV(int crmv) {
        this.crmv = crmv;
    }

    public String getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade() {
        this.especialidade = especialidade;
    }

    public void mostrarDetalhes() {
        System.out.println("Veterinário: " + nome + ", CRMV: " + crmv + ", Especialidade: " + especialidade);
    }
    
}
