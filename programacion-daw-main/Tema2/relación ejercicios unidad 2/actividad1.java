import java.time.LocalDateTime;
public class actividad1 {
    public static void main(String[] args) {
        int hora = LocalDateTime.now().getHour();

    if (hora >= 6 && hora <= 12) {
    System.out.println("Buenos días");
    }

   else if (hora >= 13 && hora <= 20) {
    System.out.println("Buenas tardes");
    }

    else if (hora >= 21 && hora <= 5) {
    System.out.println("Buenas noches");
}


    }
}