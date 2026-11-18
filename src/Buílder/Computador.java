package Buílder;

public class Computador {

    private String processador;
    private String memoriaRam;
    private String armazenamento;
    private String placaDeVideo;
    private String sistemaOperacional;

    public Computador(String processador, String memoriaRam, String armazenamento, String placaDeVideo, String sistemaOperacional) {
        this.processador = processador;
        this.memoriaRam = memoriaRam;
        this.armazenamento = armazenamento;
        this.placaDeVideo = placaDeVideo;
        this.sistemaOperacional = sistemaOperacional;
    }

    @Override
    public String toString() {
        return "Processador : " +processador + "\n" +
                "RAM : " + memoriaRam + "\n" +
                "Armazenamento : " + armazenamento + "\n" +
                "Placa de Vídeo : " + placaDeVideo + "\n" +
                "Sistema Operacional : " + sistemaOperacional;
     }
}
