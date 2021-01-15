package ru.ssau.tk.Practice5_4;

import org.testng.annotations.Test;
import ru.ssau.tk.Practice5_1.Location;
import ru.ssau.tk.Practice5_1.Settlement;
import ru.ssau.tk.Practice5_1.Waypoint;

import static org.testng.Assert.*;

public class LocationTest {
    Settlement city = new Settlement();
    Settlement village0 = new Settlement();
    Settlement village1 = new Settlement();
    Settlement village2 = new Settlement();
    Settlement village3 = new Settlement();
    Waypoint warehouse = new Waypoint();

    @Test
    public void testEquals() {
        city.setId(23);

        village0.setId(50);
        village1.setId(31);
        village2.setId(23);
        village3.setId(50);

        warehouse.setId(31);

        city.setType(Location.SettlementType.CITY);

        village1.setType(Location.SettlementType.VILLAGE);
        village2.setType(Location.SettlementType.VILLAGE);
        village3.setType(Location.SettlementType.VILLAGE);

        warehouse.setType(Location.WaypointType.WAREHOUSE);

        assertTrue(village0.equals(village3));
        assertTrue(village3.equals(village0));
        assertTrue(village1.equals(village1));
        assertTrue(city.equals(village2));

        assertFalse(warehouse.equals(village1));
        assertFalse(warehouse.equals(village0));
        assertFalse(village0.equals(village2));
        assertFalse(city.equals(null));

        city.setId(23);
        assertFalse(village3.equals(city));
    }
}