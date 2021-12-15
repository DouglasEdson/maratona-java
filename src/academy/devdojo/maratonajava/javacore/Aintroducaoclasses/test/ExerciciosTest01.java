package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Exercicios;

public class ExerciciosTest01 {
    public static void main(String[] args) {
        Exercicios carro01 = new Exercicios();
        Exercicios carro02 = new Exercicios();

        carro01.nome = "Opala";
        carro01.modelo = "Comodoro";
        carro01.ano = 1976;

        carro02.nome = "Monza";
        carro02.modelo = "Tubarão";
        carro02.ano = 1986;

        carro01 = carro02;

        System.out.println("Carro 01");
        System.out.println(carro01.nome + " " + carro01.modelo + " " + carro01.ano);
        System.out.println(" X ");
        System.out.println("Carro 02");
        System.out.println(carro02.nome + " " + carro02.modelo + " " + carro02.ano);

    }

}
