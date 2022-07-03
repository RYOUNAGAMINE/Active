import java.util.Random;

public class Cleric {
  String name;
  int hp = 50;
  final int Max_hp = 50;
  int mp = 10;
  final int Max_mp = 10;

  public void selfAid() {
    System.out.println(this.name + "はセルフエイドを唱えた");
    this.hp = this.Max_hp;
    this.mp -= 5;
    System.out.println("hpが最大まで回復した");
  }

  public int pray(int sec) {
    System.out.println(this.name + "は" + sec + "秒間天に祈った！");
    int recover = new Random().nextInt(3) + sec;
    int recoverActual = Math.min(this.Max_mp - this.Max_mp, recover);

    this.mp += recover;
    System.out.println("MPが" + recoverActual + "回復した");
    System.out.println("元気になった");

    return recoverActual;
  }
}
