package Bertoti;

public class Lista {
    private String inputSabor;
    private String inputCobertura;
    private String inputAdicional;

    public Lista(String inputSabor, String inputCobertura, String inputAdicional) {
        this.inputSabor = inputSabor;
        this.inputCobertura = inputCobertura;
        this.inputAdicional = inputAdicional;
    }
    public String getInputAdicional() {
        return inputAdicional;
    }
    public String getInputCobertura() {
        return inputCobertura;
    }
    public String getInputSabor() {
        return inputSabor;
    }
}