import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // instancia de carroService
        CarroService carroService = null;

        try {
            Registry registro = LocateRegistry.getRegistry(1099);

            carroService = (CarroService) registro.lookup("Servicos");

            //

            Carro carro = new Carro("Renavam", "T-Cross", "Wolksvagen", 2024);
            Carro carro2 = new Carro("Renavam2", "Kwid", "Renout", 2023);
            Carro carro3 = new Carro("Renavam3", "Gol", "Wolksvagen", 2022);
            Carro carro4 = new Carro("Renavam4", "Virtus", "Wolksvagen", 2023);
            Carro carro5 = new Carro("Renavam5", "Traker", "Wolksvagen", 2024);
            Carro carro6 = new Carro("Renavam6", "Amarock", "Wolksvagen", 2024);
            Carro carro7 = new Carro("Renavam7", "Voyage", "Wolksvagen", 2020);
            Carro carro8 = new Carro("Renavam8", "Jeep Renegade", "Jeep", 2019);
            Carro carro9 = new Carro("Renavam9", "Saveiro", "Wolksvagen", 2020);
            Carro carro10 = new Carro("Renavam10", "Nivus", "Wolksvagen", 2024);
            Carro carro11 = new Carro("Renavam11", "Jeta GLI", "Wolksvagen", 2024);
            Carro carro12 = new Carro("Renavam12", "Landau", "Ford", 2033);

            //
            Usuario usuario = new Usuario("Antonio", "123", 1);
            Usuario usuario2 = new Usuario("Antonio2", "1234", 2);

            // carros
            carroService.adicionarCarro(carro);
            carroService.adicionarCarro(carro2);
            carroService.adicionarCarro(carro3);
            carroService.adicionarCarro(carro4);
            carroService.adicionarCarro(carro5);
            carroService.adicionarCarro(carro6);
            carroService.adicionarCarro(carro7);
            carroService.adicionarCarro(carro8);
            carroService.adicionarCarro(carro9);
            carroService.adicionarCarro(carro10);
            carroService.adicionarCarro(carro11);
            carroService.adicionarCarro(carro12);
            carroService.removerCarro("Renavam");
            carroService.getAllCarros();
            carroService.exibirQuantidadeDisponivel("Renavan");

            // usuario
            carroService.adicionarUsuario(usuario);
            carroService.adicionarUsuario(usuario2);
            carroService.autenticarUsuario("Nome", "Senha");
            carroService.removerUsuario("Nome");
            carroService.atualizarUsuario(usuario);
            carroService.buscarUsuario("Nome");
            carroService.addUser(usuario);
            carroService.getAllUsers();
            carroService.getUserById(1);
            carroService.deleteUser(1);
            Scanner scanner = new Scanner(System.in);

            System.err.println("Bem vindo a loginha de carros");

            System.err.println("Digite o nome do usuario");
            String nome = scanner.next();

            System.err.println("Digite a senha do usuario");
            String senha = scanner.next();

            carroService.autenticarUsuario(nome, senha);
            usuario = carroService.autenticarUsuario(nome, senha);

            if (usuario.getadmin()) {
                while (true) {

                    System.err.println("Bem vindo administrador");
                    System.err.println("----------------------------");
                    System.err.println("O que deseja fazer?");
                    System.err.println("(1) Adicionar carro");
                    System.err.println("(2) Remover carro");
                    System.err.println("(3) Atualizar carro");
                    System.err.println("(4) Buscar carro");
                    System.err.println("(5) Listar carros");
                    System.err.println("(6) Adicionar usuario");
                    System.err.println("(7) Remover usuario");
                    System.err.println("(8) Atualizar usuario");
                    System.err.println("(9) Buscar usuario");
                    System.err.println("(10) Listar usuarios");
                    System.err.println("(11) Sair");

                    int opcao2 = scanner.nextInt();

                    if (opcao2 == 1) {
                        System.err.println("Digite o renavam do carro");
                        String renavam = scanner.next();
                        System.err.println("Digite o modelo do carro");
                        String modelo = scanner.next();
                        System.err.println("Digite a marca do carro");
                        String marca = scanner.next();
                        System.err.println("Digite o ano do carro");
                        int ano = scanner.nextInt();
                        Carro carronovo = new Carro(renavam, modelo, marca, ano);
                        carroService.adicionarCarro(carronovo);
                    } else if (opcao2 == 2) {
                        System.err.println("Digite o renavam do carro");
                        String renavam = scanner.next();
                        carroService.removerCarro(renavam);
                    } else if (opcao2 == 3) {
                        System.err.println("Digite o renavam do carro");
                        String renavam = scanner.next();
                        System.err.println("Digite o modelo do carro");
                        String modelo = scanner.next();
                        System.err.println("Digite a marca do carro");
                        String marca = scanner.next();
                        System.err.println("Digite o ano do carro");
                        int ano = scanner.nextInt();
                        Carro carroatualizado = new Carro(renavam, modelo, marca, ano);
                        carroService.atualizarCarro(carroatualizado);
                    } else if (opcao2 == 4) {
                        System.err.println("Digite o renavam do carro");
                        String renavam = scanner.next();
                        System.err.println(carroService.buscarCarro(renavam));

                    } else if (opcao2 == 5) {
                        for (Carro c : carroService.listarCarros()) {
                            System.out.println(c);
                        }
                    } else if (opcao2 == 6) {
                        System.err.println("Digite o nome do usuario");
                        String nomenome = scanner.next();
                        System.err.println("Digite a senha do usuario");
                        String senhasenha = scanner.next();
                        System.err.println("Digite o id do usuario");
                        int id = scanner.nextInt();
                        Usuario usuarioNovo = new Usuario(nome, senha, id);
                        carroService.adicionarUsuario(usuarioNovo);
                    } else if (opcao2 == 7) {
                        System.err.println("Digite o nome do usuario");
                        String nomeremovido = scanner.next();
                        carroService.removerUsuario(nome);
                    } else if (opcao2 == 8) {
                        System.err.println("Digite o nome do usuario");
                        String nomenome2 = scanner.next();
                        System.err.println("Digite a senha do usuario");
                        String senhasenha2 = scanner.next();
                        System.err.println("Digite o id do usuario");
                        int id = scanner.nextInt();
                        Usuario usuarioAtualizado = new Usuario(nome, senha, id);
                        carroService.atualizarUsuario(usuarioAtualizado);
                    } else if (opcao2 == 9) {
                        System.err.println("Digite o nome do usuario");
                        String nomebuscado = scanner.next();
                        carroService.buscarUsuario(nome);
                    } else if (opcao2 == 10) {
                        carroService.getAllUsers();
                    } else if (opcao2 == 11) {
                        System.err.println("Até mais :) ");
                        break;
                    }

                }
            }

            else if (!usuario.getadmin()) {
                while (true) {

                    System.err.println("Bem vindo usuario");
                    System.err.println("---------------------------");
                    System.err.println("O que deseja fazer?");
                    System.err.println("(1) Listar carros");
                    System.err.println("(2) Buscar carro");
                    System.err.println("(3) Comprar carro");
                    System.err.println("(4) Quantidade de carros");
                    System.err.println("(5) Sair");

                    int opcao3 = scanner.nextInt();

                    if (opcao3 == 1) {
                        for (Carro c : carroService.listarCarros()) {
                            System.out.println(c);
                        }
                    } else if (opcao3 == 2) {
                        System.err.println("Digite o renavam do carro");
                        String renavam = scanner.next();
                        carroService.buscarCarro(renavam);
                    } else if (opcao3 == 3) {
                        System.err.println("Digite o renavam do carro");
                        String renavam = scanner.next();
                        System.err.println("Compra realizada com sucesso, Aproveite o seu carrinho :)");

                    } else if (opcao3 == 4) {
                        String renavam = scanner.next();
                        System.err.println(carroService.exibirQuantidadeDisponivel(renavam));

                    } else if (opcao3 == 5) {
                        System.err.println("Até mais :) ");
                        break;
                    }
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
