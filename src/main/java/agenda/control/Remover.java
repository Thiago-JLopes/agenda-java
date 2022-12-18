/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agenda.control;

import agenda.model.Contato;
import agenda.view.Tela;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author thiago
 */
public class Remover implements ActionListener {

    private Tela tela;

    public Remover(Tela tela) {
        this.tela = tela;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int id = tela.getContatos().getSelectedIndex();

        if (id == -1) {
            JOptionPane.showMessageDialog(tela, "Selecione um contato para remover!");
        } else {
            DefaultListModel<Contato> listaContatos = (DefaultListModel<Contato>) tela.getContatos().getModel();
            listaContatos.removeElementAt(id);
            
            tela.getContatos().setModel(listaContatos);
            tela.getContatos().setSelectedIndex(id);
            
            tela.repaint();
        }

    }

}
