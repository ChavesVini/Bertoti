package Bertoti;

public class Sorvete {
    private String cobertura;
    private String sabor;
    private String adicional;

    public Sorvete(String sabor, String cobertura, String adicional) {
        this.sabor = sabor;
        this.cobertura = cobertura;
        this.adicional = adicional;
    }

    public String getAdicional() {
        return adicional;
    }

    public String getCobertura() {
        return cobertura;
    }

    public String getSabor() {
        return sabor;
    }
}