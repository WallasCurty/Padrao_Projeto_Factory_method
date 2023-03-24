package padroescriacao.factorymethod.factorymethod;

import org.junit.jupiter.api.Test;
import padroescriacao.factorymethod.ISistemaOperacional;
import padroescriacao.factorymethod.SistemaOperacionalFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IOSTest {
    @Test
    void deveEfetuarDownload(){
        ISistemaOperacional SO = SistemaOperacionalFactory.realizarDownload("Ios");
        assertEquals("Sucesso no dowload do Ios.", SO.efetuarDownload());
    }
}
