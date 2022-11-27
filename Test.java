public class Test {
    public static void main(String[] args) {
        int [] input = {0,2,4,6,8,107};
        int [] output = new int [input.length];
        System.out.println("Hello World");
        output = cube(input);
        for (int i = 0; i<6; i++){
            System.out.print("I calculated: ");
            System.out.println(output[i]);
        }
    }
    public static int [] cube(int [] s){
        int size = s.length;
        int [] t = new int[size];
        for(int j = 0; j < size; j++){
           t[j] = s[j]*s[j]*s[j];
        }
        return t;
    }

}

