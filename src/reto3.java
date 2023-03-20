import java.util.Scanner;

public class reto3 {
    public static void main(String[] args) {
        String [][]expendedora=new String [4][4];

        Scanner recoger=new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4 ; j++) {
                System.out.println("ingrese un producto en la posicion:_"+i+j);
                expendedora[i][j]=recoger.nextLine();   
            }
        }
        
        for (int i = 0; i == 0; i++) {
            for (int j = 0; j < 4 ; j++) {
                System.out.print("\t"+i+j+"_"+expendedora[i][j]);
            }
            System.out.print("\n");
        }
        for (int i = 1; i == 1; i++) {
            for (int j = 0; j < 4 ; j++) {
                System.out.print("\t"+i+j+"_"+expendedora[i][j]);
            }
            System.out.print("\n");
        }
        for (int i = 2; i == 2; i++) {
            for (int j = 0; j < 4 ; j++) {
                System.out.print("\t"+i+j+"_"+expendedora[i][j]);
            }
            System.out.print("\n");
        }
        for (int i = 3; i == 3; i++) {
            for (int j = 0; j < 4 ; j++) {
                System.out.print("\t"+i+j+"_"+expendedora[i][j]);
            }
            System.out.print("\n");
        }
        recoger.close();
    }
}
