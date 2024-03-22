import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class MainUsuario {

    public static void main(String[] args) {
        
        UsuarioRepository usuarioRepository = new UsuarioRepositoryImpl();

        try {
            UsuarioRepository skeleton = (UsuarioRepository) UnicastRemoteObject
        .exportObject(usuarioRepository, 0);

        LocateRegistry.createRegistry(1101);
        Registry registro = LocateRegistry.getRegistry(1101);

        registro.bind("Servicos2", skeleton);    
            
        } catch (Exception e) {
            e.printStackTrace();
        }

        

    }

}
