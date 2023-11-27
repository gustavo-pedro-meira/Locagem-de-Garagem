import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProprietarioTest {

    @Test
    void ajustarData() {
        DatasDisponiveis diaTest = DatasDisponiveis.DIA_3;
        Proprietario proprietario = new Proprietario("Gustavo", 19, 1062555623, "Desterro-PB", new Garagem(2, "Rua Dois Irmãos"));
        boolean resultado = proprietario.ajustarData(diaTest, false);
        assertEquals(false, resultado);
    }
}