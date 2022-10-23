package TP2.Ex2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Layout2 implements ActionListener {

    JFrame jf = new JFrame();

    JLabel lblTitulo, lblAutor, lblEditora, lblAnoEdicao, lblLocalizacao, lblStatus;

    JTextField txtTitulo, txtAutor, txtEditora, txtAnoEdicao, txtLocalizacao, txtStatus;

    JButton btnOk, btnEmprestar, btnDevolver, btnMostrar, btnSair;

    short ano = 2005;

    LivroDeBiblioteca L1 = new LivroDeBiblioteca("Java", "Mauricio", "LTC", ano, "a1b1");

    Layout2() {

        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(6, 2, 10, 10));

        JPanel p2 = new JPanel();

        p2.setLayout(new GridLayout(1, 5, 10, 10));

        lblTitulo = new JLabel("Titulo");
        lblAutor = new JLabel("Autor");
        lblEditora = new JLabel("Editora");
        lblAnoEdicao = new JLabel("Ano Edicao");
        lblLocalizacao = new JLabel("Localizacao");
        lblStatus = new JLabel("Status");

        txtTitulo = new JTextField(20);
        txtAutor = new JTextField(20);
        txtEditora = new JTextField(20);
        txtAnoEdicao = new JTextField(20);
        txtLocalizacao = new JTextField(20);
        txtStatus = new JTextField(20);

        btnOk = new JButton("Ok");
        btnEmprestar = new JButton("Emprestar");
        btnDevolver = new JButton("Devolver");
        btnMostrar = new JButton("Mostrar");
        btnSair = new JButton("Sair");

        p1.add(lblTitulo);
        p1.add(txtTitulo);

        p1.add(lblAutor);
        p1.add(txtAutor);

        p1.add(lblEditora);
        p1.add(txtEditora);

        p1.add(lblAnoEdicao);
        p1.add(txtAnoEdicao);

        p1.add(lblLocalizacao);
        p1.add(txtLocalizacao);

        p1.add(lblStatus);
        p1.add(txtStatus);

        p2.add(btnOk);
        p2.add(btnEmprestar);
        p2.add(btnDevolver);
        p2.add(btnMostrar);
        p2.add(btnSair);

        jf.add(p1, "North");

        jf.add(p2, "South");

        jf.setVisible(true);

        jf.setSize(600, 250);
        jf.setTitle("Semana 04 - Exercicio 02");

        btnOk.addActionListener(this);
        btnEmprestar.addActionListener(this);
        btnDevolver.addActionListener(this);
        btnMostrar.addActionListener(this);
        btnSair.addActionListener(this);

        txtTitulo.setText(L1.getTitulo());
        txtAutor.setText(L1.getAutor());
        txtEditora.setText(L1.getEditora());
        txtAnoEdicao.setText(Short.toString(L1.getAnoEdicao()));
        txtLocalizacao.setText(L1.getLocalizacao());
        txtStatus.setText(Boolean.toString(L1.emprestado));

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnMostrar) {

            txtTitulo.setText(L1.getTitulo());
            txtAutor.setText(L1.getAutor());
            txtEditora.setText(L1.getEditora());
            txtAnoEdicao.setText(Short.toString(L1.getAnoEdicao()));
            txtLocalizacao.setText(L1.getLocalizacao());
            txtStatus.setText(Boolean.toString(L1.emprestado));

        } else if (e.getSource() == btnOk) {

            L1.setTitulo(txtTitulo.getText());
            L1.setAutor(txtAutor.getText());
            L1.setEditora(txtEditora.getText());
            L1.setAnoEdicao(Short.parseShort(txtAnoEdicao.getText()));
            L1.localizacao = txtLocalizacao.getText();
            L1.emprestado = Boolean.parseBoolean(txtStatus.getText());

            txtTitulo.setText("");
            txtAutor.setText("");
            txtEditora.setText("");
            txtAnoEdicao.setText("");
            txtLocalizacao.setText("");
            txtStatus.setText("");

        } else if (e.getSource() == btnEmprestar) {
            L1.Empresta();
        } else if (e.getSource() == btnDevolver) {
            L1.Devolve();
        } else if (e.getSource() == btnSair) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new Layout2();
    }
}
