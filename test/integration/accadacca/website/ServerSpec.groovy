package accadacca.website



import spock.lang.*

/**
 *
 */
class ServerSpec extends Specification {

	def serverService
	
	def setup() {
	}

	def cleanup() {
	}

	void "test something"() {
	}

	void testIP() {
		assert serverService != null, "ServerService is null! BAD!"
		assert serverService.getServer("192.192.192.210") == "medmgmt-210.tajen.edu.tw", "ServerService.getServer() FAIL!"
	}
}
