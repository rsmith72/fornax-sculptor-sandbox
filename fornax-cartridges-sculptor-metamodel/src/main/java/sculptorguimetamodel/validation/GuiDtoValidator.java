/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sculptorguimetamodel.validation;

import sculptorguimetamodel.GuiModule;
import sculptormetamodel.DomainObject;

/**
 * A sample validator interface for {@link sculptorguimetamodel.GuiDto}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface GuiDtoValidator {
	boolean validate();

	boolean validateFor(DomainObject value);

	boolean validateGuiModule(GuiModule value);
}
