public class lab1_2 {

    public static void main(String[] args){

        double pi = 4 * ( 1 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11 );
        double pi2 = 4 * ( 1 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11 + 1.0/13 );

        System.out.println("The approximation of pi is : " + pi);
        System.out.println("The close approximation of pi is : " + pi2);

    }
}
