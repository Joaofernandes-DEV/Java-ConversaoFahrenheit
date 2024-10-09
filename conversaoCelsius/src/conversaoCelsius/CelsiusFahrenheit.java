package conversaoCelsius;

import java.util.Scanner;

public class CelsiusFahrenheit {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite a temperatura em Celsius: ");
        
        
        if (scanner.hasNextDouble()) {
            double celsius = scanner.nextDouble();  
            double fahrenheit = converterParaFahrenheit(celsius);  
            
            System.out.printf("%.2f graus Celsius é igual a %.2f graus Fahrenheit.%n", celsius, fahrenheit);
        } else {
            System.out.println("Entrada inválida. Por favor, insira um número.");
        }

        scanner.close();
    }

    public static double converterParaFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}
