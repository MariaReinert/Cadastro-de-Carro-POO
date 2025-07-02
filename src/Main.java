import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Veiculo veiculo = null;

        System.out.println("=== Cadastro de Veículo ===");
        System.out.println("Digite o tipo (1 - Carro | 2 - Moto ");

        int tipo = sc.nextInt();
        sc.nextLine();

        System.out.println("Marca: ");
        String marca = sc.nextLine();

        System.out.println("Modelo: ");
        String modelo = sc.nextLine();

        System.out.println("Ano: ");
        int ano = sc.nextInt();

        if (tipo == 1) {
            System.out.println("Número de portas: ");
            int portas = sc.nextInt();
            veiculo = new Carro(marca, modelo, ano, portas);
        } else if (tipo == 2) {
            System.out.println("Possui partida elétrica? (true/false):");
            boolean partida = sc.nextBoolean();
            veiculo = new Moto(marca, modelo, ano, partida);
        } else {
            System.out.println("Tipo inválido!");
            System.exit(0);
        }

        int opcao;
        do {
            System.out.println("\n ==== MENU ====");
            System.out.println("1 - Mostrar Dados");
            System.out.println("2 - Dirigir");
            System.out.println("3 - Abastecer");
            System.out.println("4 - Mostrar Histórico");
            System.out.println("5 - Sair");
            System.out.println("Escolha!");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    veiculo.exibirTipo();
                    if (veiculo instanceof Carro) {
                        ((Carro) veiculo).mostrarDetalhes();
                    } else if (veiculo instanceof Moto) {
                        ((Moto) veiculo).mostrarDetalhes();
                    }
                    break;
                case 2:
                    System.out.println("Distância (Km): ");
                    int km = sc.nextInt();
                    if (veiculo instanceof Carro) {
                        ((Carro) veiculo).dirigir(km);
                    } else if (veiculo instanceof Moto) {
                        ((Moto) veiculo).dirigir(km);
                    }
                    break;
                case 3:
                    System.out.println("Litros a abastecer: ");
                    double litros = sc.nextDouble();
                    if (veiculo instanceof Carro) {
                        ((Carro) veiculo).abastecer(litros);
                    } else if (veiculo instanceof Moto) {
                        ((Moto) veiculo).abastecer(litros);
                    }
                    break;
                case 4:
                    veiculo.mostrarhistorico();
                    break;
                case 5:
                    System.out.println("Fim!!");
                    break;
                default:
                    System.out.println("** Opção inválida **");
            }
        } while (opcao != 5);

        sc.close();
    }
}



//            // Polimorfismo: 'Veiculo', mas cada um tem comportamento própio.

//            veiculo.exibirTipo();
//
//            //Chamar metodo especifico

//            if (veiculo instanceof Carro) {
//                Carro c = (Carro) veiculo;
//                c.mostrarDetalhes();
////                ((carro) veiculo) mostrarDetalhes();
//            } else if (veiculo instanceof Moto) {
//                Moto m = (Moto) veiculo;
//                m.mostrarDetalhes();
////                ((moto) veiculo).mostrarDetalhes();
//            }
//            sc.close();
//        }
//
//    }
