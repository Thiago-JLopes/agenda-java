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
public class Editar implements ActionListener {

    private Tela tela;

    public Editar(Tela tela) {
        this.tela = tela;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        DefaultListModel<Contato> listaContatos = (DefaultListModel<Contato>) tela.getContatos().getModel();
        Contato contato = listaContatos.getElementAt(tela.getIdUltimo());
        
        contato.setNome(tela.getJtNome().getText());
        contato.setTelefone(tela.getJtTelefone().getText());
        contato.setDescricao(tela.getJtDescricao().getText());
        contato.setEmail(tela.getJtEmail().getText());
        
        JOptionPane.showMessageDialog(tela, "Contato Atualizado");
        tela.repaint();
    }
}
