import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void buscarGaragem() {
        Garagem garagem = new Garagem(2,"Desterro-PB, Rua nossa Senhora de Fátima");
        Veiculo veiculo = new Veiculo("BMW","BM 321",2017);
        Cliente cliente = new Cliente("Gustavo",19,1062552342,"Tataíra-PB", veiculo);
        String resultado = cliente.buscarGaragem(garagem);
        assertTrue(resultado == garagem.getLocalizacao());
    }

    @Test
    void locarGaragem() {
        Garagem garagemDesterro = new Garagem(2,"Desterro-PB, Rua nossa Senhora de Fátima");
        Veiculo veiculo = new Veiculo("BMW","BM 321",2017);
        Cliente cliente = new Cliente("Gustavo",19,1062552342,"Tataíra-PB", veiculo);
        boolean resultado = cliente.locarGaragem(garagemDesterro,DatasDisponiveis.DIA_4);
        assertTrue(resultado == false);
    }
}