import com.google.gson.Gson;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                1) Dolar => Real
                2) Real => Dolar
                3) Peso colombiano => Real
                4) Real => Peso colombiano
                5) Peso colombiano => Dolar
                6) Dolar => Peso colombiano
                
                digite:  
                
                """);

        int opcao = scanner.nextInt();
        scanner.nextLine();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("quantidade a ser convertida: ");
        int quantidade = scanner1.nextInt();
        scanner1.nextLine();
        switch (opcao ){
            case (1) :
                Real moeda = new Real( "USD", "BRL");
                System.out.println(moeda.valor());
                Gson gson = new Gson();
                Moeda conversão = gson.fromJson(moeda.valor(), Moeda.class);




                System.out.println("valor base: " + conversão.base_code+"// valor requerido: "+ conversão.target_code+ "// coeficiente de conversão: " +conversão.conversion_rate +"//valor convertido: "+ (quantidade * conversão.conversion_rate));






                break;
            case (2):
                Real moeda1 = new Real( "BRL", "USD");
                System.out.println(moeda1.valor());
                Gson gson1 = new Gson();
                Moeda conversão1 = gson1.fromJson(moeda1.valor(), Moeda.class);
                System.out.println("valor base: " + conversão1.base_code+"// valor requerido: "+ conversão1.target_code+ "// coeficiente de conversão: " + (quantidade * conversão1.conversion_rate));
                break;

            case (3):
                Real moeda2 = new Real( "COP", "BRL");
                System.out.println(moeda2.valor());
                Gson gson2 = new Gson();
                Moeda conversão2 = gson2.fromJson(moeda2.valor(), Moeda.class);
                System.out.println("valor base: " + conversão2.base_code+"// valor requerido: "+ conversão2.target_code+ "// coeficiente de conversão: " + (quantidade * conversão2.conversion_rate));
                break;

            case (4):
                Real moeda3 = new Real( "BRL", "COP");
                System.out.println(moeda3.valor());
                Gson gson3 = new Gson();
                Moeda conversão3 = gson3.fromJson(moeda3.valor(), Moeda.class);
                System.out.println("valor base: " + conversão3.base_code+"// valor requerido: "+ conversão3.target_code+ "// coeficiente de conversão: " + (quantidade * conversão3.conversion_rate));
                break;

            case (5):
                Real moeda4 = new Real( "COP", "USD");
                System.out.println(moeda4.valor());
                Gson gson4 = new Gson();
                Moeda conversão4 = gson4.fromJson(moeda4.valor(), Moeda.class);
                System.out.println("valor base: " + conversão4.base_code+"// valor requerido: "+ conversão4.target_code+ "// coeficiente de conversão: " + (quantidade * conversão4.conversion_rate));
                break;

            case (6):
                Real moeda5 = new Real( "USD", "COP");
                System.out.println(moeda5.valor());
                Gson gson5 = new Gson();
                Moeda conversão5 = gson5.fromJson(moeda5.valor(), Moeda.class);
                System.out.println("valor base: " + conversão5.base_code+"// valor requerido: "+ conversão5.target_code+ "// coeficiente de conversão: " + (quantidade * conversão5.conversion_rate));
                break;


            default:
                System.out.println("digite um numero valido");


        }

//        System.out.println(real.valor());
//        Gson gson = new Gson();
//        Dolar conversão = gson.fromJson(real.valor(), Dolar.class);
//        System.out.println("valor base: " + conversão.base_code+"// valor requerido: "+ conversão.target_code+ "//coeficiente de conversão: " +conversão.conversion_rate);
//





        }
    }