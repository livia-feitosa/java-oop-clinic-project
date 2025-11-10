public class Coelho extends Animal {
    private String cor;

    public Coelho (String nome, int idade, String raca, String cor) {
        super(nome, idade, raca);
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor() {
        this.cor = cor;
    }
    
    @Override
    public void mostrarDetalhes() {
        System.out.println("Coelho: " + getNome() + ", Idade: " + getIdade() + ", Raça: " + getRaca() + ", Cor: " + cor);
    }
}
