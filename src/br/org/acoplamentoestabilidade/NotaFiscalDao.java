package br.org.acoplamentoestabilidade;

public class NotaFiscalDao implements AcaoAposGerarNota{
	
	@Override
    public void executa(NotaFiscal nf) {
        System.out.println("salva nota fiscal no banco");
    }
}