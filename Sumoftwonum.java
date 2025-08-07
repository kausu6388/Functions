public class Sumoftwonum {
    public static void main(String[] args) {
        Sumoftwonum();
        
    }
    static void Sumoftwonum(){
        Scanner in = new Scanner(System.in);
        System.out.print("enter first number");
        int num1 = in.nextInt();
        System.out.print("enter second number");
        int num2 = in.nextInt();
        int sum = num1  + num2 ;
        System.out.println(sum);
    }
}
