import java.util.Arrays;
import java.util.Scanner;
public class revisão {

    Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        String nome[] = new String[3];
        double contas[][] = new double[4][4];
        int y = 0;

        System.out.println("Digite o 1º nome: ");
        System.out.println("Digite o 2º nome: ");
        System.out.println("Digite o 3º nome: ");

        showname(nome);

        for(int f = 0; f <=3; f++){
            System.out.println("Digite um número: ");
            checkint(nome, y);
        }

        for (int z = 0; z < contas.length; z++)
        {
            Arrays.fill(contas[z], ' ');
        }
        showmatriz(contas);
    }

    public static void showname(String[] n){

        System.out.println(n[0]);
        System.out.println(n[1]);
        System.out.println(n[2]);

    }

    public static void showmatriz(double[][] cont){

        for(int i=0;i<3;i++) {
            for (int j=0;j<3;j++) {

                if(i == 0 && j == 0)
                    cont[i][j] = 0;
                else if(i == 0){
                    System.out.println("Digite o" + j + "valor");
                    cont[i][j] = Scanner.nextDouble();
                }
                else if(j == 0){
                    cont[i][j] = cont[j][i];
                }
                else if(i == j){
                    cont[i][j] = cont[0][j] * cont[i][0];
                }
                else{
                    cont[i][j] = cont[0][j] - cont[i][j];
                }

            }
        }

    }

    public static void checkint(String[] name, int x){

            if (x == 1)
                System.out.println(name[0]);
            else if (x >= 2 && x <= 10)
                System.out.println(name[1]);
            else if (x > 10)
                System.out.println(name[2]);
            else
                System.out.println("Opção inválida!");

    }


}
