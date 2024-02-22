// 1 - Escreva um algoritmo que armazene o valor 10 em uma variável A e o valor 20 em uma variável B. A seguir 
//(utilizando apenas atribuições entre variáveis) troque os seus conteúdos fazendo co
//m que o valor que está em A passe para B e vice-versa. Ao final, escrever os valores que 
//Ficaram armazenados nas variáveis.

public class Main {
  public static void main(String[] args) {
    int  a = 10;
    int  b = 20;

     System.out.println("Antes da troca: a = " + a + ", b = " + b);
    
    //Troca de valores usando o temp

      int temp = a;
      a = b;
      b = temp;

      System.out.println("Depois da troca: a = " + a + ", b = " + b);

    
    
  }

  
}