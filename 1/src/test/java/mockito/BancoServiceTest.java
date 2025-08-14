package mockito;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


public class BancoServiceTest {


    @Test
    public void testConsultarSaldo() {
        ContaRepository contaRepository = mock(ContaRepository.class);

        Conta conta = new Conta("12345", 1000.0)

        when(contaRepository.buscarConta("12345")).thenReturn(conta);

        BancoService bancoService = new BancoService(contaRepository);

        double saldo = bancoService.consultarSaldo("12345");

        Assertions.assertEquals(1000.0, saldo);

        verify(contaRepository, times(1)).buscarConta("12345");
    }

    @Test
    public void testDepositar() {
        ContaRepository contaRepository = mock(ContaRepository.class);

        Conta conta = new Conta("54321", 2000.0);

        when(contaRepository.buscarConta("54321")).thenReturn(conta);

        BancoService bancoService = new BancoService(contaRepository);

        bancoService.depositar("54321", 100.0);

        Assertions.assertEquals(2100.0, conta.getSaldo());

        verify(contaRepository, times(1)).buscarConta("54321");
        verify(contaRepository, times(1)).salvar(conta);
    }
}