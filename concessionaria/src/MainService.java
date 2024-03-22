import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class MainService {

    public static void main(String[] args) {

        UsuarioRepository UsuarioRepositoryImpl = null;

        try {
            Registry registro = LocateRegistry.getRegistry(1101);
 
            UsuarioRepositoryImpl = (UsuarioRepository) registro.lookup("Servicos2");

        } catch (Exception e) {
            e.printStackTrace();
        }

        CarroRepository carroRepository = null;

        try {
            Registry registro = LocateRegistry.getRegistry(1100);
 
            carroRepository = (CarroRepository) registro.lookup("Servicos1");

        } catch (Exception e) {
            e.printStackTrace();
        } 

        
        CarroService carroService = new CarroServiceImpl(carroRepository, UsuarioRepositoryImpl);


        
        try {
            CarroService skeleton = (CarroService) UnicastRemoteObject
        .exportObject(carroService, 0);

        LocateRegistry.createRegistry(1099);
        Registry registro = LocateRegistry.getRegistry();

        registro.bind("Servicos", skeleton);    
            
        } catch (Exception e) {
            e.printStackTrace();
        }



        

        

    }

}
