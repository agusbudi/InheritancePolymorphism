/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritancepolymorphisms2;

/**
 *
 * @author agus budi
 */
public class Staff extends CivitasAkademik{
    public String jabatan;
    
    public Staff(int ID, String nama, String password, String jabatan){
        super(ID, nama, password);
        this.jabatan = jabatan;
    }
    
    public void ubahJabatan(String jabatanBaru){
        this.jabatan = jabatanBaru;
    }
    
    @Override
    public String cetakInfo(){
        return ("ID: " + this.ID + "\nnama: " + this.nama + "\njabatan: " + this.jabatan);
    }    
    
}
