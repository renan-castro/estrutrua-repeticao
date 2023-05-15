import java.util.Scanner;
public class ex3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
            String nome;
            int  vezes;
            int i = 1;
            System.out.println("Digite seu nome: ");
            nome = leitor.nextLine();
            System.out.println("Quantas vezes deseja repetir o nome? ");
            vezes = leitor.nextInt();

            while(i <= vezes){
                System.out.println(nome);
                i++;
            }

    }
}
