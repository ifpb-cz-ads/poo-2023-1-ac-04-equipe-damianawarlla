// Ler a idade de uma pessoa e informar a sua classe eleitoral, conforme:
// Nao-eleitor (abaixo de 16 anos)
// Eleitor obrigatorio (entre 18 e 65 anos)
// Eleitor facultativo (entre 16 e 18 ou maior de 65 anos).

import java.util.Scanner;

public class CTAtividade04 {

    public static void main(String[] args) {
      Scanner ler = new Scanner(System.in);

      int idade;

      System.out.printf("Informe a idade da pessoa: ");
      idade = ler.nextInt();

      if (idade < 16)
         System.out.printf("\nNao eleitor.\n");
      else if ((idade >= 18) && (idade <= 65))
              System.out.printf("\nEleitor obrigatorio.\n");
           else
              System.out.printf("\nEleitor facultativo.\n");
    }

}










      


