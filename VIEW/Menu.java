package VIEW;

import CONTROLLER.ControllerCarro;
import CONTROLLER.ControllerCliente;
import MODEL.Carro;
import MODEL.Cliente;
import java.util.ArrayList;
import java.util.Scanner;
import CONTROLLER.ControllerGeral;


public class Menu {
    
    private static Scanner get = new Scanner(System.in);
    private static int opcao;
    
    public static void MenuPrincipal(ArrayList<Cliente> cliente, ArrayList<Carro> carro){
        
        while(0==0){
            System.out.println("\n+++++++++++++++++++++++++++++++++");
            System.out.println("++++++++++MENU PRINCIPAL+++++++++++");
            System.out.println("++++++++++++++++++++++++++++++++++");
            System.out.println("1 - CADASTRAR");
            System.out.println("2 - CONSULTAR");
            System.out.println("3 - EXCLUIR");
            System.out.println("4 - **SAIR**");
            System.out.print("Opção Selecionada: ");
            opcao = get.nextInt();
            
            switch(opcao){
                
                case 1:
                    MenuCadastro(cliente, carro);
                    break;
                    
                case 2:
                    MenuConsulta(cliente, carro);
                    break;
                    
                case 3:
                    MenuExclui(cliente, carro);
                    break;
                    
                case 4:
                    ControllerGeral.SairSistema();
                    break;
                    
                default:
                    ControllerGeral.OpInvalida();
                    break;
            }
        }
    }
    
    
    private static void MenuCadastro(ArrayList<Cliente> cliente, ArrayList<Carro> carro){
        
        while(0==0){
            System.out.println("\n+++++++++++++++++++++++++++++++++");
            System.out.println("++++++++++MENU DE CADASTRO+++++++++");
            System.out.println("++++++++++++++++++++++++++++++++++");
            System.out.println("1 - CLIENTE");
            System.out.println("2 - CARRO");
            System.out.println("3 - **RETORNAR AO MENU PRINCIPAL**");
            System.out.println("4 - **SAIR**");
            System.out.print("Opção Selecionada: ");
            opcao = get.nextInt();
            
            switch(opcao){
                
                case 1:
                    ControllerCliente.Cadastro(cliente);
                    break;
                    
                case 2:
                    ControllerCarro.Cadastro(carro);
                    break;
                    
                case 3:
                    MenuPrincipal(cliente, carro);
                    break;
                    
                case 4:
                    ControllerGeral.SairSistema();
                    break;
                    
                default:
                    ControllerGeral.OpInvalida();
                    break;
            }
        }
    }
    
    
    private static void MenuConsulta(ArrayList<Cliente> cliente, ArrayList<Carro> carro){
        
        while(0==0){
            System.out.println("\n+++++++++++++++++++++++++++++++++");
            System.out.println("++++++++++MENU DE CONSULTA+++++++++");
            System.out.println("++++++++++++++++++++++++++++++++++");
            System.out.println("1 - CLIENTE");
            System.out.println("2 - CARRO");
            System.out.println("3 - **RETORNAR AO MENU PRINCIPAL**");
            System.out.println("4 - **SAIR**");
            System.out.print("Opção Selecionada: ");
            opcao = get.nextInt();
            
            switch(opcao){
                
                case 1:
                    MenuConsultaCliente(cliente, carro);
                    break;
                    
                case 2:
                    MenuConsultaCarro(cliente, carro);
                    break;
                    
                case 3:
                    MenuPrincipal(cliente, carro);
                    break;
                    
                case 4:
                    ControllerGeral.SairSistema();
                    break;
                    
                default:
                    ControllerGeral.OpInvalida();
                    break;
            }
        }
    }
    
    
    private static void MenuConsultaCliente(ArrayList<Cliente> cliente, ArrayList<Carro> carro){
        
        while(0==0){
            System.out.println("\n++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("++++++++++MENU DE CONSULTA(CLIENTE)+++++++++");
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("1 - MAIORES DE 18");
            System.out.println("2 - MAIORES DE 21");
            System.out.println("3 - MAIORES DE 60");
            System.out.println("4 - MAIORES DE 70");
            System.out.println("5 - ANIVERSARIANTES DO MÊS");
            System.out.println("6 - **RETORNAR AO MENU DE CONSULTA**");
            System.out.println("7 - **SAIR**");
            System.out.print("Opção Selecionada: ");
            opcao = get.nextInt();
            
            switch(opcao){
                
                case 1:
                    ControllerCliente.exibeCliente(18, cliente);
                    break;
                    
                case 2:
                    ControllerCliente.exibeCliente(21, cliente);
                    break;
                    
                case 3:
                    ControllerCliente.exibeCliente(60, cliente);
                    break;
                    
                case 4:
                    ControllerCliente.exibeCliente(70, cliente);
                    break;
                    
                case 5:
                    ControllerCliente.aniversariantes(cliente);
                    break;
                    
                case 6:
                    MenuConsulta(cliente, carro);
                    break;
                    
                case 7:
                    ControllerGeral.SairSistema();
                    break;
                    
                default:
                    ControllerGeral.OpInvalida();
                    break;
            }
        }
    }
    
    
    private static void MenuConsultaCarro(ArrayList<Cliente> cliente, ArrayList<Carro> carro){
        
        while(0==0){
            System.out.println("\n++++++++++++++++++++++++++++++++++++++++");
            System.out.println("++++++++++MENU DE CONSULTA(CARRO)+++++++++");
            System.out.println("+++++++++++++++++++++++++++++++++++++++++");
            System.out.println("1 - POR ANO");
            System.out.println("2 - POR MARCA");
            System.out.println("3 - COM MAIS DE 5 ANOS");
            System.out.println("4 - COM MENOS DE 5 ANOS");
            System.out.println("5 - **RETORNAR AO MENU DE CONSULTA**");
            System.out.println("6 - **SAIR**");
            System.out.print("Opção Selecionada: ");
            opcao = get.nextInt();
            
            switch(opcao){
                
                case 1:
                    ControllerCarro.ConsultaAno(carro);
                    break;
                    
                case 2:
                    ControllerCarro.ConsultaMarca(carro);
                    break;
                    
                case 3:
                    ControllerCarro.ConsultaMenos5Anos(false, carro);
                    break;
                    
                case 4:
                    ControllerCarro.ConsultaMenos5Anos(true, carro);
                    break;
                    
                case 5:
                    MenuConsulta(cliente, carro);
                    break;
                    
                case 6:
                    ControllerGeral.SairSistema();
                    break;
                    
                default:
                    ControllerGeral.OpInvalida();
                    break;
            }
        }
    }
    
    
    private static void MenuExclui(ArrayList<Cliente> cliente, ArrayList<Carro> carro){
        
        while(0==0){
            System.out.println("\n+++++++++++++++++++++++++++++++++");
            System.out.println("++++++++++MENU DE EXCLUSÃO+++++++++");
            System.out.println("++++++++++++++++++++++++++++++++++");
            System.out.println("1 - CLIENTE");
            System.out.println("2 - CARRO");
            System.out.println("3 - **RETORNAR AO MENU PRINCIPAL**");
            System.out.println("4 - **SAIR**");
            System.out.print("Opção Selecionada: ");
            opcao = get.nextInt();
            
            switch(opcao){
                
                case 1:
                    ControllerCliente.exclui(cliente);
                    break;
                    
                case 2:
                    ControllerCarro.Exclui(carro);
                    break;
                    
                case 3:
                    MenuPrincipal(cliente, carro);
                    break;
                    
                case 4:
                    ControllerGeral.SairSistema();
                    break;
                    
                default:
                    ControllerGeral.OpInvalida();
                    break;
            }
        }
    }
}
