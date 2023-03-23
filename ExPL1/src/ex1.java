import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        String[] nomes = new String[3];
        double[][] contas = new double[4][4];
        double[] valor = new double[4];
        int opcao;

        System.out.println("Escreva o 1° nome:");
        nomes[0]=scan.nextLine();
        System.out.println("Escreva o 2° nome:");
        nomes[1]=scan.nextLine();
        System.out.println("Escreva o 3° nome:");
        nomes[2]=scan.nextLine();

        mostrarNomes(nomes);

        for (int r=0; r<4; r++) {
            System.out.println("\nDigite um valor inteiro de opção:");
            opcao = scan.nextInt();
            mostrarOpcao(opcao, nomes);
        }

        valor[0]=0;
        System.out.println("Digite o 1° valor:");
        valor[1]=scan.nextDouble();
        System.out.println("Digite o 2° valor:");
        valor[2]=scan.nextDouble();
        System.out.println("Digite o 3° valor:");
        valor[3]=scan.nextDouble();

        mostrarContas(valor, contas);

    }

    public static void mostrarNomes(String[] nomes){
        System.out.println("Os nomes são:");
        for(int i=0; i<3; i++){
            System.out.printf(nomes[i] + " ");
        }
        System.out.println();
    }

    public static void mostrarContas(double[] valor, double[][] contas) {

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j) {
                        contas[i][j]=valor[i]*valor[j];
                    } else if (i==0) {
                    contas[i][j]=valor[j];
                } else if (j==0) {
                    contas[i][j]=valor[i];
                } else {
                    contas[i][j]=valor[i]-valor[j];
                }
                }
            }

            System.out.println("As contas são:");
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.printf(contas[i][j] + " ");
                }
                System.out.printf("\n");
            }
        }

        public static void mostrarOpcao ( int opcao, String[] nomes){
            System.out.println("A opção é correspondente ao nome:");
            if (opcao == 1) {
                System.out.println(nomes[0]);
            } else if (opcao >= 2 && opcao <= 10) {
                System.out.println(nomes[1]);
            } else if (opcao > 10) {
                System.out.println(nomes[2]);
            } else {
                System.out.println("Opção Invalida");
            }

        }



}
