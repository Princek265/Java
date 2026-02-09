class patterns{
    public static void main(String args[]){
        
        for(int i=0;i<5;i++){
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }

        System.out.println("");

         for(int i=5;i>0;i--){
            for(int j=i;j>0;j--){
                System.out.print("* ");
            }
            System.out.println("");
        }

        System.out.println("");

        for(int i=0;i<5;i++){
            for(int j=0;j<i;j++){
                if(j==0 || j==i-1)
                System.out.print("* ");
                else
                System.out.print( "  ");
            }
            System.out.println("");
        }

        System.out.println("");


        for(int i=0;i<5;i++){
            for(int j=5-i;j>0;j--){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("* ");
            }
        System.out.println("");
        }

        System.out.println("");


        for(int i=0;i<5;i++){
            for(int j=5-i;j>0;j--){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("*");
            }
            for(int l=0;l<i;l++){
                System.out.print("*");
            }
        System.out.println("");
        }

        System.out.println("");

        for(int i=0;i<5;i++){
            for(int j=5-i;j>0;j--){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("*");
            }
            for(int l=0;l<i;l++){
                System.out.print("*");
            }
        System.out.println("");
        }

        for(int i=0;i<4;i++){
            for(int j=0;j<i+2;j++){
                System.out.print(" ");
            }
            for(int k=4-i;k>0;k--){
                System.out.print("*");
            }
            for(int l=4-i;l>1;l--){
                System.out.print("*");
            }
            System.out.println("");

        }
        
    }
}