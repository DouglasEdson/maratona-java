package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class ImpressoraEstudante {
    public void imprime(Estudante estudante) {
        System.out.println(estudante.nome + "\n" + estudante.sexo + "\n" + estudante.idade + "\n");
        estudante.nome = "Gohan";
    }

}
