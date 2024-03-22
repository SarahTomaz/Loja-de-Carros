import java.util.List;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CarroRepository extends Remote{
    void adicionarCarro(Carro carro) throws RemoteException;
    void removerCarro(String renavan) throws RemoteException;
    void atualizarCarro(Carro carro) throws RemoteException;
    Carro buscarCarro(String renavan) throws RemoteException;
    List<Carro> listarCarros() throws RemoteException;

    
    

}
