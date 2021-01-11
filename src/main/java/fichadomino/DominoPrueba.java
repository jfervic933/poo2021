package fichadomino;

import java.util.InputMismatchException;
import java.util.Scanner;


public class DominoPrueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		FichaDomino f = null;
//                
//                dobleSeis(f);
                
                
		//Creación de dos objetos de la clase FichaDomino
		FichaDomino f1 = new FichaDomino(9, 2);
		FichaDomino f2 = new FichaDomino(lectura(), lectura());
                
		//Impresión por pantalla de ambos objetos
		System.out.println("El valor de la ficha f1 es " + f1.toString());
		System.out.println("El valor de la ficha f2 es " + f2.toString());
		
		//Creación de un tercer objeto con valores incompatibles, mostrando tabién sus valores con toString()
		FichaDomino f3 = new FichaDomino(79, 13858);
		System.out.println("El valor de la ficha f3 es " + f3.toString());
		
		//Creación de un cuarto objeto mostrando sus valores con los getters
		FichaDomino f4 = new FichaDomino();
		System.out.println("El valor de la ficha f1 es [" + f4.getSuperior() + "|" + f4.getInferior() + "]");
		
		//Cambio de valores en las partes de las fichas
		f4.setSuperior(4);
		f4.setInferior(2);
		System.out.println("El valor de la ficha f4 es " + f4.toString());
		
		//Código que se encarga de generar fichas aleatoriamente hasta llegar a un 6 doble donde posteriormente muestra
		//el número de fichas creadas hasta llegar a ese punto.
		int contador = 0;
		FichaDomino f5 = new FichaDomino();
		do {
                    f5 = FichaDomino.generaFichaAleatoria();
                    contador ++;
                    System.out.println("El valor de la ficha generada es " + f5.toString() + 
				"\nEl valor total de la ficha es: " + f5.getValorTotal());
		}while(!dobleSeis(f5));
                imprimir(f5.getInferior());
		System.out.println("El número de fichas creadas es: " + contador);
                
                FichaDomino copiaf5 = new FichaDomino(f5);
                FichaDomino otracopia = f5; // Alias. Mismo espacio
                FichaDomino copiaf3 = FichaDomino.copiar(f3);
                System.out.println("f3: " + f3);
                System.out.println("copiaf3: " + copiaf3);
                f3.setInferior(0);
                System.out.println("f3: " + f3);
                System.out.println("copiaf3: " + copiaf3);
                
                
	}
	
	//Metodo que se encarga de la lectura de uno de los dos valores necesarios para la ficha
	public static int lectura() {
		Scanner s = new Scanner(System.in);
		int valor = -1;
                
                do{
                   System.out.println("Introduzca un valor entre 0 y 6");
                   try{
                        valor = s.nextInt(); 
                   } catch (InputMismatchException ime){
                       s.nextLine();
                   }
                }while(valor > 6 || valor < 0);
			
			
                return valor;
	}
	
	//Metodo que se encarga de comprobar si la ficha es 6doble
	public static boolean dobleSeis(FichaDomino ficha) {
		/* mayor eficiencia en el return
		 * if(ficha.getSuperior() != 6 || ficha.getInferior() != 6){
			return false;
		}
		*/
                if (ficha!=null){
                    return ficha.getValorTotal() == 12;
                   // return (ficha.getSuperior() == 6 && ficha.getInferior() == 6);
                } 
                
                return false;
		
	}
	
	public static void imprimir(int valor){
            System.out.println("El valor es " + valor);
        }

}
