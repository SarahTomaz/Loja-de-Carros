import java.util.ArrayList;
import java.util.List;

public class CarroRepositoryImpl implements CarroRepository {

    private List<Carro> carros = new ArrayList<>();

    @Override
    public void adicionarCarro(Carro carro) {
        carros.add(carro);
    }

    @Override 
    public void removerCarro(String renavan) {
        carros.removeIf(carro -> carro.getRenavan().equals(renavan));
    }

    @Override
    public void atualizarCarro(Carro carro) {
        for (int i = 0; i < carros.size(); i++) {
            if (carros.get(i).getRenavan().equals(carro.getRenavan())) {
                carros.set(i, carro);
                break;
            }
        }
    }

    @Override
    public Carro buscarCarro(String renavan) {
        for (Carro carro : carros) {
            if (carro.getRenavan().equals(renavan)) {
                return carro;
            }
        }
        return null;
    }

    @Override
    public List<Carro> listarCarros() {
        return new ArrayList<>(carros);
    }

}
