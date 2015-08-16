package goaccess

class Equipamento {

	String ip
	String mac
	Solicitacao solicitacao
		
	String toString () {
		"${this.mac}"
	}
	
	static belongsTo = Solicitacao
	
    static constraints = {
		ip(blank:false,unique:true)
		mac(nullable:false,blank:false)
    }
}
