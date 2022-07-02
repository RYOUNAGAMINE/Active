import java.util.Random;

public class Main {
  public static void main(String[] args) {
    Cleric h = new Cleric();
    h.name = "Ryo";
    h.hp = 40;
    h.mp = 6;
    System.out.println("主人公誕生");
    h.selfAid();
    h.pray(4);
  }
}
