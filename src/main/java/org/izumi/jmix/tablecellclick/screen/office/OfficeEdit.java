package org.izumi.jmix.tablecellclick.screen.office;

import io.jmix.ui.screen.*;
import org.izumi.jmix.tablecellclick.entity.Office;

@UiController("Office.edit")
@UiDescriptor("office-edit.xml")
@EditedEntityContainer("officeDc")
public class OfficeEdit extends StandardEditor<Office> {
}