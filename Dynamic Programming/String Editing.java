import java.util.*;
class Main{
    public static int String_Editing(String a ,String b){
        int x = a.length();
        int y = b.length();
        int arr[][] = new int[x+1][y+1];
        for(int i = 0;i <= x;i++){
            for(int j = 0;j <=y;j++){
                if(i==0 && j==0){
                    arr[i][j]=0;
                }
                else if(i==0 && j>0){
                    arr[i][j] = arr[0][j-1]+1;
                }
                else if(j==0 && i>0){
                    arr[i][j] = arr[i-1][0]+1;
                }
                else{
                    if(a.charAt(i-1)==b.charAt(j-1)){
                        arr[i][j] = arr[i-1][j-1];
                    }
                    else{
                        arr[i][j]=Math.min(arr[i][j-1]+1,Math.min(arr[i-1][j]+1,arr[i-1][j-1]+2));
                    }
                }
            }
        }
        return arr[x][y];
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter x string: ");
        String x = sc.nextLine();
        System.out.println("Enter y string: ");
        String y = sc.nextLine();
        System.out.println("The Minimum edit sequence cost: " + String_Editing(x,y));
    }
}
