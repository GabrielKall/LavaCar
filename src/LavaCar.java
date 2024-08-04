import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LavaCar {
    private List<Cliente> clientes;
    private List<Servico> servicos;
    private List<Funcionario> funcionarios;

    public LavaCar() {
        this.clientes = new ArrayList<>();
        this.servicos = new ArrayList<>();
        this.funcionarios = new ArrayList<>();
    }

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void removerCliente(Cliente cliente) {
        clientes.remove(cliente);
    }

    public void adicionarServico(Servico servico) {
        servicos.add(servico);
    }

    public void removerServico(Servico servico) {
        servicos.remove(servico);
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void removerFuncionario(Funcionario funcionario) {
        funcionarios.remove(funcionario);
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public List<Servico> getServicos() {
        return servicos;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void escolherServico(Cliente cliente) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um serviço para o cliente " + cliente.getNome() + ":");
        for (int i = 0; i < servicos.size(); i++) {
            System.out.println((i + 1) + ". " + servicos.get(i).getNome() + " - R$ " + servicos.get(i).getPreco());
        }

        int escolha = scanner.nextInt();
        if (escolha > 0 && escolha <= servicos.size()) {
            cliente.setServicoEscolhido(servicos.get(escolha - 1));
            System.out.println("Serviço " + servicos.get(escolha - 1).getNome() + " escolhido para o cliente " + cliente.getNome());
        } else {
            System.out.println("Escolha inválida.");
        }
    }

    public static void main(String[] args) {
        LavaCar lavaCar = new LavaCar();

        Cliente cliente1 = new Cliente("João", "123456789", "joao@example.com");
        Cliente cliente2 = new Cliente("Maria", "987654321", "maria@example.com");

        Servico servico1 = new Servico("Lavagem Simples", 30.0);
        Servico servico2 = new Servico("Lavagem Completa", 50.0);

        Funcionario funcionario1 = new Funcionario("Carlos", "Lavador", 1500.0);
        Funcionario funcionario2 = new Funcionario("Ana", "Atendente", 1200.0);

        lavaCar.adicionarCliente(cliente1);
        lavaCar.adicionarCliente(cliente2);

        lavaCar.adicionarServico(servico1);
        lavaCar.adicionarServico(servico2);

        lavaCar.adicionarFuncionario(funcionario1);
        lavaCar.adicionarFuncionario(funcionario2);

        System.out.println("Clientes: " + lavaCar.getClientes());
        System.out.println("Serviços: " + lavaCar.getServicos());
        System.out.println("Funcionários: " + lavaCar.getFuncionarios());

        lavaCar.escolherServico(cliente1);
        lavaCar.escolherServico(cliente2);

        System.out.println("Clientes após escolha de serviços: " + lavaCar.getClientes());
    }
}
