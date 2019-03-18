package FirstProjectGitlab;

public class drawingInConsole {

    public static void pointAiB (int m, int n){
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    public static void pointCiD(int triangleWidth){

        for (int i = 0; i <= triangleWidth - 1 ; i++) {
            for (int j = 0; j <= triangleWidth - 1 ; j++) {
                if (i == 0 || i == triangleWidth - 1){
                    System.out.print("# ");
                }else if (i == j || i == triangleWidth - 1 - j){
                    System.out.print("# ");
                }else {
                    System.out.print("  ");
                }

            }
            System.out.println();

        }
    }


        public static void pointEiF(){


        }




    public static void main(String[] args) {
        //pointAiB(8, 4);
        pointCiD(5);
    }


}
