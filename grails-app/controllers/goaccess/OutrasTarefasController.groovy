
package goaccess
import grails.plugin.springsecurity.annotation.Secured

@Secured('ROLE_ADMIN')
class OutrasTarefasController {
	
	def index(){
		
	}

    def indexInicial() {
		//render "OIiii!!!"
		/*Por enquanto serve apenas para direcionar para a p�gina inicial padrao do Grails,
		 * pois ela tem informa��es que podem nos ajudar.*/
		
	}
	
	def seguro() {
		render "ambiente restrito, vc est� autenticado!"
	}
}
