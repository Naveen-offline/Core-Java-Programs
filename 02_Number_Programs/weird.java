import java.util.Scanner;

class weird{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a number: ");
		int a = sc.nextInt();
		if(a%2==0){
			if (a>=6 && a<=20){
				System.out.println("weird");
			}else
				System.out.println("Not weird");
}
else
	System.out.println("weird");
}
}