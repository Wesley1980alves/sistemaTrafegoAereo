package pacotetorre;

import java.util.Scanner;

public class ClasseTorre {
    // atributos da classe torre
    private String nomeControlador;
    private String numeroIdentificacao;
    private String horasEntrada;
    private String horassaida;


    public String getNomeControlador() {
        return nomeControlador;
    }

    public void setNomeControlador(String nomeControlador, String codigo) {

        this.nomeControlador = nomeControlador;

    }

    public String getNumeroIdentificacao() {
        return numeroIdentificacao;
    }

    public void setNumeroIdentificacao(String numeroIdentificacao) {
        this.numeroIdentificacao = numeroIdentificacao;
    }

    public String getHorasEntrada() {
        return horasEntrada;
    }

    public void setHorasEntrada(int horasEntrada) {

        this.horasEntrada = String.valueOf(horasEntrada);
    }

    public String getHorassaida() {

        return horassaida;
    }

    public void setHorassaida(int horassaida) {
        this.horassaida = String.valueOf(horassaida);
    }

    //METODOS DA CLASSE TORRE

    public boolean receberDados(boolean mensagem) {
        mensagem = false;
        if (mensagem != false) {
            System.out.println("MENSAGEM RECEBIDA COM SUCESSO, PROSSIGA");
        } else {
            System.out.println("MENSAGEM NAO RECEBIDA , CONFIRME ENVIO");
        }

        return true;
    }


    public String enviarDados(String dados) {
        Scanner lerDados = new Scanner(System.in);
        System.out.println("DIGITE A MENSAGEM QUE DESEJA ENVIAR :");
        dados = lerDados.nextLine();
        if (dados == dados) {
            System.out.println("MENSAGEM ENVIADA COM SUCESSO ");
        } else {
            System.out.println("NAO HA  DADOS PARA SER ENVIADOS  ");

        }
        return dados;

    }

    public void emitirAlertClima(String clima) {
        System.out.println("NUVENS: Esparsas \n TEMPERATURA:  29 graus \n SENSAÇAO:  32 \n UMIDADE DO AR:  66%  \nPRESSAO:  1009hPa \n VENTO:  11KM/H");


    }




}
