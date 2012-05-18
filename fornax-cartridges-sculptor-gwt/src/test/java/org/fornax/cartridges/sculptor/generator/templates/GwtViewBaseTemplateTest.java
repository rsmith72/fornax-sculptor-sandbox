package org.fornax.cartridges.sculptor.generator.templates;

import java.io.IOException;
import java.util.HashMap;

import org.fornax.utilities.xtendtools.xunit.XpandUnit;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import sculptorguimetamodel.GuiApplication;
import sculptorguimetamodel.GuiModule;
import sculptorguimetamodel.View;

public class GwtViewBaseTemplateTest extends TemplateTestBase {


    @BeforeClass
    public static void before() throws Exception {
		System.setProperty("widgetType.class.SimplePanel",
				"com.google.gwt.user.client.ui.SimplePanel");
		System.setProperty("widgetType.tag.SimplePanel", "g:SimplePanel");
		initTemplateTestBase();
    }

    @AfterClass
    public static void after() {
		System.getProperties().remove("widgetType.class.SimplePanel");
		System.getProperties().remove("widgetType.tag.SimplePanel");
        teardownTemplateTestBase();
    }
    
    private GuiModule personModule() {
        return (GuiModule) getNamedElement("person", guiApp.getModules());
    }

    private GuiModule mediaModule() {
        return (GuiModule) getNamedElement("media", guiApp.getModules());
    }

    @Test
    public void assertTableViewBaseCode() throws IOException {
    	View tableView = (View) getNamedElement("TableView", personModule().getViews());
    	
        XpandUnit.xpand("templates::gwt::View::viewBaseForUnitTest", tableView,
                new HashMap<String, Object>(), getXpandTempDir());
        
        String tableViewBaseCode = getFileText("org/fornax/cartridges/sculptor/examples/library/person/gwt/client/gen/view/TableViewViewBase.java");
        
        assertContainsConsecutiveFragments(tableViewBaseCode,
        		"public abstract class TableViewViewBase extends org.fornax.cartridges.sculptor.framework.gwt.client.BaseView",
        		"implements", "org.fornax.cartridges.sculptor.examples.library.person.gwt.client.gen.view.TableViewViewBaseIf", "{");//,
        	
        assertContainsConsecutiveFragments(tableViewBaseCode,
        		"private static TableViewViewBaseUiBinder uiBinder = com.google.gwt.core.client.GWT",
        		".create(TableViewViewBaseUiBinder.class);");
        
        // Assert panel code
        assertContainsConsecutiveFragments(tableViewBaseCode, "@com.google.gwt.uibinder.client.UiField",
        		"public com.google.gwt.user.client.ui.HTMLPanel personDetailsPanel;");

    	assertContainsConsecutiveFragments(tableViewBaseCode, "public com.google.gwt.user.client.ui.HasWidgets.ForIsWidget getPersonDetailsPanelForIsWidget() {",
    		"return personDetailsPanel;",
    	"}");
 
        // Assert InformationalText code
        assertContainsConsecutiveFragments(tableViewBaseCode, "	public com.google.gwt.user.client.ui.HasText getInfo1HasText() {",
        		"return info1;",
        		"}");
        
        // Assert nestedNameField code
        assertContainsConsecutiveFragments(tableViewBaseCode, "@com.google.gwt.uibinder.client.UiField",
        	"public com.google.gwt.user.client.ui.TextBox nestedNameField;");
        
        assertContainsConsecutiveFragments(tableViewBaseCode, "public com.google.gwt.user.client.ui.HasText getNestedNameFieldHasText() {",
		"return nestedNameField;",
		"}");	
       
        
        // Assert date table column
        assertContains(tableViewBaseCode, "com.google.gwt.user.cellview.client.Column<org.fornax.cartridges.sculptor.examples.library.person.gwt.shared.domain.Person, java.util.Date> mytableBirthDateTableCol;");
        
        // Assert button table column
        assertContains(tableViewBaseCode, "protected abstract String getPersonTableTableEditColValue(org.fornax.cartridges.sculptor.examples.library.person.gwt.shared.domain.Person object)");
        
        // Assert errorPanel
        assertContains(tableViewBaseCode, "com.google.gwt.user.client.ui.SimplePanel errorPanel;");
    }

    @Test
    public void assertViewAltPkgBaseCode() throws IOException {
    	View browseView = (View) getNamedElement("MediaBrowse", mediaModule().getViews());
    	
    	Assert.assertEquals("org.fornax.cartridges.sculptor.examples.library.mediaalt", browseView.getModule().getBasePackage());
    	
        XpandUnit.xpand("templates::gwt::View::viewBaseForUnitTest", browseView,
                new HashMap<String, Object>(), getXpandTempDir());
        
        String tableViewBaseCode = getFileText("org/fornax/cartridges/sculptor/examples/library/mediaalt/gwt/client/gen/view/MediaBrowseViewBase.java");
        
    }
    
    @Test
    public void assertPersonFormViewBaseCode() throws IOException {
    	View personForm = (View) getNamedElement("PersonForm", personModule().getViews());
    	
        XpandUnit.xpand("templates::gwt::View::viewBaseForUnitTest", personForm,
                new HashMap<String, Object>(), getXpandTempDir());
        
//        String tableViewBaseCode = getFileText("org/fornax/cartridges/sculptor/examples/library/person/gwt/client/view/TableViewViewBase.java");

    }
}
