import java.util.Scanner;

public class ifElse {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

//        System.out.println("Entre com sua idade");

//        int idade = scan.nextInt();
//
//        if(idade >= 18) {
//            System.out.println("E maior de idade");
//        } else {
//            System.out.println("Nao e maior de idade");
//        }

        //barato <= 10
        //10 > valor < 15 - pedir desconto
        //15 <= valor 17 - pesquisar mais
        //>= 17 - muito caro

        System.out.println("Entre com o preco do intem");
        double valor = scan.nextDouble();

        if(valor <= 10){
            System.out.println("Pode comprar, pois esta barato");
        } else if (valor > 10 && valor < 15){
            System.out.println("Pedir desconto");
        } else if (valor >= 15 && valor < 17){
            System.out.println("Pode pesquisar mais");
        } else { // valor >= 17
            System.out.println("Muito Caro");
        }

    }

}
