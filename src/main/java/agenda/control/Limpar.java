/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agenda.control;

import agenda.model.Contato;
import agenda.view.Tela;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author thiago
 */
public class Limpar implements ActionListener{
    private Tela tela;

    public Limpar(Tela tela) {
        this.tela = tela;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        
        tela.getJtNome().setText("");
        tela.getJtTelefone().setText("");
        tela.getJtDescricao().setText("");
        tela.getJtEmail().setText("");
        
        tela.repaint();
    }
    
}
