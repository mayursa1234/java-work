// TYPES OF SORTING 
//1.BUBBLE SORT
// 2.INSERTION SORT
//3.SELECTION SORT
//4.COUNTING SORT





//**************************************** BUBBLE SORT******************************************
//ISME AISA RHATA HAI KI EK ARRAY DIYA RHATA HAI WO UNSORTED RAHTA HAI USKO SORTED KRNA HOTA HAI TO SORTED KRNE KE LIYE JO ARRAY KA 0th INDEX HAI WO EK EK KRKE SABSE COMPARE KRTE HAI WO HONE KE BAD DURSA ELEMENT 0th POSITION PE AAYA HOGA WO EK EK KRKE SABSE COMPARE HOTA HAI YE PROCESS JAB TAK CHALTA TAB TAK APNE KO SORTED ARRAY NAHI MIL PATA.......


// import java.util.*;
// public class basicSortingAlg {
//     public static void bubbleSort(int arr[]){
//         for(int turn=0; turn<arr.length-1;turn++){
//             for(int j=0; j<arr.length-1-turn;j++){

//                 if (arr[j]>arr[j+1]) {
//                     int temp=arr[j];
//                     arr[j]=arr[j+1];
//                     arr[j+1]=temp;
//                 }
//             }
//         }
//     }

// public static void printArr(int arr[]){
//     for(int i=0;i<arr.length;i++){
//         System.out.print(arr[i]+" ");
//     }
//     System.out.println();
// }

// public static void main(String[] args) {
//     int arr[]={5,4,1,3,2};
//     bubbleSort(arr);
//     printArr(arr);
//  }
// }




// *************************************SELECTION SORT********************************************************

//ISME ARRAY ME NO HAI USME SE SMALLEST NO PICK KRNA HAI AUR USKO BEGINNING ME PUT KRNA HAI


// import java.util.*;

public class basicSortingAlg{
    public static void selectionSort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int minPos=i;
            for(int j=i+1; j<arr.length-1; j++){
                if (arr[minPos] > arr[j]) {
                    minPos=j;   
                }
            }
            int temp=arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
         }
        }
        public static void printArr(int arr[]){
            for(int i=0; i<arr.length; i++){
                System.out.print(arr[i]+ " ");
        }
        System.out.println();

    }
        public static void main(String args[]){
            int arr[]={5,4,1,2,3};
            selectionSort(arr);
            printArr(arr);
       
        }
}