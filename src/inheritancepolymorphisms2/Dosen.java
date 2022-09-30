/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritancepolymorphisms2;

/**
 *
 * @author agus budi
 */
public class Dosen extends CivitasAkademik{
    public String NIDN;
    
    public Dosen(int ID, String nama, String password, String NIDN){
        super(ID, nama, password);
        this.NIDN = NIDN;
    }
}
