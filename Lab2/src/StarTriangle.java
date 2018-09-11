public class StarTriangle {

    int width;
    String res;

    public StarTriangle(int width){
        this.width = width;
        res = "";
    }

    public String toString(){
        for(int i = 1; i <= width; i++){
            for(int j = 0; j < i; j++)
                res += "[*]";
            res += "\n";
        }
        return res;

    }

    public static void main(String [] args){
        StarTriangle star = new StarTriangle(25);
        System.out.printf(star.toString());
    }
}
