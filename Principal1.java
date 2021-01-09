
import java.util.Scanner;

public class Principal1 {
    
    public static void main(String[] args) {
        
    Scanner leitor = new Scanner (System.in);
    
    pesoideal1 ps1 = new pesoideal1 ();
                
    int tecla = 0;
    while (tecla!=2) {
        
    System.out.format("\n 1 Calcular peso ideal \n 2 Sair");
    tecla= leitor.nextInt();
    switch (tecla){
            
        case 1: ps1. ler (leitor);
        System.out.format("\n ", ps1.calcular_exibir());
        break;
            
        case 2: System.out.println ("\n Programa finalizado");
        System.exit (0);
        break;}
    }
    }
    }
    

