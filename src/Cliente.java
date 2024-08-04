public class Cliente {
    private String nome;
    private String telefone;
    private String email;
    private Servico servicoEscolhido; // Novo atributo

    public Cliente(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.servicoEscolhido = null; // Inicialmente, nenhum serviço escolhido
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Servico getServicoEscolhido() {
        return servicoEscolhido;
    }

    public void setServicoEscolhido(Servico servicoEscolhido) {
        this.servicoEscolhido = servicoEscolhido;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                ", servicoEscolhido=" + (servicoEscolhido != null ? servicoEscolhido.getNome() : "Nenhum") +
                '}';
    }
}
