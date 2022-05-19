import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    //Palavra palavra1 = new Palavra("O lanche está dois reais!");
    ArrayList<Palavra> listaDePalavras = new ArrayList<Palavra>();
  
    listaDePalavras.add(new Palavra ("O lanche está dois reais!"));
    int var = listaDePalavras.get(0).getPalavra().split(" ", -1).length - 1;
    String var2[] = new String[var];
    var2 = listaDePalavras.get(0).getPalavra().split(" ");


    System.out.println(listaDePalavras.get(0).getPalavra());
    for(int i = var; 0 <= i; i--){
      System.out.println(var2[i].length() + " - " + var2[i]);
    }
    
    
    
    

     
    

  }
}