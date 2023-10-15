package pacoteComandante;

import java.util.Scanner;


public class ClasseComandante {


    private String nome;
    private String ControladorAeronave;
    private String cod_dac;
    private String identificacaolicenca;
    private int horas_voo;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public String getControladorAeronave() {
        return ControladorAeronave;
    }

    public void setControladorAeronave(String controladorAeronave) {

        ControladorAeronave = controladorAeronave;
    }

    public String getCod_dac() {
        return cod_dac;
    }

    public void setCod_dac(String cod_dac) {

        this.cod_dac = cod_dac;
    }

    public String getIdentificacaolicenca() {
        return identificacaolicenca;
    }

    public void setIdentificacaolicenca(String identificacaolicenca) {
        this.identificacaolicenca = identificacaolicenca;
    }

    public int getHoras_voo() {
        return horas_voo;
    }

    public void setHoras_voo(int horas_voo) {


        this.horas_voo = horas_voo;
    }

    private boolean ligado = false;

    public void setLigado(boolean alterarEstado) {
        if (desligado(true) != alterarEstado) {
            this.ligado = alterarEstado;
        }
    }

    public boolean desligado(boolean b) {
        return ligado;
    }

    public void ligarPiloto(boolean alterarEstado) {
        alterarEstado = true;
        boolean isLigado = false;
        if (isLigado = alterarEstado) {
            isLigado = alterarEstado;
        }
        char opcao = 's';
        Scanner scanner = new Scanner(System.in);
        System.out.println("LIGAR / DESLIGAR PILOTO AUTOMATICO [S/N]");
        opcao = scanner.nextLine().charAt(0);
        if (opcao == 's' || opcao == 'S') {
            desligado(true);
            System.out.println("PILOTO AUTOMATICO LIGADO");
        } else if (opcao == 'n' || opcao == 'N') {
            desligado(false);
            System.out.println("PILOTO AUTOMATICO DESLIGADO");
        }


    }


}















