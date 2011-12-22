/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sculptorguimetamodel.validation;

import sculptorguimetamodel.PropertyReference;

/**
 * A sample validator interface for {@link sculptorguimetamodel.TableColumn}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface TableColumnValidator {
	boolean validate();

	boolean validateLabel(String value);
	boolean validateColumnType(String value);
	boolean validateForProperty(PropertyReference value);

	boolean validateFilterable(boolean value);

	boolean validateSortable(boolean value);
}
