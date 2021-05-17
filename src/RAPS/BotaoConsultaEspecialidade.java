package RAPS;

import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class BotaoConsultaEspecialidade extends AbstractAction {
    int j;
    Medicos[] vetor;


    JTextField especialidadeDesejada;

    public BotaoConsultaEspecialidade (Medicos[] vetor, JTextField especialidade){
        this.vetor = vetor;
        this.especialidadeDesejada = especialidade;
    }
    @Override
    public void actionPerformed(ActionEvent e) {


        String[] nomeMedicos = new String[vetor.length];
        String[] especialidadeMedicos = new String[vetor.length];
        String[] horarioMedicos = new String[vetor.length];
        String[] fimHorario = new String[vetor.length];


        nomeMedicos[0] = "Nome: ";
        especialidadeMedicos[0] = "Especialidade: ";
        horarioMedicos[0] = "Horario inicial: ";
        fimHorario[0] = "Horario final: ";

        for(j = 1; j < vetor.length; j++){
            if ((vetor[j-1]!=null)&&(vetor[j-1].getEspecialidade().equals(especialidadeDesejada.getText()))){
                nomeMedicos[j] = vetor[j-1].getNome();
                especialidadeMedicos[j] = vetor[j-1].getEspecialidade();
                horarioMedicos[j] = vetor[j-1].getHorario();
                fimHorario[j] = vetor[j-1].getFimHorario();
            }
        }
        JList<String> listaNomes = new JList<>(nomeMedicos);
        JList<String> listaEspecialidades = new JList<>(especialidadeMedicos);
        JList<String> listaHorario = new JList<>(horarioMedicos);
        JList<String> listaFimHorario = new JList<>(fimHorario);

        Janela frame = new Janela("Medicos Disponiveis", false, false);
        frame.setLayout(new GridLayout());



        frame.add(listaNomes);
        frame.add(listaEspecialidades);
        frame.add(listaHorario);
        frame.add(listaFimHorario);

    }

}
