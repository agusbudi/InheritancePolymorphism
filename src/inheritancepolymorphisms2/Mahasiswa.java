/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritancepolymorphisms2;

/**
 *
 * @author agus budi
 */
public class Mahasiswa extends CivitasAkademik{
    public String jenjang;
    
    public Mahasiswa(int ID, String nama, String password, String jenjang){
        super(ID, nama, password);
        this.jenjang = jenjang;
    }   
    
    //overloading pada constructor
    public Mahasiswa(int ID, String nama, String password){
        super(ID, nama, password);
    } 
    
    //overloading method dari parent class
    public String cetakInfo(int usia){
        return ("ID: " + this.ID + "\nnama: " + this.nama + "\nusia: " + usia);
    }    
}
