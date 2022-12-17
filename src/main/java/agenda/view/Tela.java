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
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Panel;
import java.util.*;
import javax.swing.*;

public class Tela extends JFrame {

    private List<Contato> contatos;
    private JPanel telaPrincipal;
    private JTextField jtNome;
    private JTextField jtTelefone;
    private JTextField jtDescricao;
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
        this.setSize(500, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Agenda de Contatos");

        this.telaPrincipal = new JPanel();
        this.telaPrincipal.setLayout(new BorderLayout());
        this.add(this.telaPrincipal);
    }

    private void listaContatos() {
        JPanel jPContatos = new JPanel();
        jPContatos.setBorder(BorderFactory.createTitledBorder("Contatos"));
        jPContatos.setLayout(new BorderLayout());
        jPContatos.setPreferredSize(new Dimension(95, 200));
        

        this.telaPrincipal.add(jPContatos, BorderLayout.WEST);

    }

    private void configurarFormulario() {
        JPanel jPformulario = new JPanel();
        jPformulario.setBorder(BorderFactory.createTitledBorder("Formulário"));
        jPformulario.setLayout(new BorderLayout());

        JPanel descricao = new JPanel();
        JPanel caixaTexto = new JPanel();
        descricao.setLayout(new GridLayout(0, 1));
        caixaTexto.setLayout(new GridLayout(0, 1));

        this.jtNome = new JTextField(20);
        descricao.add(new JLabel("Nome: "));
        caixaTexto.add(this.jtNome);

        this.jtTelefone = new JTextField(20);
        descricao.add(new JLabel("Telefone: "));
        caixaTexto.add(this.jtTelefone);

        this.jtEmail = new JTextField(20);
        descricao.add(new JLabel("E-mail: "));
        caixaTexto.add(this.jtEmail);

        jPformulario.add(descricao, BorderLayout.WEST);
        jPformulario.add(caixaTexto, BorderLayout.EAST);
        
        //Adicona botoes
        JPanel jpButton = new JPanel();
        
        JButton btAdicionar = new JButton("Adicionar");
        jpButton.add(btAdicionar);
        
        JButton btLimpar = new JButton("Limpar");
        jpButton.add(btLimpar);
        
        JButton btEditar = new JButton("Editar");
        jpButton.add(btEditar);
        
        JButton btRemover = new JButton("Remover");
        jpButton.add(btRemover);
        
        jPformulario.add(jpButton, BorderLayout.SOUTH);

        this.telaPrincipal.add(jPformulario);
    }

    public void exibirTelas() {
        criaTela();
        configurarFormulario();
        listaContatos();
       
        this.add(telaPrincipal);
        this.setVisible(true);
        
        repaint();
    }

    public static void main(String[] args) {
        Tela tela = new Tela();

        tela.exibirTelas();
    }
}
