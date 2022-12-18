/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agenda.control;

/**
 *
 * @author thiago
 */
import agenda.view.Tela;
import agenda.model.Contato;
import java.awt.event.*;
import javax.swing.*;

public class AdicionarContato implements ActionListener {

    private Tela tela;

    public AdicionarContato(Tela tela) {
        this.tela = tela;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        DefaultListModel<Contato> listaContatos = (DefaultListModel<Contato>) tela.getContatos().getModel();
        listaContatos.addElement(new Contato(tela.getJtNome().getText(), tela.getJtTelefone().getText(),
                tela.getJtDescricao().getText(),
                tela.getJtEmail().getText()));
        
        tela.getContatos().setModel(listaContatos);
        tela.repaint();
    }

}
