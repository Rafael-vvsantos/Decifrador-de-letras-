import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    //Palavra palavra1 = new Palavra("O lanche está dois reais!");
    List<String> listaDePalavras;
    ArrayList<Palavra> palavras = new ArrayList<Palavra>();
  
    String frase = "O lanche está dois reais!"; //Scanner
    listaDePalavras = Arrays.asList(frase.split(" "));

    for(int i = 0; i < listaDePalavras.size()-1; i++){
      palavras.add(new Palavra(listaDePalavras.get(i), listaDePalavras.get(i).length()));
    }

    for(int i = listaDePalavras.size() ; 0 < i; i--){
     System.out.println(palavras.get(i).getPalavra() + " " + palavras.get(i).getNumeroLetra());
    }
  }
}

/*import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    //Palavra palavra1 = new Palavra("O lanche está dois reais!");
    List<String> listaDePalavras;
    ArrayList<Palavra> palavras = new ArrayList<Palavra>();
   
    String frase = "O lanche está dois reais!"; //Scanner
    listaDePalavras = Arrays.asList(frase.split(" "));
    
    
    for(int i = 0; i < listaDePalavras.size(); i++){
      palavras.add(new Palavra(listaDePalavras.get(i), listaDePalavras.get(i).length()));
    }
    System.out.println("Hello world!");
    
    for(int i = listaDePalavras.size()-1 ; 0 < i; i--){
     System.out.println(palavras.get(i).getPalavra() + " - "  + palavras.get(i).getNumeroLetra());
    }
  }
}*/