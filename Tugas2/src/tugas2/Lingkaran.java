/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;

/**
 *
 * @author lenovo
 */
public class Lingkaran implements MenghitungBidang
{
    public int jari;
        public Lingkaran(int jari)
        {
            this.jari = jari;
        }
    
        @Override
        public double Luas()
        {
            return Math.PI*jari*jari;
        }
    
        @Override
        public double Keliling()
        {
            return Math.PI*2*jari;
        }
    }
   
