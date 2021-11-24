import java.util.Scanner;
public class first
{
    int length;
    int breadth;
    int height;
    first(int l, int b, int h){
        length = l;
        breadth = b;
        height = h;
       }

        public int volume(){
        return length * breadth * height;
    }
}
class firstProject{
    public static void main(String[] args){
     int val1,val2,val3;
      Scanner myObj = new Scanner(System.in);
        System.out.print("Enter the length: ");
        val1 =  myObj.nextInt();
        System.out.print("Enter the breadth: ");
        val2 = myObj.nextInt();
        System.out.print("Enter the height: ");
        val3 = myObj.nextInt();
        //first value = new first(val1,val2,val3 );
        first value = new first(val1,val2,val3);

        //System.out.print("The length is: " + value.length);

       System.out.print("The volume is: " + value.volume());
    }

}
