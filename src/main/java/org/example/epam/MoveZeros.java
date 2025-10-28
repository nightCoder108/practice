package org.example.epam;

public class MoveZeros {
    public static void main(String[] args) {
        int[] numericArray = {1,4,2,0,5,0,22};
        int[] resultArray = moveZero(numericArray);
        for(int num : resultArray){
            System.out.print(num +",");
        }

    }
    private static int[] moveZero(int[] numericArray){
        int[] resultArray = new int[numericArray.length];
        int index =0;
        for(int i = 0;i<numericArray.length;i++){
            if(numericArray[i] != 0 ){
                resultArray[index] = numericArray[i];
                index++;
            }
        }
        return resultArray;
    }
}