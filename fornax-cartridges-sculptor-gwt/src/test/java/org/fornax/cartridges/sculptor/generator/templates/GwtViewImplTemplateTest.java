package org.fornax.cartridges.sculptor.generator.templates;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.xpand2.output.Outlet;
import org.fornax.utilities.xtendtools.xunit.XpandUnit;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import sculptorguimetamodel.GuiApplication;
import sculptorguimetamodel.GuiModule;
import sculptorguimetamodel.View;

public class GwtViewImplTemplateTest extends TemplateTestBase {
	
    private static GuiApplication guiApp;

    
    @BeforeClass
    public static void before() throws Exception {
        System.setProperty("project.nature", "business-tier, rcp");
		System.setProperty("datetime.library", "joda");
        System.setProperty("gui.createDefaults", "false");
        System.setProperty("package.gwt", "gwt");
        
        Map<String, Object> slotContents = new HashMap<String, Object>();
        slotContents.put("TO_SRC", getXpandTempDir());

        initWorkflowContext("workflowguidsl-test-library-gwt.mwe", slotContents);
        guiApp = (GuiApplication) ctx.get("guiModel");
    }

    @AfterClass
    public static void after() {
        System.getProperties().remove("project.nature");
		System.getProperties().remove("datetime.library");
		System.getProperties().remove("gui.createDefaults");
		System.getProperties().remove("package.gwt");

    }

    
    private GuiModule personModule() {
        return (GuiModule) getNamedElement("person", guiApp.getModules());
    }

    @Test
    public void assertTableViewBaseCode() throws IOException {
    	View tableView = (View) getNamedElement("TableView", personModule().getViews());
    	
    	HashMap<String, Object> globalVars = new HashMap<String, Object>();
//    	slots.put("TO_SRC", getXpandTempDir());
    	
        XpandUnit.xpand("templates::gwt::View::viewImplForUnitTest", tableView,
                globalVars, getXpandTempDir());
        
        String tableViewCode = getFileText("org/fornax/cartridges/sculptor/examples/library/person/gwt/client/view/TableViewViewImpl.java");
    }
    
}