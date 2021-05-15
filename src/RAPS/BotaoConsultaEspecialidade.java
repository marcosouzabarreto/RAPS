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
        String[] nomeMedicos = new String[1024];
        String[] especialidadeMedicos = new String[1024];
        for(j=0; j < vetor.length; j++){
            if ((vetor[j]!=null)&&(vetor[j].getEspecialidade().equals(especialidade.getText()))){
                nomeMedicos[j] = vetor[j].getNome();
                especialidadeMedicos[j] = vetor[j].getEspecialidade();
            }
        }
        JList<String> listaNomes = new JList<>(nomeMedicos);
        JList<String> listaEspecialidades = new JList<>(especialidadeMedicos);

        Janela medicosEspecializados = new Janela("Medicos Disponiveis", false, false);
        medicosEspecializados.add(listaNomes, BorderLayout.WEST);
        medicosEspecializados.add(listaEspecialidades, BorderLayout.EAST);
    }

}
