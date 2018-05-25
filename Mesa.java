package aula02exercicio;
public class Mesa {
    String modelo;
    String tipo;
    String cor;
    String tamanho;
    boolean uso;
    
    void status (){
        System.out.println("Uma mesa " + this.cor);
        System.out.println("modelo: " + this.modelo);
        System.out.println("tipo: " + this.tipo);
        System.out.println("tamanho: " + this.tamanho);
        System.out.println("tem espaço na mesa? " + this.uso);
    }
    void sentar (){
        if (this.uso == true){
        System.out.println("ERRO! não há espaço na mesa ");}
    else {
            System.out.println("sentando ");}
}
   
}

