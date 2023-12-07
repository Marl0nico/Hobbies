public class Música extends Hobbies{
    public Música(String fútbol, String música) {
        super(fútbol, música);
    }
    String género, plataforma;
    public Música(String fútbol, String música, String género, String plataforma) {
        super(fútbol, música);
        this.género = género;
        this.plataforma=plataforma;
    }
    public String getGénero() {
        return género;
    }
    public void setGénero(String género) {
        this.género = género;
    }
    public String getPlataforma(){
        return plataforma;
    }
    public void setPlataforma(String género){
        this.plataforma=plataforma;
    }
}
