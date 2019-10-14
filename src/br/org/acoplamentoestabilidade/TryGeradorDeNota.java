package br.org.acoplamentoestabilidade;

import java.util.Arrays;
import java.util.List;

public class TryGeradorDeNota {

    public static void main(String[] args) {

        Fatura fatura = new Fatura();
        fatura.setCliente("Andrade");
        fatura.setValorMensal(100.00);

        List<AcaoAposGerarNota> listAcoes = Arrays.asList( new EnviadorDeEmail(), new EnviadorDeSms());

        GeradorDeNotaFiscal geradorDeNotaFiscal = new GeradorDeNotaFiscal(listAcoes);

        geradorDeNotaFiscal.gera(fatura);




    }
}
