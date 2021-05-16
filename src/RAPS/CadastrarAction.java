package RAPS;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class CadastrarAction extends AbstractAction {

    Medicos[] vetor;

    public CadastrarAction (Medicos[] vetor){
        this.vetor = vetor;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Janela janelaDeCadastro = new Janela("Novo Cadastro", false, false);
        JPanel nomeDoMedico = new JPanel();
        JPanel especialidadeDoMedico = new JPanel();
        JPanel horarioDoMedico = new JPanel();

        JLabel nome = new JLabel("Digite o nome");
        JTextField getNome = new JTextField(20);
        nomeDoMedico.add(nome);
        nomeDoMedico.add(getNome);

        JLabel especialidade = new JLabel("Digite a sua especialidade");
        JTextField getEspecialidade = new JTextField(20);
        especialidadeDoMedico.add(especialidade);
        especialidadeDoMedico.add(getEspecialidade);

        JLabel horario = new JLabel("Escolha o seu horario");
        JTextField getHorario = new JTextField(8);
        JLabel fimHorario = new JLabel("até");
        JTextField getFimHorario = new JTextField(8);

        horarioDoMedico.add(horario);
        horarioDoMedico.add(getHorario);
        horarioDoMedico.add(fimHorario);
        horarioDoMedico.add(getFimHorario);

        JButton botaoCadastrar = new JButton(new BotaoCadastro(getNome, getEspecialidade, vetor, getHorario, getFimHorario));
        botaoCadastrar.setText("Cadastrar");


        janelaDeCadastro.add(especialidadeDoMedico, BorderLayout.CENTER);
        janelaDeCadastro.add(nomeDoMedico, BorderLayout.WEST);
        janelaDeCadastro.add(horarioDoMedico, BorderLayout.EAST);
        janelaDeCadastro.add(botaoCadastrar, BorderLayout.SOUTH);
    }
}
