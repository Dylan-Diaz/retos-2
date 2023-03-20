import java.util.*;
public class reto2 {
    public static void main(String[] args) {
        int n;
        float mejorTiempo;
        String nNombre;
        int contarNombre=0;

        Scanner recoger=new Scanner(System.in);

        System.out.println("Digite el numero de competidores:");
        n=recoger.nextInt();

        float tiempos[]=new float[n];
        String []nombre=new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite el nombre del competidor numero: "+i);
            nombre[i]=recoger.next();
            
            System.out.println("Digite el tiempo del competidor:");
            tiempos[i]=recoger.nextFloat();
            nNombre=nombre[i];
        }
        mejorTiempo=tiempos[0];

        for (int j= 0; j < tiempos.length; j++) {
            for (int i = 0; i < nombre.length; i++) {
                if (tiempos[j]<mejorTiempo) {
                    mejorTiempo=tiempos[j];
                }
                if (tiempos[j]==i) {
                    contarNombre=i;
                }
            }
        }
        nNombre=nombre[contarNombre];
        
        System.out.println("El mejor tiempo es:"+mejorTiempo);
        System.out.println("El mejor tiempo es:"+nNombre);
        recoger.close();
    }
}
