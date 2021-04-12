/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;
import tugas2.Lingkaran;
/**
 *
 * @author lenovo
 */
public class Kerucut extends Lingkaran implements MenghitungRuang 
{
    int tinggi;
    
    public Kerucut(int tinggi, int jari)
    {
        super(jari);
        this.tinggi = tinggi;
    }
    
    @Override   
    public double Volume()
    {
        return Math.PI*jari*jari*tinggi/3;
    }
    
    @Override
    public double Luaspermukaan()
    {
        float s;
        s = (float) Math.sqrt(jari*jari+tinggi*tinggi);
        return Math.PI*jari*(jari+s);
    }
}
