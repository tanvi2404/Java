public class inverted_triangle {

    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++) {
                while(j<=n-i){
                    System.out.print(" ");
                    j++;
                }
                while(j<=n){
                    System.out.print("*");
                    j++;
                }
            }
            System.out.println("");
    }
}}
