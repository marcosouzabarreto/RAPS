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

        JLabel nome = new JLabel("Digite o nome");
        JTextField getNome = new JTextField(20);
        nomeDoMedico.add(nome);
        nomeDoMedico.add(getNome);

        JLabel especialidade = new JLabel("Digite a sua especialidade");
        JTextField getEspecialidade = new JTextField(20);
        especialidadeDoMedico.add(especialidade);
        especialidadeDoMedico.add(getEspecialidade);

        JButton botaoCadastrar = new JButton(new BotaoCadastro(getNome, getEspecialidade, vetor));
        botaoCadastrar.setText("Cadastrar");

        janelaDeCadastro.add(especialidadeDoMedico);
        janelaDeCadastro.add(nomeDoMedico, BorderLayout.BEFORE_FIRST_LINE);
        janelaDeCadastro.add(botaoCadastrar, BorderLayout.SOUTH);
    }
}
