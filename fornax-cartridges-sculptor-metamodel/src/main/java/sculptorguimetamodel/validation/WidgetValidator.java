/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sculptorguimetamodel.validation;

import org.eclipse.emf.common.util.EList;
import sculptorguimetamodel.UiCondition;
import sculptorguimetamodel.View;

/**
 * A sample validator interface for {@link sculptorguimetamodel.Widget}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface WidgetValidator {
	boolean validate();

	boolean validateView(View value);

	boolean validateLabel(String value);

	boolean validateBehaviorBindings(EList value);

	boolean validateEnabled(UiCondition value);
}
