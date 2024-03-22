import java.rmi.RemoteException;
import java.util.List;

public class CarroController {
    private CarroService carroService;
    private CarroRepository carroRepository;

    public CarroController(CarroService carroService) {
        this.carroService = carroService;
    }

    public CarroController(CarroRepository carroRepository) {
        this.carroRepository = carroRepository;
    }

    public void adicionarCarro(Carro carro) throws RemoteException {
        carroRepository.adicionarCarro(carro);
    }

    public void removerCarro(String renavan) throws RemoteException {
        carroRepository.removerCarro(renavan);
    }

    public void atualizarCarro(Carro carro) throws RemoteException {
        carroRepository.atualizarCarro(carro);
    }

    public Carro buscarCarro(String renavan) throws RemoteException {
        return carroRepository.buscarCarro(renavan);
    }

    public List<Carro> listarCarros() throws RemoteException {
        return carroService.listarCarros();
    }

    public int exibirQuantidadeDisponivel(String modelo) throws RemoteException {
        return carroService.exibirQuantidadeDisponivel(modelo);
    }

    public void comprarCarro(String renavan) throws RemoteException {
        carroService.comprarCarro(renavan);
    }

    public Carro pesquisarCarro(String modelo) throws RemoteException {
        return carroService.pesquisarCarro(modelo);
    }
}