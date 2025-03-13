public class Carro {
    private String marca,modelo,cor;

    public void setCaracteristica(String marca)
    {
        this.marca=marca;
    }

    public void setCaracteristica(String marca,String modelo)
    {
        this.marca=marca;
        this.modelo=modelo;
    }

    public void setCaracteristica(String marca,String modelo,String cor)
    {
        this.marca=marca;
        this.modelo=modelo;
        this.cor=cor;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cor='" + cor + '\'' +
                '}';
    }
}
