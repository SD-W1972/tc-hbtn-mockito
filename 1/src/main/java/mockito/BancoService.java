package mockito;

public class BancoService {
    private ContaRepository contaRepository;


    public BancoService(ContaRepository contaRepository) {
        this.contaRepository = contaRepository;
    }


    public double consultarSaldo(String numeroConta) {
        return contaRepository.buscarConta(numeroConta).getSaldo();
    }


    public void depositar(String numeroConta, double valor) {
        Conta conta = contaRepository.buscarConta(numeroConta);
        conta.setSaldo(valor);
        contaRepository.salvar(conta); 
    }
}