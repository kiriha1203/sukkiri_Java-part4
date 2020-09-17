public class Practice4 {
  public static void main(String[] args) {
    practice1();
    practice2();
    practice4();
  }

  public static void practice1() {
    int[] points = new int[4];
    double[] weights = new double[5];
    boolean[] answers = new boolean[3];
    String[] names = new String[3];
  }

  public static void practice2() {
    int[] moneyList = {121902, 8302, 55100};
    for (int i = 0; i < moneyList.length; i++) {
      System.out.println(moneyList[i]);
    }

    for (int m : moneyList) {
      System.out.println(m);
    }
  }

  public static void practice4() {
    int[] numbers = {3, 4, 9};
    System.out.println("一桁の数字を入力してください");
    int input = new java.util.Scanner(System.in).nextInt();
    for (int i : numbers) {
      if (input == i) {
        System.out.println("あたり");
        break;
      }
    }
  }
}