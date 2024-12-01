package oi;

public class Caminhao extends Veiculo {
    private int quantidadeEixos;
    private int peso_bruto	;

    public Caminhao(String modelo, int anoFabricacao, String montadora, String cor, int kilometragem, int quantidadeEixos, double pesoBruto2) {
        super(modelo, anoFabricacao, montadora, cor, kilometragem);
        this.quantidadeEixos = quantidadeEixos;
        this.peso_bruto	 = peso_bruto;
    }

    // Getters e Setters
    public int getQuantidadeEixos() { return quantidadeEixos; }
    public void setQuantidadeEixos(int quantidadeEixos) { this.quantidadeEixos = quantidadeEixos; }
    public int getPesoBruto() { return peso_bruto	; }
    public void setPesoBruto(int pesoBruto) { this.peso_bruto	 = peso_bruto	; }

    @Override
    public String gerarInsert() {
        return "INSERT INTO caminhoes (modelo, ano_fabricacao, montadora, cor, kilometragem, quantidade_eixos, peso_bruto) " +
               "VALUES ('" + getModelo() + "', " + getAnoFabricacao() + ", '" + getMontadora() + "', '" + getCor() + "', " + getKilometragem() + ", " + quantidadeEixos + ", " + peso_bruto	 + ");";
    }
}
