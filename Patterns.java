// import java.util.*/


public class Patterns {
    public static void main(String[] args) {
        

        int m = 4;
        int n = 5;
        
        System.out.println(" \n1. Solid Reactangle\n ");

        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                System.out.print(" *");
            }
            System.out.println();
        }
        System.out.println(" 2. \nHollow Reactangle\n ");
    //  2nd patterns

     
        for (int i=0; i<=m; i++){
            for (int j=0; j<=n; j++){
                if(i==0 || j==0 || i==m || j==n){
                System.out.print(" *");
                }
                else {
                    System.out.print("  ");
                }
            }   
            System.out.println();
        }
        
        System.out.println(" \n3. Half Pyramid\n ");


        for (int i=0; i<=m; i++){
            for (int j=0; j<=i; j++){
                System.out.print(" *");
            }
            System.out.println();
        }


         
        System.out.println(" \n4. Inverted Half Pyramid\n ");


        for (int i=m; i>=0; i--){
            for (int j=0; j<=i; j++){
                System.out.print(" *");
            }
            System.out.println();
        }

         
        System.out.println(" \n5. Inverted Half Pyramid\nRotated by 180 deg\n  ");


        for (int i=m; i>=0; i--){
            for (int j=0; j<i; j++){
                System.out.print("  ");
            }
            for (int j=0; j<=m-i; j++){

                System.out.print(" *");
            }
            System.out.println();
        }
        
        System.out.println("\n6. Half Pyramid With Numbers\n ");

        for (int i=0; i<=m+1; i++){
            for (int j=0; j<=i; j++){
                System.out.print(" "+i);
            }
            System.out.println();
        }

          
        System.out.println(" \n7. Inverted Half Pyramid With Numbers\n ");


        for (int i=m+1; i>=0; i--){
            for (int j=0; j<=i; j++){
                System.out.print(" "+i);
            }
            System.out.println();
        }

        System.out.println(" \n8. Floyd' S Triangle\n ");

        int number = 1;

        for (int i=0; i<=m; i++){
            for (int j=0; j<=i; j++){
                System.out.print(" "+number);
                number++;
            }
            System.out.println();
        }
 

        System.out.println(" \n9. 0 - 1 Triangle\n ");

        for (int i=0; i<=m; i++){
            for (int j=0; j<=i; j++){
                int sum = i + j;
                if (sum % 2 == 0){
                    System.out.print(" 1");
                }
                else{
                    System.out.print(" 0");
                }
            }
            System.out.println();
        }


        System.out.println(" \n10. Solid Rahmobus\n ");

        for (int i=0; i<=m; i++){
            for (int j=0; j<=m-i; j++){
               
                    System.out.print(" ");
                }
                for(int j=0; j<=m; j++){
                    System.out.print("*");
                }
             
            System.out.println();
        }


        System.out.println(" \n11. Butterfly Pattern\n "); 

        for (int i=0; i<=n; i++){
            for(int j=0; j<=i; j++){

                System.out.print("*");
            }
            int spaces = 2*(n-i);
            for(int j=0; j<=spaces; j++){
                System.out.print(" ");
            }

            for (int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }   
         
        
        for (int i=n; i>=0; i--){
            for(int j=0; j<=i; j++){

                System.out.print("*");
            }
            int spaces = 2*(n-i);
            for(int j=0; j<=spaces; j++){
                System.out.print(" ");
            }

            for (int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }   
           
        System.out.println(" \n12. Numbers Pattern\n ");

        for (int i=0; i<=m+1; i++){
            for (int j=0; j<n-i; j++){
                 System.out.print(" ");
            }
            for (int j=0; j<=i; j++){

            System.out.print(i+ "  ");
            }

            System.out.println();
        }

        System.out.println(" \n13. Palindromic Pattern\n ");

        for(int i=0; i<=n; i++) {
            //spaces
            for(int j=0; j<=n-i; j++) {
                System.out.print(" ");
            }
 
 
            //first part
            for(int j=i; j>=0; j--) {
                System.out.print(j);
            }
 
 
            //second part
            for(int j=1; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
 
        System.out.println(" \n14. Diamond Pattern\n ");

        

       //upper part
       for(int i=1; i<=n; i++) {
        //spaces
        for(int j=1; j<=n-i; j++) {
            System.out.print(" ");
        }
        for(int j=1; j<=2*i-1; j++) {
            System.out.print("*");
        }
        System.out.println();
    }


    //lower part
    for(int i=n; i>=1; i--) {
        //spaces
        for(int j=1; j<=n-i; j++) {
            System.out.print(" ");
        }
        for(int j=1; j<=2*i-1; j++) {
            System.out.print("*");
        }
        System.out.println();
    }


    }
}

