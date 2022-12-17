/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agenda.view;

/**
 *
 * @author thiago
 */
import javax.swing.*;
public class Tela extends JFrame{
    private JPanel telaPrincipal;
    private JTextField jtNome;
    private JTextField jtTelefone;
    private JTextField jtEmail;
    private int idUltimo;

    public Tela() {
        this.idUltimo = 0;
    }

    public JTextField getJtNome() {
        return jtNome;
    }

    public void setJtNome(JTextField jtNome) {
        this.jtNome = jtNome;
    }

    public JTextField getJtTelefone() {
        return jtTelefone;
    }

    public void setJtTelefone(JTextField jtTelefone) {
        this.jtTelefone = jtTelefone;
    }

    public JTextField getJtEmail() {
        return jtEmail;
    }

    public void setJtEmail(JTextField jtEmail) {
        this.jtEmail = jtEmail;
    }

    public int getIdUltimo() {
        return idUltimo;
    }

    public void setIdUltimo(int idUltimo) {
        this.idUltimo = idUltimo;
    }
    
    
}
