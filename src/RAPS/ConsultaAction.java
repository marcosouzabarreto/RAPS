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

        for(j=0; j < vetor.length; j++){
            if (vetor[j]!=null){
                nomeMedicos[j] = vetor[j].getNome();
                especialidadeMedicos[j] = vetor[j].getEspecialidade();
            }
        }
        JList<String> listaNomes = new JList<>(nomeMedicos);
        JList<String> listaEspecialidades = new JList<>(especialidadeMedicos);

        listaMedicos.add(listaNomes, BorderLayout.WEST);
        listaMedicos.add(listaEspecialidades, BorderLayout.EAST);
    }
}
