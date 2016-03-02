import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();            
        String ans="";
        if (n%2==0){
        	ans  = "четно";
        }
        else  if(n%2==1){
            ans = "Нечетно";
            }
        System.out.println(ans);
	}

}

