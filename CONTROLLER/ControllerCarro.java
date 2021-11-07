package CONTROLLER;

import MODEL.Carro;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class ControllerCarro {

    public static void Cadastro(ArrayList<Carro> carro) {

        Scanner get = new Scanner(System.in);
        String marca, modelo, cor;
        int ano;

        System.out.print("\nInforme a Marca: ");
        marca = get.nextLine();

        System.out.print("\nInforme o Modelo: ");
        modelo = get.nextLine();

        System.out.print("\nInforme a Cor: ");
        cor = get.nextLine();

        System.out.print("\nInforme o Ano: ");
        ano = get.nextInt();

        carro.add(new Carro(marca, modelo, cor, ano));
    }

    private static void imprime(Carro c) {

        System.out.println("\nMarca: " + c.getMarca());
        System.out.println("Modelo: " + c.getModelo());
        System.out.println("Cor: " + c.getCor());
        System.out.println("Ano: " + c.getAno());
    }

    public static void ConsultaAno(ArrayList<Carro> carro) {

        boolean verifica = false;
        int ano;
        Scanner get = new Scanner(System.in);

        System.out.print("\nInforme o Ano do Carro: ");
        ano = get.nextInt();

        for (Carro c : carro) {

            if (c.getAno() == ano) {

                imprime(c);
                
                System.out.println("------------------------");
                
                verifica = true;
            }
        }
        
        if (!verifica) {

                System.out.println("\nNenhum Carro do Ano de " + ano + " Cadastrado.");
            }

    }

    public static void ConsultaMarca(ArrayList<Carro> carro) {

        boolean verifica = false;
        String marca;
        Scanner get = new Scanner(System.in);

        System.out.print("\nInforme a Marca do Carro: ");
        marca = get.nextLine();

        for (Carro c : carro) {

            if (c.getMarca().equalsIgnoreCase(marca)) {

                imprime(c);
                verifica = true;
                
                System.out.println("------------------------");
            }

        }
        
        if (!verifica) {

                System.out.println("\nNenhum Carro da Marca " + marca + " Cadastrado.");
            }

    }

    public static void ConsultaMenos5Anos(boolean Menos, ArrayList<Carro> carro) {

        Calendar anoAtual = Calendar.getInstance();
        boolean verifica = false;

        if (Menos) {

            for (Carro c : carro) {

                if (anoAtual.get(Calendar.YEAR) - c.getAno() < 5) {

                    imprime(c);
                    
                    System.out.println("------------------------");

                    verifica = true;
                }
            }

            if (!verifica) {

                System.out.println("\nNenhum Carro com Menos de 5 Anos Cadastrado");
            }

        } else {

            for (Carro c : carro) {

                if (anoAtual.get(Calendar.YEAR) - c.getAno() >= 5) {

                    imprime(c);
                    
                    System.out.println("------------------------");

                    verifica = true;
                }
            }

            if (!verifica) {

                System.out.println("\nNenhum Carro com Mais de 5 Anos Cadastrado");
            }
        }

    }

    public static void Exclui(ArrayList<Carro> carro) {

        if (carro.isEmpty()) {

            System.out.println("\nNenhum Carro Cadastrado");
        } else {

            int cont = 0;
            int resposta;
            Scanner get = new Scanner(System.in);

            for (Carro c : carro) {

                cont++;

                System.out.println("\nNº " + cont);

                imprime(c);
                
                System.out.println("------------------------");

            }

            System.out.print("Informe o Número do Carro que Deseja Excluir: ");
            resposta = get.nextInt();

            if (resposta > cont || resposta == 0) {
                System.out.println("\nNúmero Inválido");
            } else {

                System.out.println("\nCadastro Excluído com Sucesso!");
                carro.remove((resposta - 1));
            }

        }
    }

}
