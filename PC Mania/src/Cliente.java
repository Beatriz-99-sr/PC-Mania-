public class Cliente{

    public Computador[] computadores;
    public String nome;
    public long cpf;

    public Cliente(Computador[] computadores, String nome, long cpf){
        this.computadores = computadores;
        this.nome = nome;
        this.cpf = cpf;
    }


    float calculaTotalCompra(){
            float TotalCompra = 0;

            for (int i = 0; i < computadores.length; i++){
                if(computadores[i] != null){
                    TotalCompra += computadores[i].preco;
                }
            }
            return TotalCompra;
    }

}



