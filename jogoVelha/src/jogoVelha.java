import java.util.Scanner;

public class jogoVelha {
    public static void main(String[] args) {
        char[][] tabu = {{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}};

        instru();

        int c=1;

        while (!vitx(tabu) && !vito(tabu) && c<10) {

            if (c==1||c==3||c==5||c==7||c==9)
                jogarx(tabu);

            if (c==2||c==4||c==6||c==8)
                jogaro(tabu);

            exibirTabu(tabu);

            c++;
        }

        if (vitx(tabu)) {
            System.out.println("X ganhou!");
        }else if (vito(tabu)) {
            System.out.println("O ganhou!");
        }else {
            System.out.println("Empate!");
        }
    }
    public static boolean vitx(char[][] tabu){

        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
            }
        }
        if (tabu[0][0]=='X' && tabu[0][1]=='X' && tabu[0][2]=='X'){
            return true;
        }
        if (tabu[1][0]=='X' && tabu[1][1]=='X' && tabu[1][2]=='X'){
            return true;
        }
        if (tabu[2][0]=='X' && tabu[2][1]=='X' && tabu[2][2]=='X'){
            return true;
        }
        if (tabu[0][0]=='X' && tabu[1][0]=='X' && tabu[2][0]=='X'){
            return true;
        }
        if (tabu[0][1]=='X' && tabu[1][1]=='X' && tabu[2][1]=='X'){
            return true;
        }
        if (tabu[0][2]=='X' && tabu[1][2]=='X' && tabu[2][2]=='X'){
            return true;
        }
        if (tabu[0][0]=='X' && tabu[1][1]=='X' && tabu[2][2]=='X'){
            return true;
        }
        if (tabu[0][2]=='X' && tabu[1][1]=='X' && tabu[2][0]=='X'){
            return true;
        }


        return false;
    }
    public static boolean vito(char[][] tabu){

        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
            }

        }
        if (tabu[0][0]=='O' && tabu[0][1]=='O' && tabu[0][2]=='O'){
            return true;
        }
        if (tabu[1][0]=='O' && tabu[1][1]=='O' && tabu[1][2]=='O'){
            return true;
        }
        if (tabu[2][0]=='O' && tabu[2][1]=='O' && tabu[2][2]=='O'){
            return true;
        }
        if (tabu[0][0]=='O' && tabu[1][0]=='O' && tabu[2][0]=='O'){
            return true;
        }
        if (tabu[0][1]=='O' && tabu[1][1]=='O' && tabu[2][1]=='O'){
            return true;
        }
        if (tabu[0][2]=='O' && tabu[1][2]=='O' && tabu[2][2]=='O'){
            return true;
        }
        if (tabu[0][0]=='O' && tabu[1][1]=='O' && tabu[2][2]=='O'){
            return true;
        }
        if (tabu[0][2]=='O' && tabu[1][1]=='O' && tabu[2][0]=='O'){
            return true;
        }


        return false;
    }

    public static void instru(){
        System.out.println("para escolher a posição aperte:");
        System.out.println("1 | 2 | 3");
        System.out.println("---------");
        System.out.println("4 | 5 | 6");
        System.out.println("---------");
        System.out.println("7 | 8 | 9");
    }

    public static void exibirTabu(char[][] tabu){
        System.out.println(tabu[0][0] + " | " + tabu[0][1] + " | " + tabu[0][2]);
        System.out.println("---------");
        System.out.println(tabu[1][0] + " | " + tabu[1][1] + " | " + tabu[1][2]);
        System.out.println("---------");
        System.out.println(tabu[2][0] + " | " + tabu[2][1] + " | " + tabu[2][2]);
    }

    public static void jogarx(char[][] tabu){
        Scanner jogx=new Scanner(System.in);

        System.out.println("Vez do X:");

        int t=0;

        while(t==0) {

            int jogada = jogx.nextInt();

            while (jogada < 1 || jogada > 9) {
                System.out.println("Essa opção não é valida, escolha outra:");
                jogada = jogx.nextInt();
            }

            if (jogada == 1) {
                if (tabu[0][0] == ' ') {
                    tabu[0][0] = 'X';
                    t = 1;
                } else {
                    System.out.println("Essa opção não é valida, escolha outra:");
                }
            }

            if (jogada == 2){
                if (tabu[0][1] == ' '){
                    tabu[0][1] = 'X';
                    t = 1;
                } else {
                    System.out.println("Essa opção não é valida, escolha outra:");
                }
            }

            if (jogada == 3){
                if (tabu[0][2] == ' '){
                    tabu[0][2] = 'X';
                    t = 1;
                } else {
                    System.out.println("Essa opção não é valida, escolha outra:");
                }
            }

            if (jogada == 4){
                if (tabu[1][0] == ' '){
                    tabu[1][0] = 'X';
                    t = 1;
                } else {
                    System.out.println("Essa opção não é valida, escolha outra:");
                }
            }

            if (jogada == 5){
                if (tabu[1][1] == ' '){
                    tabu[1][1] = 'X';
                    t = 1;
                } else {
                    System.out.println("Essa opção não é valida, escolha outra:");
                }
            }

            if (jogada == 6){
                if (tabu[1][2] == ' '){
                    tabu[1][2] = 'X';
                    t = 1;
                } else {
                    System.out.println("Essa opção não é valida, escolha outra:");
                }
            }

            if (jogada == 7){
                if (tabu[2][0] == ' '){
                    tabu[2][0] = 'X';
                    t = 1;
                } else {
                    System.out.println("Essa opção não é valida, escolha outra:");
                }
            }

            if (jogada == 8){
                if (tabu[2][1] == ' '){
                    tabu[2][1] = 'X';
                    t = 1;
                } else {
                    System.out.println("Essa opção não é valida, escolha outra:");
                }
            }

            if (jogada == 9){
                if (tabu[2][2] == ' '){
                    tabu[2][2] = 'X';
                    t = 1;
                } else {
                    System.out.println("Essa opção não é valida, escolha outra:");
                }
            }
        }
    }
    public static void jogaro(char[][] tabu){
        Scanner jogo=new Scanner(System.in);

        System.out.println("Vez do O:");

        int t=0;

        while(t==0) {

            int jogada = jogo.nextInt();

            while (jogada < 1 || jogada > 9) {
                System.out.println("Essa opção não é valida, escolha outra:");
                jogada = jogo.nextInt();
            }

            if (jogada == 1) {
                if (tabu[0][0] == ' ') {
                    tabu[0][0] = 'O';
                    t = 1;
                } else {
                    System.out.println("Essa opção não é valida, escolha outra:");
                }
            }

            if (jogada == 2){
                if (tabu[0][1] == ' '){
                    tabu[0][1] = 'O';
                    t = 1;
                } else {
                    System.out.println("Essa opção não é valida, escolha outra:");
                }
            }

            if (jogada == 3){
                if (tabu[0][2] == ' '){
                    tabu[0][2] = 'O';
                    t = 1;
                } else {
                    System.out.println("Essa opção não é valida, escolha outra:");
                }
            }

            if (jogada == 4){
                if (tabu[1][0] == ' '){
                    tabu[1][0] = 'O';
                    t = 1;
                } else {
                    System.out.println("Essa opção não é valida, escolha outra:");
                }
            }

            if (jogada == 5){
                if (tabu[1][1] == ' '){
                    tabu[1][1] = 'O';
                    t = 1;
                } else {
                    System.out.println("Essa opção não é valida, escolha outra:");
                }
            }

            if (jogada == 6){
                if (tabu[1][2] == ' '){
                    tabu[1][2] = 'O';
                    t = 1;
                } else {
                    System.out.println("Essa opção não é valida, escolha outra:");
                }
            }

            if (jogada == 7){
                if (tabu[2][0] == ' '){
                    tabu[2][0] = 'O';
                    t = 1;
                } else {
                    System.out.println("Essa opção não é valida, escolha outra:");
                }
            }

            if (jogada == 8){
                if (tabu[2][1] == ' '){
                    tabu[2][1] = 'O';
                    t = 1;
                } else {
                    System.out.println("Essa opção não é valida, escolha outra:");
                }
            }

            if (jogada == 9){
                if (tabu[2][2] == ' '){
                    tabu[2][2] = 'O';
                    t = 1;
                } else {
                    System.out.println("Essa opção não é valida, escolha outra:");
                }
            }
        }
    }

}
