/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanmvc.model;

import javax.swing.JOptionPane;
import latihanmvc.event.PelangganListener;

/**
 *
 * @author asus
 */
public class PelangganModel {
    
    private String nama;
    private String email;
    private String noTelp;

    public PelangganListener getPelangganListener() {
        return pelangganListener;
    }

    public void setPelangganListener(PelangganListener pelangganListener) {
        this.pelangganListener = pelangganListener;
    }
    
    private PelangganListener pelangganListener;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
        fireOnChange();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        fireOnChange();
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
        fireOnChange();
    }
    
    protected void fireOnChange() {
        if(pelangganListener!=null) {
            pelangganListener.onChange(this);
        }
    }
    
    public void resetForm() {
        setNama("");
        setEmail("");
        setNoTelp("");
    }
    
    public void simpanForm() {
        JOptionPane.showMessageDialog(null,"Berhasil Disimpan");
        resetForm();  
    }
    
}