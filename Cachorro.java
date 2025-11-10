public class Cachorro extends Animal {
    private String porte;

    public Cachorro (String nome, int idade, String raca, String porte) {
        super(nome, idade, raca);
        this.porte = porte;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    @Override
    
    public void mostrarDetalhes() {
        System.out.println("Cachorro: " + getNome() + ", Idade: " + getIdade() + ", Raça: " + getRaca() + ", Porte: " + porte);
    }
}
