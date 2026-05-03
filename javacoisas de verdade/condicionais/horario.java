package condicionais;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class horario {
    public static void main(String[] args) {
        LocalDateTime agora = LocalDateTime.now();
        LocalTime manhã = LocalTime.parse("00:00");
        LocalTime tarde = LocalTime.parse("12:00");
        LocalTime noite = LocalTime.parse("18:00");
        LocalTime mimir = LocalTime.parse("22:00");

        if (agora.toLocalTime().isAfter(manhã) && agora.toLocalTime().isBefore(tarde))
            System.out.println("Bom dia");
        if (agora.toLocalTime().isAfter(tarde) && agora.toLocalTime().isBefore(noite))
            System.out.println("Boa tarde");
        if (agora.toLocalTime().isAfter(noite) || agora.toLocalTime().isBefore(manhã))
            System.out.println("Boa noite");
        if (agora.toLocalTime().isAfter(mimir) && agora.toLocalTime().isBefore(manhã))
            System.out.println("va mimir");
    }
}

