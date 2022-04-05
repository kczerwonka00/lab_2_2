class Main {
  public static void main(String[] args) {

    int linia;
    for(linia = 1 ; linia <=5;linia++){
    for(int kolumna=0;kolumna<(5-linia);kolumna++){
      System.out.print(" ");
    }
      for(int i=0; i<linia;i++){
        System.out.print("*");
      }
        System.out.println();
    }


}
}