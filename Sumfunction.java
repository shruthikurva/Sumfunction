public class Sumfunction {
    public static int addNumbers(int a,int b) {
        return a+b;    
    }
    public static void main(String[] args) {
        int num1=1578;
        int num2=2587;
        int sum= addNumbers(num1,num2);
        System.out.println("The sum of "+num1+"and"+num2+"is:"+sum);
    }
}
