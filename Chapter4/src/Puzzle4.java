public class Puzzle4 {
    public static void main (String [] args) {
        Puzzle4b [] obs = new Puzzle4b[6];
        int y = 1;
        int x = 0;
        int result = 0;
        while (x < 6) {
            obs[x] = new Puzzle4b();
            obs[x].ivar = y;
            y = y * 10;
            x = x + 1;
            System.out.println("x = " + x);
            System.out.println("y = " + y);
        }
        x = 6;
        while (x > 0) {
            x = x - 1;
            System.out.println("x = " + x);
            result = result + obs[x].doStuff(x);
            System.out.println("doStuff = " + obs[x].doStuff(x));

            System.out.println("result = " + result);

        }
        System.out.println("result " + result);
    }
}
