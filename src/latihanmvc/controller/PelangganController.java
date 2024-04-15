/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanmvc.controller;

import javax.swing.JOptionPane;
import latihanmvc.model.PelangganModel;
import latihanmvc.view.PelangganView;

/**
 *
 * @author asus
 */
public class PelangganController {
    
    private PelangganModel model;

    public void setModel(PelangganModel model) {
        this.model = model;
    }
    
    
    public void resetForm(PelangganView view) {
        String nama = view.getTxtNama().getText();
        String email = view.getTxtEmail().getText();
        String noTlp = view.getTxtTelp().getText();

        if (nama.equals("") && email.equals("") && noTlp.equals("")) {

        } else {

            model.resetForm();
        }

        
    }

    public void simpanForm(PelangganView view) {
        String nama = view.getTxtNama().getText();
        String email = view.getTxtEmail().getText();
        String noTlp = view.getTxtTelp().getText();
        
        if (nama.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Nama Masih Kosong");
        } else if (email.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Email Masih Kosong");
        } else if (noTlp.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "No Telp Masih Kosong");
        } else {
            model.simpanForm();
        }

    }
    
}
