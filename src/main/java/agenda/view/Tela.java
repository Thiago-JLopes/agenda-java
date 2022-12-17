/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agenda.view;

/**
 *
 * @author thiago
 */
import agenda.model.Contato;
import java.awt.BorderLayout;
import java.util.*;
import javax.swing.*;

public class Tela extends JFrame {

    private List<Contato> contatos;
    private JPanel telaPrincipal;
    private JTextField jtNome;
    private JTextField jtTelefone;
    private JTextField jtEmail;
    private int idUltimo;

    public Tela() {
        this.idUltimo = 0;
    }

    public List<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(List<Contato> contatos) {
        this.contatos = contatos;
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

    public void criaTela() {
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Agenda de Contatos");
        
        this.telaPrincipal = new JPanel();
        this.telaPrincipal.setLayout(new BorderLayout());    
    }
    
    public void exibirTelas() {
        this.add(telaPrincipal);
        this.setVisible(true);
    }
    
    public static void main(String[] args) {
        Tela tela = new Tela();
        
        tela.criaTela();
        tela.exibirTelas();
    }
}
