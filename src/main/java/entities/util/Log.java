package entities.util;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

public class Log {

    private static SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private String mensagem;
    private String porcentagem;
    private LogLevel logLevel;
    private HardwareType hardwareType;

    public LogLevel getLogLevel() {
        return logLevel;
    }

    public void setLogLevel(LogLevel logLevel) {
        this.logLevel = logLevel;
    }

    public HardwareType getHardwareType() {
        return hardwareType;
    }

    public void setHardwareType(HardwareType hardwareType) {
        this.hardwareType = hardwareType;
    }

    public String getMensagem() {
        return this.mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getPorcentagem() {
        return this.porcentagem;
    }

    public void setPorcentagem(String porcentagem) {
        this.porcentagem = porcentagem;
    }

    @Override
    public String toString() {
        return formato.format(new Date()) +
                ", mensagem='" + mensagem + '\'' +
                ", porcentagem='" + porcentagem + '\'' +
                ", logLevel=" + logLevel +
                ", hardwareType=" + hardwareType;
    }
}


