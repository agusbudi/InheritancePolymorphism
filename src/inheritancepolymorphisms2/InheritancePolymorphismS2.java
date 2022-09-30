/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inheritancepolymorphisms2;

import java.math.MathContext;

/**
 *
 * @author agus budi
 */
public class InheritancePolymorphismS2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dosen dosenIF1 = new Dosen(3550, "Agus", "1234", "8890");
        Mahasiswa mhs1 = new Mahasiswa(321, "Handy", "QWERTy", "S2");
        
        //System.out.println(mhs1.cetakInfo());
        
        //polymorphism
        CivitasAkademik ca1 = new CivitasAkademik(11, "Budi", "AZERTY");
        ca1 = new Dosen(11, "Budi", "qq", "888");
        ca1 = new Mahasiswa(12,"Mhs Budi", "qq", "S1");
        ca1 = new Staff(12,"Mhs Budi", "qq", "keuangan");

        //kelemahan polymorphism
        //error : ca1.ubahJabatan("administrasi");
        Staff ca2 = new Staff(13,"Raharjo", "qa", "keuangan");
        ca2.ubahJabatan("manajer");
        
        //overriding di polymorphism
        System.out.println(mhs1.cetakInfo(18));
        System.out.println(ca1.cetakInfo());
        
        
        //possible but not recommended
        Object var1 = new String();
        var1 = new Staff(12,"Mhs Budi", "qq", "S1");
        var1 = new MathContext(0);
    }
    
}
