import java.util.Scanner;
public class calculadoraPratica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Operacao;
       final String adicao = "adicao";
       final String subtracao = "subtracao";
       final String divisao = "divisao";
       final String multiplicacao = "multiplicacao";

       calculadora numero1 = new calculadora();
       System.out.println("Digite um numero ");
       numero1.n1 =sc.nextInt();
        System.out.println("Digite outro numero numero ");
        numero1.n2 = sc.nextInt();
        System.out.println("Escolha a operação desejada ");
        Operacao = sc.next();
        switch (Operacao) {
            case adicao:
                System.out.println(numero1.Adicao());
                break;
            case divisao:
                System.out.println(numero1.Divisao());
                break;
            case subtracao:
                System.out.println(numero1.Subtracao());
                break;
            case multiplicacao:
                System.out.println(numero1.Multiplica());
                break;
            default:
                System.out.println("Opção inválida.");
        }
       sc.close();
    }

}