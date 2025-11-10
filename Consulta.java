import java.util.Date;
public class Consulta {
    private Animal animal;
    private Responsavel responsavel;
    private Vet vet;
    private Date data;
    private String descricao;

    public Consulta (Animal animal, Responsavel responsavel, Vet vet) {
        this.animal = animal;
        this.responsavel = responsavel;
        this.vet =  vet;
        this.data = data;
        this.descricao = descricao;
    }

    public Animal getAnimal() {
        return animal;
    }
    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Responsavel getResponsavel() {
        return responsavel;
    }
    public void setResponsavel(Responsavel responsavel) {
        this.responsavel = responsavel;
    }

    public Vet getVet() {
        return vet;
    }
    public void setVet(Vet vet) {
        this.vet = vet;
    }

    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void mostrarDetalhes() {
        System.out.println("Consulta:");
        System.out.println("Animal: " + animal.getNome() + ", Cliente: " + responsavel.getNome() + ", Veterinário: " + vet.getNome() + ", Data: " + data + ", Descrição: " + descricao);
    }
} 
