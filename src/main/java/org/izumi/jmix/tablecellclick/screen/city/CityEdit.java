package org.izumi.jmix.tablecellclick.screen.city;

import io.jmix.ui.screen.*;
import org.izumi.jmix.tablecellclick.entity.City;

@UiController("City.edit")
@UiDescriptor("city-edit.xml")
@EditedEntityContainer("cityDc")
public class CityEdit extends StandardEditor<City> {
}