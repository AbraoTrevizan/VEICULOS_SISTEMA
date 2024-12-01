package oi;

public class Motocicleta extends Veiculo {
    private int cilindrada;
    private int torque;

    public Motocicleta(String modelo, int anoFabricacao, String montadora, String cor, int kilometragem, int cilindrada, int torque) {
        super(modelo, anoFabricacao, montadora, cor, kilometragem);
        this.cilindrada = cilindrada;
        this.torque = torque;
    }

    public int getCilindrada() { return cilindrada; }
    public void setCilindrada(int cilindrada) { this.cilindrada = cilindrada; }
    public int getTorque() { return torque; }
    public void setTorque(int torque) { this.torque = torque; }

    @Override
    public String gerarInsert() {
        return "INSERT INTO motocicletas (modelo, ano_fabricacao, montadora, cor, kilometragem, cilindrada, torque) " +
               "VALUES ('" + getModelo() + "', " + getAnoFabricacao() + ", '" + getMontadora() + "', '" + getCor() + "', " + getKilometragem() + ", " + cilindrada + ", " + torque + ");";
    }
}
