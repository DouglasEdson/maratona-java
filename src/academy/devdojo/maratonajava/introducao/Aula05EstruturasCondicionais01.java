package academy.devdojo.maratonajava.introducao;

public class Aulas05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >=18;
        // ! (Operador de negação) == false

        if (isAutorizadoComprarBebida != false) {
            System.out.println("Autorizado a comprar bebida alcólica");
        }else{
            System.out.println("Não Autorizado a comprar bebida alcólica");
        }

        if(!isAutorizadoComprarBebida){
            System.out.println("Não Autorizado a comprar bebida alcólica");
        }
        boolean c = false;
        if(c == true){
            System.out.println("Dentro de algo que nunca deve ser feito");
        }
            System.out.println("Fora do if");
    }

}
