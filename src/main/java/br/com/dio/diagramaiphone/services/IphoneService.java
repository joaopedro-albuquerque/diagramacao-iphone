package br.com.dio.diagramaiphone.services;

import br.com.dio.diagramaiphone.entities.Iphone;

public class IphoneService {
    private final Iphone iphone;

    public IphoneService() {
        this.iphone = new Iphone();
    }

    public String ligar(String numero) {
        return iphone.ligar(numero);
    }

    public String atender() {
        return iphone.atender();
    }

    public String iniciarCorreioVoz() {
        return iphone.iniciarCorreioVoz();
    }

    public String exibirPagina(String url) {
        return iphone.exibirPagina(url);
    }

    public String adicionarNovaAba() {
        return iphone.adicionarNovaAba();
    }

    public String atualizarPagina() {
        return iphone.atualizarPagina();
    }

    public String tocar() {
        return iphone.tocar();
    }

    public String pausar() {
        return iphone.pausar();
    }

    public String selecionarMusica(String musica) {
        return iphone.selecionarMusica(musica);
    }
}