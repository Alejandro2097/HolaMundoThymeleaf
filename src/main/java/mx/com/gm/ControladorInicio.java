
package mx.com.gm;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ALEJANDRO
 */
@RestController 
@Slf4j
public class ControladorInicio {
    @GetMapping("/")
    public String inicio(){
        log.info("Ejecutando el controlador rest");
        log.debug("mas detalle del controlador");
        return "Hola mundo con Spring boot";
    }
}
