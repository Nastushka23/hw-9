import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int []arr=generateRandomArray();
        System.out.println(Arrays.toString(arr));

        task1(arr);
        task2(arr);
        task3(arr);
        task4();

    }
    public static int [] generateRandomArray(){
        java.util.Random random = new java.util.Random();
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++){
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void task1(int[]arr){
        System.out.println("Задача 1");
        int paymentAmount=0;
        for (int i=0; i< arr.length; i++){
            paymentAmount+=arr[i];
        }
        System.out.println("Сумма трат за месяц составила "+paymentAmount);
    }
    public static void task2(int[]arr){
        System.out.println("Задача 2");
        int maxSum=arr[0];
        for (int i=0; i< arr.length; i++){
           if(arr[i]>maxSum){
               maxSum=arr[i];
           }
        }
        System.out.println("Максимальная сумма трат за день составила "+maxSum);
        int minSum=arr[0];
        for (int i=0;i<arr.length; i++){
            if (arr[i]<minSum){
                minSum=arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила "+minSum);

    }
    public static void task3(int[]arr){
        System.out.println("Задача 3");

        double paymentAmount=0;
        for (int i=0; i< arr.length; i++){
            paymentAmount+=arr[i];
        }
        System.out.println("Средняя сумма трат за месяц составила " +paymentAmount/arr.length);

    }
    public static void task4(){
        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i=reverseFullName.length-1;i>=0; i--){
            System.out.print(reverseFullName[i]);
        }



    }

}