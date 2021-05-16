package RAPS;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class BotaoConsultaEspecialidade extends AbstractAction {
    int j;
    Medicos[] vetor;


    JTextField especialidade;
    public BotaoConsultaEspecialidade (Medicos[] vetor, JTextField especialidade){
        this.vetor = vetor;
        this.especialidade = especialidade;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String[] nomeMedicos = new String[vetor.length];
        String[] especialidadeMedicos = new String[vetor.length];
        String[] horarioMedicos = new String[vetor.length];
        String[] fimHorario = new String[vetor.length];

        for(j=0; j < vetor.length; j++){
            if ((vetor[j]!=null)&&(vetor[j].getEspecialidade().equals(especialidade.getText()))){
                nomeMedicos[j] = vetor[j].getNome();
                especialidadeMedicos[j] = vetor[j].getEspecialidade();
                horarioMedicos[j] = vetor[j].getHorario() + " - ";
                fimHorario[j] = vetor[j].getFimHorario();
            }
        }
        JList<String> listaNomes = new JList<>(nomeMedicos);
        JList<String> listaEspecialidades = new JList<>(especialidadeMedicos);
        JList<String> listaHorario = new JList<>(horarioMedicos);
        JList<String> listaFimHorario = new JList<>(fimHorario);

        Janela medicosEspecializados = new Janela("Medicos Disponiveis", false, false);

        /*
            Falta adicionar essas desgraca de lista no layout
            Pode criar uns JPanel se quiser


        */

    }

}
