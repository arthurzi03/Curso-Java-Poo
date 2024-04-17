package atividade;

public class cortina {
    String modelo;
    String cor;
    float tamanho;
    boolean fechada;
    void fechar(){
        if(this.fechada == true){
            System.out.println("ta sol nao posso abrir");
        }else{
            System.out.println("estar aberta");
        }
        if (this.aberta == false) {
            System.out.println();
        }
    }
    void fechada(){
          this.fechada = true;
    }
   void abrir (){
    this.abrir = false;
   }
}
