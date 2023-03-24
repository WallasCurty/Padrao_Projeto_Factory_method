package padroescriacao.factorymethod.factorymethod;

import org.junit.jupiter.api.Test;
import padroescriacao.factorymethod.ISistemaOperacional;
import padroescriacao.factorymethod.SistemaOperacionalFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WindowsTest {
    @Test
    void deveEfetuarDownload(){
        ISistemaOperacional SO = SistemaOperacionalFactory.realizarDownload("Windows");
        assertEquals("Sucesso no dowload do Windows.", SO.efetuarDownload());
    }
}
