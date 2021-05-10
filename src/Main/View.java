/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import Ruang.Balok;
import bidang.PersegiPanjang;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
/**
 *
 * @author lenovo
 */

public class View extends JFrame implements ActionListener{
    JLabel kalkulator = new JLabel("KALKULATOR BALOK");
    JLabel Panjang = new JLabel("Panjang");
    final JTextField fPanjang = new JTextField(11);
    JLabel Lebar = new JLabel("Lebar");
    final JTextField fLebar = new JTextField(11);
    JLabel Tinggi = new JLabel("Tinggi");
    final JTextField fTinggi = new JTextField(11);
    JLabel Hasil = new JLabel("Hasil : ");
    JLabel Luas = new JLabel(); 
    JLabel Keliling = new JLabel();
    JLabel Volume = new JLabel();
    JLabel LuasPermukaan = new JLabel(); 
    JButton bHitung = new JButton("Hitung");
    JButton bReset = new JButton("Reset");
    
    
    View(){
        setTitle("Tugas Pertemuan-5");
        setSize(400,500);
        setLayout(null);
      
        add(kalkulator);
        add(Panjang);
        add(fPanjang);
        add(Lebar);
        add(fLebar);
        add(Tinggi);
        add(fTinggi);
        add(Hasil);
        add(bHitung);
        add(bReset);
        
        kalkulator.setBounds(135,15,200,20);
        Panjang.setBounds(10,55,200,20);
        fPanjang.setBounds(90, 55, 200, 20);
        Lebar.setBounds(10,85,150,20);
        fLebar.setBounds(90, 85, 200, 20);
        Tinggi.setBounds(10,115,150,20);
        fTinggi.setBounds(90, 115, 200, 20);
        Hasil.setBounds(50, 155, 150, 20);
        bHitung.setBounds(90, 315, 100, 30);
        bReset.setBounds(195, 315, 100, 30);
        bHitung.addActionListener(this);
        bReset.addActionListener(this);
        
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);  
        setLocationRelativeTo(null);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == bHitung) {
            
            try{
                double panjang, lebar, tinggi;
               
                panjang = Double.parseDouble(fPanjang.getText());
                lebar = Double.parseDouble(fLebar.getText());
                tinggi = Double.parseDouble(fTinggi.getText());
                
                PersegiPanjang persegipanjang = new PersegiPanjang(panjang,lebar);
                Balok balok = new Balok(panjang,lebar,tinggi);
                          
                LuasPermukaan.setText("Luas Persegi                   : " + Double.toString(persegipanjang.Luas()));
                add(LuasPermukaan);
                LuasPermukaan.setBounds(50, 175, 200, 20);
                
                Keliling.setText("Keliling Persegi              : " + Double.toString(persegipanjang.Keliling()));
                add(Keliling);
                Keliling.setBounds(50, 195, 200, 20);
                
                Volume.setText("Volume Balok                  : " + Double.toString(balok.Volume()));
                add(Volume);
                Volume.setBounds(50, 215, 200, 20);
                
                Luas.setText("Luas Permukaan Balok  : " + Double.toString(balok.Luas()));
                add(LuasPermukaan);
                LuasPermukaan.setBounds(50, 235, 200, 20);
                
            }
            catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, ""+e.getMessage());
            }
            
        }
        
        if (ae.getSource() == bReset) {
            fPanjang.setText(null);
            fLebar.setText(null);
            fTinggi.setText(null);
            Luas.setText(null);
            Keliling.setText(null);
            Volume.setText(null);
            LuasPermukaan.setText(null);
        }
    }
}
