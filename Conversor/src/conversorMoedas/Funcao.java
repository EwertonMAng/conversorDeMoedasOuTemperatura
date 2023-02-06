package conversorMoedas;

import conversorMoedas.ConverteMoedas;
import conversorMoedas.ConverteMoedasParaReais;

import javax.swing.JOptionPane;
import java.util.Objects;

public class Funcao {

    ConverteMoedas moedas = new ConverteMoedas();
    ConverteMoedasParaReais reais = new ConverteMoedasParaReais();

    public void converterMoeda(double valorRecebido) {
        String opcao = (JOptionPane.showInputDialog(null,
                "Escolha a moeda para a qual você deseja girar seu dinheiro ", "Moedas", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"De Reais a Dólares", "De Reais para Euros", "De Reais para Libras", "De Reais para Peso Argentino", "De Reais para Peso Chileno", "De Dólares para Reais", "De Euros para Reais", "De Libras para Reais", "De Peso Argentino para Reais", "De Peso Chileno para Reais",}, "Escolha")).toString();

        switch (opcao) {
            case "De Reais para Dólares":
                moedas.converterReaisParaDolares(valorRecebido);
                break;
            case "De Reais para Euros":
                moedas.converterReaisParaEuros(valorRecebido);
                break;
            case "De Reais para Libras":
                moedas.converterReaisParaLibras(valorRecebido);
                break;
            case "De Reais para Peso Argentino":
                moedas.converterReaisParaPesosArgentinos(valorRecebido);
                break;
            case "De Reais para Peso Chileno":
                moedas.converterReaisParaPesosChilenos(valorRecebido);
                break;             
               
            case "De Dólares para Reais":
                reais.converterDolaresParaReais(valorRecebido);
                break;
            case "De Euros para Reais":
                reais.converterEurosParaReais(valorRecebido);
                break;
            case "De Libras para Reais":
                reais.converterLibrasParaReais(valorRecebido);
                break;
            case "De Peso Argentino para Reais":
                reais.converterPesosArgentinosParaReais(valorRecebido);
                break;
            case "De Peso Chileno para Reais":
                reais.converterPesosChilenosParaReais(valorRecebido);
                break;
     
        }
    }
}


