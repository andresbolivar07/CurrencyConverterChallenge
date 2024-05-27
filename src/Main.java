import ApiConnection.ApiConverterProcess;
import ApiConnection.Currency;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ApiConverterProcess apiConverterProcess = new ApiConverterProcess();

        while (true) {

            System.out.println("Monedas disponibles para convertir\n" +

                    "1) Dólares (USD) a pesos colombianos (COP)\n" +
                    "2) Pesos colombianos (COP) a dólares (USD)\n" +
                    "3) Euros (EUR) a pesos colombianos (COP)\n" +
                    "4) Pesos colombianos (COP) a euros (EUR)\n" +
                    "5) Dólares (USD) a euros (EUR)\n" +
                    "6) Euros (EUR) a dólares (USD)\n" +
                    "7) Salir");


            Scanner teclado = new Scanner(System.in);
            System.out.println("Digite (en números) la opción que desea usar: ");
            int option = teclado.nextInt();
            if (option == 7) {
                System.out.println("La aplicación ha finalizado");
                break;
            }
            double currencyAmount;

            switch (option) {
                case 1:
                    teclado.nextLine();
                    System.out.println("Ingrese la cantidad a convertir: ");
                    currencyAmount = Double.parseDouble(teclado.nextLine());
                    Currency currency1 = apiConverterProcess.locateCurrency("USD/COP/", currencyAmount);
                    System.out.println("La cantidad de " + currencyAmount + " dólares es equivalente a: " + currency1.conversion_result() + " pesos colombianos");
                    break;
                case 2:
                    teclado.nextLine();
                    System.out.println("Ingrese la cantidad a convertir: ");
                    currencyAmount = Double.parseDouble(teclado.nextLine());
                    Currency currency2 = apiConverterProcess.locateCurrency("COP/USD/", currencyAmount);
                    System.out.println("La cantidad de " + currencyAmount + " pesos colombianos es equivalente a: " + currency2.conversion_result() + " dólares");
                    break;
                case 3:
                    teclado.nextLine();
                    System.out.println("Ingrese la cantidad a convertir: ");
                    currencyAmount = Double.parseDouble(teclado.nextLine());
                    Currency currency3 = apiConverterProcess.locateCurrency("EUR/COP/", currencyAmount);
                    System.out.println("La cantidad de " + currencyAmount + " euros es equivalente a: " + currency3.conversion_result() + " pesos colombianos");
                    break;
                case 4:
                    teclado.nextLine();
                    System.out.println("Ingrese la cantidad a convertir: ");
                    currencyAmount = Double.parseDouble(teclado.nextLine());
                    Currency currency4 = apiConverterProcess.locateCurrency("COP/EUR/", currencyAmount);
                    System.out.println("La cantidad de " + currencyAmount + " pesos colombianos es equivalente a: " + currency4.conversion_result() + " euros");
                    break;
                case 5:
                    teclado.nextLine();
                    System.out.println("Ingrese la cantidad a convertir: ");
                    currencyAmount = Double.parseDouble(teclado.nextLine());
                    Currency currency5 = apiConverterProcess.locateCurrency("USD/EUR/", currencyAmount);
                    System.out.println("La cantidad de " + currencyAmount + " dólares es equivalente a: " + currency5.conversion_result() + " euros");
                    break;
                case 6:
                    teclado.nextLine();
                    System.out.println("Ingrese la cantidad a convertir: ");
                    currencyAmount = Double.parseDouble(teclado.nextLine());
                    Currency currency6 = apiConverterProcess.locateCurrency("EUR/USD/", currencyAmount);
                    System.out.println("La cantidad de " + currencyAmount + " euros es equivalente a: " + currency6.conversion_result() + " dólares");
                    break;
                default:
                    System.out.println("Entrada no valida.");
                    break;
            }
        }
    }
}
