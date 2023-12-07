import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner partidos=new Scanner(System.in);
        Scanner escucharMúsica=new Scanner(System.in);
        System.out.println("Hobbie:fútbol");
        System.out.print("Día que juega:");
        String día=partidos.next();
        System.out.print("Posición en la que juega:");
        String posición=partidos.next();
        System.out.print("Tipo de campo en el que juega:");
        String tipo=partidos.next();
        Fútbol partido1=new Fútbol(posición, día, tipo);
        partido1.datosFútbol();
        System.out.println("Hobbie:escuchar múisca");
        System.out.print("Género:");
        String género=escucharMúsica.next();
        System.out.print("Plataforma:");
        String plataforma=escucharMúsica.next();
        System.out.print("Artista:");
        String artista=escucharMúsica.next();
        System.out.print("Canción:");
        String canción= escucharMúsica.next();
        Bachata canción1=new Bachata("", "");
    }
}