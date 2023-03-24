package factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WindowsTest {

    @Test
    void deveReakizarDowload() {
        ISistemaOperacional SO = SistemaOperacionalFactory.realizarDownload("Windows");
        assertEquals("Boleto para pagamento gerado com sucesso.", pagamento.efetuarPagamento());
    }
}