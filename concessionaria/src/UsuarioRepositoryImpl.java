import java.util.ArrayList;
import java.util.List;

    public class UsuarioRepositoryImpl implements UsuarioRepository {
            
            private List<Usuario> usuarios = new ArrayList<Usuario>();
    
            @Override
            public void adicionarUsuario(Usuario usuario) {
                usuarios.add(usuario);
            }
    
            @Override
            public void removerUsuario(String nomeUsuario) {
                usuarios.removeIf(usuario -> usuario.getNomeUsuario().equals(nomeUsuario));
            }
    
            @Override
            public void atualizarUsuario(Usuario usuario) {
                for (int i = 0; i < usuarios.size(); i++) {
                    if (usuarios.get(i).getNomeUsuario().equals(usuario.getNomeUsuario())) {
                        usuarios.set(i, usuario);
                        break;
                    }
                }
            }
    
            @Override
            public Usuario buscarUsuario(String nomeUsuario) {
                for (Usuario usuario : usuarios) {
                    if (usuario.getNomeUsuario().equals(nomeUsuario)) {
                        return usuario;
                    }
                }
                return null;
            }

                @Override
                public boolean autenticarUsuario(String nomeUsuario, String senha) {
                    for (Usuario usuario : usuarios) {
                        if (usuario.getNomeUsuario().equals(nomeUsuario) && usuario.getSenha().equals(senha)) {
                            return true;
                        }
                    }
                    return false;
                }

                @Override
    public void addUser(Usuario usuario) {
        // implementação do método
    }

    @Override
    public List<Usuario> getAllUsers() {
        // implementação do método
        return null;
    }

    @Override
    public Usuario getUserById(int id) {
        // implementação do método
        return null;
    }

    @Override
    public void deleteUser(int id) {
        // implementação do método
    }
}

