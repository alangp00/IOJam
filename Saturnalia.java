public class Saturnalia {


    public static void main(String[] args) {
        String[] lines = {"5", "Merry Saturnalia, Giovanni!", "Equus, you're the best!", "Caballus, you try really hard!", "    ", "w"};
        
        boxString(lines[0]);
        boxString(lines[1]);
        boxString(lines[2]);
        boxString(lines[3]);
        boxString(lines[4]);
        boxString(lines[5]);

    }
    public static void boxString(String contents) {
        int n = contents.length();
        System.out.print("+");
        for (int i = 0; i < n + 0; i++) {
            System.out.print("-");

        }
        System.out.print("+");
        System.out.println();
        System.out.println("|" + contents + "|");
        System.out.print("+");
        for (int i = 0; i < n + 0; i++) {
            System.out.print("-");
        }
        System.out.print("+");
        System.out.println();
    }


}