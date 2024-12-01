package oi;

public class Automovel extends Veiculo {
    private int quantidadePassageiros;
    private String tipoFreio;
    private boolean airbag;

    public Automovel(String modelo, int anoFabricacao, String montadora, String cor, int kilometragem, int quantidadePassageiros, String tipoFreio, boolean airbag) {
        super(modelo, anoFabricacao, montadora, cor, kilometragem);
        this.quantidadePassageiros = quantidadePassageiros;
        this.tipoFreio = tipoFreio;
        this.airbag = airbag;
    }

    public int getQuantidadePassageiros() { return quantidadePassageiros; }
    public void setQuantidadePassageiros(int quantidadePassageiros) { this.quantidadePassageiros = quantidadePassageiros; }
    public String getTipoFreio() { return tipoFreio; }
    public void setTipoFreio(String tipoFreio) { this.tipoFreio = tipoFreio; }
    public boolean isAirbag() { return airbag; }
    public void setAirbag(boolean airbag) { this.airbag = airbag; }

    @Override
    public String gerarInsert() {
        return "INSERT INTO automoveis (modelo, ano_fabricacao, montadora, cor, kilometragem, quantidade_passageiros, tipo_freio, airbag) " +
               "VALUES ('" + getModelo() + "', " + getAnoFabricacao() + ", '" + getMontadora() + "', '" + getCor() + "', " + getKilometragem() + ", " + quantidadePassageiros + ", '" + tipoFreio + "', " + (airbag ? "TRUE" : "FALSE") + ");";
    }
}
