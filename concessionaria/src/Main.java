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
            
            Carro carro = new Carro("Renavam", "Modelo", "Marca", 2022);
            Carro carro2 = new Carro("Renavam2", "Modelo2", "Marca2", 2023);
            Carro carro3 = new Carro("Renavam3", "Modelo3", "Marca3", 2024);
            Carro carro4 = new Carro("Renavam4", "Modelo4", "Marca4", 2025);
            Carro carro5 = new Carro("Renavam5", "Modelo5", "Marca5", 2026);
            Carro carro6 = new Carro("Renavam6", "Modelo6", "Marca6", 2027);
            Carro carro7 = new Carro("Renavam7", "Modelo7", "Marca7", 2028);
            Carro carro8 = new Carro("Renavam8", "Modelo8", "Marca8", 2029);
            Carro carro9 = new Carro(null, null, null, 0);
            Carro carro10 = new Carro(null, null, null, 0);
            Carro carro11 = new Carro(null, null, null, 0);
            Carro carro12 = new Carro(null, null, null, 0);

            //
            Usuario usuario = new Usuario("Antonio", "123", 1);
            Usuario usuario2 = new Usuario("Antonio2", "1234", 2);


            //carros
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


            System.err.println("Bem vindo a loginha de carros");
            System.err.println("-------------------------------------");
            System.err.println("Você é um usuario administrador? (1) sim (2) não");

            Scanner scanner = new Scanner(System.in);
            int opcao = scanner.nextInt();

            if (opcao == 1) {
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
                        carroService.buscarCarro(renavam);
                    } else if (opcao2 == 5) {
                        carroService.getAllCarros();
                    } else if (opcao2 == 6) {
                        System.err.println("Digite o nome do usuario");
                        String nome = scanner.next();
                        System.err.println("Digite a senha do usuario");
                        String senha = scanner.next();
                        System.err.println("Digite o id do usuario");
                        int id = scanner.nextInt();
                        Usuario usuarioNovo = new Usuario(nome, senha, id);
                        carroService.adicionarUsuario(usuarioNovo);
                    } else if (opcao2 == 7) {
                        System.err.println("Digite o nome do usuario");
                        String nome = scanner.next();
                        carroService.removerUsuario(nome);
                    } else if (opcao2 == 8) {
                        System.err.println("Digite o nome do usuario");
                        String nome = scanner.next();
                        System.err.println("Digite a senha do usuario");
                        String senha = scanner.next();
                        System.err.println("Digite o id do usuario");
                        int id = scanner.nextInt();
                        Usuario usuarioAtualizado = new Usuario(nome, senha, id);
                        carroService.atualizarUsuario(usuarioAtualizado);
                    } else if (opcao2 == 9) {
                        System.err.println("Digite o nome do usuario");
                        String nome = scanner.next();
                        carroService.buscarUsuario(nome);
                    } else if (opcao2 == 10) {
                        carroService.getAllUsers();
                    } else if (opcao2 == 11) {
                        System.err.println("Até mais :) ");
                        break;
                    }

                }
            }



            else if (opcao == 2) {
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
                    for (Carro c : carroService.getAllCarros()) {
                        System.out.println(c);
                    }
                } else if (opcao3 == 2) {
                    System.err.println("Digite o renavam do carro");
                    String renavam = scanner.next();
                    carroService.buscarCarro(renavam);
                } else if (opcao3 == 3) {
                    System.err.println("Digite o renavam do carro");
                    String renavam = scanner.next();
                    carroService.comprarCarro(renavam);
                } else if (opcao3 == 4) {
                    String renavam = scanner.next();
                    carroService.exibirQuantidadeDisponivel(renavam);
                }
                else if (opcao3 == 5) {
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
