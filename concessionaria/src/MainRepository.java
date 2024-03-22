import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class MainRepository {

    public static void main(String[] args) {
        
        CarroRepository carroRepository = new CarroRepositoryImpl();

        try {
            CarroRepository skeleton = (CarroRepository) UnicastRemoteObject
        .exportObject(carroRepository, 0);

        LocateRegistry.createRegistry(1100);
        Registry registro = LocateRegistry.getRegistry(1100);

        registro.bind("Servicos1", skeleton);    
            
        } catch (Exception e) {
            e.printStackTrace();
        }

        

    }

}
