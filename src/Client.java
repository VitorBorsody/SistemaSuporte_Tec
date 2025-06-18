 import java.time.LocalDateTime;
 import java.time.format.DateTimeFormatter;
public class Client {
    String formatted;
    LocalDateTime currentTime;
    private static final DateTimeFormatter FORMATTER=DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    String name;
    String ProblemaRelatado;
    int Num_chamado;

    public Client(String name, int num_chamado, String problemaRelatado) {
        this.name = name;
        Num_chamado = num_chamado;
        ProblemaRelatado = problemaRelatado;
        this.currentTime=LocalDateTime.now();
        this.formatted=this.currentTime.format(FORMATTER);
    }

    public String getFormatted() {
        return formatted;
    }

    public void setFormatted(String formatted) {
        this.formatted = formatted;
    }

    public LocalDateTime getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(LocalDateTime currentTime) {
        this.currentTime = currentTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProblemaRelatado() {
        return ProblemaRelatado;
    }

    public void setProblemaRelatado(String problemaRelatado) {
        ProblemaRelatado = problemaRelatado;
    }

    public int getNum_chamado() {
        return Num_chamado;
    }

    public void setNum_chamado(int num_chamado) {
        Num_chamado = num_chamado;
    }
}
