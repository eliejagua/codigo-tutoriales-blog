package basic;

import org.springframework.stereotype.Component;

/**
 * Creado por  Ascari Q. Romo Pedraza - molder.itp@gmail.com on 20/03/17.
 */
@Component(value = "mensaje")
public class MensajeSms implements IMensaje {
    @Override
    public void enviar(String destinatario, String mensaje) {
        System.out.printf("Enviando mensaje SMS a %s \n Mensaje: %s", destinatario, mensaje);
    }
}
