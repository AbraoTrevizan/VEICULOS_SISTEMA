package oi;

public class Veiculo {
    private String modelo;
    private int anoFabricacao;
    private String montadora;
    private String cor;
    private int kilometragem;

    public Veiculo(String modelo, int anoFabricacao, String montadora, String cor, int kilometragem) {
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.montadora = montadora;
        this.cor = cor;
        this.kilometragem = kilometragem;
    }


    
    public String getModelo() { return modelo; }
    public int getAnoFabricacao() { return anoFabricacao; }
    public String getMontadora() { return montadora; }
    public String getCor() { return cor; }
    public int getKilometragem() { return kilometragem; }

    public String gerarInsert() {
        return "INSERT INTO veiculos (modelo, ano_fabricacao, montadora, cor, kilometragem) " +
               "VALUES ('" + modelo + "', " + anoFabricacao + ", '" + montadora + "', '" + cor + "', " + kilometragem + ");";
    }
}
