import java.util.List;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface UsuarioRepository extends Remote{
    void adicionarUsuario(Usuario usuario)throws RemoteException;
    void removerUsuario(String nomeUsuario) throws RemoteException;
    void atualizarUsuario(Usuario usuario) throws RemoteException;
    Usuario buscarUsuario(String nomeUsuario) throws RemoteException;
    boolean autenticarUsuario(String nomeUsuario, String senha) throws RemoteException;

    void addUser(Usuario usuario) throws RemoteException;
    List<Usuario> getAllUsers() throws RemoteException;
    Usuario getUserById(int id) throws RemoteException;
    void deleteUser(int id) throws RemoteException;

}
