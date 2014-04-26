package accadacca.website


class CarController {
    def index() {
		def list = []
		list << new Car(make: 'Holden', model:'Barina', year:2005)
		list << new Car(make: 'Suzuki', model:'Alto', year:2013)
		list << new Car(make: 'Ford', model:'Falcon', year:2009)
        [ list:list ]
    }
}