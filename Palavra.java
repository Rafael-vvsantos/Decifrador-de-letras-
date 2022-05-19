class Palavra{
  String palavra;
  int numeroDeLetra;

  Palavra (String palavra, int tamanho){
    this.palavra = palavra;
    this.numeroDeLetra = tamanho;
  }

  String getPalavra(){
    return palavra;
  }

  int getNumeroLetra(){
    return numeroDeLetra;
  }
  
  
} 
