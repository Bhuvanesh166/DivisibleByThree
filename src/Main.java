import java.util.Scanner;
class DivisibleByThree{
    public static int isDivisibleByThree(int[] arr){
        int res=0;
        for(int i=arr.length-1;i>=0;i--){
            res+=(arr[i]*Math.pow(10,i+1))%3;
        }
        return  res%3==0?1:0;
    }

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter size of array:");
        int sze=scanner.nextInt();
        System.out.println("Enter array elements:");
        int arr[]=new int[sze];
        for(int i=0;i<sze;i++){
            arr[i]= scanner.nextInt();
        }
        System.out.println("IsDivisible "+isDivisibleByThree(arr));

    }
}