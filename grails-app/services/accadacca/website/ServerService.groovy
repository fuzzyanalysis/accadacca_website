package accadacca.website

import grails.transaction.Transactional

@Transactional
class ServerService {

	static dataSource
	
	def getServer(String ip){
		assert dataSource != null, "Datasource is null! No Good!!!"
		def sql = Sql.newInstance(dataSource)
		def query = """select server_domain_name from server where server_ip_address = '""" + ip + """'"""
		
		try{
			def row = sql.firstRow(query)
			return row.server_domain_name
		} catch (Exception e){
			log.error "Exception thing"
		}
		log.debug("ip - ${server_ip_address} ip address - ")
		return null
	}
	
    def serviceMethod() {
		
    }
}
