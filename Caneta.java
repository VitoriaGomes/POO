package aula02;
public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    void status (){
        System.out.println("Uma Caneta " + this.cor);
        System.out.println("está tampada? " + this.tampada);
        System.out.println("modelo: " + this.modelo);
        System.out.println("ponta: " + this.ponta);
        System.out.println("carga: " + this.carga);
    }
    void rabiscar (){
        if (this.tampada == true) {
            System.out.println("ERRO! A caneta está tampada ");
        }else{
            System.out.println("rabiscando ");
            }}
    void tampar (){
        this.tampada = true;
        }
    void destampar (){
        this.tampada = false;
        
    }
}