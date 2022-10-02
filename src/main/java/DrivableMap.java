/* Below is the DrivableMap class, which is a map that contains a
 * HashMap mapping Strings to Drivable objects.
 * (Think of Python dictionaries as a comparison -- the concept is
 * similar!)
 *
 * Implement the requested methods as stated in the TODOs. We've
 * created the constructor for you already.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class DrivableMap {
    HashMap<String, Drivable> drivable_map;

    /**
     * A generic constructor that initializes car_map
     * as an empty HashMap.
     */
    public DrivableMap() {
        drivable_map = new HashMap<>();
    }
    /**
     * add a drivable item with the given ID to the DrivableMap
     * @param id    the ID of the item added
     * @param item  the item added
     * @return      whether the item has been added
     */
    public boolean addDrivable(String id, Drivable item) {
        if (!this.drivable_map.containsKey(id)) {
            this.drivable_map.put(id, item);
            return true;
        }
        return false;
    }
    /**
     * determines if there is at least one item in drivable_map that
     * has a greater maxSpeed than the speed given
     * @param speed the speed given
     * @return      whether an item has a higher maxSpeed than speed
     */
    public boolean hasFasterThan(int speed) {
        for (Drivable d : drivable_map.values()) {
            if (d.getMaxSpeed() >= speed) return true;
        }
        return false;
    }

    /**
     * return a list containing all the Tradable items in drivable_map
     * @return  the list in question
     */
    public List getTradable() {
        List l = new ArrayList<Tradable>();
        for (Drivable d : drivable_map.values()) {
            if (d instanceof Tradable) {
                l.add(d);
            }
        }

        return l;
    }
}