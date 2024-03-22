import java.util.List;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CarroService extends Remote, CarroRepository, UsuarioRepository{
    //métodos para listar, pesquisar, exibir a quantidade e comprar carros
    List<Carro> listarCarros() throws RemoteException;
    Carro pesquisarCarro(String renavan) throws RemoteException;
    int exibirQuantidadeDisponivel(String modelo) throws RemoteException;
    void comprarCarro(String renavan) throws RemoteException;
    
   
    void addCarro(Carro carro) throws RemoteException;
    List<Carro> getAllCarros() throws RemoteException;
    Carro getCarroById(int id) throws RemoteException;
    void deleteCarro(int id) throws RemoteException;

    // 
}
