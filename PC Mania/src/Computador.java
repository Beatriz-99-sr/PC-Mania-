public class Computador {

  public String marca;
  public float preco;
  public MemoriaUSB musb;
  public SistemaOperacional so;
  public HardwareBasico[] hw;

  public Computador(HardwareBasico[] hw, SistemaOperacional so, float preco, String marca) {
    this.hw = hw;
    this.so = so;
    this.preco = preco;
    this.marca = marca;
  }


  public void mostraPCConfigs(){

    System.out.println("Marca: " + marca);
    System.out.println("Preco: " + preco + " $");
    System.out.println("Processador: " + hw[0].nome + " " + hw[0].capacidade + " Mhz");
    System.out.println("Memoria: " + hw[1].nome + " " + hw[1].capacidade + " Gb");

    if(hw[2].capacidade >= 500) {
      System.out.println("Armazenamento: " + hw[2].capacidade + " Gb");
    }
    else {
      System.out.println("Armazenamento: " + hw[2].capacidade + " Tb");
    }
    if(musb.capacidade >= 16) {
      System.out.println("Acessório: " + musb.nome + " de " + musb.capacidade + " Gb");
    }
    else{
      System.out.println("Acessório: " + musb.nome + " de " + musb.capacidade + " Tb");
    }

    System.out.println("----------");

  }

  public void addMemoriaUSB(MemoriaUSB musb){
  this.musb = musb;
  }

}
