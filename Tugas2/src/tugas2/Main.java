/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;

import java.util.Scanner;
import tugas2.Lingkaran;
import tugas2.Persegipanjang;
import tugas2.Balok;
import tugas2.Kerucut;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int pilih;
        int panjang, lebar, tinggi;
        int jari;
        
        do 
        {
            System.out.println("===INPUT===");
            System.out.println("1. Balok");
            System.out.println("2. Kerucut");
            System.out.println("3. Exit");
            System.out.print("Pilih : "); 
            pilih = input.nextInt();
            if (pilih==1) 
            {
                System.out.print("Panjang = ");
                panjang = input.nextInt();
                System.out.print("Lebar = ");
                lebar = input.nextInt();
                System.out.print("Tinggi = ");
                tinggi = input.nextInt();
                
                Persegipanjang persegipanjang = new Persegipanjang(panjang,lebar);
                Balok balok = new Balok(panjang,lebar,tinggi);
                System.out.println("__OUTPUT__");
                System.out.println("Luas Persegi = " + persegipanjang.Luas());
                System.out.println("Keliling Persegi = " + persegipanjang.Keliling());
                System.out.println("Volume Balok = " + Balok.Volume());
                System.out.println("Luas Permukaan Balok = " + Balok.Luaspermukaan()); 
            }
            else if (pilih==2)
            {
                System.out.print("Jari-jari = ");
                jari = input.nextInt();
                System.out.print("tinggi = ");
                tinggi = input.nextInt();
                
                Kerucut kerucut = new Kerucut(tinggi,jari);
                Lingkaran lingkaran = new Lingkaran(jari);
                System.out.println("__OUTPUT__");
                System.out.println("Luas Lingkaran = " + Lingkaran.Luas());
                System.out.println("Keliling Lingkaran = " + Lingkaran.Keliling());
                System.out.println("Volume Kerucut = " + Kerucut.Volume());
                System.out.println("Luas Permukaan Kerucut = " + Kerucut.Luaspermukaan());
            }
        }while (pilih!=3);
    }
}