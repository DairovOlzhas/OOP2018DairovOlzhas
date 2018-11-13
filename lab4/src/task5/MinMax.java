package task5;

public class MinMax {
    static class Pare_minmax{
        int max, min;

    }

    static Pare_minmax minmax(int values[]){
        Pare_minmax pare = new Pare_minmax();
        for(int i = 0; i < values.length; i++){
            if(i == 0){
                pare.max = values[i];
                pare.min = values[i];
            }
            if(values[i] > pare.max)
                pare.max = values[i];
            if(values[i] < pare.min)
                pare.min = values[i];
        }
        return pare;
    }
}
