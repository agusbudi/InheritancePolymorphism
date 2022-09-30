/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritancepolymorphisms2;

/**
 *
 * @author agus budi
 */
public class CivitasAkademik {
    public int ID;
    public String nama;
    private String password;
    
    public CivitasAkademik(int IDx, String namax, String passwordx){
        this.ID = IDx;
        this.nama = namax;
        this.setPassword(passwordx);
    }
    
    public void setPassword(String password){
        this.password = password + "ok@";
    }
    
    public boolean checkPassword(String typedPassword){
        return false;
    }
    
    public String cetakInfo(){
        return ("ID: " + this.ID + "\nnama: " + this.nama);
    }
}
