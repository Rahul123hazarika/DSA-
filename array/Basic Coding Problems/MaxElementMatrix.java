// find max element of a 2d array
class MaxElementMatrix{
 final static int N=4;
 final static int M=4;
 static int FindMax(int mat[][]){
    int Maxelement=Integer.MIN_VALUE;
    for(int i=0;i<N;i++){
        for(int j=0;j<M;j++){
            if(mat[i][j]>Maxelement){
                Maxelement=mat[i][j];
            }
        }
    }
    return Maxelement;
     
 }
 public static void main(String args[]){
    int mat[][]={{1,2,3,4},
                   {5,6,7,8},
                   {9,10,11,12},
                   {13,14,15,16}};
    
    System.out.print("max element of this matrix is "+ FindMax(mat));
}
}

