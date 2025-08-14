package mockito;

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

}
