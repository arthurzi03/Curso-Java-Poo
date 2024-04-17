package aula2;

public class aula2 {
    public static void main(String[] args) {
        caneta c1 = new caneta();
        c1.cor = "azul";
        c1.ponta = 0.5f;
        c1.tampar();
        c1.rabiscar();
        c1.status();
        caneta c2= new caneta();
        c2.modelo="nike";
        c2.cor="preta";
        c2.destampar();
        c2.status();
        c2.rabiscar();
    }
}
