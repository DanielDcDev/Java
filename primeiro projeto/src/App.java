import java.util.Scanner;
public class App {
     static Scanner sca = new Scanner(System.in);
    static int opcao=0;
    public static void main(String[] args) throws Exception {
        System.out.println("Olá Mundo\nQual exercicio deseja vizualizar - 01 calculadora\n");
        opcao = Integer.parseInt(sca.nextLine());
        if(opcao==1){
            Calculadora();
        }else if(opcao==2){
            Emprestimo();
        }

    }
    private static void Erro(){
        System.out.println("Erro, favor reinicie o app");
    }
    
    private static void Emprestimo() {
        Scanner sc = new Scanner(System.in);
        int vezes;
        double valorOriginal, valorFinal;
        
        System.out.println("Qual o valor original do produto: ");
        valorOriginal = Integer.parseInt(sc.nextLine());
        System.out.println("Em quantas vezes você deseja dividir a sua compra?:\n01\n02\n03 ");
        vezes = Integer.parseInt(sc.nextLine());
        if(vezes==01){

        }else if(vezes==02){

        }else if(vezes==03){

        }else if(vezes==04){

        }else{
            Erro();
        }
    }

    public static double getTaxaDuasParcelas() {

        return 0.3;
    }
    public static double getTaxaTresParcelas() {

        return 0.45;
    }

    public static void Calculadora(){
        int n1, n2, res, op;
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual calculo deseja fazer?\n01->Soma\n02->Subtração\n03->Divisão\n04->Multiplição\n05-Média");
        op = Integer.parseInt(sc.nextLine());
        
            System.out.println("Favor digitar 1° variavel: \n");
            n1 = Integer.parseInt(sc.nextLine());
            System.out.println("Favor digitar á 2° variavel: \n");
            n2 = Integer.parseInt(sc.nextLine());
                
                if(op==01){
                    res=n1+n2;
                    System.out.println("O valor da soma e "+ res);
                    }else if(op==02){
                        res =n1-n2;
                        System.out.println("O valor da subtração é: "+res);
                        }else if(op==03){
                            res =n1/n2;
                            System.out.println("O valor da divisão é: "+res);
                            }else if(op==04){
                                res=n1*n2;
                                System.out.println("O valor da multiplicação é: "+res);
                            }else if(op==05){
                                double med;
                                med =(n1+n2)/2;
                                System.out.println("O valor da média é: "+med);
                            }
    }
}
