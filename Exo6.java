import java.util.Scanner;
/**
 *
 * @author rkinnous
 */
public class Exo6 {
   public static void main(String[] args) {
   System.out.println("saisisez un nombre entier");
        Scanner sc = new Scanner(System.in);
        int nombre = sc.nextInt();
        boolean estPr= estPremier(nombre);
        if(estPr){
            System.out.println(nombre+" est premier");
            }
        else{
            System.out.println(nombre+" n est pas premier");
        }
   } 
   public static boolean estPremier(int nombre){
   boolean resultat = true;
   int d=2;
   while(nombre%d !=0 && d<=nombre-1){
   d=d+1;
   }
   if(d <nombre){
       resultat=false;
   }
   return resultat;
   }
  
}