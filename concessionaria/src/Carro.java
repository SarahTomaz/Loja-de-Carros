import java.io.Serializable;

public class Carro implements Serializable {
    private String renavan;
    private String modelo;
    private String marca;
    private int ano;
    private int anoFabricacao;
    private int quantidadeDisponivel;
    private double preco;

    public Carro(String renavan, String modelo, String marca, int ano) {
        this.renavan = renavan;
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
    }

    public String getRenavan() {
        return renavan;
    }

    public void setRenavan(String renavan) {
        this.renavan = renavan;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public int getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }

    public void setQuantidadeDisponivel(int quantidadeDisponivel) {
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "renavan='" + renavan + '\'' +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", ano=" + ano +
                ", anoFabricacao=" + anoFabricacao +
                ", quantidadeDisponivel=" + quantidadeDisponivel +
                ", preco=" + preco +
                '}';
    }

}
