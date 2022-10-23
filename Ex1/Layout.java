package TP2.Ex1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Layout implements ActionListener {

    JFrame jf = new JFrame();

    JLabel lblA, lblB, lblSoma, lblSubtracao, lblMultiplicacao, lblDivisao;

    JTextField txtA, txtB, txtSoma, txtSubtracao, txtMultiplicacao, txtDivisao;

    JButton btnLimpar, btnCalcular, btnSair;

    Layout() {
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(6, 2, 10, 10));

        JPanel p2 = new JPanel();

        p2.setLayout(new GridLayout(1, 3, 10, 10));

        lblA = new JLabel("A");
        lblB = new JLabel("B");
        lblSoma = new JLabel("Soma");
        lblSubtracao = new JLabel("Subtracao");
        lblMultiplicacao = new JLabel("Multiplicao");
        lblDivisao = new JLabel("Divisao");

        txtA = new JTextField(20);
        txtB = new JTextField(20);
        txtSoma = new JTextField(20);
        txtSubtracao = new JTextField(20);
        txtMultiplicacao = new JTextField(20);
        txtDivisao = new JTextField(20);

        btnLimpar = new JButton("Limpar");
        btnCalcular = new JButton("Calcular");
        btnSair = new JButton("Sair");

        btnLimpar.addActionListener(this);
        btnCalcular.addActionListener(this);
        btnSair.addActionListener(this);

        p1.add(lblA);
        p1.add(txtA);

        p1.add(lblB);
        p1.add(txtB);

        p1.add(lblSoma);
        p1.add(txtSoma);

        p1.add(lblSubtracao);
        p1.add(txtSubtracao);

        p1.add(lblMultiplicacao);
        p1.add(txtMultiplicacao);

        p1.add(lblDivisao);
        p1.add(txtDivisao);

        p2.add(btnLimpar);
        p2.add(btnCalcular);
        p2.add(btnSair);

        jf.add(p1, "North");

        jf.add(p2, "South");

        jf.setVisible(true);

        jf.setSize(400, 250);
        jf.setTitle("Semana 04 - Exercicio 01");

    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btnCalcular) {

            double Soma, Sub, Mult, Div;

            Soma = Integer.parseInt(txtA.getText()) + Integer.parseInt(txtB.getText());

            Sub = Integer.parseInt(txtA.getText()) - Integer.parseInt(txtB.getText());

            Mult = Integer.parseInt(txtA.getText()) * Integer.parseInt(txtB.getText());

            Div = Integer.parseInt(txtA.getText()) / Integer.parseInt(txtB.getText());

            txtSoma.setText(Double.toString(Soma));
            txtSubtracao.setText(Double.toString(Sub));
            txtMultiplicacao.setText(Double.toString(Mult));
            txtDivisao.setText(Double.toString(Div));

        } else if (e.getSource() == btnLimpar) {
            txtA.setText("");
            txtB.setText("");
            txtSoma.setText("");
            txtSubtracao.setText("");
            txtMultiplicacao.setText("");
            txtDivisao.setText("");
        } else {
            System.exit(0);
        }

    }

    public static void main(String[] args) {
        new Layout();
    }
}