package aula2;


public class caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    void status (){
        System.out.println("uma caneta"+ this.cor);
        System.out.println("tampada?"+ this.tampada);
        System.out.println("modelo"+this.modelo);
        System.out.println("ponta"+this.ponta);
        System.out.println("carga"+this.carga);
    }
    
    void rabiscar(){
        if (this.tampada == true) {
            System.out.println("erro, nao posso rabiscar");
        }else{
            System.out.println("estou rabiscando");
        }

    }
    void tampar(){
       this.tampada = true;
    }
    void destampar(){
        this.tampada = false;

    }
}
