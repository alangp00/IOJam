import java.util.Scanner; 

public class Seating {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);     
        System.out.print("Enter the total number of people: ");  
        int N = sc.nextInt();  
        System.out.print("Enter the total number of tables: ");  
        int K = sc.nextInt();
        int [] tableAssign = new int [K];
        tableAssign = numberPeople(N, K);
        for (int j = 0; j<K; j++){
            System.out.println(tableAssign[j]);
        }
        /*
        System.out.println("The factorial of 3 is ");
        System.out.println(fac(3)); */
        System.out.println(Combine(5,3));
        System.out.println(finalAssembly(tableAssign, N, K));
    }

    public static int [] numberPeople(int n, int k) {
         
        int x = n/k;
        int y = n%k;
        int [] output = new int [k];
        System.out.println("Here is the grouping: ");
        for(int i = 0; i < k; i++){
            if (i<y) {
                output[i] = x+1;
            } else { 
                output[i] = x;
            }
        }
        return output;
    } 
    
    public static int fac(int x) {
        int y = 1;
        if (x == 0) {
            y = 1;
        } 
        if (x > 0) {
            for(int k = 1; k < x + 1; k++){
                y = y*k;
            }
        }
        return y;
    }

    public static int cirArr(int w){
        int result = 0;
        if (w == 1 || w == 2){
            result = 1;
        }
        if (w > 2){
            result = fac(w-1)/2;
        }
        return result;
    }

    public static int Combine(int G, int T){
        int result = 0;
        result = fac(G)/(fac(G-T)*fac(T));
        return result;
    }

    public static int finalAssembly(int [] input, int people, int table){
        int result = 1;
        int m = people%table;
        int n = table-m;
        int k = input.length;
        int r = 0;
        for (int j = 0; j<k; j++){
            int c = Combine((people-r), input[j]);
            result *= Combine((people-r), input[j])*cirArr(input[j]);
            r += input[j];
            System.out.println(j + "   "+ c + "   " + result);
        }
        result /= fac(m)*fac(n);
        return result;
    }

}
