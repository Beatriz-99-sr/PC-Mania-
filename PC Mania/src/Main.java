import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Computador[] promo = new Computador[10];
        Scanner sc = new Scanner(System.in);
        HardwareBasico[] hw = new HardwareBasico[3];
        Computador[] carrinho = new Computador[10];

        int itens = 0;
        float totalCompra = 0;

        hw[0] = new HardwareBasico("Pentium Core i3 ", 2200);  // Computador 1
        hw[1] = new HardwareBasico("RAM ", 8);
        hw[2] = new HardwareBasico("HD ", 500);

        int preco1 = 571;
        String marca1 = "Apple";

        SistemaOperacional sistemaOperacional1 = new SistemaOperacional("Linux Ubuntu", 32);
        MemoriaUSB musb1 = new MemoriaUSB("Pen drive ", 16);
        promo[0] = new Computador(hw, sistemaOperacional1,preco1, marca1);
        promo[0].addMemoriaUSB(musb1);


        hw[0] = new HardwareBasico("Pentium Core i5 ", 3370);  // Computador 2
        hw[1] = new HardwareBasico("RAM ", 16);
        hw[2] = new HardwareBasico("HD ", 1);

        int preco2 = 1805;
        String marca2 = "Samsung";

        SistemaOperacional sistemaOperacional2 = new SistemaOperacional("Windows 8", 64);
        MemoriaUSB musb2 = new MemoriaUSB("Pen drive ", 32);
        promo[1] = new Computador(hw, sistemaOperacional2,preco2, marca2);
        promo[1].addMemoriaUSB(musb2);

        hw[0] = new HardwareBasico("Pentium Core i7 ", 4500);  // Computador 3
        hw[1] = new HardwareBasico("RAM ", 32);
        hw[2] = new HardwareBasico("HD ", 2);

        int preco3 = 6249;
        String marca3 = "Dell";

        SistemaOperacional sistemaOperacional3 = new SistemaOperacional("Windows 10", 64);
        MemoriaUSB musb3 = new MemoriaUSB("HD Externo ", 32);
        promo[2] = new Computador(hw, sistemaOperacional3, preco3, marca3);
        promo[2].addMemoriaUSB(musb3);

        int promocao = 9;
        int aux = 0;

        promo[0].mostraPCConfigs();
        promo[1].mostraPCConfigs();
        promo[2].mostraPCConfigs();

        System.out.println("Qual o número da promoção escolhida? (1, 2, 3 para Comprar) ou 0 para finalizar compra ");
        System.out.println("Capacidade Maxima do Carrinho = 10");
        System.out.println("0 para finalizar compra");

        do {

            promocao = sc.nextInt();

            if(promocao == 1){

                System.out.println("Computador 1 no carrinho!");
                totalCompra +=promo[0].preco;
                itens++;

                if(itens != 0 ) {

                    System.out.println("Itens No Carrinho: " + itens);
                    System.out.println("Total da compra: " + totalCompra );
                }
                carrinho[aux] = promo[0];
            }

            if(promocao == 2){
                System.out.println("Computador 2 no carrinho!");
                totalCompra +=promo[1].preco;
                itens++;
                if(itens != 0){

                    System.out.println("Itens No Carrinho: " + itens);
                    System.out.println("Total da compra: " + totalCompra );
                }
                carrinho[aux] = promo[1];
            }

            if(promocao == 3){
                System.out.println("Computador 3 no carrinho!");
                totalCompra +=promo[2].preco;
                itens++;
                if(itens != 0 ){

                    System.out.println("Itens No Carrinho: " + itens);
                    System.out.println("Total da compra: " + totalCompra );
                }
                carrinho[aux] = promo[2];
            }
            aux++;
        }
        while (promocao != 0);
            System.out.println("Compra finalizada. ");

            Cliente cliente = new Cliente(carrinho,"Chris", 123456);
            System.out.println("Nome: " + cliente.nome);
            System.out.println("CPF: " + cliente.cpf);

            for(int i = 0; i < carrinho.length; i++){

                if(carrinho[i] != null){
                    carrinho[i].mostraPCConfigs();
                }
            }

            float total;
            total = cliente.calculaTotalCompra();
            System.out.println("Total do carrinho: " + total);

    }
}