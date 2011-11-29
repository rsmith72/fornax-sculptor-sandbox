package org.fornax.cartridges.sculptor.generator.templates;

import java.io.IOException;
import java.util.HashMap;

import org.fornax.utilities.xtendtools.xunit.XpandUnit;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import sculptorguimetamodel.GuiApplication;
import sculptorguimetamodel.GuiModule;
import sculptorguimetamodel.View;

public class GwtViewBaseTemplateTest extends TemplateTestBase {
	
    private static GuiApplication guiApp;

    
    @BeforeClass
    public static void before() throws Exception {
        System.setProperty("project.nature", "business-tier, rcp");
		System.setProperty("datetime.library", "joda");
        System.setProperty("gui.createDefaults", "false");
        System.setProperty("package.gwt", "gwt");
        
        initWorkflowContext("workflowguidsl-test-library-gwt.mwe");
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
    	
        XpandUnit.xpand("templates::gwt::View::viewBase", tableView,
                new HashMap<String, Object>(), getXpandTempDir());
        
        String tableViewBaseCode = getFileText("org/fornax/cartridges/sculptor/examples/library/person/gwt/client/view/TableViewViewBase.java");
        
        assertContainsConsecutiveFragments(tableViewBaseCode,
        		"public class TableViewViewBase extends com.google.gwt.user.client.ui.Composite",
        		"implements org.fornax.cartridges.sculptor.examples.library.person.gwt.client.view.TableViewView {");

        	
        assertContainsConsecutiveFragments(tableViewBaseCode,
        		"private static TableViewViewBaseUiBinder uiBinder = com.google.gwt.core.client.GWT",
        		".create(TableViewViewBaseUiBinder.class);");
    }
    
}
