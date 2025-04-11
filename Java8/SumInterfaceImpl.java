package Java8;

public class SumInterfaceImpl implements SumInterface{

    @Override
    public int sumOfNumber(int a, int b){
        System.out.println(a+b);
        return a+b;
    }
}
