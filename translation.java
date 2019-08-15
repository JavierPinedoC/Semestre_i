import java.util.Scanner;

public class translation {

    public static void main(String[] args) {
        String s;
        String t,aux="";
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        t = sc.nextLine();

        for (int i=t.length()-1; i>=0;i--){
           aux=aux+t.charAt(i);
        }
       
       if (s.equals(aux)){
          System.out.println("YES");
        }
        
        
       else {
          System.out.println("NO"); 
       } 
    }  
}
