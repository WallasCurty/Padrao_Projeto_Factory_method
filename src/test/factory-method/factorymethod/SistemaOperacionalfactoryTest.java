package padroescriacao.factorymethod.factorymethod;

import org.junit.jupiter.api.Test;
import padroescriacao.factorymethod.ISistemaOperacional;
import padroescriacao.factorymethod.SistemaOperacionalFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class SistemaOperacionalfactoryTest {
    @Test
    void quandoDownloadForInexistente_deveRetornarExcecao() {
        try {
            ISistemaOperacional SO = SistemaOperacionalFactory.realizarDownload("Android");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Sistema Operacional inexistente.", e.getMessage());
        }
    }
}
