public class Bachata extends Música{
    public Bachata(String fútbol, String música, String género, String plataforma) {
        super(fútbol, música, género, plataforma);
    }
    String artista, canción;
    public Bachata(String artista, String canción) {
        super(artista, canción);
        this.artista = artista;
        this.canción = canción;
    }
    public String getArtista() {
        return artista;
    }
    public void setArtista(String artista) {
        this.artista = artista;
    }
    public String getCanción() {
        return canción;
    }
    public void setCanción(String canción) {
        this.canción = canción;
    }
    public void datosMúsica(){
        System.out.println("Género:"+getGénero()+"  Plataforma:"+getPlataforma()+"  Artista:"+getArtista()+"    Canción:"+getCanción());
    }
}
