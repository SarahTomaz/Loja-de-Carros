import java.rmi.RemoteException;
import java.util.List;
public class CarroServiceImpl implements CarroService{

    private CarroRepository carroRepository;
    private UsuarioRepository usuarioRepository;

    public CarroServiceImpl(CarroRepository carroRepository, UsuarioRepository usuarioRepository) {
        this.carroRepository = carroRepository;
        this.usuarioRepository = usuarioRepository;
    }
    // Implementação dos métodos da interface UsuarioRepository
    @Override  
    public boolean autenticarUsuario(String nomeUsuario, String senha) throws RemoteException {
        return usuarioRepository.autenticarUsuario(nomeUsuario, senha);
    }
    @Override
    public void adicionarUsuario(Usuario usuario) throws RemoteException {
        usuarioRepository.adicionarUsuario(usuario);
    }
    @Override
    public void removerUsuario(String nomeUsuario) throws RemoteException {
        usuarioRepository.removerUsuario(nomeUsuario);
    }
    @Override
    public void atualizarUsuario(Usuario usuario) throws RemoteException {
        usuarioRepository.atualizarUsuario(usuario);
    }
    @Override
    public Usuario buscarUsuario(String nomeUsuario) throws RemoteException {
        return usuarioRepository.buscarUsuario(nomeUsuario);
    }
    @Override
    public void addUser(Usuario usuario) throws RemoteException {
        usuarioRepository.addUser(usuario);
    }
    @Override
    public List<Usuario> getAllUsers() throws RemoteException {
        return usuarioRepository.getAllUsers();
    }
    @Override
    public Usuario getUserById(int id) throws RemoteException {
        return usuarioRepository.getUserById(id);
    }
    @Override
    public void deleteUser(int id) throws RemoteException {
        usuarioRepository.deleteUser(id);
    }


    // Implementação dos métodos da interface CarroRepository
    @Override
    public void adicionarCarro(Carro carro) throws RemoteException{
        carroRepository.adicionarCarro(carro);
    }

    @Override
    public void removerCarro(String renavan) throws RemoteException {
        carroRepository.removerCarro(renavan);
    }

    @Override
    public void atualizarCarro(Carro carro) throws RemoteException{
        carroRepository.atualizarCarro(carro);
    }

    @Override
    public Carro buscarCarro(String renavan) throws RemoteException {
        return carroRepository.buscarCarro(renavan);
    }

    @Override
    public List<Carro> listarCarros() throws RemoteException{
        return carroRepository.listarCarros();
    }


    @Override
    public int exibirQuantidadeDisponivel(String renavan) throws RemoteException {
        // Implemente a lógica para exibir a quantidade disponível de um carro específico 
        Carro carro = carroRepository.buscarCarro(renavan);
        if (carro != null) {
            return carro.getQuantidadeDisponivel();
        }   else {
            return -1;
        }
    }

    @Override
    public void comprarCarro(String renavan)throws RemoteException {
        // lógica para comprar um carro 
        Carro carro = carroRepository.buscarCarro(renavan);
        if (carro != null) {
            carro.setQuantidadeDisponivel(carro.getQuantidadeDisponivel() - 1);
            carroRepository.atualizarCarro(carro);
        } else {
        
        }
    }

    @Override
    public Carro pesquisarCarro(String renavan) throws RemoteException{
        // lógica para pesquisar um carro por renavan 
        Carro carro = carroRepository.buscarCarro(renavan);
        if (carro != null) {
            return carro;
        } else {
            return null;
        }
    }

    @Override
    public void addCarro(Carro carro) {
        // implemente o método
        

    }

    @Override
    public List<Carro> getAllCarros() {
        // implementação do método
        return null;
    }

    @Override
    public Carro getCarroById(int id) {
        // implementação do método
        return null;
    }

    @Override
    public void deleteCarro(int id) {
        // implementação do método
    }

    
}