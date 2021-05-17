package RAPS;

import java.io.*;
import javax.swing.*;

public class Janela extends JFrame {
    Medicos[] vetor = new Medicos[1024];
    public Janela(String title, boolean exit, boolean menu) {
        setTitle(title);
        setSize(800,500);

        if (exit) setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        if (menu) createMenu(vetor);
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        setVisible(true);
    }

    public static void lookAndFeel() {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex){
            System.out.println("Ocorreu algum erro");
        }

    }

    public void createMenu(Medicos[] vetor){
        int i = 0;

        JMenuBar menu = new JMenuBar();
        JMenu operacoes = new JMenu("Operações");
        JMenu opcoes = new JMenu("Opções");

        menu.add(operacoes);
        menu.add(opcoes);

        JMenuItem cadastro = new JMenuItem(new CadastrarAction(vetor, i));
        cadastro.setText("Cadastrar");

        JMenuItem consulta = new JMenuItem(new ConsultaAction(vetor));
        consulta.setText("Consultar Medicos");

        JMenuItem consultaEspecialidade = new JMenuItem(new ConsultaEspecialidade(vetor));
        consultaEspecialidade.setText("Consulta por Especialidade");




        JMenuItem sair = new JMenuItem(new SairAction());
        sair.setText("Sair");
        opcoes.add(sair);



        operacoes.add(cadastro);
        operacoes.add(consulta);
        operacoes.add(consultaEspecialidade);

        setJMenuBar(menu);
    }

    public static void main(String[] args) {


        lookAndFeel();
        Janela home = new Janela("RAPS", true, true);


    }
}
