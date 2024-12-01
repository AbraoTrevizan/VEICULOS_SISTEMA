package oi;

public class Skate extends Veiculo {
    private String tipoRodas;


    public Skate(String modelo, int anoFabricacao, String montadora, String cor, int kilometragem, String tipoRodas) {
        super(modelo, anoFabricacao, montadora, cor, kilometragem);
        this.tipoRodas = tipoRodas;
    }

    public String getTipoRodas() {
        return tipoRodas;
    }

    public void setTipoRodas(String tipoRodas) {
        this.tipoRodas = tipoRodas;
    }

    @Override
    public String gerarInsert() {
        return "INSERT INTO skates (modelo, ano_fabricacao, montadora, cor, kilometragem, tipo_rodas) " +
               "VALUES ('" + getModelo() + "', " + getAnoFabricacao() + ", '" + getMontadora() + "', '" + getCor() + "', " + getKilometragem() + ", '" + tipoRodas + "');";
    }
}