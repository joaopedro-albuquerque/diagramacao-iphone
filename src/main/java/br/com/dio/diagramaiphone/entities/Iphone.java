package br.com.dio.diagramaiphone.entities;

import br.com.dio.diagramaiphone.interfaces.AparelhoTelefonico;
import br.com.dio.diagramaiphone.interfaces.NavegadorNaInternet;
import br.com.dio.diagramaiphone.interfaces.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorNaInternet {

    @Override
    public String ligar(String numero) {
        return "Ligando para " + numero;
    }

    @Override
    public String atender() {
        return "Atendendo a chamada";
    }

    @Override
    public String iniciarCorreioVoz() {
        return "Iniciando o correio de voz";
    }

    @Override
    public String exibirPagina(String url) {
        return "Exibindo a página: " + url;
    }

    @Override
    public String adicionarNovaAba() {
        return "Adicionando uma nova aba";
    }

    @Override
    public String atualizarPagina() {
        return "Atualizando a página";
    }

    @Override
    public String tocar() {
        return "Reproduzindo música";
    }

    @Override
    public String pausar() {
        return "Pausando a música";
    }

    @Override
    public String selecionarMusica(String musica) {
        return "Selecionando a música: " + musica;
    }
}

