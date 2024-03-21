import java.util.Scanner;
/*
 *  FEITO POR GABRIEL ALVES BRAGANÇA
 *  gabriel.braganca1705@gmail.com
 *  ULTIMA ATUALIZAÇÃO: 21/03/2024
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lendo os dados de entrada
        String nome = sc.nextLine();
        String dataAtual = sc.nextLine();
        String dataNascimento = sc.nextLine();

        // Separando os componentes das datas
        String[] partesDataAtual = dataAtual.split("/");
        String[] partesDataNascimento = dataNascimento.split("/");

        // Convertendo as partes das datas para números inteiros
        int diaAtual = Integer.parseInt(partesDataAtual[0]);
        int mesAtual = Integer.parseInt(partesDataAtual[1]);
        int anoAtual = Integer.parseInt(partesDataAtual[2]);

        int diaNascimento = Integer.parseInt(partesDataNascimento[0]);
        int mesNascimento = Integer.parseInt(partesDataNascimento[1]);
        int anoNascimento = Integer.parseInt(partesDataNascimento[2]);

        // Calculando a idade da pessoa
        int idade = anoAtual - anoNascimento;
        
        // Verificando se a data atual coincide com o aniversário da pessoa
        boolean aniversario = (diaAtual == diaNascimento) && (mesAtual == mesNascimento);

        // Imprimindo a mensagem de feliz aniversário, se necessário
        if (aniversario) {
            System.out.println("Feliz aniversario!");
        }

        // Imprimindo a idade da pessoa
        System.out.println("Voce tem " + idade + " anos " + nome + ".");

        sc.close();
    }
}
