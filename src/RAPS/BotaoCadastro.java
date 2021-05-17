package RAPS;

import java.io.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class BotaoCadastro extends AbstractAction {
    JTextField especialidade;
    JTextField nome;
    JTextField horario;
    JTextField fimHorario;
    Medicos[] vetor;

    int i;
    public BotaoCadastro(
            JTextField nome,
            JTextField especialidade,
            Medicos[] vetor,
            JTextField horario,
            JTextField fimHorario,
            int i
    ) {
        this.horario = horario;
        this.nome = nome;
        this.especialidade = especialidade;
        this.fimHorario = fimHorario;
        this.vetor = vetor;
        this.i = i;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        boolean exit = true;
        Medicos novoMedico = new Medicos();

        while (exit) {
            if (vetor[i] == null) {
                try {
                    novoMedico.setNome(nome.getText());
                    novoMedico.setEspecialidade(especialidade.getText());
                    novoMedico.setHorario(horario.getText());
                    novoMedico.setFimHorario(fimHorario.getText());

                    vetor[i] = novoMedico;
                    especialidade.setText("");
                    nome.setText("");
                    horario.setText("");
                    fimHorario.setText("");
                    JOptionPane.showMessageDialog(null, "Medico cadastrado com sucesso");
                    exit = false;
                } catch (Exception e1) {
                    JOptionPane.showMessageDialog(null, "Algo de errado ocorreu");
                }
            } else i++;
        }

    }
}
