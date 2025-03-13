public class Main {
    public static void main(String[] args) {
        Carro carro=new Carro();
        carro.setCaracteristica("Ford");
        carro.setCaracteristica("GM","Corsa");
        carro.setCaracteristica("Fiat","Uno","Branco");
        System.out.println(carro.toString());
    }
}


