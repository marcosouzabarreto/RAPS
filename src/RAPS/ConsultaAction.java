package RAPS;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ConsultaAction extends AbstractAction {
    int j = 0;
    Medicos[] vetor;

    public ConsultaAction (Medicos[] vetor){
        this.vetor = vetor;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Janela listaMedicos = new Janela("Medicos Disponiveis", false, false);
        String[] nomeMedicos = new String[vetor.length];
        String[] especialidadeMedicos = new String[vetor.length];
        String[] horarioMedicos = new String[vetor.length];
        String[] fimHorario = new String[vetor.length];

        JPanel horario = new JPanel();
        JPanel nome = new JPanel();
        JPanel especialidade = new JPanel();
        JPanel fimHora = new JPanel();



        for(j=0; j < vetor.length; j++){
            if (vetor[j]!=null){
                nomeMedicos[j] = vetor[j].getNome();
                especialidadeMedicos[j] = vetor[j].getEspecialidade();
                horarioMedicos[j] = vetor[j].getHorario();
                fimHorario[j] = vetor[j].getFimHorario();

            }
        }
        JList<String> listaNomes = new JList<>(nomeMedicos);
        JList<String> listaEspecialidades = new JList<>(especialidadeMedicos);
        JList<String> listaHorario = new JList<>(horarioMedicos);
        JList<String> listaFimHorario = new JList<>(fimHorario);

        horario.add(listaHorario);
        fimHora.add(listaFimHorario);
        nome.add(listaNomes);
        especialidade.add(listaEspecialidades);
/*
        Falta adicionar essas desgraca daqui de cima no layout


 */
    }
}
