package APP;

import MODEL.Carro;
import MODEL.Cliente;
import java.util.ArrayList;
import VIEW.Menu;



public class Main {

    public static void main(String[] args) {
        
        ArrayList<Cliente> Cliente = new ArrayList<>();
        ArrayList<Carro> Carro = new ArrayList<>();
        
        Menu.MenuPrincipal(Cliente, Carro);
         
    }
    
}
