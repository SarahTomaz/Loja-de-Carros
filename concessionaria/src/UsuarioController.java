import java.rmi.RemoteException;

public class UsuarioController {

    private UsuarioRepository usuarioRepository;

    public UsuarioController(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public void adicionarUsuario(Usuario usuario) throws RemoteException {
        usuarioRepository.adicionarUsuario(usuario);
    }

    public void removerUsuario(String cpf) throws RemoteException {
        usuarioRepository.removerUsuario(cpf);
    }

    public void atualizarUsuario(Usuario usuario) throws RemoteException {
        usuarioRepository.atualizarUsuario(usuario);
    }

    public Usuario buscarUsuario(String cpf) throws RemoteException {
        return usuarioRepository.buscarUsuario(cpf);
    }

    public Usuario autenticarUsuario(String nomeUsuario, String senha) throws RemoteException {
        return usuarioRepository.autenticarUsuario(nomeUsuario, senha);
    }

}
