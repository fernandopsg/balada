import java.sql.SQLOutput;
import java.util.Scanner;

public class balada {
    public static void main(String[] args) {

         /** variaveis */

         String nome;
         String cpf;
         long idade;
         String nomeacompanhante;
         String cpfacompanhante;
         long idadeacompanhante;
         boolean continuar = true ;


         /** instanciar teclado*/

         Scanner teclado = new Scanner(System.in);

         while (continuar)



         /** coleta de dados*/

         System.out.println("----------- Inserir Seus Dados -----------");
         System.out.println("Informe seu nome:");
         nome = teclado.nextLine();
         System.out.println("ola " + nome + " Informe seu cpf");
         cpf = teclado.nextLine();
         System.out.println("Nao minta");
         System.out.println("Sua idade");
         idade = teclado.nextInt();
         System.out.println("----------------------------------------------");


         if (idade >= 18 && idade % 2 == 0) {
              System.out.println("seja bem vindo");
         } else if (idade >= 18 && idade % 2 == 1) {

              //* coleta dados acompanhate */
              System.out.println("-------------------------------------------");
              System.out.println("nome do acompanhante");
              nomeacompanhante = teclado.nextLine();
              System.out.println("cpf do acompanhante");
              cpfacompanhante = teclado.nextLine();
              System.out.println(" idade do acompanhante");
              idadeacompanhante = teclado.nextInt();

         } else {
              System.out.println("proibido entrada de menor!!");

         }
         {
              if ((idade = idadeacompanhante) % 2 == 0 && idadeacompanhante >= 18) {
                   System.out.println("curtam bastante a balada!!!");

              } else {
                   System.out.println("vao embora");

                    /**avaliar loop*/
                   System.out.println(---------------------);
                   System.out.println("deseja continuar : [1 -sim / 2 -nao");
                   int opcao = teclado.nextInt();

                   if (opcao == 2) {
                        continuar = false;




              }
         }


    }

