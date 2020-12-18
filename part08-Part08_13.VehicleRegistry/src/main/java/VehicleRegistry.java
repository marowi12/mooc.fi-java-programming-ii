
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author marvin
 */
public class VehicleRegistry {

    private HashMap<LicensePlate, String> registry;

    public VehicleRegistry() {
        this.registry = new HashMap<>();
    }


    /*assigns the owner it received as a parameter to a car that corresponds to the license plate received as a parameter.
If the license plate doesn't have an owner, the method returns true.
If the license already has an owner attached, the method returns false and does nothing.*/
    public boolean add(LicensePlate licensePlate, String owner) {
        this.registry.putIfAbsent(licensePlate, owner);
        if (!this.registry.containsKey(licensePlate)) {
            this.registry.put(licensePlate, owner);
            return true;
        }       
        return false;
    }

//    returns the owner of the car corresponding to the license plate received as a parameter. 
    //   If the car isn't in the registry, the method returns null.
    public String get(LicensePlate licensePlate) {
        return this.registry.get(licensePlate);
    }

    /*removes the license plate and attached data from the registry. 
The method returns true if removed successfully and false if the license plate wasn't in the registry.*/
    public boolean remove(LicensePlate licensePlate) {
        if (this.registry.containsKey(licensePlate)) {
            this.registry.remove(licensePlate);
            return true;
        }
        return false;
    }

    //prints the license plates in the registry.
    public void printLicensePlates() {
        registry.keySet().forEach((l) -> {
            System.out.println(l.toString());
        });
    }
    public void printOwners () {
        ArrayList<String> owners = new ArrayList<>();
        registry.keySet().forEach((action) -> {
            if (!owners.contains(this.registry.get(action))) {
        owners.add(this.registry.get(action));                
            }

    });
        for (String o : owners) {
            System.out.print(o + "  has a car with licenseplate: ");
            if (this.registry.containsValue(o)) {
                System.out.println(getKeyFromValue(registry, o));
                
            }
        }
        
    }


        private static <K, V> K getKeyFromValue(Map<K, V> map , Object value) {
    
        //get map entries and iterate over them
        for(Map.Entry<K, V> entry : map.entrySet()){
            
            if( entry.getValue().equals(value) ){
                return entry.getKey();
            }
        }
    
        return null;
    }
}
    

