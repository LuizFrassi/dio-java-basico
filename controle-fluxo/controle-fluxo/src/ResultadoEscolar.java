public class ResultadoEscolar {
    public static void main(String[] args) {
       int nota = 6;
       
       if(nota>=7)
            System.out.println("Aprovado!");
        else if (nota>=5 &&  nota<7)
            System.out.println("Prova de Rcuperação!");
        else
            System.out.println("Reprovado!");

        nota = 5;

        String resultado = nota >= 7 ? "Aprovado!" : "Reprovado";

        System.out.println(resultado);

        String notaFinal = nota >= 7 ? "Aprovado!" : nota >= 5 && nota < 7 ? "Recuperação": "Reprovado";

        System.out.println(notaFinal);
    }
}
