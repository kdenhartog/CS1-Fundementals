public class NumSum {
    public static void main(String [] args) {
        int num = 2;
        int sum = 0;
        while (num <= 20){
            if(num % 2 == 0){
            sum += num;
            System.out.println(num);
            num ++;
        }else{
            num ++;
        }    
      }
        System.out.println("The sum is: " + sum);
    }
}