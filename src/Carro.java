public class Carro extends Veiculo {
    private int portas;

    public Carro(String marca, String modelo, int ano, int portas) {
        super(marca, modelo, ano);
        this.portas = portas;
        historico.add("Criado carro com " + portas + " portas.");
    }

    //Polimorfismo: sobrescrever metodo abstrato.
    @Override
    public void exibirTipo() {
        System.out.println("Tipo de veículo: Carro");
    }

    public void mostrarDetalhes() {
        super.mostrarDados();
        System.out.println("Número de portas: " + portas);
    }
    //Registro da ação
    public void dirigir (int km) {
        historico.add("Dirigido por " + km + "km.");
        System.out.println("Você dirigiu " + km + " km.");
    }

    public void abastecer (double litros) {
        historico.add("Abastecido com " + litros + " Litros.");
        System.out.println("Abastecido com " + litros + "L. ");
    }
}
