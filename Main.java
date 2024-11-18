
public class Main
{
    static int sum(int ...arr){
        int result = 0;
        for(int a : arr){
            result += a;
        }
        return result;
    }
	public static void main(String[] args) {
		System.out.println("the sum of array is : " + sum(1, 2));
		System.out.println("the sum of array is : " + sum(12, 23, 77));
    System.out.println("the sum of array is : " + sum(12, 23, 7, 67));
    System.out.println("the sum of array is : " + sum(12, 23, 88, 97));
	}
