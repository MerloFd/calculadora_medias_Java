/**
 * @author MerloFd
 * @version 0.1
 */

public class CalcDeMedias {

    /**
     * Método que soma todas as notas obtidas
     * E aloca esse resultado na variável somaNotas
     * @return somaNotas
     */
    public int notasAlunos (){
        int notaMatematica = 2;
        int notaPortugues = 2;
        int notaIngles = 5;
        int notaCiencias = 7;

        int somaNotas = notaMatematica + notaPortugues + notaIngles + notaCiencias;

        return somaNotas;
    }

    /**
     * Método que pega o valor de somaNotas, divide pela quantia de tarefas
     * E retorna esse resultado na variável media
     * @return media
     */
    public int mediaFinal (){
        int somaNotas = notasAlunos();
        int qtdTarefas = 4;

        int media = (somaNotas / qtdTarefas);

        return media;
    }

    /**
     * Método que instância o objeto calculadora
     * Faz validação se o aluno foi reprovado ou aprovado
     * E Imprime os valores no console
     */
    public static void main (String [] Args) {
        CalcDeMedias calculadora = new CalcDeMedias();
        int media = calculadora.mediaFinal();

        //validação de aprovação do aluno com base na nota minina
        int notaMinima = 7;
        String resultado;
        if (media >= notaMinima){
            resultado = "aprovado";
        }else if (media >= 5) {
            resultado = "de recuperação";
        } else {
            resultado = "reprovado";
        }

        //imprime tudo no console
        System.out.println("A média final do aluno(a) é: "+ media);
        System.out.println("O aluno(a) está " + resultado);
    }
}
