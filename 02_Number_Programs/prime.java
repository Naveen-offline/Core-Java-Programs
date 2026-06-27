class prime{
	public static void main(String[] args)
{
	int n=7,c=0;
	for( int i = 1;i<=n;i++){
		if(n%i==0)
			c=c+1;
	}
	System.out.println((c==2)?"Its prime":"not prime");
}
}