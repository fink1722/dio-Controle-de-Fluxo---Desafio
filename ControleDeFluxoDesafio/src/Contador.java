
import java.util.Scanner;
public class Contador {
    public static void main(String[] args) {
        
        
        Scanner terminal = new Scanner(System.in);

        System.out.println("DIGITE O PRIMEIRO PARÂMETRO: ");
        int parametroUm = terminal.nextInt();

        System.out.println("DIGITE O SEGUNDO PARÂMETRO: ");
        int parametroDois = terminal.nextInt();

        try{
            contar(parametroUm, parametroDois);


        }catch (ParametrosInvalidosException e){
            System.out.println(e.getMessage());


        }
        terminal.close();
    }

    static void contar(int parametroUm, int parametroDois)throws ParametrosInvalidosException{
        if(parametroUm> parametroDois){
            throw new ParametrosInvalidosException("O SEGUNDO PARÂMETRO DEVE SER MAIOR QUE O PRIMEIRO ");
        }
       
        int contagem = parametroDois - parametroUm;

        for (int i = 1; i <= contagem; i++ ){
            System.out.println("IMPRIMINDO O NUMERO " + i);
        } 
       
       
    }
        
        
        




    
    
}
