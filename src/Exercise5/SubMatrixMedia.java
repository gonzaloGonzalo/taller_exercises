package Exercise5;

/**
 * Created by computer on 30/03/17.
 */
public class SubMatrixMedia {

    public static void getSubMatrix(int[][] orMatrix, int size, int r1, int c1, int r2, int c2){

        int elements=0;
        int sum=0;

        for(int i=r1; i<=r2; i++){
           for(int j=c1; j<=c2; j++){
               elements = elements+orMatrix[i-1][j-1];
               sum++;
            }
        }

        float res = elements/sum;

        System.out.println(sum+" "+elements+" "+res);

    }


    public static void main(String args[]){
        int size = 4;
        int[][] originalMatrix = new int[4][4];

        originalMatrix[0][0]= 1;
        originalMatrix[0][1]= 3;
        originalMatrix[0][2]= 2;
        originalMatrix[0][3]= 4;

        originalMatrix[1][0]= 8;
        originalMatrix[1][1]= 1;
        originalMatrix[1][2]= 2;
        originalMatrix[1][3]= 9;

        originalMatrix[2][0]= 1;
        originalMatrix[2][1]= 1;
        originalMatrix[2][2]= 2;
        originalMatrix[2][3]= 2;

        originalMatrix[3][0]= 7;
        originalMatrix[3][1]= 5;
        originalMatrix[3][2]= 3;
        originalMatrix[3][3]= 6;

        getSubMatrix(originalMatrix,4,1,1,2,2);
    }


}
