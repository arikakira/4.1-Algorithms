import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Algorithms {
    private static File f;
    private static Scanner s;
    private static Scanner e;
    private static Scanner t;
    private static Scanner h;
    private static Scanner g;
    private static Scanner l;
    private static Scanner u;
    private static Scanner a;
    private static Scanner m;
    public static void main(String[] args) throws FileNotFoundException {
        f = new File("Numbers.txt");
        int odds = odds();
        int evens = evens();
        int twoDigit = twoDigit();
        int hundred = hundred();
        int greatest = greatest();
        int least = least();
        int sum = sum();
        double average = average();
        int mode = mode();
        System.out.println(odds);
        s.close();
        System.out.println(evens);
        e.close();
        System.out.println(twoDigit);
        t.close();
        System.out.println(hundred);
        h.close();
        System.out.println(greatest);
        g.close();
        System.out.println(least);
        l.close();
        System.out.println(sum);
        u.close();
        System.out.println(average);
        a.close();
        System.out.println(mode);
        m.close();
    }

    public static int odds() throws FileNotFoundException{
        s = new Scanner(f);
        int odds = 0;
        while (s.hasNext()) {
            if (s.nextInt() % 2 != 0)
                odds++;
        }
        return odds;
    }

    public static int evens() throws FileNotFoundException{
        e = new Scanner(f);
        int evens = 0;
        while(e.hasNext()) {
            if(e.nextInt() % 2 == 0) {
                evens++;
            }
        }
        return evens;
    }

    public static int twoDigit() throws FileNotFoundException {
        t = new Scanner(f);
        int twoDigit = 0;
        while(t.hasNext()) {
            if(t.nextInt()>=10 && t.nextInt()<=99) {
                twoDigit++;
            }
        }
        return twoDigit;
    }

    public static int hundred() throws FileNotFoundException {
        h = new Scanner(f);
        int hundred = 0;
        while(h.hasNext()) {
            if(h.nextInt()>500) {
                hundred++;
            }
        }
        return hundred;
    }

    public static int greatest() throws FileNotFoundException {
        g = new Scanner(f);
        int greatest = 0;
        while(g.hasNext()) {
            if(g.nextInt()>greatest) {
                greatest = g.nextInt();
            }
        }
        return greatest;
    }

    public static int least() throws FileNotFoundException {
        l = new Scanner(f);
        int least = 999;
        while(l.hasNext()) {
            if(l.nextInt()<least) {
                least = l.nextInt();
            }
        }
        return least;
    }

    public static int sum() throws FileNotFoundException {
        u = new Scanner(f);
        int sum = 0;
        while(u.hasNext()) {
            sum += u.nextInt();
        }
        return sum;
    }

    public static double average() throws FileNotFoundException {
        a = new Scanner(f);
        double average = 0.0;
        int count = 0;
        while(a.hasNext()) {
            average += a.nextInt();
            count++;
        }
        average /= count;
        return average;
    }

    public static int mode() throws FileNotFoundException {
        m = new Scanner(f);
        int most = 0;
        int count1 = 0;
        int maybeMost = 0;
        int count2 = 0;
        while(m.hasNext()) {
            maybeMost = m.nextInt();
            count2 = 1;
            while(m.hasNext()) {
                if(maybeMost == m.nextInt()) {
                    count2++;
                }
            }
            if(count2>count1) {
                most = maybeMost;
                count1 = count2;
            }
        }
        System.out.println("count: " + count1);
        return most;
    }
}