import java.util.*;
class Sort{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char a[] = str.toCharArray();
		int n = a.length;
		char temp;
		for (int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++){
				if(a[i]>a[j]){
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}
			}
			
		}
		System.out.print(a);
	}
}