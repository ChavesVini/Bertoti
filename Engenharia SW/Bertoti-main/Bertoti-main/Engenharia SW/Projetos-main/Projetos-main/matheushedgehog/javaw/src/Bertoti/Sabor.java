import java.util.Scanner;

public class Sabor {
    private double valorcobrado;
    private String sabor;
    private String proximo;
    private boolean count = true;

    public Sabor(String sabor) {
        this.sabor = sabor;  
    }
    
    while(count) {
        public static void main(String[] args) {
            String[] Sabores = {"Uva", "Morango", "Chocolate"};
            System.out.println("Temos esses sabores: \n");
            for (String sabor : Sabores) {
                System.out.println(sabor);
            }
            Scanner input = new Scanner(System.in);
            System.out.println("Qual você escolhe? ");
            String proximo = input.nextLine();

            if (proximo.equals(Sabores)) {
                System.out.print("Você escolheu: " + input);
                count = false;
            else {
                System.err.print("Esse sabor não existe poha");   
        } 
        }
    }
}
}