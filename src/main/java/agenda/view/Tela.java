/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agenda.view;

/**
 *
 * @author thiago
 */
import agenda.control.AdicionarContato;
import agenda.control.ConfiguraLista;
import agenda.model.Contato;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.ScrollPane;
import java.util.*;
import javax.swing.*;

public class Tela extends JFrame {

    private JList<Contato> contatos;
    private JPanel telaPrincipal;
    private JTextField jtNome;
    private JTextField jtTelefone;
    private JTextField jtDescricao;
    private JTextField jtEmail;
    private int idUltimo;

    public Tela() {
        this.idUltimo = 0;
    }

    public JTextField getJtDescricao() {
        return jtDescricao;
    }

    public void setJtDescricao(JTextField jtDescricao) {
        this.jtDescricao = jtDescricao;
    }

    public JList<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(JList<Contato> contatos) {
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
        this.setSize(300, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Agenda de Contatos");

        this.telaPrincipal = new JPanel();
        this.telaPrincipal.setLayout(new BorderLayout());
        
        exibirTelas();
    }

    private void listaContatos() {
        JPanel jPContatos = new JPanel();
        jPContatos.setBorder(BorderFactory.createTitledBorder("Contatos"));
        jPContatos.setLayout(new BorderLayout());
        jPContatos.setPreferredSize(new Dimension(120, 200));
        
        DefaultListModel<Contato> listaContatos = new DefaultListModel<>();
        //teste
        listaContatos.addElement(new Contato("Thiago", "(32)99949-6371", "UFJF", "tiagojosexnn12@gmail.com"));
        contatos = new JList<>(listaContatos);
        contatos.setVisible(true);
        contatos.setPreferredSize(new Dimension(95,300));
        contatos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        contatos.addListSelectionListener(new ConfiguraLista(this));
        
        jPContatos.add(new JScrollPane(contatos), BorderLayout.EAST);
        

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
        descricao.add(new JLabel("Nome:"));
        caixaTexto.add(this.jtNome);

        this.jtTelefone = new JTextField(20);
        descricao.add(new JLabel("Telefone:"));
        caixaTexto.add(this.jtTelefone);
        
        this.jtDescricao = new JTextField(20);
        descricao.add(new JLabel("Descrição:"));
        caixaTexto.add(this.jtDescricao);

        this.jtEmail = new JTextField(20);
        descricao.add(new JLabel("E-mail:"));
        caixaTexto.add(this.jtEmail);

        jPformulario.add(descricao, BorderLayout.WEST);
        jPformulario.add(caixaTexto, BorderLayout.EAST);
        
        //Adicona botoes
        JPanel jpButton = new JPanel();
        
        JButton btAdicionar = new JButton("Adicionar");
        btAdicionar.addActionListener(new AdicionarContato(this));
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
        this.setVisible(true);
            
        listaContatos();
        configurarFormulario();
       
        this.add(this.telaPrincipal);
        this.repaint();
    }

    public static void main(String[] args) {
        Tela tela = new Tela();

        tela.criaTela();
        tela.pack();
    }
}
