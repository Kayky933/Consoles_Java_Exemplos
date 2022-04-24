package entities;

public class Pessoa {
    private String nomeFilme;
    private String idiomaFilmeAudio;
    private String idiomaLegendaFilme;
    private String resolucaoFilme;

    public void mostrarDados(Pessoa pessoa) {
        System.out.println("Olá, seja bem vindo, aqui estão algumas informações dobre o filme escolhido:");
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(pessoa);
        System.out.println("----------------------------------------------------------------------------");

    }

    public String toString() {
        return "Nome do filme: " + nomeFilme +
                "\nIdioma Audio: " + idiomaFilmeAudio +
                "\nIdioma Legenda: " + idiomaLegendaFilme +
                "\nResolutado: " + resolucaoFilme;
    }

    public void assistirFilme(String nome) {
        nomeFilme = nome;

    }

    public void resolucaoFilme(String resolucao) {
        switch (resolucao) {
            case "1920X1080":
                resolucaoFilme = "Filme sendo carregado em Full HD/1080p	1920X1080";
                break;

            case "2560X1080":
                resolucaoFilme = "Filme sendo carregado em Full HD Ultra Wide	2560X1080";
                break;

            case "2560X1440":
                resolucaoFilme = "Filme sendo carregado em WQHD 2560X1440";
                break;
            case "3840X2160":
                resolucaoFilme = "Filme sendo carregado em 4K Ultra HD/2160p	3840X2160";
                break;

            default:
                resolucaoFilme = "Filme sendo carregado em HD";
                break;
        }
    }

    public void buscaraAudioIdioma(String preferencia) {

        switch (preferencia) {
            case "portugues":
                idiomaFilmeAudio = "Audio idioma padrão sendo carregado: " + preferencia;
                break;
            case "espanhol":
                idiomaFilmeAudio = "Audio idioma padrão sendo carregado: " + preferencia;
                break;
            case "ingles":
                idiomaFilmeAudio = "Audio idioma padrão sendo carregado: " + preferencia;
                break;
            case "frances":
                idiomaFilmeAudio = "Audio idioma padrão sendo carregado: " + preferencia;
                break;

            default:
                idiomaFilmeAudio = "Audio idioma padrão sendo carregado: Ingl�s";
                break;
        }

    }

    public void buscarLegendaIdioma(String preferencia) {

        switch (preferencia) {
            case "portugues":
                idiomaLegendaFilme = "Audio idioma Padrão sendo carregado: " + preferencia;
                break;
            case "espanhol":
                idiomaLegendaFilme = "Audio idioma Padrão sendo carregado: " + preferencia;
                break;
            case "ingles":
                idiomaLegendaFilme = "Audio idioma Padrão sendo carregado: " + preferencia;
                break;
            case "frances":
                idiomaLegendaFilme = "Audio idioma Padrão sendo carregado: " + preferencia;
                break;

            default:
                idiomaLegendaFilme = "Audio idioma Padrão sendo carregado: Inglês";
                break;
        }

    }
}