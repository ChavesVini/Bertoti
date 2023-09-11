package Bertoti;
import java.util.*;

public class Sabor {
    private String proxima;

    public static void main(String[] args) {
        System.out.println("Temos esses sabores: " + "\n");

        List<String> Sabores = new ArrayList<String>();
        Sabores.add("Chocolate");
        Sabores.add("Uva");
        Sabores.add("Morango");

        for (int i = 0; i < Sabores.size(); i++) {
            System.out.println(Sabores.get(i));
        }
        
        Scanner inputSabor = new Scanner(System.in);
        System.out.print("\n" + "Qual sabor você escolhe? ");
        inputSabor.nextLine();
        


        }
    }