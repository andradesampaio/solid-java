package br.org.acoplamentoestabilidade;

public class EnviadorDeSms implements AcaoAposGerarNota{

    @Override
    public void executa(NotaFiscal nf) {
        System.out.println("envia sms da nf " + nf.getId());

    }
}
