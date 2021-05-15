package RAPS;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ConsultaEspecialidade extends AbstractAction {
    Medicos[] vetor;
    public ConsultaEspecialidade (Medicos[] vetor){
        this.vetor = vetor;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Janela medicosEspecializados = new Janela("Medicos disponiveis", false, false);
        JPanel painelBusca = new JPanel();
        JLabel buscaEspecialidade = new JLabel("Digite a especialidade desejada");
        JTextField especialidadeDesejada = new JTextField(20);

        JButton botaoBuscaEspecializada = new JButton(new BotaoConsultaEspecialidade(vetor, especialidadeDesejada));
        botaoBuscaEspecializada.setText("Buscar");

        painelBusca.add(buscaEspecialidade);
        painelBusca.add(especialidadeDesejada);

        medicosEspecializados.add(painelBusca);
        medicosEspecializados.add(botaoBuscaEspecializada, BorderLayout.SOUTH);
    }
}
