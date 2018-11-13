package task5;

public class Test {
    public static void main(String args[]){


        int a[] = {0, 8, -2, 20};

        MinMax m = new MinMax();
        MinMax.Pare_minmax maxmin1;
        maxmin1 = MinMax.minmax(a);
        System.out.println("Max value:" + maxmin1.max);
        System.out.println("Min value:" + maxmin1.min);
    }

}
