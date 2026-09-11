
public class Patterns {

    // ------------------------------------------------------------------------------
    // pattern 1 (solid square pattern)
    // Output for pattern1(4):
    // * * * *
    // * * * *
    // * * * *
    // * * * *
    public static void pattern1(int n ){

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // ------------------------------------------------------------------------------
    //pattern 2 ( right angled triangle pattern)
    // Output for pattern2(5):
    // *
    // * *
    // * * *
    // * * * *
    public static void pattern2 (int n) {

        for (int i = 1; i < n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    // ------------------------------------------------------------------------------
    // Output for pattern3(4):
    // 1
    // 1 2
    // 1 2 3
    // 1 2 3 4
    public static void pattern3 (int n){

        for(int i = 1; i <= n ; i++ ){
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // ------------------------------------------------------------------------------
    // little bit new trick applied of j variable 
    // Output for pattern4(4):
    // 1
    // 2 2
    // 3 3 3
    // 4 4 4 4
     public static void pattern4 (int n){

        for(int i = 1; i <= n; i++ ){
            for(int j = 1; j <= i ; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    // ------------------------------------------------------------------------------
    // Pattern 5 (right angled triangle pattern with numbers)
    // Output for pattern5(5):
    // 1 2 3 4 5
    // 6 7 8 9
    // 10 11 12
    // 13 14
    // 15
    public static void pattern5(int n) {
        int number = 1;

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }
    // ------------------------------------------------------------------------------
    // Output for pattern6(4):
    // 0 1 2 3
    // 0 1 2 3
    // 0 1 2 3
    // 0 1 2 3
    public static void pattern6 (int n ){

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){

                System.out.print(j + " " );
            }
            System.out.println();
        }
    }
    // ------------------------------------------------------------------------------
    // Output for pattern7(4):
    // A B C D
    // A B C D
    // A B C D
    // A B C D
    public static void pattern7 (int n) {
        for(int i = 0; i < n; i++){
            char ch = 'A';
            for(int j = 0; j < n; j++){
                System.out.print(ch +" ");
                ch = (char) (ch + 1);
            }
            System.out.println();
        }
    }
    // ------------------------------------------------------------------------------
    // Output for pattern8(3):
    // 1 2 3
    // 4 5 6
    // 7 8 9
    public static void pattern8 (int n){
        int num = 1 ;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }

    // ------------------------------------------------------------------------------
    // Output for pattern9(3):
    // A B C
    // D E F
    // G H I
    public static void pattern9(int n){
        char  ch = 'A';
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(ch + " ");
                ch = (char) (ch + 1);
            }
            System.out.println();
        }
    }
    // ------------------------------------------------------------------------------
    // Output for pattern10(4):
    // *
    // * *
    // * * *
    // * * * *
    public static void pattern10(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < i + 1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // ------------------------------------------------------------------------------
    // Output for pattern11(4):
    // 1
    // 2 2
    // 3 3 3
    // 4 4 4 4
    public static void pattern11(int n ){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < i + 1; j++){
                System.out.print(i+1 + " ");
            }
            System.out.println();
        }
    }
    // ------------------------------------------------------------------------------
    // Output for pattern12(4):
    // A
    // B B
    // C C C
    // D D D D
    public static void pattern12(int n){
        char ch = 'A';
        for(int i = 0; i < n; i++){
            for(int j = 0; j < i + 1; j++){
                System.out.print(ch + " ");
            }
            System.out.println();
             ch = (char) (ch + 1); 

        }
    }
    // ------------------------------------------------------------------------------
    // Output for pattern13(4):
    // 1
    // 1 2
    // 1 2 3
    // 1 2 3 4
    public static void pattern13(int n){
        for(int i = 0; i < n ; i++){
            for(int j = 1; j <= i + 1; j++ ){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    // ------------------------------------------------------------------------------
    // Output for pattern14(4):
    // 1
    // 2 1
    // 3 2 1
    // 4 3 2 1
    public static void pattern14(int n ){
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j > 0; j--){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    // ------------------------------------------------------------------------------
    // Output for pattern15(4):
    // 1
    // 2 3
    // 4 5 6
    // 7 8 9 10
    public static void pattern15(int n){
        int num = 1; 
        for(int i = 0; i < n; i++){
            for(int j = 0; j < i + 1; j++){
                System.out.print(num + " ");
                 num++;
            }
            System.out.println();
        }
    }
    // ------------------------------------------------------------------------------
    // Output for pattern16(4):
    // A
    // B C
    // D E F
    // G H I J
    public static void pattern16(int n){
        char ch = 'A';
        for(int i = 0; i < n; i++){
            for(int j= 0; j < i +1; j++){
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }

    // ------------------------------------------------------------------------------
    // Output for pattern17(5):
    // 1
    // 1 2
    // 1 2 3
    // 1 2 3 4
     void pattern17(int n){
        for(int i = 1; i < n ; i++){
            for(int j = 1; j < i + 1; j++ ){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        
    }

    // ------------------------------------------------------------------------------
    // Output for pattern18(4):
    // 1
    // 2 2
    // 3 3 3
    // 4 4 4 4
    public static void pattern18(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 0; j < i ; j++){
                System.out.print(i + " ");

            }
            System.out.println();
        }
    }

    // ------------------------------------------------------------------------------
    // Output for pattern19(5):
    // * * * * *
    // * * * *
    // * * *
    // * *
    // *
    public static void pattern19(int n ){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n - i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // ------------------------------------------------------------------------------
    // Output for pattern20(5):
    // 1 2 3 4 5
    // 1 2 3 4
    // 1 2 3
    // 1 2
    // 1
    public static void pattern20(int n ){
        for(int i = 0; i < n; i++){
            for(int j = 1; j <= n-i ; j++){
                System.out.print(j + " ");

            }
            System.out.println();
        }
    }

    // ------------------------------------------------------------------------------
    // Output for pattern21(4):
    // A B C D
    // A B C
    // A B
    // A
    public static void pattern21(int n){
        for(int i = 0; i < n; i++){
            char ch = 'A';
            for(int j = 0; j < n - i; j++){
                System.out.print(ch + " ");
                ch = (char) (ch + 1);
            }
            System.out.println();
        }
    }

    // ------------------------------------------------------------------------------
    // Output for pattern22(4):
    // 1 2 3 4
    // 5 6 7
    // 8 9
    // 10
    public static void pattern22(int n){
        int num = 1;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n - i; j++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }

    // ------------------------------------------------------------------------------
    // Output for pattern23(5):
    // 1 1 1 1 1
    // 2 2 2 2
    // 3 3 3
    // 4 4
    // 5
    public static void pattern23(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 0; j <= n - i; j++){
                System.out.print(i + " ");

            }
            System.out.println();
        }
    }

    // ------------------------------------------------------------------------------
    // Output for pattern24(4):
    //    *
    //   ***
    //  *****
    // *******
    public static void pattern24(int n){
        for(int i = 0; i < n ; i++){
            for(int j = 0; j < n - i - 1; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < 2 * i +1; j++ ){
                System.out.print("*");
            }
            for(int j = 0 ; j < n - i - 1; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    // ------------------------------------------------------------------------------
    // Output for pattern25(4):
    // *******
    //  *****
    //   ***
    //    *
    public static void pattern25(int n ){
        for(int i = 0; i < n; i++){
            
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < 2*n - (2*i + 1); j++){
                System.out.print("*");
            }
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    // ------------------------------------------------------------------------------
    // Output for pattern26(3):
    // 0 1 2 3
    // 0 1 2 3
    // 0 1 2 3
    // 0 1 2 3
    public static void pattern26(int n){
        for(int i = 0; i <=
             n ; i++){
            for(int j = 0; j <= n; j++){
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }
  


    public static void main(String[] args) {
      
        //Patterns.pattern1(8);
        //Patterns.pattern2(5);
        //Patterns.pattern3(5);
        //Patterns.pattern4(5);
        // Patterns.pattern5(5);
        // Patterns.pattern2(6);
        // Patterns.pattern7(9);
        // Patterns.pattern8(3);
        // Patterns.pattern9(4);
        // Patterns.pattern10(5);
        // Patterns.pattern11(5);
        // Patterns.pattern12(5);
        // Patterns.pattern13(5);
        // Patterns.pattern14(4);
        // Patterns.pattern15(5);
        // Patterns obj1 = new Patterns();
        // obj1.pattern17(5);
        // Patterns.pattern18(4);
        // Patterns.pattern14(4);
        // Patterns.pattern19(5);
        // Patterns.pattern20(5);
        // Patterns.pattern23(5);  
        // Patterns.pattern26(3);




    }
}
