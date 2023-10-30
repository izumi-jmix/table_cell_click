package org.izumi.jmix.tablecellclick.screen.office;

import io.jmix.ui.screen.*;
import org.izumi.jmix.tablecellclick.entity.Office;

@UiController("Office.browse")
@UiDescriptor("office-browse.xml")
@LookupComponent("officesTable")
public class OfficeBrowse extends StandardLookup<Office> {
}