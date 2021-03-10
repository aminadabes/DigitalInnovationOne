package desenvolvimentoBasico;

public class TrabalhandoComArrays {
    public static void main(String[] args) {

        /*int [] meuArray = {12,32,43,6,7,10,15};
        for (int i = 0; i < meuArray.length; i++) {
            meuArray[3]=16;
            System.out.println(meuArray[i]);
        }*/


        int [][] meuArrayMulti = {{12,32,43,6},{7,10,15}};
        for (int i = 0; i < meuArrayMulti.length; i++) {
            System.out.println("Primeiro array indice " +i);
            for (int j = 0; j < meuArrayMulti[i].length; j++) {
                System.out.println("Segundo array indice " +j);
                System.out.println(meuArrayMulti[i][j]);
            }
        }

    }
}
