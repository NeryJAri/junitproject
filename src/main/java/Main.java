import java.util.List;

public class Main {

    public static void main(String [] args){
        double salary = 1000;
        System.out.println(MoneyUtil.format(salary));

        FizzBuzz fizzBuzz = new FizzBuzz();
        List<String> result = fizzBuzz.getNumbers();
        for (String number : result) {
            System.out.println(number);
        }

    }
}
