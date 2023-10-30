package org.izumi.jmix.tablecellclick.screen.city;

import io.jmix.ui.screen.*;
import org.izumi.jmix.tablecellclick.entity.City;

@UiController("City.browse")
@UiDescriptor("city-browse.xml")
@LookupComponent("citiesTable")
public class CityBrowse extends StandardLookup<City> {
}