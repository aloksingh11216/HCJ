import java.util.Scanner;
class Triangle3
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the Number: ");
		int n=sc.nextInt();
        sc.close();
		printPattern(n);
	}
	public static void printPattern(int n){
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(i+j<=n+1)
					System.out.print("* ");
			}
			System.out.println();
		}
	}	
}