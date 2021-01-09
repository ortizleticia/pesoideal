
import java.util.Scanner;

public class pesoideal1 {
    
    public double sexo,altura, peso, resfem, resmas;
        
    public void ler (Scanner leitor) {
        System.out.println("\n Digite 1 se for do genero feminino e 2 se for do genero masculino:");
        sexo= leitor.nextDouble();
        
        System.out.println("\n Informe o peso:");
        peso= leitor.nextDouble ();
        
        System.out.println("\n Informe a altura:");
        altura= leitor.nextDouble(); }
        
    public double calcular_exibir () {
    
    if (sexo == 1) {
               
       resfem = (72.7 * altura) - 58;
       System.out.println("\n O peso ideal é:"+ resfem + "");}
               
            
    else if ( sexo == 2) {
        
       
       resmas = (62.1 * altura) - 44.7; 
       System.out.println("\n O peso ideal é:"+ resmas + "");} 
    
    return 0;}}
    

        
        
    
   
    

  
