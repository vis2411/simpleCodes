package dsa.sortingTech;

public class BubbleSort {
    public static void printArray(int input[]){
        for (int i = 0 ; i < input.length ; i++){
            System.out.print(input[i] + " ");
        }
    }

    public static void main(String[] args) {
        int input[] = {6,4,2,7,8};

        //bubble sort
        for (int i = 0 ; i< input.length-1 ; i++){
            for (int j = 0 ; j< input.length-i-1 ; j++){
                if (input[j] < input[j+1]){
                    //swap
                    int temp = input[j];
                    input[j] = input[j+1];
                    input[j+1] = temp;
                }
            }

        }
        printArray(input);
    }
}

