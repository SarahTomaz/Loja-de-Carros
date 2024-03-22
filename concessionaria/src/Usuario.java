import java.io.Serializable;

public class Usuario implements Serializable {
    private String nomeUsuario;
    private String senha;
    private boolean admin;

    public Usuario(String nomeUsuario, String senha, int admin) {
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;

        // confirmação de usuário administrador
        if (admin == 1) {
            this.admin = true;
        } else {
            this.admin = false;
        }
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean getadmin() {
        return admin;
    }

    public void setadmin(boolean admin) {
        this.admin = admin;
        ;
    }

}
