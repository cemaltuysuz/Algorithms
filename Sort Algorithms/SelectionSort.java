package com.thicapps.lib;

public class SelectionSort {

    /**
     * Yazılım Koyu - Selection sort
     * @author cemal tuysuz
     * */

    public static void main(String[]args){

        int[] liste = {9,14,3,2,43,11,58,22}; // Sıralanması için karmaşık bir dizimiz var.
        System.out.println("Listenin sıralanmadan önceki hali : ");
        diziYazdir(liste); // Dizimizin bu halini logcat kısmına yazdırıyoruz.

        System.out.println("-------------------------");

        selectionSort(liste); // Selection sort algoritması ile bu listeleyi sıralayalım.
        System.out.println("Listenin sıralanmış hali : ");
        diziYazdir(liste); // Dizimizi yazdıralım.
    }
    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i; // Oluşturduğumuz index değişkenine döngünün o anki elemanını alıyoruz.
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[index]){ // En düşük elemanı arıyoruz.
                    index = j;
                }
            }
            int kucukSayı = arr[index]; // İçeride yaptığımız döngü tamamlandı , haliyle en küçük elemanı bulmuş olduk.
            arr[index] = arr[i];
            arr[i] = kucukSayı;
            // Swap işlemlerini gerçekleştirdik.
        }
    }
    public static void diziYazdir(int[] arr){
        for (Integer i : arr){
            System.out.print(i.toString() + " ");
        }
    }
}
