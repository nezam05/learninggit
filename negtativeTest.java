/**
 * negtativeTest
 */
public class negtativeTest {

    public static void main(String[] args) {
        int sum=0;
        for (int i=0;i<args.length;i++){
            int x=Integer.parseInt(args[i]);
            if (x<0){
                break;
            }
            sum=sum+x;
        }
        System.out.println(sum);

    }
}