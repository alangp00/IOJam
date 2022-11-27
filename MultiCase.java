import java.util.Scanner;

class MultiCase {
    
    
    public static void main(String[] args) {
     
    Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
    System.out.print("Enter Acrobots current population: ");  
    int A= sc.nextInt();  
    System.out.print("Enter Bouncoids current population: ");  
    int B= sc.nextInt();   
    System.out.print("Enter amount of years: ");  
    int C= sc.nextInt();

        int y = C;
        int a = 12345;
        int b = 12890;
        int alpha = 10, beta = 13;
        int k, N, na, nb, Na, Nb, da, db;


    for (int i = 0; i < y; i++) {
        k = Math.min(a,b);
        N = k*2/100;
        na = N*alpha/100;
        nb = N*beta/100; 
    if ((N-na-nb)%2 == 0){
        Na = (N-na-nb)*1/2; 
        Nb = (N-na-nb)*1/2;
    } else {
        Na = (N-na-nb)*1/2; 
        Nb = (N-na-nb)*1/2+1;
    }
        da = a/100;
        db = b/100;
        a =  a+na+Na-da;
        b =  b+nb+Nb-db;  
}
    System.out.println("Acrobots new population: " +a); 
    System.out.println("Bouncoids new population: " +b);  
}
}  
      
