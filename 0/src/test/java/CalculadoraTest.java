import mockito.Calculadora;
import mockito.ServicoMatematico;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class CalculadoraTest {

    @Mock
    private ServicoMatematico servicoMatematico;

    private Calculadora calculadora;

    @BeforeEach
    public void setup(){
        this.calculadora = new Calculadora(servicoMatematico);
    }

    @Test
    public void testSomar(){
        when(servicoMatematico.somar(2, 3)).thenReturn(5);

        int result = calculadora.somar(2, 3);

        Assertions.assertEquals(5, result);

        verify(servicoMatematico).somar(2, 3);
    }
}
