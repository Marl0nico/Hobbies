public class Fútbol extends Hobbies{
    public Fútbol(String fútbol, String música) {
        super(fútbol, música);
    }
    String posición, díaSemana, tipoCampo;
    public Fútbol(String posición, String díaSemana, String tipoCampo) {
        super(posición, díaSemana);
        this.posición = posición;
        this.díaSemana = díaSemana;
        this.tipoCampo = tipoCampo;
    }
    public String getPosición() {
        return posición;
    }
    public void setPosición(String posición) {
        this.posición = posición;
    }
    public String getDíaSemana() {
        return díaSemana;
    }
    public void setDíaSemana(String díaSemana) {
        this.díaSemana = díaSemana;
    }
    public String getTipoCampo() {
        return tipoCampo;
    }
    public void setTipoCampo(String tipoCampo) {
        this.tipoCampo = tipoCampo;
    }
    public void datosFútbol(){
        System.out.println("Posición:"+getPosición()+"  Día de la semana que juega:"+getDíaSemana()+"   Tipo de campo en que juega:"+getTipoCampo());
    }
}
