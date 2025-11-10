public class Cavalo extends Animal {
    private String cor;

    public Cavalo(String nome, int idade, String raca, String cor){
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
        System.out.println("Cavalo: " + getNome() + ", Idade: " + getIdade() + ", Raça: " + getRaca() + ", Cor: " + cor);
    }
}
    

