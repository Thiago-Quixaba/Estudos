package questao6;

import java.util.Scanner;

public class Main {
    public static String questao6(String texto){
        String[] diretorios = texto.split("\\\\");
        return diretorios[diretorios.length -1];
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Informe o caminho do diretório raiz até um arquivo específico: ");
        System.out.println("Nome do aquivo: " + questao6(input.nextLine()));
        
        input.close();
    }
}
