package accadacca.website


class CarController {
    def index() {
        Car car = new Car(make: 'Holden', model:'Barina', year:2005)
        [ car:car ]
    }
}