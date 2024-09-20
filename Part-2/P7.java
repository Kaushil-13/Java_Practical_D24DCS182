import java.util.*;

class P7 {
    public static void front_times(String str , int n){
        
        if(str.length()>=3){
            for(int i=0 ; i<n ; i++){
                System.out.print(str.substring(0, 3));
            }
        }
        
        else{
            for(int i=0 ; i<n ; i++){
                System.out.print(str.substring(0, str.length()));
            }
        }
    }
    public static void main(String arg[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = s.nextLine();
        System.out.print("Enter Number of repetation : ");
        int n = s.nextInt();
        front_times(str, n);
        s.close();
    }
}
