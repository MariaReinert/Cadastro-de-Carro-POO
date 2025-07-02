public class Moto extends Veiculo {
    private final boolean temPartidaEletrica;

    public Moto(String marca, String modelo, int ano, boolean temPartidaEletrica) {
        super(marca, modelo, ano);
        this.temPartidaEletrica = temPartidaEletrica;
        historico.add("Criado moto com partida elétrica " + (temPartidaEletrica ? "Sim" : "Não"));
    }

    //Polimorfismo
    @Override
    public void exibirTipo() {
        System.out.println("Tipo de veículo: Moto");
    }

    public void mostrarDetalhes() {
        super.mostrarDados();
        System.out.println("Partida elétrica: " + (temPartidaEletrica ? "Sim" : "Não"));
    }

    public void dirigir (int km) {
        historico.add("Moto pilotada por " + km + "km.");
        System.out.println("Você pilotou " + km + "km");
    }

    public void abastecer (double litros) {
        historico.add("Abastecida com " + litros + "Litros.");
        System.out.println("Abastecido com " + litros + "L");
    }
}
