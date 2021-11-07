package CONTROLLER;

import MODEL.Cliente;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class ControllerCliente {

    public static void Cadastro(ArrayList<Cliente> cliente) {

        Scanner get = new Scanner(System.in);
        String nome, sexo, dataNascimento;
        int cpf;
        boolean cpfCadastrado = false;

        System.out.print("\nInforme o Nome: ");
        nome = get.nextLine();

        System.out.print("\nInforme o Sexo: ");
        sexo = get.nextLine();

        System.out.print("\nInforme a Data de Nascimento (dd/mm/aaaa): ");
        dataNascimento = get.nextLine();

        System.out.print("\nInforme o CPF (SOMENTE NÚMEROS): ");
        cpf = get.nextInt();

        //Verificando se o CPF já esta cadastrado
        for (Cliente c : cliente) {

            if (c.getCpf() == cpf) {

                cpfCadastrado = true;
            }
        }

        if (idade(dataNascimento) < 18) {

            System.out.println("\nPROIBIDO CASDASTRAR MENORES DE 18!");
        } else {
            if (cpfCadastrado) {

                System.out.println("\nCPF JÁ CADASTRADO!");
            } else {

                cliente.add(new Cliente(nome, sexo, cpf, dataNascimento));
            }

        }

    }

    private static int idade(String dataNascimento) {

        String[] data;
        Calendar hoje = Calendar.getInstance();
        int dia, mes, ano, idadeAtual;

        data = dataNascimento.split("/");

        dia = Integer.parseInt(data[0]);
        mes = (Integer.parseInt(data[1]) - 1);
        ano = Integer.parseInt(data[2]);

        idadeAtual = hoje.get(Calendar.YEAR) - ano;

        if (mes > hoje.get(Calendar.MONTH)) {

            idadeAtual--;
        } else {

            if (mes == hoje.get(Calendar.MONTH)) {

                if (dia > hoje.get(Calendar.DAY_OF_MONTH)) {

                    idadeAtual--;
                }
            }
        }

        return idadeAtual;
    }

    private static void imprime(Cliente c) {

        System.out.println("\nNome: " + c.getNome());
        System.out.println("Sexo: " + c.getSexo());
        System.out.println("CPF: " + c.getCpf());
        System.out.println("Data de Nascimento: " + c.getDataNascimento());
        System.out.println("Idade: " + idade(c.getDataNascimento()));
    }

    public static void exibeCliente(int idade, ArrayList<Cliente> cliente) {

        boolean verifica = false;

        for (Cliente c : cliente) {

            if (idade(c.getDataNascimento()) >= idade) {
                imprime(c);
                
                System.out.println("------------------------");

                verifica = true;
            }
        }

        if (!verifica) {

            System.out.println("\nNenhum Cliente Maior que " + idade + " Cadastrado.");
        }
    }

    public static void aniversariantes(ArrayList<Cliente> cliente) {

        boolean verifica = false;
        String[] data;
        int mes;
        Calendar mesAtual = Calendar.getInstance();
        String m = "";

        switch (mesAtual.get(Calendar.MONTH)) {

            case 0:
                m = "Janeiro";
                break;

            case 1:
                m = "Fevereiro";
                break;

            case 2:
                m = "Março";
                break;

            case 3:
                m = "Abril";
                break;

            case 4:
                m = "Maio";
                break;

            case 5:
                m = "Junho";
                break;

            case 6:
                m = "Julho";
                break;

            case 7:
                m = "Agosto";
                break;

            case 8:
                m = "Setembro";
                break;

            case 9:
                m = "Outubro";
                break;

            case 10:
                m = "Novembro";
                break;

            case 11:
                m = "Dezembro";
                break;
        }

        System.out.println("\nAniversariantes do Mês de " + m);

        for (Cliente c : cliente) {

            data = c.getDataNascimento().split("/");
            mes = (Integer.parseInt(data[1]) - 1);

            if (mesAtual.get(Calendar.MONTH) == mes) {

                imprime(c);
                
                System.out.println("------------------------");

                verifica = true;
            }

        }

        if (!verifica) {

            System.out.println("\nNão Há Clientes Fazendo Aniversário em " + m);
        }
    }

    public static void exclui(ArrayList<Cliente> cliente) {

        if (cliente.isEmpty()) {

            System.out.println("\nNenhum Cliente Cadastrado");
        } else {

            boolean verifica = false;
            Scanner get = new Scanner(System.in);
            int recebeCPF;
            int resposta;

            System.out.print("\nInforme o CPF do Cliente que Deseja Excluir: ");
            recebeCPF = get.nextInt();

            for (Cliente c : cliente) {

                if (c.getCpf() == recebeCPF) {

                    verifica = true;
                    imprime(c);
                    System.out.println("\nDeseja Prosseguir com a Exclusão? 1 - Sim / 2 - Não");
                    resposta = get.nextInt();

                    switch (resposta) {

                        case 1:
                            cliente.remove(c);
                            System.out.println("\nCadastro Excluído Com Sucesso!");
                            break;

                        case 2:
                            System.out.println("\nExclusão Cancelada!");
                            break;

                        default:
                            System.out.println("\nOpção Inválida, Exclusão Cancelada!");
                            break;
                    }

                }
            }

            if (!verifica) {

                System.out.println("\nCliente Não Cadastrado!");
            }
        }

    }
}
