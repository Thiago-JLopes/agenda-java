/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agenda.control;

import agenda.model.Contato;
import agenda.view.Tela;
import java.awt.event.ActionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author thiago
 */
public class ConfiguraLista implements ListSelectionListener{
    private Tela tela;

    public ConfiguraLista(Tela tela) {
        this.tela = tela;
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        int id = tela.getContatos().getLeadSelectionIndex();
        
        if(id != -1) {
            Contato contatos = tela.getContatos().getModel().getElementAt(id);
            
            tela.getJtNome().setText(contatos.getNome());
            tela.getJtTelefone().setText(contatos.getTelefone());
            tela.getJtDescricao().setText(contatos.getDescricao());
            tela.getJtEmail().setText(contatos.getEmail());
            
            tela.setIdUltimo(id);
            tela.repaint();
        } 
    }
    
}
