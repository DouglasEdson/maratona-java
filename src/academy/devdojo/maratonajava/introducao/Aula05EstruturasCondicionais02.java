package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
       /* Se idade < 15 categoria infantil
          Se idade >= 15 && idade < 18 categoria juvenil
          Se idade >= 18 categoria adulto
       */
        int idade = 12;
        String categoria;

        if(idade < 15){
            categoria = "Categoria Infatil";
        }else if (idade <=15 && idade < 18) {
            categoria = "Categoria Juvenil";
        }else {
            categoria = "Categoria Adulto";
        }
        System.out.println(categoria);

    }
}
