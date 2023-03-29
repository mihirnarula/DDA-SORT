package dda_sorting;

public class DDA_Sorting {

    void sorting(int a[][]){
        int temp = 0;
        int i=0, j=0, p=0, q=0;
        for (int l = 0; l<24; l++)
        {
            for (i = 0; i < 5; i++){
            for (j = 0; j < 5; j++){
                if (j!=4)
                {
                if(a[i][j] > a[i][j+1]){
                    temp = a[i][j];
                    a[i][j] = a[i][j+1];
                    a[i][j+1] = temp; 
                }
                }
                else
                {
                if (i<4)
                if(a[i][j] > a[i+1][0]) {
                   
                    temp = a[i][j];
                    a[i][j] = a[i+1][0];
                    a[i+1][0] = temp; 
                }
                }
            }
        }
        }
            for (p = 0; p < 5; p++){
                for(q = 0; q < 5; q++){
                System.out.print(a[p][q]+" ");
            }
            System.out.println("");

                }
        
    }
public static void main(String[] args) {
int arr[][] = {
               {5,4,3,2,1},
               {9,7,8,6,10},
               {11,13,15,14,13},
               {19,18,17,16,20},
               {21,23,22,25,24}};
              
    DDA_Sorting ob = new DDA_Sorting();
    ob.sorting(arr);
}
}