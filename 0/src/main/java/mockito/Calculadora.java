package mockito;

public class Calculadora {
    public int soma(int a, int b){
        ServicoMatematicoImpl servicoMatematico = new ServicoMatematicoImpl();
        return servicoMatematico.somar(a, b);
    }

}
