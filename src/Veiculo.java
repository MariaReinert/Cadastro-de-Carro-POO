import java.util.ArrayList;

public abstract class Veiculo {
//    public abstract void exibirTipo();

    // Encapsulamento atributos privado
    private String marca;
    private String modelo;
    private int ano;
    protected ArrayList<String> historico;

    //Construtor
    public Veiculo (String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.historico = new ArrayList<>();
        historico.add("Veículo cadastrado: " + marca + " " + modelo + " (" + ano + ")");
    }
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public void mostrarDados() {
        System.out.println("\n--- Dados do Veículo ---");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }
    // Exibir Histórico
    public void mostrarhistorico() {
        System.out.println("\n Históricos de Movimentações");
        for (String entrada : historico) {
            System.out.println("- " + entrada);
        }
    }

    public abstract void exibirTipo();
}
