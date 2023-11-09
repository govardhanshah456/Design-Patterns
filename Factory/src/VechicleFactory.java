public class VechicleFactory {
    public Vehicle createVehicle(String type){
        if(type.equalsIgnoreCase("bike")){
            return new Bike();
        }
        else if(type.equalsIgnoreCase("car"))
            return new Car();
        return null;
    }
}
