package oi;

public class Bicicleta extends Veiculo {
    private String material;
    private int quantidadeMarchas;
    private boolean amortecedor;

    
    public Bicicleta(String modelo, int anoFabricacao, String montadora, String cor, int kilometragem, String material, int quantidadeMarchas, boolean amortecedor) {
        super(modelo, anoFabricacao, montadora, cor, kilometragem);
        this.material = material;
        this.quantidadeMarchas = quantidadeMarchas;
        this.amortecedor = amortecedor;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getQuantidadeMarchas() {
        return quantidadeMarchas;
    }

    public void setQuantidadeMarchas(int quantidadeMarchas) {
        this.quantidadeMarchas = quantidadeMarchas;
    }

    public boolean isAmortecedor() {
        return amortecedor;
    }

    public void setAmortecedor(boolean amortecedor) {
        this.amortecedor = amortecedor;
    }

    @Override
    public String gerarInsert() {
        return "INSERT INTO bicicletas (modelo, ano_fabricacao, montadora, cor, kilometragem, material, quantidade_marchas, amortecedor) " +
               "VALUES ('" + getModelo() + "', " + getAnoFabricacao() + ", '" + getMontadora() + "', '" + getCor() + "', " + getKilometragem() + ", '" + material + "', " + quantidadeMarchas + ", " + (amortecedor ? "TRUE" : "FALSE") + ");";
    }
}
