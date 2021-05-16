package RAPS;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class BotaoCadastro extends AbstractAction {
    JTextField especialidade;
    JTextField nome;
    JTextField horario;
    JTextField fimHorario;
    int i = 0;

    Medicos[] vetor;

    public BotaoCadastro (
            JTextField nome,
            JTextField especialidade,
            Medicos[] vetor,
            JTextField horario,
            JTextField fimHorario
    )
    {
        this.horario = horario;
        this.nome = nome;
        this.especialidade = especialidade;
        this.fimHorario = fimHorario;
        this.vetor = vetor;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Medicos novoMedico = new Medicos();
        try{
            novoMedico.setNome(nome.getText());
            novoMedico.setEspecialidade(especialidade.getText());
            novoMedico.setHorario(horario.getText());

            vetor[i] = novoMedico;
            especialidade.setText("");
            nome.setText("");
            horario.setText("");
            fimHorario.setText("");
            JOptionPane.showMessageDialog(null, "Medico cadastrado com sucesso");
        } catch (Exception e1){
            System.out.println("Algo de errado ocorreu");
        }

        i++;

    }
}
