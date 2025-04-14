package src;

public class DemonOperator {
  public static void main(String[] args){
    int x = 3;
    x =6 + 9;

    int y = 5 + x -10;
    System.out.println(y);

    int a = y -9 *2;
    System.out.println(a);

    int b = (y - 9) * 2;
    System.out.println(b);

    // divide by zero
    // int r = 10 / 0; // system error

    int r2 = 0 / 10;
    System.out.println(r2);

    // Java int/int -> int
    int r3 = 10/3;
    System.out.println(r3);
    // int/int -> int
    System.out.println(5 / 2); // 2
    // double / int -> double / double
    System.err.println(5.0/2); //2.5

    // int score1 = 71;
    // int score2 = 82;
    // double averageScore = (score1 + score2)/2.0;
    // System.out.println(averageScore);

    double score1 = 71;
    double score2 = 82;
    double averageScore = (score1 + score2)/2;
    System.out.println(averageScore);

    double d5 = 0.1 + 0.2;
    System.out.println(d5);  // double has precision issue

    // ! remindar of 10/3
    int r8 = 10 % 3;
    System.out.println(r8);

    //  +1 and -1
    int t = 0;
    t++;
    ++t;
    t = t + 1;
    t += 1;
    System.out.println(t);

    int w = 0;
    w--;
    --w;
    w = w - 1;
    w -= 1;
    System.out.println(w);

    // +/- non 1 value
    int o =3;
    o -= 4;
    o += 4;
    System.out.println(o);

    int q = 3;
    q = q * 3;
    q *= 3;
    System.out.println(q);

    // comparison
    int scoreA = 91;
    boolean isGradeA = scoreA >= 90;
    System.out.println(isGradeA); // true

    char gender = 'F';
    boolean isFemale = gender != 'M';
    System.out.println(isFemale);

  }
  
}
