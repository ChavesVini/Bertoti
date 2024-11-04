public class Main {
    public static void main(String[] args) {
        Canal canal = new Canal();

        Inscrito youtube = new YouTube();
        Inscrito instagram = new Instagram();

        canal.inscrever(youtube);
        canal.inscrever(instagram);

        canal.notificar("Novo vídeo disponível!");

        canal.desinscrever(youtube);
        canal.notificar("Nova foto publicada no Instagram!");
    }
}