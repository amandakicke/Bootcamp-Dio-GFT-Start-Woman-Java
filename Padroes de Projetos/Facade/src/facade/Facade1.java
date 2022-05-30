
package facade;

import Subsistema1.CrmService;
import Subsistema2.CepApi;

public class Facade1 {
    public void migrarCliente(String nome, String cep){
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
	String estado = CepApi.getInstancia().recuperarEstado(cep);
		
	CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
