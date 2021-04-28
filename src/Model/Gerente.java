package Model;

public class Gerente {
    private int id;
    private String nome;
    private String email;
    private String cpf;
    private String telefone;
    private String rg;
    private String usuario;
    private String senha;

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getCpf() {
        return cpf;
    }
    
    public String getTelefone() {
        return telefone;
    }
    
    public String getRg() {
        return rg;
    }  
    
    public String getSenha() {
        return senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    public void setSenha(String senha) {
        this.senha = senha;
    }
}
