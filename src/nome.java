package nome;

import java.util.Scanner;

public class nome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu primeiro nome:");
        String primeironome = scanner.nextLine() ;
        System.out.print("Digite seu segundo nome:");
        String segundoonome = scanner.nextLine() ;
        System.out.println("Seu nome E: " + primeironome +" "+ segundoonome);
        scanner.close();
    }
}