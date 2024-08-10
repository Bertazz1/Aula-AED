package libs;

public class matematica {
    
    public static int menor(int a, int b){
       if (a>b) {
        return b;
       }else{
        return a;
       }

    }

    public static void fibonacci(int n){
        int i =1, fibo=1, f0=1, f1=1;
           
        while (i<=n) {
            if (i<=2) {
                System.out.println(1);
 
 
            }else{
                fibo= f0+f1;
                f1=f0;
                f0=fibo;
                System.out.println(fibo);
            }
            i++;
        }
        }

        public static int mmc(int a, int b) {
            int maior,i;
            maior=a;
            if(b>a){
                maior=b;
            }
            for(i=maior;!(i%a==0 && i%b==0) ; i++){  
            }
            return i;
        }

    
    
}
