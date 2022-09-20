import java.util.Scanner;
public class App {
     static Scanner sca = new Scanner(System.in);
    static int opcao=0;
    public static void main(String[] args) throws Exception {
        System.out.println("Olá Mundo\nQual exercicio deseja vizualizar - 01 calculadora\n");
        opcao = Integer.parseInt(sca.nextLine());
        if(opcao==1){
            calculadora();
        }

    }
    
    public static void calculadora(){
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
