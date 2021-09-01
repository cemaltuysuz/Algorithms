package com.cemaltuysuz.lib;

import java.util.*;

public class QuickSort {

    /**
     * Yazilim Koyu - Quick sort
     * @author cemal tuysuz
     * */

    public static void main(String[]args){

        // Sıralanmamış dizimiz :
        int intArray[] = {20,14,4,67,0,19,41,44};
        int n = intArray.length; // dizi boyutumuz
        // Listemizin sıralanmamış halini önce yazdıralım.
        System.out.println("Original Array: " + Arrays.toString(intArray));
        // Oluşturduğumuz Quick Sort methodu ile sıralama yapıyoruz
        quick_sort(intArray, 0, n-1);
        // Artık Sıralanmış olan listemizi yazdırıyoruz
        System.out.println("\nSorted Array: " + Arrays.toString(intArray));


    }

    // Kendi içerisinde tekrar etmeli olan bu methodumuz orta değeri bulmak için
    // partition methodunu çağırıyor.
    static void quick_sort(int intArray[], int low, int high) {
        if (low < high) {
            int pi = partition(intArray, low, high);

            // Algoritma ile ayrıdğımız bölümleri quick sort ile sıralıyoruz.
            quick_sort(intArray, low, pi-1);
            quick_sort(intArray, pi+1, high);
        }
    }

    /**
     * Aşağıdaki bu orta nokta bulmaya yarayan fonksiyonun en büyük özelliği tek bir dizi kullanarak
     * bu dizi içerisindeki indisi döndürmeye çalışmasıdır. Bu yüzden hangi parça üzerinde orta nokta
     * aradığını alt ve üst limitleri parametre alarak bulur. Bu parametreler koddaki p ve r değişkenleridir.
     *
     * */
    static int partition(int intArray[], int low, int high) {
        int pi = intArray[high];
        int i = (low-1);
        for (int j=low; j<high; j++) {
            // O anki elemanın pivottan daha küçük veya eşit olmadığını kontrol edelim.
            if (intArray[j] <= pi) {
                i++;
                // intArray[i] arasında takas işlemi intArray[j]
                int temp = intArray[i];
                intArray[i] = intArray[j];
                intArray[j] = temp;
            }
        }

        // intArray[i+1] ve intArray[high] (veya pivot) öğelerinin yer değiştirmesi.
        int temp = intArray[i+1];
        intArray[i+1] = intArray[high];
        intArray[high] = temp;

        return i+1;
    }
}