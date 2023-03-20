import java.util.*;
public class reto1 {
    public static void main(String[] args) {
        int[] notas=new int[5];
        int operacion;
        Scanner recoger=new Scanner(System.in);

        System.out.println("Ingrese la primera nota:");
        notas[0]=recoger.nextInt();

        System.out.println("Ingrese la segunda nota:");
        notas[1]=recoger.nextInt();

        System.out.println("Ingrese la tercera nota:");
        notas[2]=recoger.nextInt();

        System.out.println("Ingrese la cuarta nota:");
        notas[3]=recoger.nextInt();

        System.out.println("Ingrese la quinta nota:");
        notas[4]=recoger.nextInt();

        operacion=(notas[0]+notas[1]+notas[2]+notas[3]+notas[4])/5;

        System.out.println("El promedio de las notas es:"+operacion);

        if (operacion<30) {
            System.out.println("!Reprobaste¡");
        }
        else if (operacion>30 && operacion<40) {
            System.out.println("!Pasaste raspando¡");
        }
        else if (operacion>40) {
            System.out.println("!Aprobaste con buenos resultados¡");
        }
        recoger.close();
    }
}