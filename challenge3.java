import java.io.Console;

public class challenge3{
    public static void main(String[] args) {
        
        int pola = 5;
        System.out.println("Belah ketupat");

        for(int i = 1; i <= pola; i++){

            for(int j = pola; j >= i; j--){
                System.out.print(' ');
            }
        for(int k = 1; k <= i + (i - 1); k++){
            System.out.print('0');
        }

        System.out.println();

        }
for (int i = 1; i <= pola; i++){

    for (int j = 1; j <= i; j++){
        System.out.print(' ');
    }
    for (int k = pola; k >= (2*i - pola); k--){
        System.out.print('0');
    }
    System.out.println();
}
    }
}