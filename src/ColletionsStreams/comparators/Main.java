package ColletionsStreams.comparators;

public class Main {
    public static void main(String[] args) {
        System.out.println(compara(8,13));
    }
    public static int compara(int x, int y){
        return (x<y)? -1 : ((x==y) ? 0 : 1) ;
    }
}
