package com.cemaltuysuz.bubble;

/**
 * @author cemaltuysuz
 * @date 29.09.2021
 * */

public class Bubble {

    public static void main(String[] args) {


        int [] unSortedArray = {1,24,53,63,12,5,2}; // sıralanmamış bir dizi oluşturuyorum

        System.out.println("Sıralanmamış hali : \n");
        printTheArray(unSortedArray); // dizimi yazdırıyorum

        bubbleSort(unSortedArray); // Diziyi sıralıyorum
        System.out.println("Sıralanmış hali : \n");
        printTheArray(unSortedArray); // dizimi yazdırıyorum



    }

    // Sıralama işlemini yapacağımız bubble sort methodumuz
    public static void bubbleSort(int arr[]){
        // gelen dizinin boyutunu alıyoruz
        int n = arr.length;
        // bir döngü oluşturuyoruz. Bu döngü dizi boyutu kadar dönecek
        for (int i = 0; i < n-1; i++)
            // Döngümüzün içerisinde bir döngü daha oluşturuyoruz. bunun sebebi
            // elemanlar arasında karşılaştırma yapmak
            // Dış döngümüz tarama sayısını takip ederken iç döngümüz karşılaştırmaları ve
            // swap işlemlerini yürütür.
            for (int j = 0; j < n-i-1; j++)
                // büyük ise
                if (arr[j] > arr[j+1])
                {
                    // Swap işlemi -> arr[j+1] ve arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }

    public static void printTheArray(int arr[]) {
        for (int i : arr){
            System.out.print(i + " ");
        }
    }

}
