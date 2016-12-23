
public class Exemplo {

  int y = 10;
  
  void mudar(Exemplo e) {

    e.y = y + 5;

  }

  public static void main(String[] args) {

    Exemplo e1 = new Exemplo();

    Exemplo e2 = new Exemplo();

    e1.mudar(e2);
    System.out.println(e1.y);

    System.out.println(e2.y);

  }

}

