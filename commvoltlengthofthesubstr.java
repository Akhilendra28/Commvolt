// Given two strings a and b, return the size of substring matching in both the strings

// Input:
// String 1- ROMANINROMES
// String 2- XMANBATANINROMY
// Output- 7
// Explanation:

// ROM"ANINROM"ES
// XMANBAT"ANINROM"Y
// The string in quotes are matching and their size is 7. // 
**************************************************************************************************************************************
public class Main
{
    static int LCSsubstr(char X[],  char Y[], int m , int n )
    {
    int LCStuff[][] = new int[m+1][n+1];
    int result =0;
    for(int i=0; i<=m; i++){
        for(int j=0; j<=n; j++){
            if(i==0||j==0){
            LCStuff[i][j]=0;
            }
            else if(X[i-1] == Y[j-1])
            {
                LCStuff[i][j] = LCStuff[i-1][j-1]+1;
                result = Integer.max(result,LCStuff[i][j]);
            }
            else
            LCStuff[i][j]=0;
        }
    }
    return result;
}
	public static void main(String[] args) {
		String X = "ROMANINROMES";
		String Y = "XMANBATANINROMY";
		int m = X.length();
		int n = Y.length();
		System.out.println(LCSsubstr(X.toCharArray(), Y.toCharArray(),m,n));
	}
}
