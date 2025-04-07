/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg23;

/**
 *
 * @author oneide
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("GymMaster - Menu Principal");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 300);
            frame.setLayout(new GridLayout(3, 1));

            JButton btnCriarTreino = new JButton("Criador de Treinos");
            JButton btnRegistroAtividade = new JButton("Registro de Atividade Física");
            JButton btnDesempenhoAtividade = new JButton("Desempenho de Atividade Física");

            btnCriarTreino.addActionListener(e -> {
                CriadorTreinosFrame criadorTreinos = new CriadorTreinosFrame();
                criadorTreinos.setVisible(true);
            });

            btnRegistroAtividade.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    RegistroAtividadeFrame RegistroAtividade;
                    RegistroAtividade = new RegistroAtividadeFrame();
                    RegistroAtividade.setVisible(true);
                }
            });

            btnDesempenhoAtividade.addActionListener(e -> {
                DesempenhoAtividadeFrame desempenhoAtividade = new DesempenhoAtividadeFrame();
                desempenhoAtividade.setVisible(true);
            });

            frame.add(btnCriarTreino);
            frame.add(btnRegistroAtividade);
            frame.add(btnDesempenhoAtividade);

            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
