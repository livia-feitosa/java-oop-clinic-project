import java.util.Scanner;

public class Main {
    
    private static String nomeAnimal;
    private static int idadeAnimal;
    private static String racaAnimal;
    private static String tipoAnimal;
    private static String porteCachorro;
    private static String corGato;
    private static String corCoelho;
    private static String corCavalo;

    private static String nomeCliente;
    private static String cpfCliente;
    

    private static String nomeVeterinario;
    private static String crmvVeterinario;
    private static String especialidadeVeterinario;

    private static String nomeClienteConsulta;
    private static String nomeAnimalConsulta;
    private static String nomeVeterinarioConsulta;
    private static String dataConsulta;
    private static String descricaoConsulta;
   
    public static void main(String[] args) {
        
        System.out.println("\n Happy Pet "); /* Nome da clínica*/
        System.out.println("1. Adicionar PET");
        System.out.println("2. Registrar Responsável do PET");
        System.out.println("3. Adicionar Veterinário");
        System.out.println("4. Marcar Consulta");
        System.out.println("5. Exibir Animais");
        System.out.println("6. Exibir Donos/as");
        System.out.println("7. Exibir Veterinários");
        System.out.println("8. Exibir Consultas");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");

        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            opcao = scanner.nextInt();
            scanner.nextLine();    
               
                switch (opcao) {
                case 1:
                    adicionarAnimal(scanner);
                    break;
                case 2:
                    registrarResponsavel(scanner);
                    break;
                case 3:
                    adicionarVet(scanner);
                    break;
                case 4:
                    marcarConsulta(scanner);
                    break;
                case 5:
                    exibirAnimais();
                    break;
                case 6:
                    exibirClientes();
                    break;
                case 7:
                    exibirVeterinarios();
                    break;
                case 8:
                    exibirConsultas();
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }

    

    private static void exibirMenu() {
        System.out.println("\n Happy Pet "); /* Nome da clínica*/
        System.out.println("1 - Adicionar PET");
        System.out.println("2 - Registrar Responsável do PET");
        System.out.println("3 - Adicionar Veterinário");
        System.out.println("4 - Marcar Consulta");
        System.out.println("5 - Exibir Animais");
        System.out.println("6 - Exibir Donos/as");
        System.out.println("7 - Exibir Veterinários");
        System.out.println("8 - Exibir Consultas");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void adicionarAnimal(Scanner scanner) {
        System.out.println("\n *** Adicionar Animal *** ");
        System.out.print("Tipo de animal (Cachorro, Gato, Coelho, Cavalo): ");
        tipoAnimal = scanner.nextLine();
        System.out.print("Nome do animal: ");
        nomeAnimal = scanner.nextLine();
        System.out.print("Idade do animal: ");
        idadeAnimal = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Raça do animal: ");
        racaAnimal = scanner.nextLine();
        
        switch (tipoAnimal) {
            case "cachorro":
                System.out.print("Porte do cachorro (Pequeno, Médio, Grande): ");
                porteCachorro = scanner.nextLine();
                break;
            case "gato":
                System.out.print("Cor do gato: ");
                corGato = scanner.nextLine();
                break;
            case "coelho":
                System.out.print("Cor do coelho: ");
                corCoelho = scanner.nextLine();
                break;
            case "cavalo":
                System.out.print("Cor do cavalo: ");
                corCavalo = scanner.nextLine();
                break;
            default:
                System.out.println("Tipo de animal inválido.");
                break;
        }

        System.out.println("Animal adicionado com sucesso.");
    }

    private static void registrarResponsavel(Scanner scanner) {
        System.out.println("\n*** Registrar Responsável do PET ***");
        System.out.print("Nome: ");
        nomeCliente = scanner.nextLine();
        System.out.print("CPF: ");
        cpfCliente = scanner.nextLine();

        System.out.println("Cliente registrado com sucesso.");
    }

    private static void adicionarVet(Scanner scanner) {
        System.out.println("\n*** Adicionar Veterinário ***");
        System.out.print("Nome: ");
        nomeVeterinario = scanner.nextLine();
        System.out.print("CRMV: ");
        crmvVeterinario = scanner.nextLine();
        System.out.print("Especialidade: ");
        especialidadeVeterinario = scanner.nextLine();

        System.out.println("Veterinário adicionado com sucesso.");
    }

    private static void marcarConsulta(Scanner scanner) {
        System.out.println("\n*** Marcar Consulta ***");
        System.out.print("Nome do PET para consulta: ");
        nomeAnimalConsulta = scanner.nextLine();
        System.out.print("Nome do responsável do PET para consulta: ");
        nomeClienteConsulta = scanner.nextLine();
        System.out.print("Nome do veterinário para consulta: ");
        nomeVeterinarioConsulta = scanner.nextLine();
        System.out.print("Data da consulta (dd/mm/yyyy): ");
        dataConsulta = scanner.nextLine();
        System.out.print("Descrição da consulta: ");
        descricaoConsulta = scanner.nextLine();

        System.out.println("Consulta marcada com sucesso.");
    }

    private static void exibirAnimais() {
        System.out.println("\n*** Lista de Animais ***");
        if (nomeAnimal != null) {
            System.out.println("Nome: " + nomeAnimal);
            System.out.println("Idade: " + idadeAnimal);
            System.out.println("Raça: " + racaAnimal);
            
            if ("cachorro".equals(tipoAnimal)) {
                System.out.println("Porte: " + porteCachorro);
            } else if ("gato".equals(tipoAnimal)) {
                System.out.println("Cor: " + corGato);
            } else if ("coelho".equals(tipoAnimal)) {
                System.out.println("Cor: " + corCoelho);
            } else if ("cavalo".equals(tipoAnimal)) {
                System.out.println("Cor: " + corCavalo);
            } else {
                System.out.println("Detalhes específicos não disponíveis para este tipo de animal.");
            }
        } else {
            System.out.println("Nenhum animal cadastrado.");
        }
    }
    
    

    private static void exibirClientes() {
        System.out.println("\n*** Lista de Clientes ***");
        if (nomeCliente != null) {
            System.out.println("Nome: " + nomeCliente);
            System.out.println("CPF: " + cpfCliente);
        } else {
            System.out.println("Nenhum cliente cadastrado.");
        }
    }

    private static void exibirVeterinarios() {
        System.out.println("\n*** Lista de Veterinários ***");
        if (nomeVeterinario != null) {
            System.out.println("Nome: " + nomeVeterinario);
            System.out.println("CRMV: " + crmvVeterinario);
            System.out.println("Especialidade: " + especialidadeVeterinario);
        } else {
            System.out.println("Nenhum veterinário cadastrado.");
        }
    }

    private static void exibirConsultas() {
        System.out.println("\n*** Lista de Consultas ***");
        if (nomeAnimalConsulta != null) {
            System.out.println("Animal: " + nomeAnimalConsulta);
            System.out.println("Cliente: " + nomeClienteConsulta);
            System.out.println("Veterinário: " + nomeVeterinarioConsulta);
            } else {
            System.out.println("Nenhuma consulta marcada.");
        }
    }
}

