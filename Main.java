class Main {
  public static void main(String[] args) {

    Matrice matrix = new Matrice("maurobiglino");
    Vigenere v0 = new Vigenere(0, 12, 0, 12, matrix);
    Thread t0 = new Thread(v0);
    Vigenere v1 = new Vigenere(13, 25, 13, 25, matrix);
    Thread t1 = new Thread(v1);
    
    t0.start();
    try{t0.join();}
    catch {
      System.err.println("xx");
    }
    t1.start();
    matrix.stampa();
    
  }
}