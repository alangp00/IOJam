
public class Zathras {
    //Solution for Code Jam I/O Women 2014 the problem can be found at this website: https://codingcompetitions.withgoogle.com/codejamio/round/0000000000050ed0/0000000000050ed1
    
    public static void main(String[] args) {
        int [][] input = new int[4][];//this line declares the int array and the following ints are different cases 
        input[0] = new int[]{12345, 12890, 10, 13, 0};
        input[1] = new int[]{12345, 12890, 10, 13, 1};
        input[2] = new int[]{12345, 12890, 10, 13, 100};
        input[3] = new int[]{12345, 12890, 10, 13, 5049};
        
        for (int j = 0; j < 4; j++) {
            System.out.print("Case #  ");//these lines call the arrays/ints and print them out with a case# x in front of them. x will depend on what order/line they are printed on
            System.out.print(j+1);
            System.out.print("  ");
            zGen(input[j][0], input[j][1], input[j][2], input[j][3], input[j][4]);
        }
    }
    public static void zGen(int t, int u , int v, int w, int x) { //this section of the function declares all the variables used in the program
        int a = t;
        int b = u;
        int alpha = v;
        int beta = w;
        int y = x;
        int k, N, na, nb, Na, Nb, da, db; //this line is naming all the int's that will be defined in the following lines
        

        for (int i = 0; i < y; i++) {
            k = Math.min(a,b); //k is the smaller number between a(12345) and b(12890)
            N = k*2/100; //N is 2% of k which is the number couples that will produce 1 baby Zathrinian
            na = N*alpha/100; //na is the first step to finding out how many baby acrobots there will be
            nb = N*beta/100; //nb is the first step to finding out how many baby bouncoids there will be
            if ((N-na-nb)%2 == 0){ //this if statement starts the second step of finding how many acrobots and bouncoids there will be
                Na = (N-na-nb)*1/2; //the if statement is saying if the total number of Zathrinian newborns minus na and nb is even, then do the following
                Nb = (N-na-nb)*1/2;
            } else { //the else statement is saying if the total number of Zathrinian newborns minus na and nb is odd, then do the following
                Na = (N-na-nb)*1/2; 
                Nb = (N-na-nb)*1/2+1;
            }
            da = a/100; //da is the total number off acrobots that are going to be taken apart that year
            db = b/100; //da is the total number off bouncoids that are going to be taken apart that year
            a =  a+na+Na-da; //a is calculating all the factors and producing the total number of acrobots of that given year
            b =  b+nb+Nb-db; //b is calculating all the factors and producing the total number of bouncoids of that given year
        
        }
    
        System.out.print(a); //the following 2 lines and this one are printing out both a, 2 spaces, and b
        System.out.print("  ");
        System.out.println(b);   

    }
}
