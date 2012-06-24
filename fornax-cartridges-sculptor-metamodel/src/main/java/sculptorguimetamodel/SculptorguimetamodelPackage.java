/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sculptorguimetamodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import sculptormetamodel.SculptormetamodelPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see sculptorguimetamodel.SculptorguimetamodelFactory
 * @model kind="package"
 * @generated
 */
public interface SculptorguimetamodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sculptorguimetamodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.fornax-platform.org/sculptorgui";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sc";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SculptorguimetamodelPackage eINSTANCE = sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link sculptorguimetamodel.impl.GuiApplicationImpl <em>Gui Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptorguimetamodel.impl.GuiApplicationImpl
	 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getGuiApplication()
	 * @generated
	 */
	int GUI_APPLICATION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_APPLICATION__NAME = SculptormetamodelPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_APPLICATION__DOC = SculptormetamodelPackage.NAMED_ELEMENT__DOC;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_APPLICATION__HINT = SculptormetamodelPackage.NAMED_ELEMENT__HINT;

	/**
	 * The feature id for the '<em><b>Gui For Application</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_APPLICATION__GUI_FOR_APPLICATION = SculptormetamodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_APPLICATION__MODULES = SculptormetamodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Base Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_APPLICATION__BASE_PACKAGE = SculptormetamodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Gui Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_APPLICATION_FEATURE_COUNT = SculptormetamodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link sculptorguimetamodel.impl.GuiModuleImpl <em>Gui Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptorguimetamodel.impl.GuiModuleImpl
	 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getGuiModule()
	 * @generated
	 */
	int GUI_MODULE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_MODULE__NAME = SculptormetamodelPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_MODULE__DOC = SculptormetamodelPackage.NAMED_ELEMENT__DOC;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_MODULE__HINT = SculptormetamodelPackage.NAMED_ELEMENT__HINT;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_MODULE__CONDITIONS = SculptormetamodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Behaviors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_MODULE__BEHAVIORS = SculptormetamodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>User Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_MODULE__USER_TASKS = SculptormetamodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Base Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_MODULE__BASE_PACKAGE = SculptormetamodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Application</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_MODULE__APPLICATION = SculptormetamodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>For</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_MODULE__FOR = SculptormetamodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Views</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_MODULE__VIEWS = SculptormetamodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_MODULE__EVENTS = SculptormetamodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Service Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_MODULE__SERVICE_DEPENDENCIES = SculptormetamodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Commands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_MODULE__COMMANDS = SculptormetamodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Stub Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_MODULE__STUB_MODULE = SculptormetamodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Gui Dto Options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_MODULE__GUI_DTO_OPTIONS = SculptormetamodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Gui Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_MODULE_FEATURE_COUNT = SculptormetamodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The meta object id for the '{@link sculptorguimetamodel.impl.UserTaskImpl <em>User Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptorguimetamodel.impl.UserTaskImpl
	 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getUserTask()
	 * @generated
	 */
	int USER_TASK = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__NAME = SculptormetamodelPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__DOC = SculptormetamodelPackage.NAMED_ELEMENT__DOC;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__HINT = SculptormetamodelPackage.NAMED_ELEMENT__HINT;

	/**
	 * The feature id for the '<em><b>Sub Task Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__SUB_TASK_TRANSITIONS = SculptormetamodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>For</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__FOR = SculptormetamodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__ABSTRACT = SculptormetamodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__MODULE = SculptormetamodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Task Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__TASK_TYPE = SculptormetamodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>View Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__VIEW_PROPERTIES = SculptormetamodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Conversation Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__CONVERSATION_ROOT = SculptormetamodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Gap Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__GAP_CLASS = SculptormetamodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>User Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK_FEATURE_COUNT = SculptormetamodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link sculptorguimetamodel.impl.CreateTaskImpl <em>Create Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptorguimetamodel.impl.CreateTaskImpl
	 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getCreateTask()
	 * @generated
	 */
	int CREATE_TASK = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TASK__NAME = USER_TASK__NAME;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TASK__DOC = USER_TASK__DOC;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TASK__HINT = USER_TASK__HINT;

	/**
	 * The feature id for the '<em><b>Sub Task Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TASK__SUB_TASK_TRANSITIONS = USER_TASK__SUB_TASK_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>For</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TASK__FOR = USER_TASK__FOR;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TASK__ABSTRACT = USER_TASK__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TASK__MODULE = USER_TASK__MODULE;

	/**
	 * The feature id for the '<em><b>Task Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TASK__TASK_TYPE = USER_TASK__TASK_TYPE;

	/**
	 * The feature id for the '<em><b>View Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TASK__VIEW_PROPERTIES = USER_TASK__VIEW_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Conversation Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TASK__CONVERSATION_ROOT = USER_TASK__CONVERSATION_ROOT;

	/**
	 * The feature id for the '<em><b>Gap Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TASK__GAP_CLASS = USER_TASK__GAP_CLASS;

	/**
	 * The feature id for the '<em><b>Create DO With</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TASK__CREATE_DO_WITH = USER_TASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Populate DO With</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TASK__POPULATE_DO_WITH = USER_TASK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Create Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TASK_FEATURE_COUNT = USER_TASK_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link sculptorguimetamodel.impl.UpdateTaskImpl <em>Update Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptorguimetamodel.impl.UpdateTaskImpl
	 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getUpdateTask()
	 * @generated
	 */
	int UPDATE_TASK = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_TASK__NAME = USER_TASK__NAME;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_TASK__DOC = USER_TASK__DOC;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_TASK__HINT = USER_TASK__HINT;

	/**
	 * The feature id for the '<em><b>Sub Task Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_TASK__SUB_TASK_TRANSITIONS = USER_TASK__SUB_TASK_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>For</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_TASK__FOR = USER_TASK__FOR;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_TASK__ABSTRACT = USER_TASK__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_TASK__MODULE = USER_TASK__MODULE;

	/**
	 * The feature id for the '<em><b>Task Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_TASK__TASK_TYPE = USER_TASK__TASK_TYPE;

	/**
	 * The feature id for the '<em><b>View Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_TASK__VIEW_PROPERTIES = USER_TASK__VIEW_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Conversation Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_TASK__CONVERSATION_ROOT = USER_TASK__CONVERSATION_ROOT;

	/**
	 * The feature id for the '<em><b>Gap Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_TASK__GAP_CLASS = USER_TASK__GAP_CLASS;

	/**
	 * The feature id for the '<em><b>Find DO With</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_TASK__FIND_DO_WITH = USER_TASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Update DO With</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_TASK__UPDATE_DO_WITH = USER_TASK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Populate DO With</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_TASK__POPULATE_DO_WITH = USER_TASK_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Update Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_TASK_FEATURE_COUNT = USER_TASK_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link sculptorguimetamodel.impl.ViewTaskImpl <em>View Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptorguimetamodel.impl.ViewTaskImpl
	 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getViewTask()
	 * @generated
	 */
	int VIEW_TASK = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_TASK__NAME = USER_TASK__NAME;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_TASK__DOC = USER_TASK__DOC;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_TASK__HINT = USER_TASK__HINT;

	/**
	 * The feature id for the '<em><b>Sub Task Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_TASK__SUB_TASK_TRANSITIONS = USER_TASK__SUB_TASK_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>For</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_TASK__FOR = USER_TASK__FOR;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_TASK__ABSTRACT = USER_TASK__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_TASK__MODULE = USER_TASK__MODULE;

	/**
	 * The feature id for the '<em><b>Task Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_TASK__TASK_TYPE = USER_TASK__TASK_TYPE;

	/**
	 * The feature id for the '<em><b>View Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_TASK__VIEW_PROPERTIES = USER_TASK__VIEW_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Conversation Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_TASK__CONVERSATION_ROOT = USER_TASK__CONVERSATION_ROOT;

	/**
	 * The feature id for the '<em><b>Gap Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_TASK__GAP_CLASS = USER_TASK__GAP_CLASS;

	/**
	 * The feature id for the '<em><b>Find DO With</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_TASK__FIND_DO_WITH = USER_TASK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>View Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_TASK_FEATURE_COUNT = USER_TASK_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link sculptorguimetamodel.impl.ListTaskImpl <em>List Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptorguimetamodel.impl.ListTaskImpl
	 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getListTask()
	 * @generated
	 */
	int LIST_TASK = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TASK__NAME = USER_TASK__NAME;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TASK__DOC = USER_TASK__DOC;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TASK__HINT = USER_TASK__HINT;

	/**
	 * The feature id for the '<em><b>Sub Task Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TASK__SUB_TASK_TRANSITIONS = USER_TASK__SUB_TASK_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>For</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TASK__FOR = USER_TASK__FOR;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TASK__ABSTRACT = USER_TASK__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TASK__MODULE = USER_TASK__MODULE;

	/**
	 * The feature id for the '<em><b>Task Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TASK__TASK_TYPE = USER_TASK__TASK_TYPE;

	/**
	 * The feature id for the '<em><b>View Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TASK__VIEW_PROPERTIES = USER_TASK__VIEW_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Conversation Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TASK__CONVERSATION_ROOT = USER_TASK__CONVERSATION_ROOT;

	/**
	 * The feature id for the '<em><b>Gap Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TASK__GAP_CLASS = USER_TASK__GAP_CLASS;

	/**
	 * The feature id for the '<em><b>Search DO With</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TASK__SEARCH_DO_WITH = USER_TASK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>List Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TASK_FEATURE_COUNT = USER_TASK_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link sculptorguimetamodel.impl.DeleteTaskImpl <em>Delete Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptorguimetamodel.impl.DeleteTaskImpl
	 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getDeleteTask()
	 * @generated
	 */
	int DELETE_TASK = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_TASK__NAME = USER_TASK__NAME;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_TASK__DOC = USER_TASK__DOC;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_TASK__HINT = USER_TASK__HINT;

	/**
	 * The feature id for the '<em><b>Sub Task Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_TASK__SUB_TASK_TRANSITIONS = USER_TASK__SUB_TASK_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>For</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_TASK__FOR = USER_TASK__FOR;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_TASK__ABSTRACT = USER_TASK__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_TASK__MODULE = USER_TASK__MODULE;

	/**
	 * The feature id for the '<em><b>Task Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_TASK__TASK_TYPE = USER_TASK__TASK_TYPE;

	/**
	 * The feature id for the '<em><b>View Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_TASK__VIEW_PROPERTIES = USER_TASK__VIEW_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Conversation Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_TASK__CONVERSATION_ROOT = USER_TASK__CONVERSATION_ROOT;

	/**
	 * The feature id for the '<em><b>Gap Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_TASK__GAP_CLASS = USER_TASK__GAP_CLASS;

	/**
	 * The feature id for the '<em><b>Find DO With</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_TASK__FIND_DO_WITH = USER_TASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Delete DO With</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_TASK__DELETE_DO_WITH = USER_TASK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Delete Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_TASK_FEATURE_COUNT = USER_TASK_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link sculptorguimetamodel.impl.SubTaskTransitionImpl <em>Sub Task Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptorguimetamodel.impl.SubTaskTransitionImpl
	 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getSubTaskTransition()
	 * @generated
	 */
	int SUB_TASK_TRANSITION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TASK_TRANSITION__NAME = SculptormetamodelPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TASK_TRANSITION__DOC = SculptormetamodelPackage.NAMED_ELEMENT__DOC;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TASK_TRANSITION__HINT = SculptormetamodelPackage.NAMED_ELEMENT__HINT;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TASK_TRANSITION__TO = SculptormetamodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>For Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TASK_TRANSITION__FOR_REFERENCE = SculptormetamodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TASK_TRANSITION__FROM = SculptormetamodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Sub Task Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TASK_TRANSITION_FEATURE_COUNT = SculptormetamodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link sculptorguimetamodel.impl.ViewDataPropertyImpl <em>View Data Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptorguimetamodel.impl.ViewDataPropertyImpl
	 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getViewDataProperty()
	 * @generated
	 */
	int VIEW_DATA_PROPERTY = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_DATA_PROPERTY__NAME = SculptormetamodelPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_DATA_PROPERTY__DOC = SculptormetamodelPackage.NAMED_ELEMENT__DOC;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_DATA_PROPERTY__HINT = SculptormetamodelPackage.NAMED_ELEMENT__HINT;

	/**
	 * The feature id for the '<em><b>User Task</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_DATA_PROPERTY__USER_TASK = SculptormetamodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Message Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_DATA_PROPERTY__MESSAGE_KEY = SculptormetamodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>View Data Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_DATA_PROPERTY_FEATURE_COUNT = SculptormetamodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link sculptorguimetamodel.impl.TmpReferenceHolderImpl <em>Tmp Reference Holder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptorguimetamodel.impl.TmpReferenceHolderImpl
	 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getTmpReferenceHolder()
	 * @generated
	 */
	int TMP_REFERENCE_HOLDER = 10;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMP_REFERENCE_HOLDER__REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Sub Task Transition Holders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMP_REFERENCE_HOLDER__SUB_TASK_TRANSITION_HOLDERS = 1;

	/**
	 * The number of structural features of the '<em>Tmp Reference Holder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMP_REFERENCE_HOLDER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link sculptorguimetamodel.impl.TmpSubTaskTransitionHolderImpl <em>Tmp Sub Task Transition Holder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptorguimetamodel.impl.TmpSubTaskTransitionHolderImpl
	 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getTmpSubTaskTransitionHolder()
	 * @generated
	 */
	int TMP_SUB_TASK_TRANSITION_HOLDER = 11;

	/**
	 * The feature id for the '<em><b>To Task Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMP_SUB_TASK_TRANSITION_HOLDER__TO_TASK_TYPE = 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMP_SUB_TASK_TRANSITION_HOLDER__TO = 1;

	/**
	 * The feature id for the '<em><b>Reference Holer</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMP_SUB_TASK_TRANSITION_HOLDER__REFERENCE_HOLER = 2;

	/**
	 * The number of structural features of the '<em>Tmp Sub Task Transition Holder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMP_SUB_TASK_TRANSITION_HOLDER_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link sculptorguimetamodel.impl.ReferenceTargetImpl <em>Reference Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptorguimetamodel.impl.ReferenceTargetImpl
	 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getReferenceTarget()
	 * @generated
	 */
	int REFERENCE_TARGET = 12;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TARGET__REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TARGET__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Reference Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TARGET_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link sculptorguimetamodel.impl.ReferenceViewPropertyImpl <em>Reference View Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptorguimetamodel.impl.ReferenceViewPropertyImpl
	 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getReferenceViewProperty()
	 * @generated
	 */
	int REFERENCE_VIEW_PROPERTY = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_VIEW_PROPERTY__NAME = VIEW_DATA_PROPERTY__NAME;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_VIEW_PROPERTY__DOC = VIEW_DATA_PROPERTY__DOC;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_VIEW_PROPERTY__HINT = VIEW_DATA_PROPERTY__HINT;

	/**
	 * The feature id for the '<em><b>User Task</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_VIEW_PROPERTY__USER_TASK = VIEW_DATA_PROPERTY__USER_TASK;

	/**
	 * The feature id for the '<em><b>Message Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_VIEW_PROPERTY__MESSAGE_KEY = VIEW_DATA_PROPERTY__MESSAGE_KEY;

	/**
	 * The feature id for the '<em><b>Related Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_VIEW_PROPERTY__RELATED_TRANSITIONS = VIEW_DATA_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_VIEW_PROPERTY__REFERENCE = VIEW_DATA_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_VIEW_PROPERTY__TARGET = VIEW_DATA_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_VIEW_PROPERTY__BASE = VIEW_DATA_PROPERTY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Preview Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_VIEW_PROPERTY__PREVIEW_PROPERTIES = VIEW_DATA_PROPERTY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Reference View Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_VIEW_PROPERTY_FEATURE_COUNT = VIEW_DATA_PROPERTY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link sculptorguimetamodel.impl.AttributeViewPropertyImpl <em>Attribute View Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptorguimetamodel.impl.AttributeViewPropertyImpl
	 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getAttributeViewProperty()
	 * @generated
	 */
	int ATTRIBUTE_VIEW_PROPERTY = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VIEW_PROPERTY__NAME = VIEW_DATA_PROPERTY__NAME;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VIEW_PROPERTY__DOC = VIEW_DATA_PROPERTY__DOC;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VIEW_PROPERTY__HINT = VIEW_DATA_PROPERTY__HINT;

	/**
	 * The feature id for the '<em><b>User Task</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VIEW_PROPERTY__USER_TASK = VIEW_DATA_PROPERTY__USER_TASK;

	/**
	 * The feature id for the '<em><b>Message Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VIEW_PROPERTY__MESSAGE_KEY = VIEW_DATA_PROPERTY__MESSAGE_KEY;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VIEW_PROPERTY__ATTRIBUTE = VIEW_DATA_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Attribute View Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VIEW_PROPERTY_FEATURE_COUNT = VIEW_DATA_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link sculptorguimetamodel.impl.BasicTypeViewPropertyImpl <em>Basic Type View Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptorguimetamodel.impl.BasicTypeViewPropertyImpl
	 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getBasicTypeViewProperty()
	 * @generated
	 */
	int BASIC_TYPE_VIEW_PROPERTY = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE_VIEW_PROPERTY__NAME = VIEW_DATA_PROPERTY__NAME;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE_VIEW_PROPERTY__DOC = VIEW_DATA_PROPERTY__DOC;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE_VIEW_PROPERTY__HINT = VIEW_DATA_PROPERTY__HINT;

	/**
	 * The feature id for the '<em><b>User Task</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE_VIEW_PROPERTY__USER_TASK = VIEW_DATA_PROPERTY__USER_TASK;

	/**
	 * The feature id for the '<em><b>Message Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE_VIEW_PROPERTY__MESSAGE_KEY = VIEW_DATA_PROPERTY__MESSAGE_KEY;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE_VIEW_PROPERTY__REFERENCE = VIEW_DATA_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE_VIEW_PROPERTY__ATTRIBUTE = VIEW_DATA_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Basic Type View Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE_VIEW_PROPERTY_FEATURE_COUNT = VIEW_DATA_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link sculptorguimetamodel.impl.EnumViewPropertyImpl <em>Enum View Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptorguimetamodel.impl.EnumViewPropertyImpl
	 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getEnumViewProperty()
	 * @generated
	 */
	int ENUM_VIEW_PROPERTY = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VIEW_PROPERTY__NAME = VIEW_DATA_PROPERTY__NAME;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VIEW_PROPERTY__DOC = VIEW_DATA_PROPERTY__DOC;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VIEW_PROPERTY__HINT = VIEW_DATA_PROPERTY__HINT;

	/**
	 * The feature id for the '<em><b>User Task</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VIEW_PROPERTY__USER_TASK = VIEW_DATA_PROPERTY__USER_TASK;

	/**
	 * The feature id for the '<em><b>Message Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VIEW_PROPERTY__MESSAGE_KEY = VIEW_DATA_PROPERTY__MESSAGE_KEY;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VIEW_PROPERTY__REFERENCE = VIEW_DATA_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enum View Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VIEW_PROPERTY_FEATURE_COUNT = VIEW_DATA_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link sculptorguimetamodel.impl.BasicTypeEnumViewPropertyImpl <em>Basic Type Enum View Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptorguimetamodel.impl.BasicTypeEnumViewPropertyImpl
	 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getBasicTypeEnumViewProperty()
	 * @generated
	 */
	int BASIC_TYPE_ENUM_VIEW_PROPERTY = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE_ENUM_VIEW_PROPERTY__NAME = ENUM_VIEW_PROPERTY__NAME;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE_ENUM_VIEW_PROPERTY__DOC = ENUM_VIEW_PROPERTY__DOC;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE_ENUM_VIEW_PROPERTY__HINT = ENUM_VIEW_PROPERTY__HINT;

	/**
	 * The feature id for the '<em><b>User Task</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE_ENUM_VIEW_PROPERTY__USER_TASK = ENUM_VIEW_PROPERTY__USER_TASK;

	/**
	 * The feature id for the '<em><b>Message Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE_ENUM_VIEW_PROPERTY__MESSAGE_KEY = ENUM_VIEW_PROPERTY__MESSAGE_KEY;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE_ENUM_VIEW_PROPERTY__REFERENCE = ENUM_VIEW_PROPERTY__REFERENCE;

	/**
	 * The feature id for the '<em><b>Basic Type Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE_ENUM_VIEW_PROPERTY__BASIC_TYPE_REFERENCE = ENUM_VIEW_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Basic Type Enum View Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE_ENUM_VIEW_PROPERTY_FEATURE_COUNT = ENUM_VIEW_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link sculptorguimetamodel.impl.UserTaskGroupImpl <em>User Task Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptorguimetamodel.impl.UserTaskGroupImpl
	 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getUserTaskGroup()
	 * @generated
	 */
	int USER_TASK_GROUP = 18;

	/**
	 * The feature id for the '<em><b>User Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK_GROUP__USER_TASKS = 0;

	/**
	 * The feature id for the '<em><b>For</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK_GROUP__FOR = 1;

	/**
	 * The feature id for the '<em><b>Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK_GROUP__MODULE = 2;

	/**
	 * The number of structural features of the '<em>User Task Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK_GROUP_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link sculptorguimetamodel.impl.DerivedReferenceViewPropertyImpl <em>Derived Reference View Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptorguimetamodel.impl.DerivedReferenceViewPropertyImpl
	 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getDerivedReferenceViewProperty()
	 * @generated
	 */
	int DERIVED_REFERENCE_VIEW_PROPERTY = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_REFERENCE_VIEW_PROPERTY__NAME = REFERENCE_VIEW_PROPERTY__NAME;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_REFERENCE_VIEW_PROPERTY__DOC = REFERENCE_VIEW_PROPERTY__DOC;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_REFERENCE_VIEW_PROPERTY__HINT = REFERENCE_VIEW_PROPERTY__HINT;

	/**
	 * The feature id for the '<em><b>User Task</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_REFERENCE_VIEW_PROPERTY__USER_TASK = REFERENCE_VIEW_PROPERTY__USER_TASK;

	/**
	 * The feature id for the '<em><b>Message Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_REFERENCE_VIEW_PROPERTY__MESSAGE_KEY = REFERENCE_VIEW_PROPERTY__MESSAGE_KEY;

	/**
	 * The feature id for the '<em><b>Related Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_REFERENCE_VIEW_PROPERTY__RELATED_TRANSITIONS = REFERENCE_VIEW_PROPERTY__RELATED_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_REFERENCE_VIEW_PROPERTY__REFERENCE = REFERENCE_VIEW_PROPERTY__REFERENCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_REFERENCE_VIEW_PROPERTY__TARGET = REFERENCE_VIEW_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_REFERENCE_VIEW_PROPERTY__BASE = REFERENCE_VIEW_PROPERTY__BASE;

	/**
	 * The feature id for the '<em><b>Preview Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_REFERENCE_VIEW_PROPERTY__PREVIEW_PROPERTIES = REFERENCE_VIEW_PROPERTY__PREVIEW_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_REFERENCE_VIEW_PROPERTY__DERIVED_FROM = REFERENCE_VIEW_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Derived Reference View Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_REFERENCE_VIEW_PROPERTY_FEATURE_COUNT = REFERENCE_VIEW_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link sculptorguimetamodel.impl.AddTaskImpl <em>Add Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptorguimetamodel.impl.AddTaskImpl
	 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getAddTask()
	 * @generated
	 */
	int ADD_TASK = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_TASK__NAME = USER_TASK__NAME;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_TASK__DOC = USER_TASK__DOC;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_TASK__HINT = USER_TASK__HINT;

	/**
	 * The feature id for the '<em><b>Sub Task Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_TASK__SUB_TASK_TRANSITIONS = USER_TASK__SUB_TASK_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>For</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_TASK__FOR = USER_TASK__FOR;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_TASK__ABSTRACT = USER_TASK__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_TASK__MODULE = USER_TASK__MODULE;

	/**
	 * The feature id for the '<em><b>Task Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_TASK__TASK_TYPE = USER_TASK__TASK_TYPE;

	/**
	 * The feature id for the '<em><b>View Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_TASK__VIEW_PROPERTIES = USER_TASK__VIEW_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Conversation Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_TASK__CONVERSATION_ROOT = USER_TASK__CONVERSATION_ROOT;

	/**
	 * The feature id for the '<em><b>Gap Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_TASK__GAP_CLASS = USER_TASK__GAP_CLASS;

	/**
	 * The feature id for the '<em><b>Find DO With</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_TASK__FIND_DO_WITH = USER_TASK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Add Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_TASK_FEATURE_COUNT = USER_TASK_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link sculptorguimetamodel.impl.WidgetsContainerImpl <em>Widgets Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptorguimetamodel.impl.WidgetsContainerImpl
	 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getWidgetsContainer()
	 * @generated
	 */
	int WIDGETS_CONTAINER = 41;

	/**
	 * The feature id for the '<em><b>Widgets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGETS_CONTAINER__WIDGETS = 0;

	/**
	 * The number of structural features of the '<em>Widgets Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGETS_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link sculptorguimetamodel.impl.ViewImpl <em>View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptorguimetamodel.impl.ViewImpl
	 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getView()
	 * @generated
	 */
	int VIEW = 21;

	/**
	 * The feature id for the '<em><b>Widgets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__WIDGETS = WIDGETS_CONTAINER__WIDGETS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__NAME = WIDGETS_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__DOC = WIDGETS_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__HINT = WIDGETS_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__CONDITIONS = WIDGETS_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Behaviors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__BEHAVIORS = WIDGETS_CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__MODULE = WIDGETS_CONTAINER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>For</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__FOR = WIDGETS_CONTAINER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Service Proxies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__SERVICE_PROXIES = WIDGETS_CONTAINER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__PARAMETERS = WIDGETS_CONTAINER_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__LABEL = WIDGETS_CONTAINER_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Extends Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__EXTENDS_NAME = WIDGETS_CONTAINER_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__EXTENDS = WIDGETS_CONTAINER_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Popup</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__POPUP = WIDGETS_CONTAINER_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_FEATURE_COUNT = WIDGETS_CONTAINER_FEATURE_COUNT + 13;

	/**
	 * The meta object id for the '{@link sculptorguimetamodel.impl.WidgetImpl <em>Widget</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptorguimetamodel.impl.WidgetImpl
	 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getWidget()
	 * @generated
	 */
	int WIDGET = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__NAME = SculptormetamodelPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__DOC = SculptormetamodelPackage.NAMED_ELEMENT__DOC;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__HINT = SculptormetamodelPackage.NAMED_ELEMENT__HINT;

	/**
	 * The feature id for the '<em><b>View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__VIEW = SculptormetamodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__LABEL = SculptormetamodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Behavior Bindings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__BEHAVIOR_BINDINGS = SculptormetamodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__ENABLED = SculptormetamodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Widget Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__WIDGET_TYPE = SculptormetamodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__VISIBLE = SculptormetamodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_FEATURE_COUNT = SculptormetamodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link sculptorguimetamodel.impl.PropertyReferringWidgetImpl <em>Property Referring Widget</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptorguimetamodel.impl.PropertyReferringWidgetImpl
	 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getPropertyReferringWidget()
	 * @generated
	 */
	int PROPERTY_REFERRING_WIDGET = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_REFERRING_WIDGET__NAME = WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_REFERRING_WIDGET__DOC = WIDGET__DOC;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_REFERRING_WIDGET__HINT = WIDGET__HINT;

	/**
	 * The feature id for the '<em><b>View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_REFERRING_WIDGET__VIEW = WIDGET__VIEW;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_REFERRING_WIDGET__LABEL = WIDGET__LABEL;

	/**
	 * The feature id for the '<em><b>Behavior Bindings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_REFERRING_WIDGET__BEHAVIOR_BINDINGS = WIDGET__BEHAVIOR_BINDINGS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_REFERRING_WIDGET__ENABLED = WIDGET__ENABLED;

	/**
	 * The feature id for the '<em><b>Widget Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_REFERRING_WIDGET__WIDGET_TYPE = WIDGET__WIDGET_TYPE;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_REFERRING_WIDGET__VISIBLE = WIDGET__VISIBLE;

	/**
	 * The feature id for the '<em><b>For Op</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_REFERRING_WIDGET__FOR_OP = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>For</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_REFERRING_WIDGET__FOR = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Property Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_REFERRING_WIDGET__PROPERTY_PATH = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>For Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_REFERRING_WIDGET__FOR_PROPERTY = WIDGET_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Property Referring Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_REFERRING_WIDGET_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link sculptorguimetamodel.impl.InputTextWidgetImpl <em>Input Text Widget</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptorguimetamodel.impl.InputTextWidgetImpl
	 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getInputTextWidget()
	 * @generated
	 */
	int INPUT_TEXT_WIDGET = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_TEXT_WIDGET__NAME = PROPERTY_REFERRING_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_TEXT_WIDGET__DOC = PROPERTY_REFERRING_WIDGET__DOC;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_TEXT_WIDGET__HINT = PROPERTY_REFERRING_WIDGET__HINT;

	/**
	 * The feature id for the '<em><b>View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_TEXT_WIDGET__VIEW = PROPERTY_REFERRING_WIDGET__VIEW;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_TEXT_WIDGET__LABEL = PROPERTY_REFERRING_WIDGET__LABEL;

	/**
	 * The feature id for the '<em><b>Behavior Bindings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_TEXT_WIDGET__BEHAVIOR_BINDINGS = PROPERTY_REFERRING_WIDGET__BEHAVIOR_BINDINGS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_TEXT_WIDGET__ENABLED = PROPERTY_REFERRING_WIDGET__ENABLED;

	/**
	 * The feature id for the '<em><b>Widget Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_TEXT_WIDGET__WIDGET_TYPE = PROPERTY_REFERRING_WIDGET__WIDGET_TYPE;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_TEXT_WIDGET__VISIBLE = PROPERTY_REFERRING_WIDGET__VISIBLE;

	/**
	 * The feature id for the '<em><b>For Op</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_TEXT_WIDGET__FOR_OP = PROPERTY_REFERRING_WIDGET__FOR_OP;

	/**
	 * The feature id for the '<em><b>For</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_TEXT_WIDGET__FOR = PROPERTY_REFERRING_WIDGET__FOR;

	/**
	 * The feature id for the '<em><b>Property Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_TEXT_WIDGET__PROPERTY_PATH = PROPERTY_REFERRING_WIDGET__PROPERTY_PATH;

	/**
	 * The feature id for the '<em><b>For Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_TEXT_WIDGET__FOR_PROPERTY = PROPERTY_REFERRING_WIDGET__FOR_PROPERTY;

	/**
	 * The number of structural features of the '<em>Input Text Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_TEXT_WIDGET_FEATURE_COUNT = PROPERTY_REFERRING_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link sculptorguimetamodel.impl.InformationalTextWidgetImpl <em>Informational Text Widget</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptorguimetamodel.impl.InformationalTextWidgetImpl
	 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getInformationalTextWidget()
	 * @generated
	 */
	int INFORMATIONAL_TEXT_WIDGET = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATIONAL_TEXT_WIDGET__NAME = PROPERTY_REFERRING_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATIONAL_TEXT_WIDGET__DOC = PROPERTY_REFERRING_WIDGET__DOC;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATIONAL_TEXT_WIDGET__HINT = PROPERTY_REFERRING_WIDGET__HINT;

	/**
	 * The feature id for the '<em><b>View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATIONAL_TEXT_WIDGET__VIEW = PROPERTY_REFERRING_WIDGET__VIEW;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATIONAL_TEXT_WIDGET__LABEL = PROPERTY_REFERRING_WIDGET__LABEL;

	/**
	 * The feature id for the '<em><b>Behavior Bindings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATIONAL_TEXT_WIDGET__BEHAVIOR_BINDINGS = PROPERTY_REFERRING_WIDGET__BEHAVIOR_BINDINGS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATIONAL_TEXT_WIDGET__ENABLED = PROPERTY_REFERRING_WIDGET__ENABLED;

	/**
	 * The feature id for the '<em><b>Widget Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATIONAL_TEXT_WIDGET__WIDGET_TYPE = PROPERTY_REFERRING_WIDGET__WIDGET_TYPE;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATIONAL_TEXT_WIDGET__VISIBLE = PROPERTY_REFERRING_WIDGET__VISIBLE;

	/**
	 * The feature id for the '<em><b>For Op</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATIONAL_TEXT_WIDGET__FOR_OP = PROPERTY_REFERRING_WIDGET__FOR_OP;

	/**
	 * The feature id for the '<em><b>For</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATIONAL_TEXT_WIDGET__FOR = PROPERTY_REFERRING_WIDGET__FOR;

	/**
	 * The feature id for the '<em><b>Property Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATIONAL_TEXT_WIDGET__PROPERTY_PATH = PROPERTY_REFERRING_WIDGET__PROPERTY_PATH;

	/**
	 * The feature id for the '<em><b>For Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATIONAL_TEXT_WIDGET__FOR_PROPERTY = PROPERTY_REFERRING_WIDGET__FOR_PROPERTY;

	/**
	 * The number of structural features of the '<em>Informational Text Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATIONAL_TEXT_WIDGET_FEATURE_COUNT = PROPERTY_REFERRING_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link sculptorguimetamodel.impl.ButtonWidgetImpl <em>Button Widget</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptorguimetamodel.impl.ButtonWidgetImpl
	 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getButtonWidget()
	 * @generated
	 */
	int BUTTON_WIDGET = 25;

	/**
	 * The meta object id for the '{@link sculptorguimetamodel.impl.TableWidgetImpl <em>Table Widget</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptorguimetamodel.impl.TableWidgetImpl
	 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getTableWidget()
	 * @generated
	 */
	int TABLE_WIDGET = 27;

	/**
	 * The meta object id for the '{@link sculptorguimetamodel.impl.GuiEventImpl <em>Gui Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptorguimetamodel.impl.GuiEventImpl
	 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getGuiEvent()
	 * @generated
	 */
	int GUI_EVENT = 28;

	/**
	 * The meta object id for the '{@link sculptorguimetamodel.impl.TableColumnImpl <em>Table Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptorguimetamodel.impl.TableColumnImpl
	 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getTableColumn()
	 * @generated
	 */
	int TABLE_COLUMN = 29;

	/**
	 * The meta object id for the '{@link sculptorguimetamodel.impl.TextAreaWidgetImpl <em>Text Area Widget</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptorguimetamodel.impl.TextAreaWidgetImpl
	 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getTextAreaWidget()
	 * @generated
	 */
	int TEXT_AREA_WIDGET = 30;

	/**
	 * The meta object id for the '{@link sculptorguimetamodel.impl.AutocompleteWidgetImpl <em>Autocomplete Widget</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptorguimetamodel.impl.AutocompleteWidgetImpl
	 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getAutocompleteWidget()
	 * @generated
	 */
	int AUTOCOMPLETE_WIDGET = 31;

	/**
	 * The meta object id for the '{@link sculptorguimetamodel.impl.RadioButtonsWidgetImpl <em>Radio Buttons Widget</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptorguimetamodel.impl.RadioButtonsWidgetImpl
	 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getRadioButtonsWidget()
	 * @generated
	 */
	int RADIO_BUTTONS_WIDGET = 32;

	/**
	 * The meta object id for the '{@link sculptorguimetamodel.impl.RichTextAreaWidgetImpl <em>Rich Text Area Widget</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptorguimetamodel.impl.RichTextAreaWidgetImpl
	 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getRichTextAreaWidget()
	 * @generated
	 */
	int RICH_TEXT_AREA_WIDGET = 33;

	/**
	 * The meta object id for the '{@link sculptorguimetamodel.impl.InputDateWidgetImpl <em>Input Date Widget</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptorguimetamodel.impl.InputDateWidgetImpl
	 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getInputDateWidget()
	 * @generated
	 */
	int INPUT_DATE_WIDGET = 34;

	/**
	 * The meta object id for the '{@link sculptorguimetamodel.impl.NumberSpinnerWidgetImpl <em>Number Spinner Widget</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptorguimetamodel.impl.NumberSpinnerWidgetImpl
	 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getNumberSpinnerWidget()
	 * @generated
	 */
	int NUMBER_SPINNER_WIDGET = 35;

	/**
	 * The meta object id for the '{@link sculptorguimetamodel.impl.ServiceProxyImpl <em>Service Proxy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptorguimetamodel.impl.ServiceProxyImpl
	 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getServiceProxy()
	 * @generated
	 */
	int SERVICE_PROXY = 36;

	/**
	 * The meta object id for the '{@link sculptorguimetamodel.impl.ServiceProxyOperationImpl <em>Service Proxy Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptorguimetamodel.impl.ServiceProxyOperationImpl
	 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getServiceProxyOperation()
	 * @generated
	 */
	int SERVICE_PROXY_OPERATION = 37;

	/**
	 * The meta object id for the '{@link sculptorguimetamodel.impl.GuiCommandImpl <em>Gui Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptorguimetamodel.impl.GuiCommandImpl
	 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getGuiCommand()
	 * @generated
	 */
	int GUI_COMMAND = 38;

	/**
	 * The meta object id for the '{@link sculptorguimetamodel.impl.ViewParameterImpl <em>View Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptorguimetamodel.impl.ViewParameterImpl
	 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getViewParameter()
	 * @generated
	 */
	int VIEW_PARAMETER = 39;

	/**
	 * The meta object id for the '{@link sculptorguimetamodel.impl.LinkWidgetImpl <em>Link Widget</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptorguimetamodel.impl.LinkWidgetImpl
	 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getLinkWidget()
	 * @generated
	 */
	int LINK_WIDGET = 40;

	/**
	 * The meta object id for the '{@link sculptorguimetamodel.impl.PanelWidgetImpl <em>Panel Widget</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptorguimetamodel.impl.PanelWidgetImpl
	 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getPanelWidget()
	 * @generated
	 */
	int PANEL_WIDGET = 42;

	/**
	 * The meta object id for the '{@link sculptorguimetamodel.impl.UiBehaviorImpl <em>Ui Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptorguimetamodel.impl.UiBehaviorImpl
	 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getUiBehavior()
	 * @generated
	 */
	int UI_BEHAVIOR = 43;

	/**
	 * The meta object id for the '{@link sculptorguimetamodel.impl.PopulatePanelBehaviorImpl <em>Populate Panel Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptorguimetamodel.impl.PopulatePanelBehaviorImpl
	 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getPopulatePanelBehavior()
	 * @generated
	 */
	int POPULATE_PANEL_BEHAVIOR = 44;

	/**
	 * The meta object id for the '{@link sculptorguimetamodel.impl.NavigateToViewBehaviorImpl <em>Navigate To View Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptorguimetamodel.impl.NavigateToViewBehaviorImpl
	 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getNavigateToViewBehavior()
	 * @generated
	 */
	int NAVIGATE_TO_VIEW_BEHAVIOR = 45;

	/**
	 * The meta object id for the '{@link sculptorguimetamodel.impl.BehaviorBindingImpl <em>Behavior Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptorguimetamodel.impl.BehaviorBindingImpl
	 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getBehaviorBinding()
	 * @generated
	 */
	int BEHAVIOR_BINDING = 46;

	/**
	 * The meta object id for the '{@link sculptorguimetamodel.impl.OnClickBindingImpl <em>On Click Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptorguimetamodel.impl.OnClickBindingImpl
	 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getOnClickBinding()
	 * @generated
	 */
	int ON_CLICK_BINDING = 47;

	/**
	 * The meta object id for the '{@link sculptorguimetamodel.impl.OnHoverBindingImpl <em>On Hover Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptorguimetamodel.impl.OnHoverBindingImpl
	 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getOnHoverBinding()
	 * @generated
	 */
	int ON_HOVER_BINDING = 48;

	/**
	 * The meta object id for the '{@link sculptorguimetamodel.impl.UiConditionImpl <em>Ui Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptorguimetamodel.impl.UiConditionImpl
	 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getUiCondition()
	 * @generated
	 */
	int UI_CONDITION = 49;

	/**
	 * The meta object id for the '{@link sculptorguimetamodel.impl.GuiDtoImpl <em>Gui Dto</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptorguimetamodel.impl.GuiDtoImpl
	 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getGuiDto()
	 * @generated
	 */
	int GUI_DTO = 50;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_WIDGET__NAME = PROPERTY_REFERRING_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_WIDGET__DOC = PROPERTY_REFERRING_WIDGET__DOC;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_WIDGET__HINT = PROPERTY_REFERRING_WIDGET__HINT;

	/**
	 * The feature id for the '<em><b>View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_WIDGET__VIEW = PROPERTY_REFERRING_WIDGET__VIEW;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_WIDGET__LABEL = PROPERTY_REFERRING_WIDGET__LABEL;

	/**
	 * The feature id for the '<em><b>Behavior Bindings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_WIDGET__BEHAVIOR_BINDINGS = PROPERTY_REFERRING_WIDGET__BEHAVIOR_BINDINGS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_WIDGET__ENABLED = PROPERTY_REFERRING_WIDGET__ENABLED;

	/**
	 * The feature id for the '<em><b>Widget Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_WIDGET__WIDGET_TYPE = PROPERTY_REFERRING_WIDGET__WIDGET_TYPE;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_WIDGET__VISIBLE = PROPERTY_REFERRING_WIDGET__VISIBLE;

	/**
	 * The feature id for the '<em><b>For Op</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_WIDGET__FOR_OP = PROPERTY_REFERRING_WIDGET__FOR_OP;

	/**
	 * The feature id for the '<em><b>For</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_WIDGET__FOR = PROPERTY_REFERRING_WIDGET__FOR;

	/**
	 * The feature id for the '<em><b>Property Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_WIDGET__PROPERTY_PATH = PROPERTY_REFERRING_WIDGET__PROPERTY_PATH;

	/**
	 * The feature id for the '<em><b>For Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_WIDGET__FOR_PROPERTY = PROPERTY_REFERRING_WIDGET__FOR_PROPERTY;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_WIDGET__IMAGE = PROPERTY_REFERRING_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Button Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_WIDGET_FEATURE_COUNT = PROPERTY_REFERRING_WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_WIDGET__NAME = PROPERTY_REFERRING_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_WIDGET__DOC = PROPERTY_REFERRING_WIDGET__DOC;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_WIDGET__HINT = PROPERTY_REFERRING_WIDGET__HINT;

	/**
	 * The feature id for the '<em><b>View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_WIDGET__VIEW = PROPERTY_REFERRING_WIDGET__VIEW;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_WIDGET__LABEL = PROPERTY_REFERRING_WIDGET__LABEL;

	/**
	 * The feature id for the '<em><b>Behavior Bindings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_WIDGET__BEHAVIOR_BINDINGS = PROPERTY_REFERRING_WIDGET__BEHAVIOR_BINDINGS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_WIDGET__ENABLED = PROPERTY_REFERRING_WIDGET__ENABLED;

	/**
	 * The feature id for the '<em><b>Widget Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_WIDGET__WIDGET_TYPE = PROPERTY_REFERRING_WIDGET__WIDGET_TYPE;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_WIDGET__VISIBLE = PROPERTY_REFERRING_WIDGET__VISIBLE;

	/**
	 * The feature id for the '<em><b>For Op</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_WIDGET__FOR_OP = PROPERTY_REFERRING_WIDGET__FOR_OP;

	/**
	 * The feature id for the '<em><b>For</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_WIDGET__FOR = PROPERTY_REFERRING_WIDGET__FOR;

	/**
	 * The feature id for the '<em><b>Property Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_WIDGET__PROPERTY_PATH = PROPERTY_REFERRING_WIDGET__PROPERTY_PATH;

	/**
	 * The feature id for the '<em><b>For Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_WIDGET__FOR_PROPERTY = PROPERTY_REFERRING_WIDGET__FOR_PROPERTY;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_WIDGET__COLUMNS = PROPERTY_REFERRING_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Paging</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_WIDGET__PAGING = PROPERTY_REFERRING_WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_WIDGET__SIZE = PROPERTY_REFERRING_WIDGET_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Table Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_WIDGET_FEATURE_COUNT = PROPERTY_REFERRING_WIDGET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_EVENT__NAME = SculptormetamodelPackage.DOMAIN_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_EVENT__DOC = SculptormetamodelPackage.DOMAIN_OBJECT__DOC;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_EVENT__HINT = SculptormetamodelPackage.DOMAIN_OBJECT__HINT;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_EVENT__REFERENCES = SculptormetamodelPackage.DOMAIN_OBJECT__REFERENCES;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_EVENT__EXTENDS = SculptormetamodelPackage.DOMAIN_OBJECT__EXTENDS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_EVENT__ATTRIBUTES = SculptormetamodelPackage.DOMAIN_OBJECT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_EVENT__ABSTRACT = SculptormetamodelPackage.DOMAIN_OBJECT__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_EVENT__REPOSITORY = SculptormetamodelPackage.DOMAIN_OBJECT__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_EVENT__MODULE = SculptormetamodelPackage.DOMAIN_OBJECT__MODULE;

	/**
	 * The feature id for the '<em><b>Optimistic Locking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_EVENT__OPTIMISTIC_LOCKING = SculptormetamodelPackage.DOMAIN_OBJECT__OPTIMISTIC_LOCKING;

	/**
	 * The feature id for the '<em><b>Cache</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_EVENT__CACHE = SculptormetamodelPackage.DOMAIN_OBJECT__CACHE;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_EVENT__PACKAGE = SculptormetamodelPackage.DOMAIN_OBJECT__PACKAGE;

	/**
	 * The feature id for the '<em><b>Database Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_EVENT__DATABASE_TABLE = SculptormetamodelPackage.DOMAIN_OBJECT__DATABASE_TABLE;

	/**
	 * The feature id for the '<em><b>Extends Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_EVENT__EXTENDS_NAME = SculptormetamodelPackage.DOMAIN_OBJECT__EXTENDS_NAME;

	/**
	 * The feature id for the '<em><b>Validate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_EVENT__VALIDATE = SculptormetamodelPackage.DOMAIN_OBJECT__VALIDATE;

	/**
	 * The feature id for the '<em><b>Gap Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_EVENT__GAP_CLASS = SculptormetamodelPackage.DOMAIN_OBJECT__GAP_CLASS;

	/**
	 * The feature id for the '<em><b>Inheritance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_EVENT__INHERITANCE = SculptormetamodelPackage.DOMAIN_OBJECT__INHERITANCE;

	/**
	 * The feature id for the '<em><b>Discriminator Column Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_EVENT__DISCRIMINATOR_COLUMN_VALUE = SculptormetamodelPackage.DOMAIN_OBJECT__DISCRIMINATOR_COLUMN_VALUE;

	/**
	 * The feature id for the '<em><b>Aggregate Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_EVENT__AGGREGATE_ROOT = SculptormetamodelPackage.DOMAIN_OBJECT__AGGREGATE_ROOT;

	/**
	 * The feature id for the '<em><b>Belongs To Aggregate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_EVENT__BELONGS_TO_AGGREGATE = SculptormetamodelPackage.DOMAIN_OBJECT__BELONGS_TO_AGGREGATE;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_EVENT__OPERATIONS = SculptormetamodelPackage.DOMAIN_OBJECT__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Traits</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_EVENT__TRAITS = SculptormetamodelPackage.DOMAIN_OBJECT__TRAITS;

	/**
	 * The feature id for the '<em><b>Gui Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_EVENT__GUI_MODULE = SculptormetamodelPackage.DOMAIN_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gui Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_EVENT_FEATURE_COUNT = SculptormetamodelPackage.DOMAIN_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN__NAME = PROPERTY_REFERRING_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN__DOC = PROPERTY_REFERRING_WIDGET__DOC;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN__HINT = PROPERTY_REFERRING_WIDGET__HINT;

	/**
	 * The feature id for the '<em><b>View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN__VIEW = PROPERTY_REFERRING_WIDGET__VIEW;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN__LABEL = PROPERTY_REFERRING_WIDGET__LABEL;

	/**
	 * The feature id for the '<em><b>Behavior Bindings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN__BEHAVIOR_BINDINGS = PROPERTY_REFERRING_WIDGET__BEHAVIOR_BINDINGS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN__ENABLED = PROPERTY_REFERRING_WIDGET__ENABLED;

	/**
	 * The feature id for the '<em><b>Widget Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN__WIDGET_TYPE = PROPERTY_REFERRING_WIDGET__WIDGET_TYPE;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN__VISIBLE = PROPERTY_REFERRING_WIDGET__VISIBLE;

	/**
	 * The feature id for the '<em><b>For Op</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN__FOR_OP = PROPERTY_REFERRING_WIDGET__FOR_OP;

	/**
	 * The feature id for the '<em><b>For</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN__FOR = PROPERTY_REFERRING_WIDGET__FOR;

	/**
	 * The feature id for the '<em><b>Property Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN__PROPERTY_PATH = PROPERTY_REFERRING_WIDGET__PROPERTY_PATH;

	/**
	 * The feature id for the '<em><b>For Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN__FOR_PROPERTY = PROPERTY_REFERRING_WIDGET__FOR_PROPERTY;

	/**
	 * The feature id for the '<em><b>Column Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN__COLUMN_TYPE = PROPERTY_REFERRING_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filterable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN__FILTERABLE = PROPERTY_REFERRING_WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sortable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN__SORTABLE = PROPERTY_REFERRING_WIDGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN__EDITABLE = PROPERTY_REFERRING_WIDGET_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Table Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN_FEATURE_COUNT = PROPERTY_REFERRING_WIDGET_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA_WIDGET__NAME = PROPERTY_REFERRING_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA_WIDGET__DOC = PROPERTY_REFERRING_WIDGET__DOC;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA_WIDGET__HINT = PROPERTY_REFERRING_WIDGET__HINT;

	/**
	 * The feature id for the '<em><b>View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA_WIDGET__VIEW = PROPERTY_REFERRING_WIDGET__VIEW;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA_WIDGET__LABEL = PROPERTY_REFERRING_WIDGET__LABEL;

	/**
	 * The feature id for the '<em><b>Behavior Bindings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA_WIDGET__BEHAVIOR_BINDINGS = PROPERTY_REFERRING_WIDGET__BEHAVIOR_BINDINGS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA_WIDGET__ENABLED = PROPERTY_REFERRING_WIDGET__ENABLED;

	/**
	 * The feature id for the '<em><b>Widget Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA_WIDGET__WIDGET_TYPE = PROPERTY_REFERRING_WIDGET__WIDGET_TYPE;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA_WIDGET__VISIBLE = PROPERTY_REFERRING_WIDGET__VISIBLE;

	/**
	 * The feature id for the '<em><b>For Op</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA_WIDGET__FOR_OP = PROPERTY_REFERRING_WIDGET__FOR_OP;

	/**
	 * The feature id for the '<em><b>For</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA_WIDGET__FOR = PROPERTY_REFERRING_WIDGET__FOR;

	/**
	 * The feature id for the '<em><b>Property Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA_WIDGET__PROPERTY_PATH = PROPERTY_REFERRING_WIDGET__PROPERTY_PATH;

	/**
	 * The feature id for the '<em><b>For Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA_WIDGET__FOR_PROPERTY = PROPERTY_REFERRING_WIDGET__FOR_PROPERTY;

	/**
	 * The number of structural features of the '<em>Text Area Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA_WIDGET_FEATURE_COUNT = PROPERTY_REFERRING_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOCOMPLETE_WIDGET__NAME = PROPERTY_REFERRING_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOCOMPLETE_WIDGET__DOC = PROPERTY_REFERRING_WIDGET__DOC;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOCOMPLETE_WIDGET__HINT = PROPERTY_REFERRING_WIDGET__HINT;

	/**
	 * The feature id for the '<em><b>View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOCOMPLETE_WIDGET__VIEW = PROPERTY_REFERRING_WIDGET__VIEW;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOCOMPLETE_WIDGET__LABEL = PROPERTY_REFERRING_WIDGET__LABEL;

	/**
	 * The feature id for the '<em><b>Behavior Bindings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOCOMPLETE_WIDGET__BEHAVIOR_BINDINGS = PROPERTY_REFERRING_WIDGET__BEHAVIOR_BINDINGS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOCOMPLETE_WIDGET__ENABLED = PROPERTY_REFERRING_WIDGET__ENABLED;

	/**
	 * The feature id for the '<em><b>Widget Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOCOMPLETE_WIDGET__WIDGET_TYPE = PROPERTY_REFERRING_WIDGET__WIDGET_TYPE;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOCOMPLETE_WIDGET__VISIBLE = PROPERTY_REFERRING_WIDGET__VISIBLE;

	/**
	 * The feature id for the '<em><b>For Op</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOCOMPLETE_WIDGET__FOR_OP = PROPERTY_REFERRING_WIDGET__FOR_OP;

	/**
	 * The feature id for the '<em><b>For</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOCOMPLETE_WIDGET__FOR = PROPERTY_REFERRING_WIDGET__FOR;

	/**
	 * The feature id for the '<em><b>Property Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOCOMPLETE_WIDGET__PROPERTY_PATH = PROPERTY_REFERRING_WIDGET__PROPERTY_PATH;

	/**
	 * The feature id for the '<em><b>For Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOCOMPLETE_WIDGET__FOR_PROPERTY = PROPERTY_REFERRING_WIDGET__FOR_PROPERTY;

	/**
	 * The number of structural features of the '<em>Autocomplete Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOCOMPLETE_WIDGET_FEATURE_COUNT = PROPERTY_REFERRING_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTONS_WIDGET__NAME = PROPERTY_REFERRING_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTONS_WIDGET__DOC = PROPERTY_REFERRING_WIDGET__DOC;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTONS_WIDGET__HINT = PROPERTY_REFERRING_WIDGET__HINT;

	/**
	 * The feature id for the '<em><b>View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTONS_WIDGET__VIEW = PROPERTY_REFERRING_WIDGET__VIEW;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTONS_WIDGET__LABEL = PROPERTY_REFERRING_WIDGET__LABEL;

	/**
	 * The feature id for the '<em><b>Behavior Bindings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTONS_WIDGET__BEHAVIOR_BINDINGS = PROPERTY_REFERRING_WIDGET__BEHAVIOR_BINDINGS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTONS_WIDGET__ENABLED = PROPERTY_REFERRING_WIDGET__ENABLED;

	/**
	 * The feature id for the '<em><b>Widget Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTONS_WIDGET__WIDGET_TYPE = PROPERTY_REFERRING_WIDGET__WIDGET_TYPE;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTONS_WIDGET__VISIBLE = PROPERTY_REFERRING_WIDGET__VISIBLE;

	/**
	 * The feature id for the '<em><b>For Op</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTONS_WIDGET__FOR_OP = PROPERTY_REFERRING_WIDGET__FOR_OP;

	/**
	 * The feature id for the '<em><b>For</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTONS_WIDGET__FOR = PROPERTY_REFERRING_WIDGET__FOR;

	/**
	 * The feature id for the '<em><b>Property Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTONS_WIDGET__PROPERTY_PATH = PROPERTY_REFERRING_WIDGET__PROPERTY_PATH;

	/**
	 * The feature id for the '<em><b>For Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTONS_WIDGET__FOR_PROPERTY = PROPERTY_REFERRING_WIDGET__FOR_PROPERTY;

	/**
	 * The number of structural features of the '<em>Radio Buttons Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTONS_WIDGET_FEATURE_COUNT = PROPERTY_REFERRING_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT_AREA_WIDGET__NAME = PROPERTY_REFERRING_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT_AREA_WIDGET__DOC = PROPERTY_REFERRING_WIDGET__DOC;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT_AREA_WIDGET__HINT = PROPERTY_REFERRING_WIDGET__HINT;

	/**
	 * The feature id for the '<em><b>View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT_AREA_WIDGET__VIEW = PROPERTY_REFERRING_WIDGET__VIEW;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT_AREA_WIDGET__LABEL = PROPERTY_REFERRING_WIDGET__LABEL;

	/**
	 * The feature id for the '<em><b>Behavior Bindings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT_AREA_WIDGET__BEHAVIOR_BINDINGS = PROPERTY_REFERRING_WIDGET__BEHAVIOR_BINDINGS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT_AREA_WIDGET__ENABLED = PROPERTY_REFERRING_WIDGET__ENABLED;

	/**
	 * The feature id for the '<em><b>Widget Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT_AREA_WIDGET__WIDGET_TYPE = PROPERTY_REFERRING_WIDGET__WIDGET_TYPE;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT_AREA_WIDGET__VISIBLE = PROPERTY_REFERRING_WIDGET__VISIBLE;

	/**
	 * The feature id for the '<em><b>For Op</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT_AREA_WIDGET__FOR_OP = PROPERTY_REFERRING_WIDGET__FOR_OP;

	/**
	 * The feature id for the '<em><b>For</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT_AREA_WIDGET__FOR = PROPERTY_REFERRING_WIDGET__FOR;

	/**
	 * The feature id for the '<em><b>Property Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT_AREA_WIDGET__PROPERTY_PATH = PROPERTY_REFERRING_WIDGET__PROPERTY_PATH;

	/**
	 * The feature id for the '<em><b>For Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT_AREA_WIDGET__FOR_PROPERTY = PROPERTY_REFERRING_WIDGET__FOR_PROPERTY;

	/**
	 * The number of structural features of the '<em>Rich Text Area Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT_AREA_WIDGET_FEATURE_COUNT = PROPERTY_REFERRING_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DATE_WIDGET__NAME = PROPERTY_REFERRING_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DATE_WIDGET__DOC = PROPERTY_REFERRING_WIDGET__DOC;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DATE_WIDGET__HINT = PROPERTY_REFERRING_WIDGET__HINT;

	/**
	 * The feature id for the '<em><b>View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DATE_WIDGET__VIEW = PROPERTY_REFERRING_WIDGET__VIEW;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DATE_WIDGET__LABEL = PROPERTY_REFERRING_WIDGET__LABEL;

	/**
	 * The feature id for the '<em><b>Behavior Bindings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DATE_WIDGET__BEHAVIOR_BINDINGS = PROPERTY_REFERRING_WIDGET__BEHAVIOR_BINDINGS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DATE_WIDGET__ENABLED = PROPERTY_REFERRING_WIDGET__ENABLED;

	/**
	 * The feature id for the '<em><b>Widget Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DATE_WIDGET__WIDGET_TYPE = PROPERTY_REFERRING_WIDGET__WIDGET_TYPE;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DATE_WIDGET__VISIBLE = PROPERTY_REFERRING_WIDGET__VISIBLE;

	/**
	 * The feature id for the '<em><b>For Op</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DATE_WIDGET__FOR_OP = PROPERTY_REFERRING_WIDGET__FOR_OP;

	/**
	 * The feature id for the '<em><b>For</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DATE_WIDGET__FOR = PROPERTY_REFERRING_WIDGET__FOR;

	/**
	 * The feature id for the '<em><b>Property Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DATE_WIDGET__PROPERTY_PATH = PROPERTY_REFERRING_WIDGET__PROPERTY_PATH;

	/**
	 * The feature id for the '<em><b>For Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DATE_WIDGET__FOR_PROPERTY = PROPERTY_REFERRING_WIDGET__FOR_PROPERTY;

	/**
	 * The number of structural features of the '<em>Input Date Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DATE_WIDGET_FEATURE_COUNT = PROPERTY_REFERRING_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_SPINNER_WIDGET__NAME = PROPERTY_REFERRING_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_SPINNER_WIDGET__DOC = PROPERTY_REFERRING_WIDGET__DOC;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_SPINNER_WIDGET__HINT = PROPERTY_REFERRING_WIDGET__HINT;

	/**
	 * The feature id for the '<em><b>View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_SPINNER_WIDGET__VIEW = PROPERTY_REFERRING_WIDGET__VIEW;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_SPINNER_WIDGET__LABEL = PROPERTY_REFERRING_WIDGET__LABEL;

	/**
	 * The feature id for the '<em><b>Behavior Bindings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_SPINNER_WIDGET__BEHAVIOR_BINDINGS = PROPERTY_REFERRING_WIDGET__BEHAVIOR_BINDINGS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_SPINNER_WIDGET__ENABLED = PROPERTY_REFERRING_WIDGET__ENABLED;

	/**
	 * The feature id for the '<em><b>Widget Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_SPINNER_WIDGET__WIDGET_TYPE = PROPERTY_REFERRING_WIDGET__WIDGET_TYPE;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_SPINNER_WIDGET__VISIBLE = PROPERTY_REFERRING_WIDGET__VISIBLE;

	/**
	 * The feature id for the '<em><b>For Op</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_SPINNER_WIDGET__FOR_OP = PROPERTY_REFERRING_WIDGET__FOR_OP;

	/**
	 * The feature id for the '<em><b>For</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_SPINNER_WIDGET__FOR = PROPERTY_REFERRING_WIDGET__FOR;

	/**
	 * The feature id for the '<em><b>Property Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_SPINNER_WIDGET__PROPERTY_PATH = PROPERTY_REFERRING_WIDGET__PROPERTY_PATH;

	/**
	 * The feature id for the '<em><b>For Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_SPINNER_WIDGET__FOR_PROPERTY = PROPERTY_REFERRING_WIDGET__FOR_PROPERTY;

	/**
	 * The number of structural features of the '<em>Number Spinner Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_SPINNER_WIDGET_FEATURE_COUNT = PROPERTY_REFERRING_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROXY__NAME = SculptormetamodelPackage.SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROXY__DOC = SculptormetamodelPackage.SERVICE__DOC;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROXY__HINT = SculptormetamodelPackage.SERVICE__HINT;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROXY__OPERATIONS = SculptormetamodelPackage.SERVICE__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Repository Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROXY__REPOSITORY_DEPENDENCIES = SculptormetamodelPackage.SERVICE__REPOSITORY_DEPENDENCIES;

	/**
	 * The feature id for the '<em><b>Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROXY__MODULE = SculptormetamodelPackage.SERVICE__MODULE;

	/**
	 * The feature id for the '<em><b>Other Dependencies</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROXY__OTHER_DEPENDENCIES = SculptormetamodelPackage.SERVICE__OTHER_DEPENDENCIES;

	/**
	 * The feature id for the '<em><b>Service Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROXY__SERVICE_DEPENDENCIES = SculptormetamodelPackage.SERVICE__SERVICE_DEPENDENCIES;

	/**
	 * The feature id for the '<em><b>Gap Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROXY__GAP_CLASS = SculptormetamodelPackage.SERVICE__GAP_CLASS;

	/**
	 * The feature id for the '<em><b>Web Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROXY__WEB_SERVICE = SculptormetamodelPackage.SERVICE__WEB_SERVICE;

	/**
	 * The feature id for the '<em><b>Remote Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROXY__REMOTE_INTERFACE = SculptormetamodelPackage.SERVICE__REMOTE_INTERFACE;

	/**
	 * The feature id for the '<em><b>Local Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROXY__LOCAL_INTERFACE = SculptormetamodelPackage.SERVICE__LOCAL_INTERFACE;

	/**
	 * The feature id for the '<em><b>Subscribe</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROXY__SUBSCRIBE = SculptormetamodelPackage.SERVICE__SUBSCRIBE;

	/**
	 * The feature id for the '<em><b>For</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROXY__FOR = SculptormetamodelPackage.SERVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gui Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROXY__GUI_MODULE = SculptormetamodelPackage.SERVICE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Service Proxy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROXY_FEATURE_COUNT = SculptormetamodelPackage.SERVICE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROXY_OPERATION__NAME = SculptormetamodelPackage.SERVICE_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROXY_OPERATION__DOC = SculptormetamodelPackage.SERVICE_OPERATION__DOC;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROXY_OPERATION__HINT = SculptormetamodelPackage.SERVICE_OPERATION__HINT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROXY_OPERATION__TYPE = SculptormetamodelPackage.SERVICE_OPERATION__TYPE;

	/**
	 * The feature id for the '<em><b>Collection Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROXY_OPERATION__COLLECTION_TYPE = SculptormetamodelPackage.SERVICE_OPERATION__COLLECTION_TYPE;

	/**
	 * The feature id for the '<em><b>Map Key Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROXY_OPERATION__MAP_KEY_TYPE = SculptormetamodelPackage.SERVICE_OPERATION__MAP_KEY_TYPE;

	/**
	 * The feature id for the '<em><b>Domain Object Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROXY_OPERATION__DOMAIN_OBJECT_TYPE = SculptormetamodelPackage.SERVICE_OPERATION__DOMAIN_OBJECT_TYPE;

	/**
	 * The feature id for the '<em><b>Throws</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROXY_OPERATION__THROWS = SculptormetamodelPackage.SERVICE_OPERATION__THROWS;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROXY_OPERATION__VISIBILITY = SculptormetamodelPackage.SERVICE_OPERATION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROXY_OPERATION__PARAMETERS = SculptormetamodelPackage.SERVICE_OPERATION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Publish</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROXY_OPERATION__PUBLISH = SculptormetamodelPackage.SERVICE_OPERATION__PUBLISH;

	/**
	 * The feature id for the '<em><b>Delegate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROXY_OPERATION__DELEGATE = SculptormetamodelPackage.SERVICE_OPERATION__DELEGATE;

	/**
	 * The feature id for the '<em><b>Service</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROXY_OPERATION__SERVICE = SculptormetamodelPackage.SERVICE_OPERATION__SERVICE;

	/**
	 * The feature id for the '<em><b>Service Delegate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROXY_OPERATION__SERVICE_DELEGATE = SculptormetamodelPackage.SERVICE_OPERATION__SERVICE_DELEGATE;

	/**
	 * The feature id for the '<em><b>For</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROXY_OPERATION__FOR = SculptormetamodelPackage.SERVICE_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Service Proxy Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROXY_OPERATION_FEATURE_COUNT = SculptormetamodelPackage.SERVICE_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_DTO__NAME = SculptormetamodelPackage.DOMAIN_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_DTO__DOC = SculptormetamodelPackage.DOMAIN_OBJECT__DOC;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_DTO__HINT = SculptormetamodelPackage.DOMAIN_OBJECT__HINT;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_DTO__REFERENCES = SculptormetamodelPackage.DOMAIN_OBJECT__REFERENCES;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_DTO__EXTENDS = SculptormetamodelPackage.DOMAIN_OBJECT__EXTENDS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_DTO__ATTRIBUTES = SculptormetamodelPackage.DOMAIN_OBJECT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_DTO__ABSTRACT = SculptormetamodelPackage.DOMAIN_OBJECT__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_DTO__REPOSITORY = SculptormetamodelPackage.DOMAIN_OBJECT__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_DTO__MODULE = SculptormetamodelPackage.DOMAIN_OBJECT__MODULE;

	/**
	 * The feature id for the '<em><b>Optimistic Locking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_DTO__OPTIMISTIC_LOCKING = SculptormetamodelPackage.DOMAIN_OBJECT__OPTIMISTIC_LOCKING;

	/**
	 * The feature id for the '<em><b>Cache</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_DTO__CACHE = SculptormetamodelPackage.DOMAIN_OBJECT__CACHE;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_DTO__PACKAGE = SculptormetamodelPackage.DOMAIN_OBJECT__PACKAGE;

	/**
	 * The feature id for the '<em><b>Database Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_DTO__DATABASE_TABLE = SculptormetamodelPackage.DOMAIN_OBJECT__DATABASE_TABLE;

	/**
	 * The feature id for the '<em><b>Extends Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_DTO__EXTENDS_NAME = SculptormetamodelPackage.DOMAIN_OBJECT__EXTENDS_NAME;

	/**
	 * The feature id for the '<em><b>Validate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_DTO__VALIDATE = SculptormetamodelPackage.DOMAIN_OBJECT__VALIDATE;

	/**
	 * The feature id for the '<em><b>Gap Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_DTO__GAP_CLASS = SculptormetamodelPackage.DOMAIN_OBJECT__GAP_CLASS;

	/**
	 * The feature id for the '<em><b>Inheritance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_DTO__INHERITANCE = SculptormetamodelPackage.DOMAIN_OBJECT__INHERITANCE;

	/**
	 * The feature id for the '<em><b>Discriminator Column Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_DTO__DISCRIMINATOR_COLUMN_VALUE = SculptormetamodelPackage.DOMAIN_OBJECT__DISCRIMINATOR_COLUMN_VALUE;

	/**
	 * The feature id for the '<em><b>Aggregate Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_DTO__AGGREGATE_ROOT = SculptormetamodelPackage.DOMAIN_OBJECT__AGGREGATE_ROOT;

	/**
	 * The feature id for the '<em><b>Belongs To Aggregate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_DTO__BELONGS_TO_AGGREGATE = SculptormetamodelPackage.DOMAIN_OBJECT__BELONGS_TO_AGGREGATE;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_DTO__OPERATIONS = SculptormetamodelPackage.DOMAIN_OBJECT__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Traits</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_DTO__TRAITS = SculptormetamodelPackage.DOMAIN_OBJECT__TRAITS;

	/**
	 * The feature id for the '<em><b>For</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_DTO__FOR = SculptormetamodelPackage.DOMAIN_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gui Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_DTO__GUI_MODULE = SculptormetamodelPackage.DOMAIN_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Immutable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_DTO__IMMUTABLE = SculptormetamodelPackage.DOMAIN_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Gui Dto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_DTO_FEATURE_COUNT = SculptormetamodelPackage.DOMAIN_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_COMMAND__NAME = GUI_DTO__NAME;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_COMMAND__DOC = GUI_DTO__DOC;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_COMMAND__HINT = GUI_DTO__HINT;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_COMMAND__REFERENCES = GUI_DTO__REFERENCES;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_COMMAND__EXTENDS = GUI_DTO__EXTENDS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_COMMAND__ATTRIBUTES = GUI_DTO__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_COMMAND__ABSTRACT = GUI_DTO__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_COMMAND__REPOSITORY = GUI_DTO__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_COMMAND__MODULE = GUI_DTO__MODULE;

	/**
	 * The feature id for the '<em><b>Optimistic Locking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_COMMAND__OPTIMISTIC_LOCKING = GUI_DTO__OPTIMISTIC_LOCKING;

	/**
	 * The feature id for the '<em><b>Cache</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_COMMAND__CACHE = GUI_DTO__CACHE;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_COMMAND__PACKAGE = GUI_DTO__PACKAGE;

	/**
	 * The feature id for the '<em><b>Database Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_COMMAND__DATABASE_TABLE = GUI_DTO__DATABASE_TABLE;

	/**
	 * The feature id for the '<em><b>Extends Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_COMMAND__EXTENDS_NAME = GUI_DTO__EXTENDS_NAME;

	/**
	 * The feature id for the '<em><b>Validate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_COMMAND__VALIDATE = GUI_DTO__VALIDATE;

	/**
	 * The feature id for the '<em><b>Gap Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_COMMAND__GAP_CLASS = GUI_DTO__GAP_CLASS;

	/**
	 * The feature id for the '<em><b>Inheritance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_COMMAND__INHERITANCE = GUI_DTO__INHERITANCE;

	/**
	 * The feature id for the '<em><b>Discriminator Column Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_COMMAND__DISCRIMINATOR_COLUMN_VALUE = GUI_DTO__DISCRIMINATOR_COLUMN_VALUE;

	/**
	 * The feature id for the '<em><b>Aggregate Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_COMMAND__AGGREGATE_ROOT = GUI_DTO__AGGREGATE_ROOT;

	/**
	 * The feature id for the '<em><b>Belongs To Aggregate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_COMMAND__BELONGS_TO_AGGREGATE = GUI_DTO__BELONGS_TO_AGGREGATE;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_COMMAND__OPERATIONS = GUI_DTO__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Traits</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_COMMAND__TRAITS = GUI_DTO__TRAITS;

	/**
	 * The feature id for the '<em><b>For</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_COMMAND__FOR = GUI_DTO__FOR;

	/**
	 * The feature id for the '<em><b>Gui Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_COMMAND__GUI_MODULE = GUI_DTO__GUI_MODULE;

	/**
	 * The feature id for the '<em><b>Immutable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_COMMAND__IMMUTABLE = GUI_DTO__IMMUTABLE;

	/**
	 * The number of structural features of the '<em>Gui Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_COMMAND_FEATURE_COUNT = GUI_DTO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_PARAMETER__NAME = SculptormetamodelPackage.TYPED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_PARAMETER__DOC = SculptormetamodelPackage.TYPED_ELEMENT__DOC;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_PARAMETER__HINT = SculptormetamodelPackage.TYPED_ELEMENT__HINT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_PARAMETER__TYPE = SculptormetamodelPackage.TYPED_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Collection Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_PARAMETER__COLLECTION_TYPE = SculptormetamodelPackage.TYPED_ELEMENT__COLLECTION_TYPE;

	/**
	 * The feature id for the '<em><b>Map Key Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_PARAMETER__MAP_KEY_TYPE = SculptormetamodelPackage.TYPED_ELEMENT__MAP_KEY_TYPE;

	/**
	 * The feature id for the '<em><b>Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_PARAMETER__NULLABLE = SculptormetamodelPackage.TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>View Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_PARAMETER_FEATURE_COUNT = SculptormetamodelPackage.TYPED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_WIDGET__NAME = PROPERTY_REFERRING_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_WIDGET__DOC = PROPERTY_REFERRING_WIDGET__DOC;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_WIDGET__HINT = PROPERTY_REFERRING_WIDGET__HINT;

	/**
	 * The feature id for the '<em><b>View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_WIDGET__VIEW = PROPERTY_REFERRING_WIDGET__VIEW;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_WIDGET__LABEL = PROPERTY_REFERRING_WIDGET__LABEL;

	/**
	 * The feature id for the '<em><b>Behavior Bindings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_WIDGET__BEHAVIOR_BINDINGS = PROPERTY_REFERRING_WIDGET__BEHAVIOR_BINDINGS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_WIDGET__ENABLED = PROPERTY_REFERRING_WIDGET__ENABLED;

	/**
	 * The feature id for the '<em><b>Widget Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_WIDGET__WIDGET_TYPE = PROPERTY_REFERRING_WIDGET__WIDGET_TYPE;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_WIDGET__VISIBLE = PROPERTY_REFERRING_WIDGET__VISIBLE;

	/**
	 * The feature id for the '<em><b>For Op</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_WIDGET__FOR_OP = PROPERTY_REFERRING_WIDGET__FOR_OP;

	/**
	 * The feature id for the '<em><b>For</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_WIDGET__FOR = PROPERTY_REFERRING_WIDGET__FOR;

	/**
	 * The feature id for the '<em><b>Property Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_WIDGET__PROPERTY_PATH = PROPERTY_REFERRING_WIDGET__PROPERTY_PATH;

	/**
	 * The feature id for the '<em><b>For Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_WIDGET__FOR_PROPERTY = PROPERTY_REFERRING_WIDGET__FOR_PROPERTY;

	/**
	 * The feature id for the '<em><b>To View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_WIDGET__TO_VIEW = PROPERTY_REFERRING_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To Destination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_WIDGET__TO_DESTINATION = PROPERTY_REFERRING_WIDGET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Link Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_WIDGET_FEATURE_COUNT = PROPERTY_REFERRING_WIDGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Widgets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL_WIDGET__WIDGETS = WIDGETS_CONTAINER__WIDGETS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL_WIDGET__NAME = WIDGETS_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL_WIDGET__DOC = WIDGETS_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL_WIDGET__HINT = WIDGETS_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL_WIDGET__VIEW = WIDGETS_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL_WIDGET__LABEL = WIDGETS_CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Behavior Bindings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL_WIDGET__BEHAVIOR_BINDINGS = WIDGETS_CONTAINER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL_WIDGET__ENABLED = WIDGETS_CONTAINER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Widget Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL_WIDGET__WIDGET_TYPE = WIDGETS_CONTAINER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL_WIDGET__VISIBLE = WIDGETS_CONTAINER_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>For Op</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL_WIDGET__FOR_OP = WIDGETS_CONTAINER_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>For</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL_WIDGET__FOR = WIDGETS_CONTAINER_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Property Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL_WIDGET__PROPERTY_PATH = WIDGETS_CONTAINER_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>For Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL_WIDGET__FOR_PROPERTY = WIDGETS_CONTAINER_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Disclosure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL_WIDGET__DISCLOSURE = WIDGETS_CONTAINER_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Panel Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL_WIDGET_FEATURE_COUNT = WIDGETS_CONTAINER_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_BEHAVIOR__NAME = SculptormetamodelPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_BEHAVIOR__DOC = SculptormetamodelPackage.NAMED_ELEMENT__DOC;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_BEHAVIOR__HINT = SculptormetamodelPackage.NAMED_ELEMENT__HINT;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_BEHAVIOR__BINDINGS = SculptormetamodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ui Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_BEHAVIOR_FEATURE_COUNT = SculptormetamodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPULATE_PANEL_BEHAVIOR__NAME = UI_BEHAVIOR__NAME;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPULATE_PANEL_BEHAVIOR__DOC = UI_BEHAVIOR__DOC;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPULATE_PANEL_BEHAVIOR__HINT = UI_BEHAVIOR__HINT;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPULATE_PANEL_BEHAVIOR__BINDINGS = UI_BEHAVIOR__BINDINGS;

	/**
	 * The feature id for the '<em><b>Panel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPULATE_PANEL_BEHAVIOR__PANEL = UI_BEHAVIOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Populate Panel Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPULATE_PANEL_BEHAVIOR_FEATURE_COUNT = UI_BEHAVIOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATE_TO_VIEW_BEHAVIOR__NAME = UI_BEHAVIOR__NAME;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATE_TO_VIEW_BEHAVIOR__DOC = UI_BEHAVIOR__DOC;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATE_TO_VIEW_BEHAVIOR__HINT = UI_BEHAVIOR__HINT;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATE_TO_VIEW_BEHAVIOR__BINDINGS = UI_BEHAVIOR__BINDINGS;

	/**
	 * The feature id for the '<em><b>View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATE_TO_VIEW_BEHAVIOR__VIEW = UI_BEHAVIOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Navigate To View Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATE_TO_VIEW_BEHAVIOR_FEATURE_COUNT = UI_BEHAVIOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Behaviors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_BINDING__BEHAVIORS = 0;

	/**
	 * The feature id for the '<em><b>Widget</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_BINDING__WIDGET = 1;

	/**
	 * The feature id for the '<em><b>Binding Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_BINDING__BINDING_TYPE_NAME = 2;

	/**
	 * The number of structural features of the '<em>Behavior Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_BINDING_FEATURE_COUNT = 3;

	/**
	 * The feature id for the '<em><b>Behaviors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_CLICK_BINDING__BEHAVIORS = BEHAVIOR_BINDING__BEHAVIORS;

	/**
	 * The feature id for the '<em><b>Widget</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_CLICK_BINDING__WIDGET = BEHAVIOR_BINDING__WIDGET;

	/**
	 * The feature id for the '<em><b>Binding Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_CLICK_BINDING__BINDING_TYPE_NAME = BEHAVIOR_BINDING__BINDING_TYPE_NAME;

	/**
	 * The number of structural features of the '<em>On Click Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_CLICK_BINDING_FEATURE_COUNT = BEHAVIOR_BINDING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Behaviors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_HOVER_BINDING__BEHAVIORS = BEHAVIOR_BINDING__BEHAVIORS;

	/**
	 * The feature id for the '<em><b>Widget</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_HOVER_BINDING__WIDGET = BEHAVIOR_BINDING__WIDGET;

	/**
	 * The feature id for the '<em><b>Binding Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_HOVER_BINDING__BINDING_TYPE_NAME = BEHAVIOR_BINDING__BINDING_TYPE_NAME;

	/**
	 * The number of structural features of the '<em>On Hover Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_HOVER_BINDING_FEATURE_COUNT = BEHAVIOR_BINDING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_CONDITION__NAME = SculptormetamodelPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_CONDITION__DOC = SculptormetamodelPackage.NAMED_ELEMENT__DOC;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_CONDITION__HINT = SculptormetamodelPackage.NAMED_ELEMENT__HINT;

	/**
	 * The number of structural features of the '<em>Ui Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_CONDITION_FEATURE_COUNT = SculptormetamodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link sculptorguimetamodel.impl.GuiEnumImpl <em>Gui Enum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptorguimetamodel.impl.GuiEnumImpl
	 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getGuiEnum()
	 * @generated
	 */
	int GUI_ENUM = 51;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_ENUM__NAME = SculptormetamodelPackage.ENUM__NAME;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_ENUM__DOC = SculptormetamodelPackage.ENUM__DOC;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_ENUM__HINT = SculptormetamodelPackage.ENUM__HINT;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_ENUM__REFERENCES = SculptormetamodelPackage.ENUM__REFERENCES;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_ENUM__EXTENDS = SculptormetamodelPackage.ENUM__EXTENDS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_ENUM__ATTRIBUTES = SculptormetamodelPackage.ENUM__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_ENUM__ABSTRACT = SculptormetamodelPackage.ENUM__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_ENUM__REPOSITORY = SculptormetamodelPackage.ENUM__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_ENUM__MODULE = SculptormetamodelPackage.ENUM__MODULE;

	/**
	 * The feature id for the '<em><b>Optimistic Locking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_ENUM__OPTIMISTIC_LOCKING = SculptormetamodelPackage.ENUM__OPTIMISTIC_LOCKING;

	/**
	 * The feature id for the '<em><b>Cache</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_ENUM__CACHE = SculptormetamodelPackage.ENUM__CACHE;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_ENUM__PACKAGE = SculptormetamodelPackage.ENUM__PACKAGE;

	/**
	 * The feature id for the '<em><b>Database Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_ENUM__DATABASE_TABLE = SculptormetamodelPackage.ENUM__DATABASE_TABLE;

	/**
	 * The feature id for the '<em><b>Extends Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_ENUM__EXTENDS_NAME = SculptormetamodelPackage.ENUM__EXTENDS_NAME;

	/**
	 * The feature id for the '<em><b>Validate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_ENUM__VALIDATE = SculptormetamodelPackage.ENUM__VALIDATE;

	/**
	 * The feature id for the '<em><b>Gap Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_ENUM__GAP_CLASS = SculptormetamodelPackage.ENUM__GAP_CLASS;

	/**
	 * The feature id for the '<em><b>Inheritance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_ENUM__INHERITANCE = SculptormetamodelPackage.ENUM__INHERITANCE;

	/**
	 * The feature id for the '<em><b>Discriminator Column Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_ENUM__DISCRIMINATOR_COLUMN_VALUE = SculptormetamodelPackage.ENUM__DISCRIMINATOR_COLUMN_VALUE;

	/**
	 * The feature id for the '<em><b>Aggregate Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_ENUM__AGGREGATE_ROOT = SculptormetamodelPackage.ENUM__AGGREGATE_ROOT;

	/**
	 * The feature id for the '<em><b>Belongs To Aggregate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_ENUM__BELONGS_TO_AGGREGATE = SculptormetamodelPackage.ENUM__BELONGS_TO_AGGREGATE;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_ENUM__OPERATIONS = SculptormetamodelPackage.ENUM__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Traits</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_ENUM__TRAITS = SculptormetamodelPackage.ENUM__TRAITS;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_ENUM__VALUES = SculptormetamodelPackage.ENUM__VALUES;

	/**
	 * The feature id for the '<em><b>For</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_ENUM__FOR = SculptormetamodelPackage.ENUM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gui Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_ENUM__GUI_MODULE = SculptormetamodelPackage.ENUM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Immutable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_ENUM__IMMUTABLE = SculptormetamodelPackage.ENUM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Gui Enum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_ENUM_FEATURE_COUNT = SculptormetamodelPackage.ENUM_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link sculptorguimetamodel.impl.StubModuleImpl <em>Stub Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptorguimetamodel.impl.StubModuleImpl
	 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getStubModule()
	 * @generated
	 */
	int STUB_MODULE = 52;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUB_MODULE__NAME = SculptormetamodelPackage.MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUB_MODULE__DOC = SculptormetamodelPackage.MODULE__DOC;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUB_MODULE__HINT = SculptormetamodelPackage.MODULE__HINT;

	/**
	 * The feature id for the '<em><b>Base Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUB_MODULE__BASE_PACKAGE = SculptormetamodelPackage.MODULE__BASE_PACKAGE;

	/**
	 * The feature id for the '<em><b>Application</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUB_MODULE__APPLICATION = SculptormetamodelPackage.MODULE__APPLICATION;

	/**
	 * The feature id for the '<em><b>Domain Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUB_MODULE__DOMAIN_OBJECTS = SculptormetamodelPackage.MODULE__DOMAIN_OBJECTS;

	/**
	 * The feature id for the '<em><b>Consumers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUB_MODULE__CONSUMERS = SculptormetamodelPackage.MODULE__CONSUMERS;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUB_MODULE__SERVICES = SculptormetamodelPackage.MODULE__SERVICES;

	/**
	 * The feature id for the '<em><b>External</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUB_MODULE__EXTERNAL = SculptormetamodelPackage.MODULE__EXTERNAL;

	/**
	 * The feature id for the '<em><b>Persistence Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUB_MODULE__PERSISTENCE_UNIT = SculptormetamodelPackage.MODULE__PERSISTENCE_UNIT;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUB_MODULE__RESOURCES = SculptormetamodelPackage.MODULE__RESOURCES;

	/**
	 * The feature id for the '<em><b>Stub For</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUB_MODULE__STUB_FOR = SculptormetamodelPackage.MODULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gui Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUB_MODULE__GUI_MODULE = SculptormetamodelPackage.MODULE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Stub Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUB_MODULE_FEATURE_COUNT = SculptormetamodelPackage.MODULE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link sculptorguimetamodel.impl.ListBoxWidgetImpl <em>List Box Widget</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptorguimetamodel.impl.ListBoxWidgetImpl
	 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getListBoxWidget()
	 * @generated
	 */
	int LIST_BOX_WIDGET = 53;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_BOX_WIDGET__NAME = PROPERTY_REFERRING_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_BOX_WIDGET__DOC = PROPERTY_REFERRING_WIDGET__DOC;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_BOX_WIDGET__HINT = PROPERTY_REFERRING_WIDGET__HINT;

	/**
	 * The feature id for the '<em><b>View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_BOX_WIDGET__VIEW = PROPERTY_REFERRING_WIDGET__VIEW;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_BOX_WIDGET__LABEL = PROPERTY_REFERRING_WIDGET__LABEL;

	/**
	 * The feature id for the '<em><b>Behavior Bindings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_BOX_WIDGET__BEHAVIOR_BINDINGS = PROPERTY_REFERRING_WIDGET__BEHAVIOR_BINDINGS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_BOX_WIDGET__ENABLED = PROPERTY_REFERRING_WIDGET__ENABLED;

	/**
	 * The feature id for the '<em><b>Widget Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_BOX_WIDGET__WIDGET_TYPE = PROPERTY_REFERRING_WIDGET__WIDGET_TYPE;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_BOX_WIDGET__VISIBLE = PROPERTY_REFERRING_WIDGET__VISIBLE;

	/**
	 * The feature id for the '<em><b>For Op</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_BOX_WIDGET__FOR_OP = PROPERTY_REFERRING_WIDGET__FOR_OP;

	/**
	 * The feature id for the '<em><b>For</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_BOX_WIDGET__FOR = PROPERTY_REFERRING_WIDGET__FOR;

	/**
	 * The feature id for the '<em><b>Property Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_BOX_WIDGET__PROPERTY_PATH = PROPERTY_REFERRING_WIDGET__PROPERTY_PATH;

	/**
	 * The feature id for the '<em><b>For Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_BOX_WIDGET__FOR_PROPERTY = PROPERTY_REFERRING_WIDGET__FOR_PROPERTY;

	/**
	 * The feature id for the '<em><b>For Enum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_BOX_WIDGET__FOR_ENUM = PROPERTY_REFERRING_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>List Box Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_BOX_WIDGET_FEATURE_COUNT = PROPERTY_REFERRING_WIDGET_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link sculptorguimetamodel.impl.BehaviorContainerImpl <em>Behavior Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptorguimetamodel.impl.BehaviorContainerImpl
	 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getBehaviorContainer()
	 * @generated
	 */
	int BEHAVIOR_CONTAINER = 54;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONTAINER__CONDITIONS = 0;

	/**
	 * The feature id for the '<em><b>Behaviors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONTAINER__BEHAVIORS = 1;

	/**
	 * The number of structural features of the '<em>Behavior Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONTAINER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link sculptorguimetamodel.impl.CustomWidgetImpl <em>Custom Widget</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptorguimetamodel.impl.CustomWidgetImpl
	 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getCustomWidget()
	 * @generated
	 */
	int CUSTOM_WIDGET = 55;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_WIDGET__NAME = PROPERTY_REFERRING_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_WIDGET__DOC = PROPERTY_REFERRING_WIDGET__DOC;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_WIDGET__HINT = PROPERTY_REFERRING_WIDGET__HINT;

	/**
	 * The feature id for the '<em><b>View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_WIDGET__VIEW = PROPERTY_REFERRING_WIDGET__VIEW;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_WIDGET__LABEL = PROPERTY_REFERRING_WIDGET__LABEL;

	/**
	 * The feature id for the '<em><b>Behavior Bindings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_WIDGET__BEHAVIOR_BINDINGS = PROPERTY_REFERRING_WIDGET__BEHAVIOR_BINDINGS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_WIDGET__ENABLED = PROPERTY_REFERRING_WIDGET__ENABLED;

	/**
	 * The feature id for the '<em><b>Widget Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_WIDGET__WIDGET_TYPE = PROPERTY_REFERRING_WIDGET__WIDGET_TYPE;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_WIDGET__VISIBLE = PROPERTY_REFERRING_WIDGET__VISIBLE;

	/**
	 * The feature id for the '<em><b>For Op</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_WIDGET__FOR_OP = PROPERTY_REFERRING_WIDGET__FOR_OP;

	/**
	 * The feature id for the '<em><b>For</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_WIDGET__FOR = PROPERTY_REFERRING_WIDGET__FOR;

	/**
	 * The feature id for the '<em><b>Property Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_WIDGET__PROPERTY_PATH = PROPERTY_REFERRING_WIDGET__PROPERTY_PATH;

	/**
	 * The feature id for the '<em><b>For Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_WIDGET__FOR_PROPERTY = PROPERTY_REFERRING_WIDGET__FOR_PROPERTY;

	/**
	 * The number of structural features of the '<em>Custom Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_WIDGET_FEATURE_COUNT = PROPERTY_REFERRING_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link sculptorguimetamodel.impl.UpdateTableBehaviorImpl <em>Update Table Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptorguimetamodel.impl.UpdateTableBehaviorImpl
	 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getUpdateTableBehavior()
	 * @generated
	 */
	int UPDATE_TABLE_BEHAVIOR = 56;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_TABLE_BEHAVIOR__NAME = UI_BEHAVIOR__NAME;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_TABLE_BEHAVIOR__DOC = UI_BEHAVIOR__DOC;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_TABLE_BEHAVIOR__HINT = UI_BEHAVIOR__HINT;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_TABLE_BEHAVIOR__BINDINGS = UI_BEHAVIOR__BINDINGS;

	/**
	 * The feature id for the '<em><b>Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_TABLE_BEHAVIOR__TABLE = UI_BEHAVIOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Update Table Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_TABLE_BEHAVIOR_FEATURE_COUNT = UI_BEHAVIOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link sculptorguimetamodel.impl.ConfirmMessageBehaviorImpl <em>Confirm Message Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptorguimetamodel.impl.ConfirmMessageBehaviorImpl
	 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getConfirmMessageBehavior()
	 * @generated
	 */
	int CONFIRM_MESSAGE_BEHAVIOR = 57;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIRM_MESSAGE_BEHAVIOR__NAME = UI_BEHAVIOR__NAME;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIRM_MESSAGE_BEHAVIOR__DOC = UI_BEHAVIOR__DOC;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIRM_MESSAGE_BEHAVIOR__HINT = UI_BEHAVIOR__HINT;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIRM_MESSAGE_BEHAVIOR__BINDINGS = UI_BEHAVIOR__BINDINGS;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIRM_MESSAGE_BEHAVIOR__MESSAGE = UI_BEHAVIOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Confirm Message Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIRM_MESSAGE_BEHAVIOR_FEATURE_COUNT = UI_BEHAVIOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link sculptorguimetamodel.impl.CustomBehaviorImpl <em>Custom Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptorguimetamodel.impl.CustomBehaviorImpl
	 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getCustomBehavior()
	 * @generated
	 */
	int CUSTOM_BEHAVIOR = 58;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_BEHAVIOR__NAME = UI_BEHAVIOR__NAME;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_BEHAVIOR__DOC = UI_BEHAVIOR__DOC;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_BEHAVIOR__HINT = UI_BEHAVIOR__HINT;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_BEHAVIOR__BINDINGS = UI_BEHAVIOR__BINDINGS;

	/**
	 * The number of structural features of the '<em>Custom Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_BEHAVIOR_FEATURE_COUNT = UI_BEHAVIOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link sculptorguimetamodel.impl.CustomConditionImpl <em>Custom Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptorguimetamodel.impl.CustomConditionImpl
	 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getCustomCondition()
	 * @generated
	 */
	int CUSTOM_CONDITION = 59;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONDITION__NAME = UI_CONDITION__NAME;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONDITION__DOC = UI_CONDITION__DOC;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONDITION__HINT = UI_CONDITION__HINT;

	/**
	 * The number of structural features of the '<em>Custom Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONDITION_FEATURE_COUNT = UI_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link sculptorguimetamodel.impl.CompositeBehaviorImpl <em>Composite Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptorguimetamodel.impl.CompositeBehaviorImpl
	 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getCompositeBehavior()
	 * @generated
	 */
	int COMPOSITE_BEHAVIOR = 60;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_BEHAVIOR__NAME = UI_BEHAVIOR__NAME;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_BEHAVIOR__DOC = UI_BEHAVIOR__DOC;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_BEHAVIOR__HINT = UI_BEHAVIOR__HINT;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_BEHAVIOR__BINDINGS = UI_BEHAVIOR__BINDINGS;

	/**
	 * The feature id for the '<em><b>Behaviors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_BEHAVIOR__BEHAVIORS = UI_BEHAVIOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composite Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_BEHAVIOR_FEATURE_COUNT = UI_BEHAVIOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link sculptorguimetamodel.impl.OnSelectItemBindingImpl <em>On Select Item Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptorguimetamodel.impl.OnSelectItemBindingImpl
	 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getOnSelectItemBinding()
	 * @generated
	 */
	int ON_SELECT_ITEM_BINDING = 61;

	/**
	 * The feature id for the '<em><b>Behaviors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SELECT_ITEM_BINDING__BEHAVIORS = BEHAVIOR_BINDING__BEHAVIORS;

	/**
	 * The feature id for the '<em><b>Widget</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SELECT_ITEM_BINDING__WIDGET = BEHAVIOR_BINDING__WIDGET;

	/**
	 * The feature id for the '<em><b>Binding Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SELECT_ITEM_BINDING__BINDING_TYPE_NAME = BEHAVIOR_BINDING__BINDING_TYPE_NAME;

	/**
	 * The number of structural features of the '<em>On Select Item Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SELECT_ITEM_BINDING_FEATURE_COUNT = BEHAVIOR_BINDING_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link sculptorguimetamodel.impl.WidgetTableColumnImpl <em>Widget Table Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptorguimetamodel.impl.WidgetTableColumnImpl
	 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getWidgetTableColumn()
	 * @generated
	 */
	int WIDGET_TABLE_COLUMN = 62;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_TABLE_COLUMN__NAME = TABLE_COLUMN__NAME;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_TABLE_COLUMN__DOC = TABLE_COLUMN__DOC;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_TABLE_COLUMN__HINT = TABLE_COLUMN__HINT;

	/**
	 * The feature id for the '<em><b>View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_TABLE_COLUMN__VIEW = TABLE_COLUMN__VIEW;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_TABLE_COLUMN__LABEL = TABLE_COLUMN__LABEL;

	/**
	 * The feature id for the '<em><b>Behavior Bindings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_TABLE_COLUMN__BEHAVIOR_BINDINGS = TABLE_COLUMN__BEHAVIOR_BINDINGS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_TABLE_COLUMN__ENABLED = TABLE_COLUMN__ENABLED;

	/**
	 * The feature id for the '<em><b>Widget Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_TABLE_COLUMN__WIDGET_TYPE = TABLE_COLUMN__WIDGET_TYPE;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_TABLE_COLUMN__VISIBLE = TABLE_COLUMN__VISIBLE;

	/**
	 * The feature id for the '<em><b>For Op</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_TABLE_COLUMN__FOR_OP = TABLE_COLUMN__FOR_OP;

	/**
	 * The feature id for the '<em><b>For</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_TABLE_COLUMN__FOR = TABLE_COLUMN__FOR;

	/**
	 * The feature id for the '<em><b>Property Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_TABLE_COLUMN__PROPERTY_PATH = TABLE_COLUMN__PROPERTY_PATH;

	/**
	 * The feature id for the '<em><b>For Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_TABLE_COLUMN__FOR_PROPERTY = TABLE_COLUMN__FOR_PROPERTY;

	/**
	 * The feature id for the '<em><b>Column Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_TABLE_COLUMN__COLUMN_TYPE = TABLE_COLUMN__COLUMN_TYPE;

	/**
	 * The feature id for the '<em><b>Filterable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_TABLE_COLUMN__FILTERABLE = TABLE_COLUMN__FILTERABLE;

	/**
	 * The feature id for the '<em><b>Sortable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_TABLE_COLUMN__SORTABLE = TABLE_COLUMN__SORTABLE;

	/**
	 * The feature id for the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_TABLE_COLUMN__EDITABLE = TABLE_COLUMN__EDITABLE;

	/**
	 * The feature id for the '<em><b>Widget</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_TABLE_COLUMN__WIDGET = TABLE_COLUMN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Widget Table Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_TABLE_COLUMN_FEATURE_COUNT = TABLE_COLUMN_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link sculptorguimetamodel.impl.SimpleTableColumnImpl <em>Simple Table Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptorguimetamodel.impl.SimpleTableColumnImpl
	 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getSimpleTableColumn()
	 * @generated
	 */
	int SIMPLE_TABLE_COLUMN = 63;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TABLE_COLUMN__NAME = TABLE_COLUMN__NAME;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TABLE_COLUMN__DOC = TABLE_COLUMN__DOC;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TABLE_COLUMN__HINT = TABLE_COLUMN__HINT;

	/**
	 * The feature id for the '<em><b>View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TABLE_COLUMN__VIEW = TABLE_COLUMN__VIEW;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TABLE_COLUMN__LABEL = TABLE_COLUMN__LABEL;

	/**
	 * The feature id for the '<em><b>Behavior Bindings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TABLE_COLUMN__BEHAVIOR_BINDINGS = TABLE_COLUMN__BEHAVIOR_BINDINGS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TABLE_COLUMN__ENABLED = TABLE_COLUMN__ENABLED;

	/**
	 * The feature id for the '<em><b>Widget Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TABLE_COLUMN__WIDGET_TYPE = TABLE_COLUMN__WIDGET_TYPE;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TABLE_COLUMN__VISIBLE = TABLE_COLUMN__VISIBLE;

	/**
	 * The feature id for the '<em><b>For Op</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TABLE_COLUMN__FOR_OP = TABLE_COLUMN__FOR_OP;

	/**
	 * The feature id for the '<em><b>For</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TABLE_COLUMN__FOR = TABLE_COLUMN__FOR;

	/**
	 * The feature id for the '<em><b>Property Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TABLE_COLUMN__PROPERTY_PATH = TABLE_COLUMN__PROPERTY_PATH;

	/**
	 * The feature id for the '<em><b>For Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TABLE_COLUMN__FOR_PROPERTY = TABLE_COLUMN__FOR_PROPERTY;

	/**
	 * The feature id for the '<em><b>Column Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TABLE_COLUMN__COLUMN_TYPE = TABLE_COLUMN__COLUMN_TYPE;

	/**
	 * The feature id for the '<em><b>Filterable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TABLE_COLUMN__FILTERABLE = TABLE_COLUMN__FILTERABLE;

	/**
	 * The feature id for the '<em><b>Sortable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TABLE_COLUMN__SORTABLE = TABLE_COLUMN__SORTABLE;

	/**
	 * The feature id for the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TABLE_COLUMN__EDITABLE = TABLE_COLUMN__EDITABLE;

	/**
	 * The number of structural features of the '<em>Simple Table Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TABLE_COLUMN_FEATURE_COUNT = TABLE_COLUMN_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link sculptorguimetamodel.impl.SetDirtyFlagBehaviorImpl <em>Set Dirty Flag Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptorguimetamodel.impl.SetDirtyFlagBehaviorImpl
	 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getSetDirtyFlagBehavior()
	 * @generated
	 */
	int SET_DIRTY_FLAG_BEHAVIOR = 64;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_DIRTY_FLAG_BEHAVIOR__NAME = UI_BEHAVIOR__NAME;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_DIRTY_FLAG_BEHAVIOR__DOC = UI_BEHAVIOR__DOC;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_DIRTY_FLAG_BEHAVIOR__HINT = UI_BEHAVIOR__HINT;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_DIRTY_FLAG_BEHAVIOR__BINDINGS = UI_BEHAVIOR__BINDINGS;

	/**
	 * The feature id for the '<em><b>Mark Specific Obj</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_DIRTY_FLAG_BEHAVIOR__MARK_SPECIFIC_OBJ = UI_BEHAVIOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Set Dirty Flag Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_DIRTY_FLAG_BEHAVIOR_FEATURE_COUNT = UI_BEHAVIOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link sculptorguimetamodel.impl.WarnIfDirtyBehaviorImpl <em>Warn If Dirty Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptorguimetamodel.impl.WarnIfDirtyBehaviorImpl
	 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getWarnIfDirtyBehavior()
	 * @generated
	 */
	int WARN_IF_DIRTY_BEHAVIOR = 65;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARN_IF_DIRTY_BEHAVIOR__NAME = CONFIRM_MESSAGE_BEHAVIOR__NAME;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARN_IF_DIRTY_BEHAVIOR__DOC = CONFIRM_MESSAGE_BEHAVIOR__DOC;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARN_IF_DIRTY_BEHAVIOR__HINT = CONFIRM_MESSAGE_BEHAVIOR__HINT;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARN_IF_DIRTY_BEHAVIOR__BINDINGS = CONFIRM_MESSAGE_BEHAVIOR__BINDINGS;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARN_IF_DIRTY_BEHAVIOR__MESSAGE = CONFIRM_MESSAGE_BEHAVIOR__MESSAGE;

	/**
	 * The number of structural features of the '<em>Warn If Dirty Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARN_IF_DIRTY_BEHAVIOR_FEATURE_COUNT = CONFIRM_MESSAGE_BEHAVIOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link sculptorguimetamodel.impl.PopulateListBoxBehaviorImpl <em>Populate List Box Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptorguimetamodel.impl.PopulateListBoxBehaviorImpl
	 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getPopulateListBoxBehavior()
	 * @generated
	 */
	int POPULATE_LIST_BOX_BEHAVIOR = 66;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPULATE_LIST_BOX_BEHAVIOR__NAME = UI_BEHAVIOR__NAME;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPULATE_LIST_BOX_BEHAVIOR__DOC = UI_BEHAVIOR__DOC;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPULATE_LIST_BOX_BEHAVIOR__HINT = UI_BEHAVIOR__HINT;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPULATE_LIST_BOX_BEHAVIOR__BINDINGS = UI_BEHAVIOR__BINDINGS;

	/**
	 * The feature id for the '<em><b>Widget</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPULATE_LIST_BOX_BEHAVIOR__WIDGET = UI_BEHAVIOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Populate List Box Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPULATE_LIST_BOX_BEHAVIOR_FEATURE_COUNT = UI_BEHAVIOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link sculptorguimetamodel.impl.MarkDirtyBehaviorImpl <em>Mark Dirty Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptorguimetamodel.impl.MarkDirtyBehaviorImpl
	 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getMarkDirtyBehavior()
	 * @generated
	 */
	int MARK_DIRTY_BEHAVIOR = 67;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARK_DIRTY_BEHAVIOR__NAME = SET_DIRTY_FLAG_BEHAVIOR__NAME;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARK_DIRTY_BEHAVIOR__DOC = SET_DIRTY_FLAG_BEHAVIOR__DOC;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARK_DIRTY_BEHAVIOR__HINT = SET_DIRTY_FLAG_BEHAVIOR__HINT;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARK_DIRTY_BEHAVIOR__BINDINGS = SET_DIRTY_FLAG_BEHAVIOR__BINDINGS;

	/**
	 * The feature id for the '<em><b>Mark Specific Obj</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARK_DIRTY_BEHAVIOR__MARK_SPECIFIC_OBJ = SET_DIRTY_FLAG_BEHAVIOR__MARK_SPECIFIC_OBJ;

	/**
	 * The number of structural features of the '<em>Mark Dirty Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARK_DIRTY_BEHAVIOR_FEATURE_COUNT = SET_DIRTY_FLAG_BEHAVIOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link sculptorguimetamodel.impl.MarkCleanBehaviorImpl <em>Mark Clean Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptorguimetamodel.impl.MarkCleanBehaviorImpl
	 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getMarkCleanBehavior()
	 * @generated
	 */
	int MARK_CLEAN_BEHAVIOR = 68;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARK_CLEAN_BEHAVIOR__NAME = SET_DIRTY_FLAG_BEHAVIOR__NAME;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARK_CLEAN_BEHAVIOR__DOC = SET_DIRTY_FLAG_BEHAVIOR__DOC;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARK_CLEAN_BEHAVIOR__HINT = SET_DIRTY_FLAG_BEHAVIOR__HINT;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARK_CLEAN_BEHAVIOR__BINDINGS = SET_DIRTY_FLAG_BEHAVIOR__BINDINGS;

	/**
	 * The feature id for the '<em><b>Mark Specific Obj</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARK_CLEAN_BEHAVIOR__MARK_SPECIFIC_OBJ = SET_DIRTY_FLAG_BEHAVIOR__MARK_SPECIFIC_OBJ;

	/**
	 * The number of structural features of the '<em>Mark Clean Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARK_CLEAN_BEHAVIOR_FEATURE_COUNT = SET_DIRTY_FLAG_BEHAVIOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link sculptorguimetamodel.impl.GoBackBehaviorImpl <em>Go Back Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptorguimetamodel.impl.GoBackBehaviorImpl
	 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getGoBackBehavior()
	 * @generated
	 */
	int GO_BACK_BEHAVIOR = 69;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_BACK_BEHAVIOR__NAME = UI_BEHAVIOR__NAME;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_BACK_BEHAVIOR__DOC = UI_BEHAVIOR__DOC;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_BACK_BEHAVIOR__HINT = UI_BEHAVIOR__HINT;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_BACK_BEHAVIOR__BINDINGS = UI_BEHAVIOR__BINDINGS;

	/**
	 * The number of structural features of the '<em>Go Back Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_BACK_BEHAVIOR_FEATURE_COUNT = UI_BEHAVIOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link sculptorguimetamodel.impl.UpdateAttributeBehaviorImpl <em>Update Attribute Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptorguimetamodel.impl.UpdateAttributeBehaviorImpl
	 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getUpdateAttributeBehavior()
	 * @generated
	 */
	int UPDATE_ATTRIBUTE_BEHAVIOR = 70;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ATTRIBUTE_BEHAVIOR__NAME = UI_BEHAVIOR__NAME;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ATTRIBUTE_BEHAVIOR__DOC = UI_BEHAVIOR__DOC;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ATTRIBUTE_BEHAVIOR__HINT = UI_BEHAVIOR__HINT;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ATTRIBUTE_BEHAVIOR__BINDINGS = UI_BEHAVIOR__BINDINGS;

	/**
	 * The feature id for the '<em><b>Property Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ATTRIBUTE_BEHAVIOR__PROPERTY_PATH = UI_BEHAVIOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ATTRIBUTE_BEHAVIOR__TARGET_CLASS = UI_BEHAVIOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Update Attribute Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ATTRIBUTE_BEHAVIOR_FEATURE_COUNT = UI_BEHAVIOR_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link sculptorguimetamodel.impl.HasDirtyValueConditionImpl <em>Has Dirty Value Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptorguimetamodel.impl.HasDirtyValueConditionImpl
	 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getHasDirtyValueCondition()
	 * @generated
	 */
	int HAS_DIRTY_VALUE_CONDITION = 71;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_DIRTY_VALUE_CONDITION__NAME = UI_CONDITION__NAME;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_DIRTY_VALUE_CONDITION__DOC = UI_CONDITION__DOC;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_DIRTY_VALUE_CONDITION__HINT = UI_CONDITION__HINT;

	/**
	 * The feature id for the '<em><b>Dirty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_DIRTY_VALUE_CONDITION__DIRTY = UI_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Has Dirty Value Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_DIRTY_VALUE_CONDITION_FEATURE_COUNT = UI_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link sculptorguimetamodel.impl.PopupPanelBehaviorImpl <em>Popup Panel Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptorguimetamodel.impl.PopupPanelBehaviorImpl
	 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getPopupPanelBehavior()
	 * @generated
	 */
	int POPUP_PANEL_BEHAVIOR = 72;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPUP_PANEL_BEHAVIOR__NAME = UI_BEHAVIOR__NAME;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPUP_PANEL_BEHAVIOR__DOC = UI_BEHAVIOR__DOC;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPUP_PANEL_BEHAVIOR__HINT = UI_BEHAVIOR__HINT;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPUP_PANEL_BEHAVIOR__BINDINGS = UI_BEHAVIOR__BINDINGS;

	/**
	 * The feature id for the '<em><b>View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPUP_PANEL_BEHAVIOR__VIEW = UI_BEHAVIOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Panel Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPUP_PANEL_BEHAVIOR__PANEL_NAME = UI_BEHAVIOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Popup Panel Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPUP_PANEL_BEHAVIOR_FEATURE_COUNT = UI_BEHAVIOR_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link sculptorguimetamodel.impl.GuiDtoOptionsImpl <em>Gui Dto Options</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptorguimetamodel.impl.GuiDtoOptionsImpl
	 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getGuiDtoOptions()
	 * @generated
	 */
	int GUI_DTO_OPTIONS = 73;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_DTO_OPTIONS__NAME = SculptormetamodelPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_DTO_OPTIONS__DOC = SculptormetamodelPackage.NAMED_ELEMENT__DOC;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_DTO_OPTIONS__HINT = SculptormetamodelPackage.NAMED_ELEMENT__HINT;

	/**
	 * The feature id for the '<em><b>Skip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_DTO_OPTIONS__SKIP = SculptormetamodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gui Dto Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_DTO_OPTIONS_FEATURE_COUNT = SculptormetamodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link sculptorguimetamodel.impl.PropertyPathElementImpl <em>Property Path Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptorguimetamodel.impl.PropertyPathElementImpl
	 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getPropertyPathElement()
	 * @generated
	 */
	int PROPERTY_PATH_ELEMENT = 74;

	/**
	 * The feature id for the '<em><b>Remaining Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_PATH_ELEMENT__REMAINING_PATH = 0;

	/**
	 * The feature id for the '<em><b>For Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_PATH_ELEMENT__FOR_ATTRIBUTE = 1;

	/**
	 * The feature id for the '<em><b>For Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_PATH_ELEMENT__FOR_REFERENCE = 2;

	/**
	 * The number of structural features of the '<em>Property Path Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_PATH_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * Returns the meta object for class '{@link sculptorguimetamodel.GuiApplication <em>Gui Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gui Application</em>'.
	 * @see sculptorguimetamodel.GuiApplication
	 * @generated
	 */
	EClass getGuiApplication();

	/**
	 * Returns the meta object for the reference '{@link sculptorguimetamodel.GuiApplication#getGuiForApplication <em>Gui For Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gui For Application</em>'.
	 * @see sculptorguimetamodel.GuiApplication#getGuiForApplication()
	 * @see #getGuiApplication()
	 * @generated
	 */
	EReference getGuiApplication_GuiForApplication();

	/**
	 * Returns the meta object for the containment reference list '{@link sculptorguimetamodel.GuiApplication#getModules <em>Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modules</em>'.
	 * @see sculptorguimetamodel.GuiApplication#getModules()
	 * @see #getGuiApplication()
	 * @generated
	 */
	EReference getGuiApplication_Modules();

	/**
	 * Returns the meta object for the attribute '{@link sculptorguimetamodel.GuiApplication#getBasePackage <em>Base Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Package</em>'.
	 * @see sculptorguimetamodel.GuiApplication#getBasePackage()
	 * @see #getGuiApplication()
	 * @generated
	 */
	EAttribute getGuiApplication_BasePackage();

	/**
	 * Returns the meta object for class '{@link sculptorguimetamodel.GuiModule <em>Gui Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gui Module</em>'.
	 * @see sculptorguimetamodel.GuiModule
	 * @generated
	 */
	EClass getGuiModule();

	/**
	 * Returns the meta object for the containment reference list '{@link sculptorguimetamodel.GuiModule#getUserTasks <em>User Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>User Tasks</em>'.
	 * @see sculptorguimetamodel.GuiModule#getUserTasks()
	 * @see #getGuiModule()
	 * @generated
	 */
	EReference getGuiModule_UserTasks();

	/**
	 * Returns the meta object for the attribute '{@link sculptorguimetamodel.GuiModule#getBasePackage <em>Base Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Package</em>'.
	 * @see sculptorguimetamodel.GuiModule#getBasePackage()
	 * @see #getGuiModule()
	 * @generated
	 */
	EAttribute getGuiModule_BasePackage();

	/**
	 * Returns the meta object for the container reference '{@link sculptorguimetamodel.GuiModule#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Application</em>'.
	 * @see sculptorguimetamodel.GuiModule#getApplication()
	 * @see #getGuiModule()
	 * @generated
	 */
	EReference getGuiModule_Application();

	/**
	 * Returns the meta object for the reference '{@link sculptorguimetamodel.GuiModule#getFor <em>For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>For</em>'.
	 * @see sculptorguimetamodel.GuiModule#getFor()
	 * @see #getGuiModule()
	 * @generated
	 */
	EReference getGuiModule_For();

	/**
	 * Returns the meta object for the containment reference list '{@link sculptorguimetamodel.GuiModule#getViews <em>Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Views</em>'.
	 * @see sculptorguimetamodel.GuiModule#getViews()
	 * @see #getGuiModule()
	 * @generated
	 */
	EReference getGuiModule_Views();

	/**
	 * Returns the meta object for the containment reference list '{@link sculptorguimetamodel.GuiModule#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Events</em>'.
	 * @see sculptorguimetamodel.GuiModule#getEvents()
	 * @see #getGuiModule()
	 * @generated
	 */
	EReference getGuiModule_Events();

	/**
	 * Returns the meta object for the reference list '{@link sculptorguimetamodel.GuiModule#getServiceDependencies <em>Service Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Service Dependencies</em>'.
	 * @see sculptorguimetamodel.GuiModule#getServiceDependencies()
	 * @see #getGuiModule()
	 * @generated
	 */
	EReference getGuiModule_ServiceDependencies();

	/**
	 * Returns the meta object for the containment reference list '{@link sculptorguimetamodel.GuiModule#getCommands <em>Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Commands</em>'.
	 * @see sculptorguimetamodel.GuiModule#getCommands()
	 * @see #getGuiModule()
	 * @generated
	 */
	EReference getGuiModule_Commands();

	/**
	 * Returns the meta object for the reference '{@link sculptorguimetamodel.GuiModule#getStubModule <em>Stub Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Stub Module</em>'.
	 * @see sculptorguimetamodel.GuiModule#getStubModule()
	 * @see #getGuiModule()
	 * @generated
	 */
	EReference getGuiModule_StubModule();

	/**
	 * Returns the meta object for the containment reference list '{@link sculptorguimetamodel.GuiModule#getGuiDtoOptions <em>Gui Dto Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gui Dto Options</em>'.
	 * @see sculptorguimetamodel.GuiModule#getGuiDtoOptions()
	 * @see #getGuiModule()
	 * @generated
	 */
	EReference getGuiModule_GuiDtoOptions();

	/**
	 * Returns the meta object for class '{@link sculptorguimetamodel.UserTask <em>User Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Task</em>'.
	 * @see sculptorguimetamodel.UserTask
	 * @generated
	 */
	EClass getUserTask();

	/**
	 * Returns the meta object for the containment reference list '{@link sculptorguimetamodel.UserTask#getSubTaskTransitions <em>Sub Task Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Task Transitions</em>'.
	 * @see sculptorguimetamodel.UserTask#getSubTaskTransitions()
	 * @see #getUserTask()
	 * @generated
	 */
	EReference getUserTask_SubTaskTransitions();

	/**
	 * Returns the meta object for the reference '{@link sculptorguimetamodel.UserTask#getFor <em>For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>For</em>'.
	 * @see sculptorguimetamodel.UserTask#getFor()
	 * @see #getUserTask()
	 * @generated
	 */
	EReference getUserTask_For();

	/**
	 * Returns the meta object for the attribute '{@link sculptorguimetamodel.UserTask#getAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see sculptorguimetamodel.UserTask#getAbstract()
	 * @see #getUserTask()
	 * @generated
	 */
	EAttribute getUserTask_Abstract();

	/**
	 * Returns the meta object for the container reference '{@link sculptorguimetamodel.UserTask#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Module</em>'.
	 * @see sculptorguimetamodel.UserTask#getModule()
	 * @see #getUserTask()
	 * @generated
	 */
	EReference getUserTask_Module();

	/**
	 * Returns the meta object for the attribute '{@link sculptorguimetamodel.UserTask#getTaskType <em>Task Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Task Type</em>'.
	 * @see sculptorguimetamodel.UserTask#getTaskType()
	 * @see #getUserTask()
	 * @generated
	 */
	EAttribute getUserTask_TaskType();

	/**
	 * Returns the meta object for the containment reference list '{@link sculptorguimetamodel.UserTask#getViewProperties <em>View Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>View Properties</em>'.
	 * @see sculptorguimetamodel.UserTask#getViewProperties()
	 * @see #getUserTask()
	 * @generated
	 */
	EReference getUserTask_ViewProperties();

	/**
	 * Returns the meta object for the attribute '{@link sculptorguimetamodel.UserTask#isConversationRoot <em>Conversation Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conversation Root</em>'.
	 * @see sculptorguimetamodel.UserTask#isConversationRoot()
	 * @see #getUserTask()
	 * @generated
	 */
	EAttribute getUserTask_ConversationRoot();

	/**
	 * Returns the meta object for the attribute '{@link sculptorguimetamodel.UserTask#isGapClass <em>Gap Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gap Class</em>'.
	 * @see sculptorguimetamodel.UserTask#isGapClass()
	 * @see #getUserTask()
	 * @generated
	 */
	EAttribute getUserTask_GapClass();

	/**
	 * Returns the meta object for class '{@link sculptorguimetamodel.CreateTask <em>Create Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Task</em>'.
	 * @see sculptorguimetamodel.CreateTask
	 * @generated
	 */
	EClass getCreateTask();

	/**
	 * Returns the meta object for the reference '{@link sculptorguimetamodel.CreateTask#getCreateDOWith <em>Create DO With</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Create DO With</em>'.
	 * @see sculptorguimetamodel.CreateTask#getCreateDOWith()
	 * @see #getCreateTask()
	 * @generated
	 */
	EReference getCreateTask_CreateDOWith();

	/**
	 * Returns the meta object for the reference '{@link sculptorguimetamodel.CreateTask#getPopulateDOWith <em>Populate DO With</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Populate DO With</em>'.
	 * @see sculptorguimetamodel.CreateTask#getPopulateDOWith()
	 * @see #getCreateTask()
	 * @generated
	 */
	EReference getCreateTask_PopulateDOWith();

	/**
	 * Returns the meta object for class '{@link sculptorguimetamodel.UpdateTask <em>Update Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update Task</em>'.
	 * @see sculptorguimetamodel.UpdateTask
	 * @generated
	 */
	EClass getUpdateTask();

	/**
	 * Returns the meta object for the reference '{@link sculptorguimetamodel.UpdateTask#getFindDOWith <em>Find DO With</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Find DO With</em>'.
	 * @see sculptorguimetamodel.UpdateTask#getFindDOWith()
	 * @see #getUpdateTask()
	 * @generated
	 */
	EReference getUpdateTask_FindDOWith();

	/**
	 * Returns the meta object for the reference '{@link sculptorguimetamodel.UpdateTask#getUpdateDOWith <em>Update DO With</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Update DO With</em>'.
	 * @see sculptorguimetamodel.UpdateTask#getUpdateDOWith()
	 * @see #getUpdateTask()
	 * @generated
	 */
	EReference getUpdateTask_UpdateDOWith();

	/**
	 * Returns the meta object for the reference '{@link sculptorguimetamodel.UpdateTask#getPopulateDOWith <em>Populate DO With</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Populate DO With</em>'.
	 * @see sculptorguimetamodel.UpdateTask#getPopulateDOWith()
	 * @see #getUpdateTask()
	 * @generated
	 */
	EReference getUpdateTask_PopulateDOWith();

	/**
	 * Returns the meta object for class '{@link sculptorguimetamodel.ViewTask <em>View Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Task</em>'.
	 * @see sculptorguimetamodel.ViewTask
	 * @generated
	 */
	EClass getViewTask();

	/**
	 * Returns the meta object for the reference '{@link sculptorguimetamodel.ViewTask#getFindDOWith <em>Find DO With</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Find DO With</em>'.
	 * @see sculptorguimetamodel.ViewTask#getFindDOWith()
	 * @see #getViewTask()
	 * @generated
	 */
	EReference getViewTask_FindDOWith();

	/**
	 * Returns the meta object for class '{@link sculptorguimetamodel.ListTask <em>List Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Task</em>'.
	 * @see sculptorguimetamodel.ListTask
	 * @generated
	 */
	EClass getListTask();

	/**
	 * Returns the meta object for the reference '{@link sculptorguimetamodel.ListTask#getSearchDOWith <em>Search DO With</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Search DO With</em>'.
	 * @see sculptorguimetamodel.ListTask#getSearchDOWith()
	 * @see #getListTask()
	 * @generated
	 */
	EReference getListTask_SearchDOWith();

	/**
	 * Returns the meta object for class '{@link sculptorguimetamodel.DeleteTask <em>Delete Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delete Task</em>'.
	 * @see sculptorguimetamodel.DeleteTask
	 * @generated
	 */
	EClass getDeleteTask();

	/**
	 * Returns the meta object for the reference '{@link sculptorguimetamodel.DeleteTask#getFindDOWith <em>Find DO With</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Find DO With</em>'.
	 * @see sculptorguimetamodel.DeleteTask#getFindDOWith()
	 * @see #getDeleteTask()
	 * @generated
	 */
	EReference getDeleteTask_FindDOWith();

	/**
	 * Returns the meta object for the reference '{@link sculptorguimetamodel.DeleteTask#getDeleteDOWith <em>Delete DO With</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Delete DO With</em>'.
	 * @see sculptorguimetamodel.DeleteTask#getDeleteDOWith()
	 * @see #getDeleteTask()
	 * @generated
	 */
	EReference getDeleteTask_DeleteDOWith();

	/**
	 * Returns the meta object for class '{@link sculptorguimetamodel.SubTaskTransition <em>Sub Task Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Task Transition</em>'.
	 * @see sculptorguimetamodel.SubTaskTransition
	 * @generated
	 */
	EClass getSubTaskTransition();

	/**
	 * Returns the meta object for the reference '{@link sculptorguimetamodel.SubTaskTransition#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see sculptorguimetamodel.SubTaskTransition#getTo()
	 * @see #getSubTaskTransition()
	 * @generated
	 */
	EReference getSubTaskTransition_To();

	/**
	 * Returns the meta object for the reference '{@link sculptorguimetamodel.SubTaskTransition#getForReference <em>For Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>For Reference</em>'.
	 * @see sculptorguimetamodel.SubTaskTransition#getForReference()
	 * @see #getSubTaskTransition()
	 * @generated
	 */
	EReference getSubTaskTransition_ForReference();

	/**
	 * Returns the meta object for the reference '{@link sculptorguimetamodel.SubTaskTransition#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see sculptorguimetamodel.SubTaskTransition#getFrom()
	 * @see #getSubTaskTransition()
	 * @generated
	 */
	EReference getSubTaskTransition_From();

	/**
	 * Returns the meta object for class '{@link sculptorguimetamodel.ViewDataProperty <em>View Data Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Data Property</em>'.
	 * @see sculptorguimetamodel.ViewDataProperty
	 * @generated
	 */
	EClass getViewDataProperty();

	/**
	 * Returns the meta object for the container reference '{@link sculptorguimetamodel.ViewDataProperty#getUserTask <em>User Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>User Task</em>'.
	 * @see sculptorguimetamodel.ViewDataProperty#getUserTask()
	 * @see #getViewDataProperty()
	 * @generated
	 */
	EReference getViewDataProperty_UserTask();

	/**
	 * Returns the meta object for the attribute '{@link sculptorguimetamodel.ViewDataProperty#getMessageKey <em>Message Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Key</em>'.
	 * @see sculptorguimetamodel.ViewDataProperty#getMessageKey()
	 * @see #getViewDataProperty()
	 * @generated
	 */
	EAttribute getViewDataProperty_MessageKey();

	/**
	 * Returns the meta object for class '{@link sculptorguimetamodel.TmpReferenceHolder <em>Tmp Reference Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tmp Reference Holder</em>'.
	 * @see sculptorguimetamodel.TmpReferenceHolder
	 * @generated
	 */
	EClass getTmpReferenceHolder();

	/**
	 * Returns the meta object for the reference '{@link sculptorguimetamodel.TmpReferenceHolder#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see sculptorguimetamodel.TmpReferenceHolder#getReference()
	 * @see #getTmpReferenceHolder()
	 * @generated
	 */
	EReference getTmpReferenceHolder_Reference();

	/**
	 * Returns the meta object for the containment reference list '{@link sculptorguimetamodel.TmpReferenceHolder#getSubTaskTransitionHolders <em>Sub Task Transition Holders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Task Transition Holders</em>'.
	 * @see sculptorguimetamodel.TmpReferenceHolder#getSubTaskTransitionHolders()
	 * @see #getTmpReferenceHolder()
	 * @generated
	 */
	EReference getTmpReferenceHolder_SubTaskTransitionHolders();

	/**
	 * Returns the meta object for class '{@link sculptorguimetamodel.TmpSubTaskTransitionHolder <em>Tmp Sub Task Transition Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tmp Sub Task Transition Holder</em>'.
	 * @see sculptorguimetamodel.TmpSubTaskTransitionHolder
	 * @generated
	 */
	EClass getTmpSubTaskTransitionHolder();

	/**
	 * Returns the meta object for the attribute '{@link sculptorguimetamodel.TmpSubTaskTransitionHolder#getToTaskType <em>To Task Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Task Type</em>'.
	 * @see sculptorguimetamodel.TmpSubTaskTransitionHolder#getToTaskType()
	 * @see #getTmpSubTaskTransitionHolder()
	 * @generated
	 */
	EAttribute getTmpSubTaskTransitionHolder_ToTaskType();

	/**
	 * Returns the meta object for the reference '{@link sculptorguimetamodel.TmpSubTaskTransitionHolder#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see sculptorguimetamodel.TmpSubTaskTransitionHolder#getTo()
	 * @see #getTmpSubTaskTransitionHolder()
	 * @generated
	 */
	EReference getTmpSubTaskTransitionHolder_To();

	/**
	 * Returns the meta object for the container reference '{@link sculptorguimetamodel.TmpSubTaskTransitionHolder#getReferenceHoler <em>Reference Holer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Reference Holer</em>'.
	 * @see sculptorguimetamodel.TmpSubTaskTransitionHolder#getReferenceHoler()
	 * @see #getTmpSubTaskTransitionHolder()
	 * @generated
	 */
	EReference getTmpSubTaskTransitionHolder_ReferenceHoler();

	/**
	 * Returns the meta object for class '{@link sculptorguimetamodel.ReferenceTarget <em>Reference Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Target</em>'.
	 * @see sculptorguimetamodel.ReferenceTarget
	 * @generated
	 */
	EClass getReferenceTarget();

	/**
	 * Returns the meta object for the reference '{@link sculptorguimetamodel.ReferenceTarget#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see sculptorguimetamodel.ReferenceTarget#getReference()
	 * @see #getReferenceTarget()
	 * @generated
	 */
	EReference getReferenceTarget_Reference();

	/**
	 * Returns the meta object for the reference '{@link sculptorguimetamodel.ReferenceTarget#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see sculptorguimetamodel.ReferenceTarget#getTarget()
	 * @see #getReferenceTarget()
	 * @generated
	 */
	EReference getReferenceTarget_Target();

	/**
	 * Returns the meta object for class '{@link sculptorguimetamodel.ReferenceViewProperty <em>Reference View Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference View Property</em>'.
	 * @see sculptorguimetamodel.ReferenceViewProperty
	 * @generated
	 */
	EClass getReferenceViewProperty();

	/**
	 * Returns the meta object for the reference list '{@link sculptorguimetamodel.ReferenceViewProperty#getRelatedTransitions <em>Related Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Related Transitions</em>'.
	 * @see sculptorguimetamodel.ReferenceViewProperty#getRelatedTransitions()
	 * @see #getReferenceViewProperty()
	 * @generated
	 */
	EReference getReferenceViewProperty_RelatedTransitions();

	/**
	 * Returns the meta object for the reference '{@link sculptorguimetamodel.ReferenceViewProperty#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see sculptorguimetamodel.ReferenceViewProperty#getReference()
	 * @see #getReferenceViewProperty()
	 * @generated
	 */
	EReference getReferenceViewProperty_Reference();

	/**
	 * Returns the meta object for the reference '{@link sculptorguimetamodel.ReferenceViewProperty#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see sculptorguimetamodel.ReferenceViewProperty#getTarget()
	 * @see #getReferenceViewProperty()
	 * @generated
	 */
	EReference getReferenceViewProperty_Target();

	/**
	 * Returns the meta object for the attribute '{@link sculptorguimetamodel.ReferenceViewProperty#isBase <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base</em>'.
	 * @see sculptorguimetamodel.ReferenceViewProperty#isBase()
	 * @see #getReferenceViewProperty()
	 * @generated
	 */
	EAttribute getReferenceViewProperty_Base();

	/**
	 * Returns the meta object for the reference list '{@link sculptorguimetamodel.ReferenceViewProperty#getPreviewProperties <em>Preview Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Preview Properties</em>'.
	 * @see sculptorguimetamodel.ReferenceViewProperty#getPreviewProperties()
	 * @see #getReferenceViewProperty()
	 * @generated
	 */
	EReference getReferenceViewProperty_PreviewProperties();

	/**
	 * Returns the meta object for class '{@link sculptorguimetamodel.AttributeViewProperty <em>Attribute View Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute View Property</em>'.
	 * @see sculptorguimetamodel.AttributeViewProperty
	 * @generated
	 */
	EClass getAttributeViewProperty();

	/**
	 * Returns the meta object for the reference '{@link sculptorguimetamodel.AttributeViewProperty#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see sculptorguimetamodel.AttributeViewProperty#getAttribute()
	 * @see #getAttributeViewProperty()
	 * @generated
	 */
	EReference getAttributeViewProperty_Attribute();

	/**
	 * Returns the meta object for class '{@link sculptorguimetamodel.BasicTypeViewProperty <em>Basic Type View Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Type View Property</em>'.
	 * @see sculptorguimetamodel.BasicTypeViewProperty
	 * @generated
	 */
	EClass getBasicTypeViewProperty();

	/**
	 * Returns the meta object for the reference '{@link sculptorguimetamodel.BasicTypeViewProperty#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see sculptorguimetamodel.BasicTypeViewProperty#getReference()
	 * @see #getBasicTypeViewProperty()
	 * @generated
	 */
	EReference getBasicTypeViewProperty_Reference();

	/**
	 * Returns the meta object for the reference '{@link sculptorguimetamodel.BasicTypeViewProperty#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see sculptorguimetamodel.BasicTypeViewProperty#getAttribute()
	 * @see #getBasicTypeViewProperty()
	 * @generated
	 */
	EReference getBasicTypeViewProperty_Attribute();

	/**
	 * Returns the meta object for class '{@link sculptorguimetamodel.EnumViewProperty <em>Enum View Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum View Property</em>'.
	 * @see sculptorguimetamodel.EnumViewProperty
	 * @generated
	 */
	EClass getEnumViewProperty();

	/**
	 * Returns the meta object for the reference '{@link sculptorguimetamodel.EnumViewProperty#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see sculptorguimetamodel.EnumViewProperty#getReference()
	 * @see #getEnumViewProperty()
	 * @generated
	 */
	EReference getEnumViewProperty_Reference();

	/**
	 * Returns the meta object for class '{@link sculptorguimetamodel.BasicTypeEnumViewProperty <em>Basic Type Enum View Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Type Enum View Property</em>'.
	 * @see sculptorguimetamodel.BasicTypeEnumViewProperty
	 * @generated
	 */
	EClass getBasicTypeEnumViewProperty();

	/**
	 * Returns the meta object for the reference '{@link sculptorguimetamodel.BasicTypeEnumViewProperty#getBasicTypeReference <em>Basic Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Basic Type Reference</em>'.
	 * @see sculptorguimetamodel.BasicTypeEnumViewProperty#getBasicTypeReference()
	 * @see #getBasicTypeEnumViewProperty()
	 * @generated
	 */
	EReference getBasicTypeEnumViewProperty_BasicTypeReference();

	/**
	 * Returns the meta object for class '{@link sculptorguimetamodel.UserTaskGroup <em>User Task Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Task Group</em>'.
	 * @see sculptorguimetamodel.UserTaskGroup
	 * @generated
	 */
	EClass getUserTaskGroup();

	/**
	 * Returns the meta object for the reference list '{@link sculptorguimetamodel.UserTaskGroup#getUserTasks <em>User Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>User Tasks</em>'.
	 * @see sculptorguimetamodel.UserTaskGroup#getUserTasks()
	 * @see #getUserTaskGroup()
	 * @generated
	 */
	EReference getUserTaskGroup_UserTasks();

	/**
	 * Returns the meta object for the reference '{@link sculptorguimetamodel.UserTaskGroup#getFor <em>For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>For</em>'.
	 * @see sculptorguimetamodel.UserTaskGroup#getFor()
	 * @see #getUserTaskGroup()
	 * @generated
	 */
	EReference getUserTaskGroup_For();

	/**
	 * Returns the meta object for the reference '{@link sculptorguimetamodel.UserTaskGroup#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Module</em>'.
	 * @see sculptorguimetamodel.UserTaskGroup#getModule()
	 * @see #getUserTaskGroup()
	 * @generated
	 */
	EReference getUserTaskGroup_Module();

	/**
	 * Returns the meta object for class '{@link sculptorguimetamodel.DerivedReferenceViewProperty <em>Derived Reference View Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Derived Reference View Property</em>'.
	 * @see sculptorguimetamodel.DerivedReferenceViewProperty
	 * @generated
	 */
	EClass getDerivedReferenceViewProperty();

	/**
	 * Returns the meta object for the reference '{@link sculptorguimetamodel.DerivedReferenceViewProperty#getDerivedFrom <em>Derived From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Derived From</em>'.
	 * @see sculptorguimetamodel.DerivedReferenceViewProperty#getDerivedFrom()
	 * @see #getDerivedReferenceViewProperty()
	 * @generated
	 */
	EReference getDerivedReferenceViewProperty_DerivedFrom();

	/**
	 * Returns the meta object for class '{@link sculptorguimetamodel.AddTask <em>Add Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Task</em>'.
	 * @see sculptorguimetamodel.AddTask
	 * @generated
	 */
	EClass getAddTask();

	/**
	 * Returns the meta object for the reference '{@link sculptorguimetamodel.AddTask#getFindDOWith <em>Find DO With</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Find DO With</em>'.
	 * @see sculptorguimetamodel.AddTask#getFindDOWith()
	 * @see #getAddTask()
	 * @generated
	 */
	EReference getAddTask_FindDOWith();

	/**
	 * Returns the meta object for class '{@link sculptorguimetamodel.View <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View</em>'.
	 * @see sculptorguimetamodel.View
	 * @generated
	 */
	EClass getView();

	/**
	 * Returns the meta object for the container reference '{@link sculptorguimetamodel.View#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Module</em>'.
	 * @see sculptorguimetamodel.View#getModule()
	 * @see #getView()
	 * @generated
	 */
	EReference getView_Module();

	/**
	 * Returns the meta object for the reference '{@link sculptorguimetamodel.View#getFor <em>For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>For</em>'.
	 * @see sculptorguimetamodel.View#getFor()
	 * @see #getView()
	 * @generated
	 */
	EReference getView_For();

	/**
	 * Returns the meta object for the reference list '{@link sculptorguimetamodel.View#getServiceProxies <em>Service Proxies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Service Proxies</em>'.
	 * @see sculptorguimetamodel.View#getServiceProxies()
	 * @see #getView()
	 * @generated
	 */
	EReference getView_ServiceProxies();

	/**
	 * Returns the meta object for the containment reference list '{@link sculptorguimetamodel.View#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see sculptorguimetamodel.View#getParameters()
	 * @see #getView()
	 * @generated
	 */
	EReference getView_Parameters();

	/**
	 * Returns the meta object for the attribute '{@link sculptorguimetamodel.View#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see sculptorguimetamodel.View#getLabel()
	 * @see #getView()
	 * @generated
	 */
	EAttribute getView_Label();

	/**
	 * Returns the meta object for the attribute '{@link sculptorguimetamodel.View#getExtendsName <em>Extends Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extends Name</em>'.
	 * @see sculptorguimetamodel.View#getExtendsName()
	 * @see #getView()
	 * @generated
	 */
	EAttribute getView_ExtendsName();

	/**
	 * Returns the meta object for the reference '{@link sculptorguimetamodel.View#getExtends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Extends</em>'.
	 * @see sculptorguimetamodel.View#getExtends()
	 * @see #getView()
	 * @generated
	 */
	EReference getView_Extends();

	/**
	 * Returns the meta object for the attribute '{@link sculptorguimetamodel.View#isPopup <em>Popup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Popup</em>'.
	 * @see sculptorguimetamodel.View#isPopup()
	 * @see #getView()
	 * @generated
	 */
	EAttribute getView_Popup();

	/**
	 * Returns the meta object for class '{@link sculptorguimetamodel.Widget <em>Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Widget</em>'.
	 * @see sculptorguimetamodel.Widget
	 * @generated
	 */
	EClass getWidget();

	/**
	 * Returns the meta object for the reference '{@link sculptorguimetamodel.Widget#getView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>View</em>'.
	 * @see sculptorguimetamodel.Widget#getView()
	 * @see #getWidget()
	 * @generated
	 */
	EReference getWidget_View();

	/**
	 * Returns the meta object for the attribute '{@link sculptorguimetamodel.Widget#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see sculptorguimetamodel.Widget#getLabel()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_Label();

	/**
	 * Returns the meta object for the reference list '{@link sculptorguimetamodel.Widget#getBehaviorBindings <em>Behavior Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Behavior Bindings</em>'.
	 * @see sculptorguimetamodel.Widget#getBehaviorBindings()
	 * @see #getWidget()
	 * @generated
	 */
	EReference getWidget_BehaviorBindings();

	/**
	 * Returns the meta object for the reference '{@link sculptorguimetamodel.Widget#getEnabled <em>Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Enabled</em>'.
	 * @see sculptorguimetamodel.Widget#getEnabled()
	 * @see #getWidget()
	 * @generated
	 */
	EReference getWidget_Enabled();

	/**
	 * Returns the meta object for the attribute '{@link sculptorguimetamodel.Widget#getWidgetType <em>Widget Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Widget Type</em>'.
	 * @see sculptorguimetamodel.Widget#getWidgetType()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_WidgetType();

	/**
	 * Returns the meta object for the reference '{@link sculptorguimetamodel.Widget#getVisible <em>Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Visible</em>'.
	 * @see sculptorguimetamodel.Widget#getVisible()
	 * @see #getWidget()
	 * @generated
	 */
	EReference getWidget_Visible();

	/**
	 * Returns the meta object for class '{@link sculptorguimetamodel.InputTextWidget <em>Input Text Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Text Widget</em>'.
	 * @see sculptorguimetamodel.InputTextWidget
	 * @generated
	 */
	EClass getInputTextWidget();

	/**
	 * Returns the meta object for class '{@link sculptorguimetamodel.InformationalTextWidget <em>Informational Text Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Informational Text Widget</em>'.
	 * @see sculptorguimetamodel.InformationalTextWidget
	 * @generated
	 */
	EClass getInformationalTextWidget();

	/**
	 * Returns the meta object for class '{@link sculptorguimetamodel.ButtonWidget <em>Button Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button Widget</em>'.
	 * @see sculptorguimetamodel.ButtonWidget
	 * @generated
	 */
	EClass getButtonWidget();

	/**
	 * Returns the meta object for the attribute '{@link sculptorguimetamodel.ButtonWidget#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image</em>'.
	 * @see sculptorguimetamodel.ButtonWidget#getImage()
	 * @see #getButtonWidget()
	 * @generated
	 */
	EAttribute getButtonWidget_Image();

	/**
	 * Returns the meta object for class '{@link sculptorguimetamodel.PropertyReferringWidget <em>Property Referring Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Referring Widget</em>'.
	 * @see sculptorguimetamodel.PropertyReferringWidget
	 * @generated
	 */
	EClass getPropertyReferringWidget();

	/**
	 * Returns the meta object for the reference '{@link sculptorguimetamodel.PropertyReferringWidget#getForOp <em>For Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>For Op</em>'.
	 * @see sculptorguimetamodel.PropertyReferringWidget#getForOp()
	 * @see #getPropertyReferringWidget()
	 * @generated
	 */
	EReference getPropertyReferringWidget_ForOp();

	/**
	 * Returns the meta object for the reference '{@link sculptorguimetamodel.PropertyReferringWidget#getFor <em>For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>For</em>'.
	 * @see sculptorguimetamodel.PropertyReferringWidget#getFor()
	 * @see #getPropertyReferringWidget()
	 * @generated
	 */
	EReference getPropertyReferringWidget_For();

	/**
	 * Returns the meta object for the attribute '{@link sculptorguimetamodel.PropertyReferringWidget#getPropertyPath <em>Property Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Path</em>'.
	 * @see sculptorguimetamodel.PropertyReferringWidget#getPropertyPath()
	 * @see #getPropertyReferringWidget()
	 * @generated
	 */
	EAttribute getPropertyReferringWidget_PropertyPath();

	/**
	 * Returns the meta object for the containment reference '{@link sculptorguimetamodel.PropertyReferringWidget#getForProperty <em>For Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>For Property</em>'.
	 * @see sculptorguimetamodel.PropertyReferringWidget#getForProperty()
	 * @see #getPropertyReferringWidget()
	 * @generated
	 */
	EReference getPropertyReferringWidget_ForProperty();

	/**
	 * Returns the meta object for class '{@link sculptorguimetamodel.TableWidget <em>Table Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Widget</em>'.
	 * @see sculptorguimetamodel.TableWidget
	 * @generated
	 */
	EClass getTableWidget();

	/**
	 * Returns the meta object for the containment reference list '{@link sculptorguimetamodel.TableWidget#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columns</em>'.
	 * @see sculptorguimetamodel.TableWidget#getColumns()
	 * @see #getTableWidget()
	 * @generated
	 */
	EReference getTableWidget_Columns();

	/**
	 * Returns the meta object for the attribute '{@link sculptorguimetamodel.TableWidget#isPaging <em>Paging</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Paging</em>'.
	 * @see sculptorguimetamodel.TableWidget#isPaging()
	 * @see #getTableWidget()
	 * @generated
	 */
	EAttribute getTableWidget_Paging();

	/**
	 * Returns the meta object for the attribute '{@link sculptorguimetamodel.TableWidget#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see sculptorguimetamodel.TableWidget#getSize()
	 * @see #getTableWidget()
	 * @generated
	 */
	EAttribute getTableWidget_Size();

	/**
	 * Returns the meta object for class '{@link sculptorguimetamodel.GuiEvent <em>Gui Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gui Event</em>'.
	 * @see sculptorguimetamodel.GuiEvent
	 * @generated
	 */
	EClass getGuiEvent();

	/**
	 * Returns the meta object for the container reference '{@link sculptorguimetamodel.GuiEvent#getGuiModule <em>Gui Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Gui Module</em>'.
	 * @see sculptorguimetamodel.GuiEvent#getGuiModule()
	 * @see #getGuiEvent()
	 * @generated
	 */
	EReference getGuiEvent_GuiModule();

	/**
	 * Returns the meta object for class '{@link sculptorguimetamodel.TableColumn <em>Table Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Column</em>'.
	 * @see sculptorguimetamodel.TableColumn
	 * @generated
	 */
	EClass getTableColumn();

	/**
	 * Returns the meta object for the attribute '{@link sculptorguimetamodel.TableColumn#getColumnType <em>Column Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Type</em>'.
	 * @see sculptorguimetamodel.TableColumn#getColumnType()
	 * @see #getTableColumn()
	 * @generated
	 */
	EAttribute getTableColumn_ColumnType();

	/**
	 * Returns the meta object for the attribute '{@link sculptorguimetamodel.TableColumn#isFilterable <em>Filterable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filterable</em>'.
	 * @see sculptorguimetamodel.TableColumn#isFilterable()
	 * @see #getTableColumn()
	 * @generated
	 */
	EAttribute getTableColumn_Filterable();

	/**
	 * Returns the meta object for the attribute '{@link sculptorguimetamodel.TableColumn#isSortable <em>Sortable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sortable</em>'.
	 * @see sculptorguimetamodel.TableColumn#isSortable()
	 * @see #getTableColumn()
	 * @generated
	 */
	EAttribute getTableColumn_Sortable();

	/**
	 * Returns the meta object for the attribute '{@link sculptorguimetamodel.TableColumn#isEditable <em>Editable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Editable</em>'.
	 * @see sculptorguimetamodel.TableColumn#isEditable()
	 * @see #getTableColumn()
	 * @generated
	 */
	EAttribute getTableColumn_Editable();

	/**
	 * Returns the meta object for class '{@link sculptorguimetamodel.TextAreaWidget <em>Text Area Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Area Widget</em>'.
	 * @see sculptorguimetamodel.TextAreaWidget
	 * @generated
	 */
	EClass getTextAreaWidget();

	/**
	 * Returns the meta object for class '{@link sculptorguimetamodel.AutocompleteWidget <em>Autocomplete Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Autocomplete Widget</em>'.
	 * @see sculptorguimetamodel.AutocompleteWidget
	 * @generated
	 */
	EClass getAutocompleteWidget();

	/**
	 * Returns the meta object for class '{@link sculptorguimetamodel.RadioButtonsWidget <em>Radio Buttons Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Radio Buttons Widget</em>'.
	 * @see sculptorguimetamodel.RadioButtonsWidget
	 * @generated
	 */
	EClass getRadioButtonsWidget();

	/**
	 * Returns the meta object for class '{@link sculptorguimetamodel.RichTextAreaWidget <em>Rich Text Area Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rich Text Area Widget</em>'.
	 * @see sculptorguimetamodel.RichTextAreaWidget
	 * @generated
	 */
	EClass getRichTextAreaWidget();

	/**
	 * Returns the meta object for class '{@link sculptorguimetamodel.InputDateWidget <em>Input Date Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Date Widget</em>'.
	 * @see sculptorguimetamodel.InputDateWidget
	 * @generated
	 */
	EClass getInputDateWidget();

	/**
	 * Returns the meta object for class '{@link sculptorguimetamodel.NumberSpinnerWidget <em>Number Spinner Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Spinner Widget</em>'.
	 * @see sculptorguimetamodel.NumberSpinnerWidget
	 * @generated
	 */
	EClass getNumberSpinnerWidget();

	/**
	 * Returns the meta object for class '{@link sculptorguimetamodel.ServiceProxy <em>Service Proxy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Proxy</em>'.
	 * @see sculptorguimetamodel.ServiceProxy
	 * @generated
	 */
	EClass getServiceProxy();

	/**
	 * Returns the meta object for the reference '{@link sculptorguimetamodel.ServiceProxy#getFor <em>For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>For</em>'.
	 * @see sculptorguimetamodel.ServiceProxy#getFor()
	 * @see #getServiceProxy()
	 * @generated
	 */
	EReference getServiceProxy_For();

	/**
	 * Returns the meta object for the reference '{@link sculptorguimetamodel.ServiceProxy#getGuiModule <em>Gui Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gui Module</em>'.
	 * @see sculptorguimetamodel.ServiceProxy#getGuiModule()
	 * @see #getServiceProxy()
	 * @generated
	 */
	EReference getServiceProxy_GuiModule();

	/**
	 * Returns the meta object for class '{@link sculptorguimetamodel.ServiceProxyOperation <em>Service Proxy Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Proxy Operation</em>'.
	 * @see sculptorguimetamodel.ServiceProxyOperation
	 * @generated
	 */
	EClass getServiceProxyOperation();

	/**
	 * Returns the meta object for the reference '{@link sculptorguimetamodel.ServiceProxyOperation#getFor <em>For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>For</em>'.
	 * @see sculptorguimetamodel.ServiceProxyOperation#getFor()
	 * @see #getServiceProxyOperation()
	 * @generated
	 */
	EReference getServiceProxyOperation_For();

	/**
	 * Returns the meta object for class '{@link sculptorguimetamodel.GuiCommand <em>Gui Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gui Command</em>'.
	 * @see sculptorguimetamodel.GuiCommand
	 * @generated
	 */
	EClass getGuiCommand();

	/**
	 * Returns the meta object for class '{@link sculptorguimetamodel.ViewParameter <em>View Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Parameter</em>'.
	 * @see sculptorguimetamodel.ViewParameter
	 * @generated
	 */
	EClass getViewParameter();

	/**
	 * Returns the meta object for the attribute '{@link sculptorguimetamodel.ViewParameter#isNullable <em>Nullable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nullable</em>'.
	 * @see sculptorguimetamodel.ViewParameter#isNullable()
	 * @see #getViewParameter()
	 * @generated
	 */
	EAttribute getViewParameter_Nullable();

	/**
	 * Returns the meta object for class '{@link sculptorguimetamodel.LinkWidget <em>Link Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Widget</em>'.
	 * @see sculptorguimetamodel.LinkWidget
	 * @generated
	 */
	EClass getLinkWidget();

	/**
	 * Returns the meta object for the reference '{@link sculptorguimetamodel.LinkWidget#getToView <em>To View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To View</em>'.
	 * @see sculptorguimetamodel.LinkWidget#getToView()
	 * @see #getLinkWidget()
	 * @generated
	 */
	EReference getLinkWidget_ToView();

	/**
	 * Returns the meta object for the attribute '{@link sculptorguimetamodel.LinkWidget#getToDestination <em>To Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Destination</em>'.
	 * @see sculptorguimetamodel.LinkWidget#getToDestination()
	 * @see #getLinkWidget()
	 * @generated
	 */
	EAttribute getLinkWidget_ToDestination();

	/**
	 * Returns the meta object for class '{@link sculptorguimetamodel.WidgetsContainer <em>Widgets Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Widgets Container</em>'.
	 * @see sculptorguimetamodel.WidgetsContainer
	 * @generated
	 */
	EClass getWidgetsContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link sculptorguimetamodel.WidgetsContainer#getWidgets <em>Widgets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Widgets</em>'.
	 * @see sculptorguimetamodel.WidgetsContainer#getWidgets()
	 * @see #getWidgetsContainer()
	 * @generated
	 */
	EReference getWidgetsContainer_Widgets();

	/**
	 * Returns the meta object for class '{@link sculptorguimetamodel.PanelWidget <em>Panel Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Panel Widget</em>'.
	 * @see sculptorguimetamodel.PanelWidget
	 * @generated
	 */
	EClass getPanelWidget();

	/**
	 * Returns the meta object for the attribute '{@link sculptorguimetamodel.PanelWidget#isDisclosure <em>Disclosure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disclosure</em>'.
	 * @see sculptorguimetamodel.PanelWidget#isDisclosure()
	 * @see #getPanelWidget()
	 * @generated
	 */
	EAttribute getPanelWidget_Disclosure();

	/**
	 * Returns the meta object for class '{@link sculptorguimetamodel.UiBehavior <em>Ui Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ui Behavior</em>'.
	 * @see sculptorguimetamodel.UiBehavior
	 * @generated
	 */
	EClass getUiBehavior();

	/**
	 * Returns the meta object for the reference list '{@link sculptorguimetamodel.UiBehavior#getBindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Bindings</em>'.
	 * @see sculptorguimetamodel.UiBehavior#getBindings()
	 * @see #getUiBehavior()
	 * @generated
	 */
	EReference getUiBehavior_Bindings();

	/**
	 * Returns the meta object for class '{@link sculptorguimetamodel.PopulatePanelBehavior <em>Populate Panel Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Populate Panel Behavior</em>'.
	 * @see sculptorguimetamodel.PopulatePanelBehavior
	 * @generated
	 */
	EClass getPopulatePanelBehavior();

	/**
	 * Returns the meta object for the reference '{@link sculptorguimetamodel.PopulatePanelBehavior#getPanel <em>Panel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Panel</em>'.
	 * @see sculptorguimetamodel.PopulatePanelBehavior#getPanel()
	 * @see #getPopulatePanelBehavior()
	 * @generated
	 */
	EReference getPopulatePanelBehavior_Panel();

	/**
	 * Returns the meta object for class '{@link sculptorguimetamodel.NavigateToViewBehavior <em>Navigate To View Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Navigate To View Behavior</em>'.
	 * @see sculptorguimetamodel.NavigateToViewBehavior
	 * @generated
	 */
	EClass getNavigateToViewBehavior();

	/**
	 * Returns the meta object for the reference '{@link sculptorguimetamodel.NavigateToViewBehavior#getView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>View</em>'.
	 * @see sculptorguimetamodel.NavigateToViewBehavior#getView()
	 * @see #getNavigateToViewBehavior()
	 * @generated
	 */
	EReference getNavigateToViewBehavior_View();

	/**
	 * Returns the meta object for class '{@link sculptorguimetamodel.BehaviorBinding <em>Behavior Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavior Binding</em>'.
	 * @see sculptorguimetamodel.BehaviorBinding
	 * @generated
	 */
	EClass getBehaviorBinding();

	/**
	 * Returns the meta object for the reference list '{@link sculptorguimetamodel.BehaviorBinding#getBehaviors <em>Behaviors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Behaviors</em>'.
	 * @see sculptorguimetamodel.BehaviorBinding#getBehaviors()
	 * @see #getBehaviorBinding()
	 * @generated
	 */
	EReference getBehaviorBinding_Behaviors();

	/**
	 * Returns the meta object for the reference '{@link sculptorguimetamodel.BehaviorBinding#getWidget <em>Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Widget</em>'.
	 * @see sculptorguimetamodel.BehaviorBinding#getWidget()
	 * @see #getBehaviorBinding()
	 * @generated
	 */
	EReference getBehaviorBinding_Widget();

	/**
	 * Returns the meta object for the attribute '{@link sculptorguimetamodel.BehaviorBinding#getBindingTypeName <em>Binding Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Binding Type Name</em>'.
	 * @see sculptorguimetamodel.BehaviorBinding#getBindingTypeName()
	 * @see #getBehaviorBinding()
	 * @generated
	 */
	EAttribute getBehaviorBinding_BindingTypeName();

	/**
	 * Returns the meta object for class '{@link sculptorguimetamodel.OnClickBinding <em>On Click Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>On Click Binding</em>'.
	 * @see sculptorguimetamodel.OnClickBinding
	 * @generated
	 */
	EClass getOnClickBinding();

	/**
	 * Returns the meta object for class '{@link sculptorguimetamodel.OnHoverBinding <em>On Hover Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>On Hover Binding</em>'.
	 * @see sculptorguimetamodel.OnHoverBinding
	 * @generated
	 */
	EClass getOnHoverBinding();

	/**
	 * Returns the meta object for class '{@link sculptorguimetamodel.UiCondition <em>Ui Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ui Condition</em>'.
	 * @see sculptorguimetamodel.UiCondition
	 * @generated
	 */
	EClass getUiCondition();

	/**
	 * Returns the meta object for class '{@link sculptorguimetamodel.GuiDto <em>Gui Dto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gui Dto</em>'.
	 * @see sculptorguimetamodel.GuiDto
	 * @generated
	 */
	EClass getGuiDto();

	/**
	 * Returns the meta object for the reference '{@link sculptorguimetamodel.GuiDto#getFor <em>For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>For</em>'.
	 * @see sculptorguimetamodel.GuiDto#getFor()
	 * @see #getGuiDto()
	 * @generated
	 */
	EReference getGuiDto_For();

	/**
	 * Returns the meta object for the reference '{@link sculptorguimetamodel.GuiDto#getGuiModule <em>Gui Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gui Module</em>'.
	 * @see sculptorguimetamodel.GuiDto#getGuiModule()
	 * @see #getGuiDto()
	 * @generated
	 */
	EReference getGuiDto_GuiModule();

	/**
	 * Returns the meta object for the attribute '{@link sculptorguimetamodel.GuiDto#isImmutable <em>Immutable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Immutable</em>'.
	 * @see sculptorguimetamodel.GuiDto#isImmutable()
	 * @see #getGuiDto()
	 * @generated
	 */
	EAttribute getGuiDto_Immutable();

	/**
	 * Returns the meta object for class '{@link sculptorguimetamodel.GuiEnum <em>Gui Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gui Enum</em>'.
	 * @see sculptorguimetamodel.GuiEnum
	 * @generated
	 */
	EClass getGuiEnum();

	/**
	 * Returns the meta object for class '{@link sculptorguimetamodel.StubModule <em>Stub Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stub Module</em>'.
	 * @see sculptorguimetamodel.StubModule
	 * @generated
	 */
	EClass getStubModule();

	/**
	 * Returns the meta object for the reference '{@link sculptorguimetamodel.StubModule#getStubFor <em>Stub For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Stub For</em>'.
	 * @see sculptorguimetamodel.StubModule#getStubFor()
	 * @see #getStubModule()
	 * @generated
	 */
	EReference getStubModule_StubFor();

	/**
	 * Returns the meta object for the reference '{@link sculptorguimetamodel.StubModule#getGuiModule <em>Gui Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gui Module</em>'.
	 * @see sculptorguimetamodel.StubModule#getGuiModule()
	 * @see #getStubModule()
	 * @generated
	 */
	EReference getStubModule_GuiModule();

	/**
	 * Returns the meta object for class '{@link sculptorguimetamodel.ListBoxWidget <em>List Box Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Box Widget</em>'.
	 * @see sculptorguimetamodel.ListBoxWidget
	 * @generated
	 */
	EClass getListBoxWidget();

	/**
	 * Returns the meta object for the reference '{@link sculptorguimetamodel.ListBoxWidget#getForEnum <em>For Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>For Enum</em>'.
	 * @see sculptorguimetamodel.ListBoxWidget#getForEnum()
	 * @see #getListBoxWidget()
	 * @generated
	 */
	EReference getListBoxWidget_ForEnum();

	/**
	 * Returns the meta object for class '{@link sculptorguimetamodel.BehaviorContainer <em>Behavior Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavior Container</em>'.
	 * @see sculptorguimetamodel.BehaviorContainer
	 * @generated
	 */
	EClass getBehaviorContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link sculptorguimetamodel.BehaviorContainer#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditions</em>'.
	 * @see sculptorguimetamodel.BehaviorContainer#getConditions()
	 * @see #getBehaviorContainer()
	 * @generated
	 */
	EReference getBehaviorContainer_Conditions();

	/**
	 * Returns the meta object for the containment reference list '{@link sculptorguimetamodel.BehaviorContainer#getBehaviors <em>Behaviors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Behaviors</em>'.
	 * @see sculptorguimetamodel.BehaviorContainer#getBehaviors()
	 * @see #getBehaviorContainer()
	 * @generated
	 */
	EReference getBehaviorContainer_Behaviors();

	/**
	 * Returns the meta object for class '{@link sculptorguimetamodel.CustomWidget <em>Custom Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Widget</em>'.
	 * @see sculptorguimetamodel.CustomWidget
	 * @generated
	 */
	EClass getCustomWidget();

	/**
	 * Returns the meta object for class '{@link sculptorguimetamodel.UpdateTableBehavior <em>Update Table Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update Table Behavior</em>'.
	 * @see sculptorguimetamodel.UpdateTableBehavior
	 * @generated
	 */
	EClass getUpdateTableBehavior();

	/**
	 * Returns the meta object for the reference '{@link sculptorguimetamodel.UpdateTableBehavior#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Table</em>'.
	 * @see sculptorguimetamodel.UpdateTableBehavior#getTable()
	 * @see #getUpdateTableBehavior()
	 * @generated
	 */
	EReference getUpdateTableBehavior_Table();

	/**
	 * Returns the meta object for class '{@link sculptorguimetamodel.ConfirmMessageBehavior <em>Confirm Message Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Confirm Message Behavior</em>'.
	 * @see sculptorguimetamodel.ConfirmMessageBehavior
	 * @generated
	 */
	EClass getConfirmMessageBehavior();

	/**
	 * Returns the meta object for the attribute '{@link sculptorguimetamodel.ConfirmMessageBehavior#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see sculptorguimetamodel.ConfirmMessageBehavior#getMessage()
	 * @see #getConfirmMessageBehavior()
	 * @generated
	 */
	EAttribute getConfirmMessageBehavior_Message();

	/**
	 * Returns the meta object for class '{@link sculptorguimetamodel.CustomBehavior <em>Custom Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Behavior</em>'.
	 * @see sculptorguimetamodel.CustomBehavior
	 * @generated
	 */
	EClass getCustomBehavior();

	/**
	 * Returns the meta object for class '{@link sculptorguimetamodel.CustomCondition <em>Custom Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Condition</em>'.
	 * @see sculptorguimetamodel.CustomCondition
	 * @generated
	 */
	EClass getCustomCondition();

	/**
	 * Returns the meta object for class '{@link sculptorguimetamodel.CompositeBehavior <em>Composite Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Behavior</em>'.
	 * @see sculptorguimetamodel.CompositeBehavior
	 * @generated
	 */
	EClass getCompositeBehavior();

	/**
	 * Returns the meta object for the reference list '{@link sculptorguimetamodel.CompositeBehavior#getBehaviors <em>Behaviors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Behaviors</em>'.
	 * @see sculptorguimetamodel.CompositeBehavior#getBehaviors()
	 * @see #getCompositeBehavior()
	 * @generated
	 */
	EReference getCompositeBehavior_Behaviors();

	/**
	 * Returns the meta object for class '{@link sculptorguimetamodel.OnSelectItemBinding <em>On Select Item Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>On Select Item Binding</em>'.
	 * @see sculptorguimetamodel.OnSelectItemBinding
	 * @generated
	 */
	EClass getOnSelectItemBinding();

	/**
	 * Returns the meta object for class '{@link sculptorguimetamodel.WidgetTableColumn <em>Widget Table Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Widget Table Column</em>'.
	 * @see sculptorguimetamodel.WidgetTableColumn
	 * @generated
	 */
	EClass getWidgetTableColumn();

	/**
	 * Returns the meta object for the containment reference '{@link sculptorguimetamodel.WidgetTableColumn#getWidget <em>Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Widget</em>'.
	 * @see sculptorguimetamodel.WidgetTableColumn#getWidget()
	 * @see #getWidgetTableColumn()
	 * @generated
	 */
	EReference getWidgetTableColumn_Widget();

	/**
	 * Returns the meta object for class '{@link sculptorguimetamodel.SimpleTableColumn <em>Simple Table Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Table Column</em>'.
	 * @see sculptorguimetamodel.SimpleTableColumn
	 * @generated
	 */
	EClass getSimpleTableColumn();

	/**
	 * Returns the meta object for class '{@link sculptorguimetamodel.SetDirtyFlagBehavior <em>Set Dirty Flag Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Dirty Flag Behavior</em>'.
	 * @see sculptorguimetamodel.SetDirtyFlagBehavior
	 * @generated
	 */
	EClass getSetDirtyFlagBehavior();

	/**
	 * Returns the meta object for the attribute '{@link sculptorguimetamodel.SetDirtyFlagBehavior#isMarkSpecificObj <em>Mark Specific Obj</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mark Specific Obj</em>'.
	 * @see sculptorguimetamodel.SetDirtyFlagBehavior#isMarkSpecificObj()
	 * @see #getSetDirtyFlagBehavior()
	 * @generated
	 */
	EAttribute getSetDirtyFlagBehavior_MarkSpecificObj();

	/**
	 * Returns the meta object for class '{@link sculptorguimetamodel.WarnIfDirtyBehavior <em>Warn If Dirty Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Warn If Dirty Behavior</em>'.
	 * @see sculptorguimetamodel.WarnIfDirtyBehavior
	 * @generated
	 */
	EClass getWarnIfDirtyBehavior();

	/**
	 * Returns the meta object for class '{@link sculptorguimetamodel.PopulateListBoxBehavior <em>Populate List Box Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Populate List Box Behavior</em>'.
	 * @see sculptorguimetamodel.PopulateListBoxBehavior
	 * @generated
	 */
	EClass getPopulateListBoxBehavior();

	/**
	 * Returns the meta object for the reference '{@link sculptorguimetamodel.PopulateListBoxBehavior#getWidget <em>Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Widget</em>'.
	 * @see sculptorguimetamodel.PopulateListBoxBehavior#getWidget()
	 * @see #getPopulateListBoxBehavior()
	 * @generated
	 */
	EReference getPopulateListBoxBehavior_Widget();

	/**
	 * Returns the meta object for class '{@link sculptorguimetamodel.MarkDirtyBehavior <em>Mark Dirty Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mark Dirty Behavior</em>'.
	 * @see sculptorguimetamodel.MarkDirtyBehavior
	 * @generated
	 */
	EClass getMarkDirtyBehavior();

	/**
	 * Returns the meta object for class '{@link sculptorguimetamodel.MarkCleanBehavior <em>Mark Clean Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mark Clean Behavior</em>'.
	 * @see sculptorguimetamodel.MarkCleanBehavior
	 * @generated
	 */
	EClass getMarkCleanBehavior();

	/**
	 * Returns the meta object for class '{@link sculptorguimetamodel.GoBackBehavior <em>Go Back Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Go Back Behavior</em>'.
	 * @see sculptorguimetamodel.GoBackBehavior
	 * @generated
	 */
	EClass getGoBackBehavior();

	/**
	 * Returns the meta object for class '{@link sculptorguimetamodel.UpdateAttributeBehavior <em>Update Attribute Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update Attribute Behavior</em>'.
	 * @see sculptorguimetamodel.UpdateAttributeBehavior
	 * @generated
	 */
	EClass getUpdateAttributeBehavior();

	/**
	 * Returns the meta object for the attribute '{@link sculptorguimetamodel.UpdateAttributeBehavior#getPropertyPath <em>Property Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Path</em>'.
	 * @see sculptorguimetamodel.UpdateAttributeBehavior#getPropertyPath()
	 * @see #getUpdateAttributeBehavior()
	 * @generated
	 */
	EAttribute getUpdateAttributeBehavior_PropertyPath();

	/**
	 * Returns the meta object for the reference '{@link sculptorguimetamodel.UpdateAttributeBehavior#getTargetClass <em>Target Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Class</em>'.
	 * @see sculptorguimetamodel.UpdateAttributeBehavior#getTargetClass()
	 * @see #getUpdateAttributeBehavior()
	 * @generated
	 */
	EReference getUpdateAttributeBehavior_TargetClass();

	/**
	 * Returns the meta object for class '{@link sculptorguimetamodel.HasDirtyValueCondition <em>Has Dirty Value Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Has Dirty Value Condition</em>'.
	 * @see sculptorguimetamodel.HasDirtyValueCondition
	 * @generated
	 */
	EClass getHasDirtyValueCondition();

	/**
	 * Returns the meta object for the attribute '{@link sculptorguimetamodel.HasDirtyValueCondition#isDirty <em>Dirty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dirty</em>'.
	 * @see sculptorguimetamodel.HasDirtyValueCondition#isDirty()
	 * @see #getHasDirtyValueCondition()
	 * @generated
	 */
	EAttribute getHasDirtyValueCondition_Dirty();

	/**
	 * Returns the meta object for class '{@link sculptorguimetamodel.PopupPanelBehavior <em>Popup Panel Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Popup Panel Behavior</em>'.
	 * @see sculptorguimetamodel.PopupPanelBehavior
	 * @generated
	 */
	EClass getPopupPanelBehavior();

	/**
	 * Returns the meta object for the reference '{@link sculptorguimetamodel.PopupPanelBehavior#getView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>View</em>'.
	 * @see sculptorguimetamodel.PopupPanelBehavior#getView()
	 * @see #getPopupPanelBehavior()
	 * @generated
	 */
	EReference getPopupPanelBehavior_View();

	/**
	 * Returns the meta object for the attribute '{@link sculptorguimetamodel.PopupPanelBehavior#getPanelName <em>Panel Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Panel Name</em>'.
	 * @see sculptorguimetamodel.PopupPanelBehavior#getPanelName()
	 * @see #getPopupPanelBehavior()
	 * @generated
	 */
	EAttribute getPopupPanelBehavior_PanelName();

	/**
	 * Returns the meta object for class '{@link sculptorguimetamodel.GuiDtoOptions <em>Gui Dto Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gui Dto Options</em>'.
	 * @see sculptorguimetamodel.GuiDtoOptions
	 * @generated
	 */
	EClass getGuiDtoOptions();

	/**
	 * Returns the meta object for the attribute '{@link sculptorguimetamodel.GuiDtoOptions#isSkip <em>Skip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Skip</em>'.
	 * @see sculptorguimetamodel.GuiDtoOptions#isSkip()
	 * @see #getGuiDtoOptions()
	 * @generated
	 */
	EAttribute getGuiDtoOptions_Skip();

	/**
	 * Returns the meta object for class '{@link sculptorguimetamodel.PropertyPathElement <em>Property Path Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Path Element</em>'.
	 * @see sculptorguimetamodel.PropertyPathElement
	 * @generated
	 */
	EClass getPropertyPathElement();

	/**
	 * Returns the meta object for the containment reference '{@link sculptorguimetamodel.PropertyPathElement#getRemainingPath <em>Remaining Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remaining Path</em>'.
	 * @see sculptorguimetamodel.PropertyPathElement#getRemainingPath()
	 * @see #getPropertyPathElement()
	 * @generated
	 */
	EReference getPropertyPathElement_RemainingPath();

	/**
	 * Returns the meta object for the reference '{@link sculptorguimetamodel.PropertyPathElement#getForAttribute <em>For Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>For Attribute</em>'.
	 * @see sculptorguimetamodel.PropertyPathElement#getForAttribute()
	 * @see #getPropertyPathElement()
	 * @generated
	 */
	EReference getPropertyPathElement_ForAttribute();

	/**
	 * Returns the meta object for the reference '{@link sculptorguimetamodel.PropertyPathElement#getForReference <em>For Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>For Reference</em>'.
	 * @see sculptorguimetamodel.PropertyPathElement#getForReference()
	 * @see #getPropertyPathElement()
	 * @generated
	 */
	EReference getPropertyPathElement_ForReference();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SculptorguimetamodelFactory getSculptorguimetamodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link sculptorguimetamodel.impl.GuiApplicationImpl <em>Gui Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptorguimetamodel.impl.GuiApplicationImpl
		 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getGuiApplication()
		 * @generated
		 */
		EClass GUI_APPLICATION = eINSTANCE.getGuiApplication();

		/**
		 * The meta object literal for the '<em><b>Gui For Application</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUI_APPLICATION__GUI_FOR_APPLICATION = eINSTANCE.getGuiApplication_GuiForApplication();

		/**
		 * The meta object literal for the '<em><b>Modules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUI_APPLICATION__MODULES = eINSTANCE.getGuiApplication_Modules();

		/**
		 * The meta object literal for the '<em><b>Base Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUI_APPLICATION__BASE_PACKAGE = eINSTANCE.getGuiApplication_BasePackage();

		/**
		 * The meta object literal for the '{@link sculptorguimetamodel.impl.GuiModuleImpl <em>Gui Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptorguimetamodel.impl.GuiModuleImpl
		 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getGuiModule()
		 * @generated
		 */
		EClass GUI_MODULE = eINSTANCE.getGuiModule();

		/**
		 * The meta object literal for the '<em><b>User Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUI_MODULE__USER_TASKS = eINSTANCE.getGuiModule_UserTasks();

		/**
		 * The meta object literal for the '<em><b>Base Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUI_MODULE__BASE_PACKAGE = eINSTANCE.getGuiModule_BasePackage();

		/**
		 * The meta object literal for the '<em><b>Application</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUI_MODULE__APPLICATION = eINSTANCE.getGuiModule_Application();

		/**
		 * The meta object literal for the '<em><b>For</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUI_MODULE__FOR = eINSTANCE.getGuiModule_For();

		/**
		 * The meta object literal for the '<em><b>Views</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUI_MODULE__VIEWS = eINSTANCE.getGuiModule_Views();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUI_MODULE__EVENTS = eINSTANCE.getGuiModule_Events();

		/**
		 * The meta object literal for the '<em><b>Service Dependencies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUI_MODULE__SERVICE_DEPENDENCIES = eINSTANCE.getGuiModule_ServiceDependencies();

		/**
		 * The meta object literal for the '<em><b>Commands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUI_MODULE__COMMANDS = eINSTANCE.getGuiModule_Commands();

		/**
		 * The meta object literal for the '<em><b>Stub Module</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUI_MODULE__STUB_MODULE = eINSTANCE.getGuiModule_StubModule();

		/**
		 * The meta object literal for the '<em><b>Gui Dto Options</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUI_MODULE__GUI_DTO_OPTIONS = eINSTANCE.getGuiModule_GuiDtoOptions();

		/**
		 * The meta object literal for the '{@link sculptorguimetamodel.impl.UserTaskImpl <em>User Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptorguimetamodel.impl.UserTaskImpl
		 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getUserTask()
		 * @generated
		 */
		EClass USER_TASK = eINSTANCE.getUserTask();

		/**
		 * The meta object literal for the '<em><b>Sub Task Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_TASK__SUB_TASK_TRANSITIONS = eINSTANCE.getUserTask_SubTaskTransitions();

		/**
		 * The meta object literal for the '<em><b>For</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_TASK__FOR = eINSTANCE.getUserTask_For();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_TASK__ABSTRACT = eINSTANCE.getUserTask_Abstract();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_TASK__MODULE = eINSTANCE.getUserTask_Module();

		/**
		 * The meta object literal for the '<em><b>Task Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_TASK__TASK_TYPE = eINSTANCE.getUserTask_TaskType();

		/**
		 * The meta object literal for the '<em><b>View Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_TASK__VIEW_PROPERTIES = eINSTANCE.getUserTask_ViewProperties();

		/**
		 * The meta object literal for the '<em><b>Conversation Root</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_TASK__CONVERSATION_ROOT = eINSTANCE.getUserTask_ConversationRoot();

		/**
		 * The meta object literal for the '<em><b>Gap Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_TASK__GAP_CLASS = eINSTANCE.getUserTask_GapClass();

		/**
		 * The meta object literal for the '{@link sculptorguimetamodel.impl.CreateTaskImpl <em>Create Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptorguimetamodel.impl.CreateTaskImpl
		 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getCreateTask()
		 * @generated
		 */
		EClass CREATE_TASK = eINSTANCE.getCreateTask();

		/**
		 * The meta object literal for the '<em><b>Create DO With</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATE_TASK__CREATE_DO_WITH = eINSTANCE.getCreateTask_CreateDOWith();

		/**
		 * The meta object literal for the '<em><b>Populate DO With</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATE_TASK__POPULATE_DO_WITH = eINSTANCE.getCreateTask_PopulateDOWith();

		/**
		 * The meta object literal for the '{@link sculptorguimetamodel.impl.UpdateTaskImpl <em>Update Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptorguimetamodel.impl.UpdateTaskImpl
		 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getUpdateTask()
		 * @generated
		 */
		EClass UPDATE_TASK = eINSTANCE.getUpdateTask();

		/**
		 * The meta object literal for the '<em><b>Find DO With</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPDATE_TASK__FIND_DO_WITH = eINSTANCE.getUpdateTask_FindDOWith();

		/**
		 * The meta object literal for the '<em><b>Update DO With</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPDATE_TASK__UPDATE_DO_WITH = eINSTANCE.getUpdateTask_UpdateDOWith();

		/**
		 * The meta object literal for the '<em><b>Populate DO With</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPDATE_TASK__POPULATE_DO_WITH = eINSTANCE.getUpdateTask_PopulateDOWith();

		/**
		 * The meta object literal for the '{@link sculptorguimetamodel.impl.ViewTaskImpl <em>View Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptorguimetamodel.impl.ViewTaskImpl
		 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getViewTask()
		 * @generated
		 */
		EClass VIEW_TASK = eINSTANCE.getViewTask();

		/**
		 * The meta object literal for the '<em><b>Find DO With</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_TASK__FIND_DO_WITH = eINSTANCE.getViewTask_FindDOWith();

		/**
		 * The meta object literal for the '{@link sculptorguimetamodel.impl.ListTaskImpl <em>List Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptorguimetamodel.impl.ListTaskImpl
		 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getListTask()
		 * @generated
		 */
		EClass LIST_TASK = eINSTANCE.getListTask();

		/**
		 * The meta object literal for the '<em><b>Search DO With</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_TASK__SEARCH_DO_WITH = eINSTANCE.getListTask_SearchDOWith();

		/**
		 * The meta object literal for the '{@link sculptorguimetamodel.impl.DeleteTaskImpl <em>Delete Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptorguimetamodel.impl.DeleteTaskImpl
		 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getDeleteTask()
		 * @generated
		 */
		EClass DELETE_TASK = eINSTANCE.getDeleteTask();

		/**
		 * The meta object literal for the '<em><b>Find DO With</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELETE_TASK__FIND_DO_WITH = eINSTANCE.getDeleteTask_FindDOWith();

		/**
		 * The meta object literal for the '<em><b>Delete DO With</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELETE_TASK__DELETE_DO_WITH = eINSTANCE.getDeleteTask_DeleteDOWith();

		/**
		 * The meta object literal for the '{@link sculptorguimetamodel.impl.SubTaskTransitionImpl <em>Sub Task Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptorguimetamodel.impl.SubTaskTransitionImpl
		 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getSubTaskTransition()
		 * @generated
		 */
		EClass SUB_TASK_TRANSITION = eINSTANCE.getSubTaskTransition();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_TASK_TRANSITION__TO = eINSTANCE.getSubTaskTransition_To();

		/**
		 * The meta object literal for the '<em><b>For Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_TASK_TRANSITION__FOR_REFERENCE = eINSTANCE.getSubTaskTransition_ForReference();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_TASK_TRANSITION__FROM = eINSTANCE.getSubTaskTransition_From();

		/**
		 * The meta object literal for the '{@link sculptorguimetamodel.impl.ViewDataPropertyImpl <em>View Data Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptorguimetamodel.impl.ViewDataPropertyImpl
		 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getViewDataProperty()
		 * @generated
		 */
		EClass VIEW_DATA_PROPERTY = eINSTANCE.getViewDataProperty();

		/**
		 * The meta object literal for the '<em><b>User Task</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_DATA_PROPERTY__USER_TASK = eINSTANCE.getViewDataProperty_UserTask();

		/**
		 * The meta object literal for the '<em><b>Message Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_DATA_PROPERTY__MESSAGE_KEY = eINSTANCE.getViewDataProperty_MessageKey();

		/**
		 * The meta object literal for the '{@link sculptorguimetamodel.impl.TmpReferenceHolderImpl <em>Tmp Reference Holder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptorguimetamodel.impl.TmpReferenceHolderImpl
		 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getTmpReferenceHolder()
		 * @generated
		 */
		EClass TMP_REFERENCE_HOLDER = eINSTANCE.getTmpReferenceHolder();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMP_REFERENCE_HOLDER__REFERENCE = eINSTANCE.getTmpReferenceHolder_Reference();

		/**
		 * The meta object literal for the '<em><b>Sub Task Transition Holders</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMP_REFERENCE_HOLDER__SUB_TASK_TRANSITION_HOLDERS = eINSTANCE.getTmpReferenceHolder_SubTaskTransitionHolders();

		/**
		 * The meta object literal for the '{@link sculptorguimetamodel.impl.TmpSubTaskTransitionHolderImpl <em>Tmp Sub Task Transition Holder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptorguimetamodel.impl.TmpSubTaskTransitionHolderImpl
		 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getTmpSubTaskTransitionHolder()
		 * @generated
		 */
		EClass TMP_SUB_TASK_TRANSITION_HOLDER = eINSTANCE.getTmpSubTaskTransitionHolder();

		/**
		 * The meta object literal for the '<em><b>To Task Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMP_SUB_TASK_TRANSITION_HOLDER__TO_TASK_TYPE = eINSTANCE.getTmpSubTaskTransitionHolder_ToTaskType();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMP_SUB_TASK_TRANSITION_HOLDER__TO = eINSTANCE.getTmpSubTaskTransitionHolder_To();

		/**
		 * The meta object literal for the '<em><b>Reference Holer</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMP_SUB_TASK_TRANSITION_HOLDER__REFERENCE_HOLER = eINSTANCE.getTmpSubTaskTransitionHolder_ReferenceHoler();

		/**
		 * The meta object literal for the '{@link sculptorguimetamodel.impl.ReferenceTargetImpl <em>Reference Target</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptorguimetamodel.impl.ReferenceTargetImpl
		 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getReferenceTarget()
		 * @generated
		 */
		EClass REFERENCE_TARGET = eINSTANCE.getReferenceTarget();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_TARGET__REFERENCE = eINSTANCE.getReferenceTarget_Reference();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_TARGET__TARGET = eINSTANCE.getReferenceTarget_Target();

		/**
		 * The meta object literal for the '{@link sculptorguimetamodel.impl.ReferenceViewPropertyImpl <em>Reference View Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptorguimetamodel.impl.ReferenceViewPropertyImpl
		 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getReferenceViewProperty()
		 * @generated
		 */
		EClass REFERENCE_VIEW_PROPERTY = eINSTANCE.getReferenceViewProperty();

		/**
		 * The meta object literal for the '<em><b>Related Transitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_VIEW_PROPERTY__RELATED_TRANSITIONS = eINSTANCE.getReferenceViewProperty_RelatedTransitions();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_VIEW_PROPERTY__REFERENCE = eINSTANCE.getReferenceViewProperty_Reference();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_VIEW_PROPERTY__TARGET = eINSTANCE.getReferenceViewProperty_Target();

		/**
		 * The meta object literal for the '<em><b>Base</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_VIEW_PROPERTY__BASE = eINSTANCE.getReferenceViewProperty_Base();

		/**
		 * The meta object literal for the '<em><b>Preview Properties</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_VIEW_PROPERTY__PREVIEW_PROPERTIES = eINSTANCE.getReferenceViewProperty_PreviewProperties();

		/**
		 * The meta object literal for the '{@link sculptorguimetamodel.impl.AttributeViewPropertyImpl <em>Attribute View Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptorguimetamodel.impl.AttributeViewPropertyImpl
		 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getAttributeViewProperty()
		 * @generated
		 */
		EClass ATTRIBUTE_VIEW_PROPERTY = eINSTANCE.getAttributeViewProperty();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_VIEW_PROPERTY__ATTRIBUTE = eINSTANCE.getAttributeViewProperty_Attribute();

		/**
		 * The meta object literal for the '{@link sculptorguimetamodel.impl.BasicTypeViewPropertyImpl <em>Basic Type View Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptorguimetamodel.impl.BasicTypeViewPropertyImpl
		 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getBasicTypeViewProperty()
		 * @generated
		 */
		EClass BASIC_TYPE_VIEW_PROPERTY = eINSTANCE.getBasicTypeViewProperty();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASIC_TYPE_VIEW_PROPERTY__REFERENCE = eINSTANCE.getBasicTypeViewProperty_Reference();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASIC_TYPE_VIEW_PROPERTY__ATTRIBUTE = eINSTANCE.getBasicTypeViewProperty_Attribute();

		/**
		 * The meta object literal for the '{@link sculptorguimetamodel.impl.EnumViewPropertyImpl <em>Enum View Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptorguimetamodel.impl.EnumViewPropertyImpl
		 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getEnumViewProperty()
		 * @generated
		 */
		EClass ENUM_VIEW_PROPERTY = eINSTANCE.getEnumViewProperty();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUM_VIEW_PROPERTY__REFERENCE = eINSTANCE.getEnumViewProperty_Reference();

		/**
		 * The meta object literal for the '{@link sculptorguimetamodel.impl.BasicTypeEnumViewPropertyImpl <em>Basic Type Enum View Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptorguimetamodel.impl.BasicTypeEnumViewPropertyImpl
		 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getBasicTypeEnumViewProperty()
		 * @generated
		 */
		EClass BASIC_TYPE_ENUM_VIEW_PROPERTY = eINSTANCE.getBasicTypeEnumViewProperty();

		/**
		 * The meta object literal for the '<em><b>Basic Type Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASIC_TYPE_ENUM_VIEW_PROPERTY__BASIC_TYPE_REFERENCE = eINSTANCE.getBasicTypeEnumViewProperty_BasicTypeReference();

		/**
		 * The meta object literal for the '{@link sculptorguimetamodel.impl.UserTaskGroupImpl <em>User Task Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptorguimetamodel.impl.UserTaskGroupImpl
		 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getUserTaskGroup()
		 * @generated
		 */
		EClass USER_TASK_GROUP = eINSTANCE.getUserTaskGroup();

		/**
		 * The meta object literal for the '<em><b>User Tasks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_TASK_GROUP__USER_TASKS = eINSTANCE.getUserTaskGroup_UserTasks();

		/**
		 * The meta object literal for the '<em><b>For</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_TASK_GROUP__FOR = eINSTANCE.getUserTaskGroup_For();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_TASK_GROUP__MODULE = eINSTANCE.getUserTaskGroup_Module();

		/**
		 * The meta object literal for the '{@link sculptorguimetamodel.impl.DerivedReferenceViewPropertyImpl <em>Derived Reference View Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptorguimetamodel.impl.DerivedReferenceViewPropertyImpl
		 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getDerivedReferenceViewProperty()
		 * @generated
		 */
		EClass DERIVED_REFERENCE_VIEW_PROPERTY = eINSTANCE.getDerivedReferenceViewProperty();

		/**
		 * The meta object literal for the '<em><b>Derived From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DERIVED_REFERENCE_VIEW_PROPERTY__DERIVED_FROM = eINSTANCE.getDerivedReferenceViewProperty_DerivedFrom();

		/**
		 * The meta object literal for the '{@link sculptorguimetamodel.impl.AddTaskImpl <em>Add Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptorguimetamodel.impl.AddTaskImpl
		 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getAddTask()
		 * @generated
		 */
		EClass ADD_TASK = eINSTANCE.getAddTask();

		/**
		 * The meta object literal for the '<em><b>Find DO With</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADD_TASK__FIND_DO_WITH = eINSTANCE.getAddTask_FindDOWith();

		/**
		 * The meta object literal for the '{@link sculptorguimetamodel.impl.ViewImpl <em>View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptorguimetamodel.impl.ViewImpl
		 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getView()
		 * @generated
		 */
		EClass VIEW = eINSTANCE.getView();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW__MODULE = eINSTANCE.getView_Module();

		/**
		 * The meta object literal for the '<em><b>For</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW__FOR = eINSTANCE.getView_For();

		/**
		 * The meta object literal for the '<em><b>Service Proxies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW__SERVICE_PROXIES = eINSTANCE.getView_ServiceProxies();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW__PARAMETERS = eINSTANCE.getView_Parameters();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW__LABEL = eINSTANCE.getView_Label();

		/**
		 * The meta object literal for the '<em><b>Extends Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW__EXTENDS_NAME = eINSTANCE.getView_ExtendsName();

		/**
		 * The meta object literal for the '<em><b>Extends</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW__EXTENDS = eINSTANCE.getView_Extends();

		/**
		 * The meta object literal for the '<em><b>Popup</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW__POPUP = eINSTANCE.getView_Popup();

		/**
		 * The meta object literal for the '{@link sculptorguimetamodel.impl.WidgetImpl <em>Widget</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptorguimetamodel.impl.WidgetImpl
		 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getWidget()
		 * @generated
		 */
		EClass WIDGET = eINSTANCE.getWidget();

		/**
		 * The meta object literal for the '<em><b>View</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET__VIEW = eINSTANCE.getWidget_View();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__LABEL = eINSTANCE.getWidget_Label();

		/**
		 * The meta object literal for the '<em><b>Behavior Bindings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET__BEHAVIOR_BINDINGS = eINSTANCE.getWidget_BehaviorBindings();

		/**
		 * The meta object literal for the '<em><b>Enabled</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET__ENABLED = eINSTANCE.getWidget_Enabled();

		/**
		 * The meta object literal for the '<em><b>Widget Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__WIDGET_TYPE = eINSTANCE.getWidget_WidgetType();

		/**
		 * The meta object literal for the '<em><b>Visible</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET__VISIBLE = eINSTANCE.getWidget_Visible();

		/**
		 * The meta object literal for the '{@link sculptorguimetamodel.impl.InputTextWidgetImpl <em>Input Text Widget</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptorguimetamodel.impl.InputTextWidgetImpl
		 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getInputTextWidget()
		 * @generated
		 */
		EClass INPUT_TEXT_WIDGET = eINSTANCE.getInputTextWidget();

		/**
		 * The meta object literal for the '{@link sculptorguimetamodel.impl.InformationalTextWidgetImpl <em>Informational Text Widget</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptorguimetamodel.impl.InformationalTextWidgetImpl
		 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getInformationalTextWidget()
		 * @generated
		 */
		EClass INFORMATIONAL_TEXT_WIDGET = eINSTANCE.getInformationalTextWidget();

		/**
		 * The meta object literal for the '{@link sculptorguimetamodel.impl.ButtonWidgetImpl <em>Button Widget</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptorguimetamodel.impl.ButtonWidgetImpl
		 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getButtonWidget()
		 * @generated
		 */
		EClass BUTTON_WIDGET = eINSTANCE.getButtonWidget();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUTTON_WIDGET__IMAGE = eINSTANCE.getButtonWidget_Image();

		/**
		 * The meta object literal for the '{@link sculptorguimetamodel.impl.PropertyReferringWidgetImpl <em>Property Referring Widget</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptorguimetamodel.impl.PropertyReferringWidgetImpl
		 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getPropertyReferringWidget()
		 * @generated
		 */
		EClass PROPERTY_REFERRING_WIDGET = eINSTANCE.getPropertyReferringWidget();

		/**
		 * The meta object literal for the '<em><b>For Op</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_REFERRING_WIDGET__FOR_OP = eINSTANCE.getPropertyReferringWidget_ForOp();

		/**
		 * The meta object literal for the '<em><b>For</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_REFERRING_WIDGET__FOR = eINSTANCE.getPropertyReferringWidget_For();

		/**
		 * The meta object literal for the '<em><b>Property Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_REFERRING_WIDGET__PROPERTY_PATH = eINSTANCE.getPropertyReferringWidget_PropertyPath();

		/**
		 * The meta object literal for the '<em><b>For Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_REFERRING_WIDGET__FOR_PROPERTY = eINSTANCE.getPropertyReferringWidget_ForProperty();

		/**
		 * The meta object literal for the '{@link sculptorguimetamodel.impl.TableWidgetImpl <em>Table Widget</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptorguimetamodel.impl.TableWidgetImpl
		 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getTableWidget()
		 * @generated
		 */
		EClass TABLE_WIDGET = eINSTANCE.getTableWidget();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_WIDGET__COLUMNS = eINSTANCE.getTableWidget_Columns();

		/**
		 * The meta object literal for the '<em><b>Paging</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_WIDGET__PAGING = eINSTANCE.getTableWidget_Paging();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_WIDGET__SIZE = eINSTANCE.getTableWidget_Size();

		/**
		 * The meta object literal for the '{@link sculptorguimetamodel.impl.GuiEventImpl <em>Gui Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptorguimetamodel.impl.GuiEventImpl
		 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getGuiEvent()
		 * @generated
		 */
		EClass GUI_EVENT = eINSTANCE.getGuiEvent();

		/**
		 * The meta object literal for the '<em><b>Gui Module</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUI_EVENT__GUI_MODULE = eINSTANCE.getGuiEvent_GuiModule();

		/**
		 * The meta object literal for the '{@link sculptorguimetamodel.impl.TableColumnImpl <em>Table Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptorguimetamodel.impl.TableColumnImpl
		 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getTableColumn()
		 * @generated
		 */
		EClass TABLE_COLUMN = eINSTANCE.getTableColumn();

		/**
		 * The meta object literal for the '<em><b>Column Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_COLUMN__COLUMN_TYPE = eINSTANCE.getTableColumn_ColumnType();

		/**
		 * The meta object literal for the '<em><b>Filterable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_COLUMN__FILTERABLE = eINSTANCE.getTableColumn_Filterable();

		/**
		 * The meta object literal for the '<em><b>Sortable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_COLUMN__SORTABLE = eINSTANCE.getTableColumn_Sortable();

		/**
		 * The meta object literal for the '<em><b>Editable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_COLUMN__EDITABLE = eINSTANCE.getTableColumn_Editable();

		/**
		 * The meta object literal for the '{@link sculptorguimetamodel.impl.TextAreaWidgetImpl <em>Text Area Widget</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptorguimetamodel.impl.TextAreaWidgetImpl
		 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getTextAreaWidget()
		 * @generated
		 */
		EClass TEXT_AREA_WIDGET = eINSTANCE.getTextAreaWidget();

		/**
		 * The meta object literal for the '{@link sculptorguimetamodel.impl.AutocompleteWidgetImpl <em>Autocomplete Widget</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptorguimetamodel.impl.AutocompleteWidgetImpl
		 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getAutocompleteWidget()
		 * @generated
		 */
		EClass AUTOCOMPLETE_WIDGET = eINSTANCE.getAutocompleteWidget();

		/**
		 * The meta object literal for the '{@link sculptorguimetamodel.impl.RadioButtonsWidgetImpl <em>Radio Buttons Widget</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptorguimetamodel.impl.RadioButtonsWidgetImpl
		 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getRadioButtonsWidget()
		 * @generated
		 */
		EClass RADIO_BUTTONS_WIDGET = eINSTANCE.getRadioButtonsWidget();

		/**
		 * The meta object literal for the '{@link sculptorguimetamodel.impl.RichTextAreaWidgetImpl <em>Rich Text Area Widget</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptorguimetamodel.impl.RichTextAreaWidgetImpl
		 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getRichTextAreaWidget()
		 * @generated
		 */
		EClass RICH_TEXT_AREA_WIDGET = eINSTANCE.getRichTextAreaWidget();

		/**
		 * The meta object literal for the '{@link sculptorguimetamodel.impl.InputDateWidgetImpl <em>Input Date Widget</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptorguimetamodel.impl.InputDateWidgetImpl
		 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getInputDateWidget()
		 * @generated
		 */
		EClass INPUT_DATE_WIDGET = eINSTANCE.getInputDateWidget();

		/**
		 * The meta object literal for the '{@link sculptorguimetamodel.impl.NumberSpinnerWidgetImpl <em>Number Spinner Widget</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptorguimetamodel.impl.NumberSpinnerWidgetImpl
		 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getNumberSpinnerWidget()
		 * @generated
		 */
		EClass NUMBER_SPINNER_WIDGET = eINSTANCE.getNumberSpinnerWidget();

		/**
		 * The meta object literal for the '{@link sculptorguimetamodel.impl.ServiceProxyImpl <em>Service Proxy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptorguimetamodel.impl.ServiceProxyImpl
		 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getServiceProxy()
		 * @generated
		 */
		EClass SERVICE_PROXY = eINSTANCE.getServiceProxy();

		/**
		 * The meta object literal for the '<em><b>For</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_PROXY__FOR = eINSTANCE.getServiceProxy_For();

		/**
		 * The meta object literal for the '<em><b>Gui Module</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_PROXY__GUI_MODULE = eINSTANCE.getServiceProxy_GuiModule();

		/**
		 * The meta object literal for the '{@link sculptorguimetamodel.impl.ServiceProxyOperationImpl <em>Service Proxy Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptorguimetamodel.impl.ServiceProxyOperationImpl
		 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getServiceProxyOperation()
		 * @generated
		 */
		EClass SERVICE_PROXY_OPERATION = eINSTANCE.getServiceProxyOperation();

		/**
		 * The meta object literal for the '<em><b>For</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_PROXY_OPERATION__FOR = eINSTANCE.getServiceProxyOperation_For();

		/**
		 * The meta object literal for the '{@link sculptorguimetamodel.impl.GuiCommandImpl <em>Gui Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptorguimetamodel.impl.GuiCommandImpl
		 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getGuiCommand()
		 * @generated
		 */
		EClass GUI_COMMAND = eINSTANCE.getGuiCommand();

		/**
		 * The meta object literal for the '{@link sculptorguimetamodel.impl.ViewParameterImpl <em>View Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptorguimetamodel.impl.ViewParameterImpl
		 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getViewParameter()
		 * @generated
		 */
		EClass VIEW_PARAMETER = eINSTANCE.getViewParameter();

		/**
		 * The meta object literal for the '<em><b>Nullable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_PARAMETER__NULLABLE = eINSTANCE.getViewParameter_Nullable();

		/**
		 * The meta object literal for the '{@link sculptorguimetamodel.impl.LinkWidgetImpl <em>Link Widget</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptorguimetamodel.impl.LinkWidgetImpl
		 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getLinkWidget()
		 * @generated
		 */
		EClass LINK_WIDGET = eINSTANCE.getLinkWidget();

		/**
		 * The meta object literal for the '<em><b>To View</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_WIDGET__TO_VIEW = eINSTANCE.getLinkWidget_ToView();

		/**
		 * The meta object literal for the '<em><b>To Destination</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_WIDGET__TO_DESTINATION = eINSTANCE.getLinkWidget_ToDestination();

		/**
		 * The meta object literal for the '{@link sculptorguimetamodel.impl.WidgetsContainerImpl <em>Widgets Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptorguimetamodel.impl.WidgetsContainerImpl
		 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getWidgetsContainer()
		 * @generated
		 */
		EClass WIDGETS_CONTAINER = eINSTANCE.getWidgetsContainer();

		/**
		 * The meta object literal for the '<em><b>Widgets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGETS_CONTAINER__WIDGETS = eINSTANCE.getWidgetsContainer_Widgets();

		/**
		 * The meta object literal for the '{@link sculptorguimetamodel.impl.PanelWidgetImpl <em>Panel Widget</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptorguimetamodel.impl.PanelWidgetImpl
		 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getPanelWidget()
		 * @generated
		 */
		EClass PANEL_WIDGET = eINSTANCE.getPanelWidget();

		/**
		 * The meta object literal for the '<em><b>Disclosure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PANEL_WIDGET__DISCLOSURE = eINSTANCE.getPanelWidget_Disclosure();

		/**
		 * The meta object literal for the '{@link sculptorguimetamodel.impl.UiBehaviorImpl <em>Ui Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptorguimetamodel.impl.UiBehaviorImpl
		 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getUiBehavior()
		 * @generated
		 */
		EClass UI_BEHAVIOR = eINSTANCE.getUiBehavior();

		/**
		 * The meta object literal for the '<em><b>Bindings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_BEHAVIOR__BINDINGS = eINSTANCE.getUiBehavior_Bindings();

		/**
		 * The meta object literal for the '{@link sculptorguimetamodel.impl.PopulatePanelBehaviorImpl <em>Populate Panel Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptorguimetamodel.impl.PopulatePanelBehaviorImpl
		 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getPopulatePanelBehavior()
		 * @generated
		 */
		EClass POPULATE_PANEL_BEHAVIOR = eINSTANCE.getPopulatePanelBehavior();

		/**
		 * The meta object literal for the '<em><b>Panel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POPULATE_PANEL_BEHAVIOR__PANEL = eINSTANCE.getPopulatePanelBehavior_Panel();

		/**
		 * The meta object literal for the '{@link sculptorguimetamodel.impl.NavigateToViewBehaviorImpl <em>Navigate To View Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptorguimetamodel.impl.NavigateToViewBehaviorImpl
		 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getNavigateToViewBehavior()
		 * @generated
		 */
		EClass NAVIGATE_TO_VIEW_BEHAVIOR = eINSTANCE.getNavigateToViewBehavior();

		/**
		 * The meta object literal for the '<em><b>View</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAVIGATE_TO_VIEW_BEHAVIOR__VIEW = eINSTANCE.getNavigateToViewBehavior_View();

		/**
		 * The meta object literal for the '{@link sculptorguimetamodel.impl.BehaviorBindingImpl <em>Behavior Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptorguimetamodel.impl.BehaviorBindingImpl
		 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getBehaviorBinding()
		 * @generated
		 */
		EClass BEHAVIOR_BINDING = eINSTANCE.getBehaviorBinding();

		/**
		 * The meta object literal for the '<em><b>Behaviors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_BINDING__BEHAVIORS = eINSTANCE.getBehaviorBinding_Behaviors();

		/**
		 * The meta object literal for the '<em><b>Widget</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_BINDING__WIDGET = eINSTANCE.getBehaviorBinding_Widget();

		/**
		 * The meta object literal for the '<em><b>Binding Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEHAVIOR_BINDING__BINDING_TYPE_NAME = eINSTANCE.getBehaviorBinding_BindingTypeName();

		/**
		 * The meta object literal for the '{@link sculptorguimetamodel.impl.OnClickBindingImpl <em>On Click Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptorguimetamodel.impl.OnClickBindingImpl
		 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getOnClickBinding()
		 * @generated
		 */
		EClass ON_CLICK_BINDING = eINSTANCE.getOnClickBinding();

		/**
		 * The meta object literal for the '{@link sculptorguimetamodel.impl.OnHoverBindingImpl <em>On Hover Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptorguimetamodel.impl.OnHoverBindingImpl
		 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getOnHoverBinding()
		 * @generated
		 */
		EClass ON_HOVER_BINDING = eINSTANCE.getOnHoverBinding();

		/**
		 * The meta object literal for the '{@link sculptorguimetamodel.impl.UiConditionImpl <em>Ui Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptorguimetamodel.impl.UiConditionImpl
		 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getUiCondition()
		 * @generated
		 */
		EClass UI_CONDITION = eINSTANCE.getUiCondition();

		/**
		 * The meta object literal for the '{@link sculptorguimetamodel.impl.GuiDtoImpl <em>Gui Dto</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptorguimetamodel.impl.GuiDtoImpl
		 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getGuiDto()
		 * @generated
		 */
		EClass GUI_DTO = eINSTANCE.getGuiDto();

		/**
		 * The meta object literal for the '<em><b>For</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUI_DTO__FOR = eINSTANCE.getGuiDto_For();

		/**
		 * The meta object literal for the '<em><b>Gui Module</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUI_DTO__GUI_MODULE = eINSTANCE.getGuiDto_GuiModule();

		/**
		 * The meta object literal for the '<em><b>Immutable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUI_DTO__IMMUTABLE = eINSTANCE.getGuiDto_Immutable();

		/**
		 * The meta object literal for the '{@link sculptorguimetamodel.impl.GuiEnumImpl <em>Gui Enum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptorguimetamodel.impl.GuiEnumImpl
		 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getGuiEnum()
		 * @generated
		 */
		EClass GUI_ENUM = eINSTANCE.getGuiEnum();

		/**
		 * The meta object literal for the '{@link sculptorguimetamodel.impl.StubModuleImpl <em>Stub Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptorguimetamodel.impl.StubModuleImpl
		 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getStubModule()
		 * @generated
		 */
		EClass STUB_MODULE = eINSTANCE.getStubModule();

		/**
		 * The meta object literal for the '<em><b>Stub For</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUB_MODULE__STUB_FOR = eINSTANCE.getStubModule_StubFor();

		/**
		 * The meta object literal for the '<em><b>Gui Module</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUB_MODULE__GUI_MODULE = eINSTANCE.getStubModule_GuiModule();

		/**
		 * The meta object literal for the '{@link sculptorguimetamodel.impl.ListBoxWidgetImpl <em>List Box Widget</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptorguimetamodel.impl.ListBoxWidgetImpl
		 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getListBoxWidget()
		 * @generated
		 */
		EClass LIST_BOX_WIDGET = eINSTANCE.getListBoxWidget();

		/**
		 * The meta object literal for the '<em><b>For Enum</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_BOX_WIDGET__FOR_ENUM = eINSTANCE.getListBoxWidget_ForEnum();

		/**
		 * The meta object literal for the '{@link sculptorguimetamodel.impl.BehaviorContainerImpl <em>Behavior Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptorguimetamodel.impl.BehaviorContainerImpl
		 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getBehaviorContainer()
		 * @generated
		 */
		EClass BEHAVIOR_CONTAINER = eINSTANCE.getBehaviorContainer();

		/**
		 * The meta object literal for the '<em><b>Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_CONTAINER__CONDITIONS = eINSTANCE.getBehaviorContainer_Conditions();

		/**
		 * The meta object literal for the '<em><b>Behaviors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_CONTAINER__BEHAVIORS = eINSTANCE.getBehaviorContainer_Behaviors();

		/**
		 * The meta object literal for the '{@link sculptorguimetamodel.impl.CustomWidgetImpl <em>Custom Widget</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptorguimetamodel.impl.CustomWidgetImpl
		 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getCustomWidget()
		 * @generated
		 */
		EClass CUSTOM_WIDGET = eINSTANCE.getCustomWidget();

		/**
		 * The meta object literal for the '{@link sculptorguimetamodel.impl.UpdateTableBehaviorImpl <em>Update Table Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptorguimetamodel.impl.UpdateTableBehaviorImpl
		 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getUpdateTableBehavior()
		 * @generated
		 */
		EClass UPDATE_TABLE_BEHAVIOR = eINSTANCE.getUpdateTableBehavior();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPDATE_TABLE_BEHAVIOR__TABLE = eINSTANCE.getUpdateTableBehavior_Table();

		/**
		 * The meta object literal for the '{@link sculptorguimetamodel.impl.ConfirmMessageBehaviorImpl <em>Confirm Message Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptorguimetamodel.impl.ConfirmMessageBehaviorImpl
		 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getConfirmMessageBehavior()
		 * @generated
		 */
		EClass CONFIRM_MESSAGE_BEHAVIOR = eINSTANCE.getConfirmMessageBehavior();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIRM_MESSAGE_BEHAVIOR__MESSAGE = eINSTANCE.getConfirmMessageBehavior_Message();

		/**
		 * The meta object literal for the '{@link sculptorguimetamodel.impl.CustomBehaviorImpl <em>Custom Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptorguimetamodel.impl.CustomBehaviorImpl
		 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getCustomBehavior()
		 * @generated
		 */
		EClass CUSTOM_BEHAVIOR = eINSTANCE.getCustomBehavior();

		/**
		 * The meta object literal for the '{@link sculptorguimetamodel.impl.CustomConditionImpl <em>Custom Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptorguimetamodel.impl.CustomConditionImpl
		 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getCustomCondition()
		 * @generated
		 */
		EClass CUSTOM_CONDITION = eINSTANCE.getCustomCondition();

		/**
		 * The meta object literal for the '{@link sculptorguimetamodel.impl.CompositeBehaviorImpl <em>Composite Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptorguimetamodel.impl.CompositeBehaviorImpl
		 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getCompositeBehavior()
		 * @generated
		 */
		EClass COMPOSITE_BEHAVIOR = eINSTANCE.getCompositeBehavior();

		/**
		 * The meta object literal for the '<em><b>Behaviors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_BEHAVIOR__BEHAVIORS = eINSTANCE.getCompositeBehavior_Behaviors();

		/**
		 * The meta object literal for the '{@link sculptorguimetamodel.impl.OnSelectItemBindingImpl <em>On Select Item Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptorguimetamodel.impl.OnSelectItemBindingImpl
		 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getOnSelectItemBinding()
		 * @generated
		 */
		EClass ON_SELECT_ITEM_BINDING = eINSTANCE.getOnSelectItemBinding();

		/**
		 * The meta object literal for the '{@link sculptorguimetamodel.impl.WidgetTableColumnImpl <em>Widget Table Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptorguimetamodel.impl.WidgetTableColumnImpl
		 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getWidgetTableColumn()
		 * @generated
		 */
		EClass WIDGET_TABLE_COLUMN = eINSTANCE.getWidgetTableColumn();

		/**
		 * The meta object literal for the '<em><b>Widget</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET_TABLE_COLUMN__WIDGET = eINSTANCE.getWidgetTableColumn_Widget();

		/**
		 * The meta object literal for the '{@link sculptorguimetamodel.impl.SimpleTableColumnImpl <em>Simple Table Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptorguimetamodel.impl.SimpleTableColumnImpl
		 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getSimpleTableColumn()
		 * @generated
		 */
		EClass SIMPLE_TABLE_COLUMN = eINSTANCE.getSimpleTableColumn();

		/**
		 * The meta object literal for the '{@link sculptorguimetamodel.impl.SetDirtyFlagBehaviorImpl <em>Set Dirty Flag Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptorguimetamodel.impl.SetDirtyFlagBehaviorImpl
		 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getSetDirtyFlagBehavior()
		 * @generated
		 */
		EClass SET_DIRTY_FLAG_BEHAVIOR = eINSTANCE.getSetDirtyFlagBehavior();

		/**
		 * The meta object literal for the '<em><b>Mark Specific Obj</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_DIRTY_FLAG_BEHAVIOR__MARK_SPECIFIC_OBJ = eINSTANCE.getSetDirtyFlagBehavior_MarkSpecificObj();

		/**
		 * The meta object literal for the '{@link sculptorguimetamodel.impl.WarnIfDirtyBehaviorImpl <em>Warn If Dirty Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptorguimetamodel.impl.WarnIfDirtyBehaviorImpl
		 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getWarnIfDirtyBehavior()
		 * @generated
		 */
		EClass WARN_IF_DIRTY_BEHAVIOR = eINSTANCE.getWarnIfDirtyBehavior();

		/**
		 * The meta object literal for the '{@link sculptorguimetamodel.impl.PopulateListBoxBehaviorImpl <em>Populate List Box Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptorguimetamodel.impl.PopulateListBoxBehaviorImpl
		 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getPopulateListBoxBehavior()
		 * @generated
		 */
		EClass POPULATE_LIST_BOX_BEHAVIOR = eINSTANCE.getPopulateListBoxBehavior();

		/**
		 * The meta object literal for the '<em><b>Widget</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POPULATE_LIST_BOX_BEHAVIOR__WIDGET = eINSTANCE.getPopulateListBoxBehavior_Widget();

		/**
		 * The meta object literal for the '{@link sculptorguimetamodel.impl.MarkDirtyBehaviorImpl <em>Mark Dirty Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptorguimetamodel.impl.MarkDirtyBehaviorImpl
		 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getMarkDirtyBehavior()
		 * @generated
		 */
		EClass MARK_DIRTY_BEHAVIOR = eINSTANCE.getMarkDirtyBehavior();

		/**
		 * The meta object literal for the '{@link sculptorguimetamodel.impl.MarkCleanBehaviorImpl <em>Mark Clean Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptorguimetamodel.impl.MarkCleanBehaviorImpl
		 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getMarkCleanBehavior()
		 * @generated
		 */
		EClass MARK_CLEAN_BEHAVIOR = eINSTANCE.getMarkCleanBehavior();

		/**
		 * The meta object literal for the '{@link sculptorguimetamodel.impl.GoBackBehaviorImpl <em>Go Back Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptorguimetamodel.impl.GoBackBehaviorImpl
		 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getGoBackBehavior()
		 * @generated
		 */
		EClass GO_BACK_BEHAVIOR = eINSTANCE.getGoBackBehavior();

		/**
		 * The meta object literal for the '{@link sculptorguimetamodel.impl.UpdateAttributeBehaviorImpl <em>Update Attribute Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptorguimetamodel.impl.UpdateAttributeBehaviorImpl
		 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getUpdateAttributeBehavior()
		 * @generated
		 */
		EClass UPDATE_ATTRIBUTE_BEHAVIOR = eINSTANCE.getUpdateAttributeBehavior();

		/**
		 * The meta object literal for the '<em><b>Property Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATE_ATTRIBUTE_BEHAVIOR__PROPERTY_PATH = eINSTANCE.getUpdateAttributeBehavior_PropertyPath();

		/**
		 * The meta object literal for the '<em><b>Target Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPDATE_ATTRIBUTE_BEHAVIOR__TARGET_CLASS = eINSTANCE.getUpdateAttributeBehavior_TargetClass();

		/**
		 * The meta object literal for the '{@link sculptorguimetamodel.impl.HasDirtyValueConditionImpl <em>Has Dirty Value Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptorguimetamodel.impl.HasDirtyValueConditionImpl
		 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getHasDirtyValueCondition()
		 * @generated
		 */
		EClass HAS_DIRTY_VALUE_CONDITION = eINSTANCE.getHasDirtyValueCondition();

		/**
		 * The meta object literal for the '<em><b>Dirty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAS_DIRTY_VALUE_CONDITION__DIRTY = eINSTANCE.getHasDirtyValueCondition_Dirty();

		/**
		 * The meta object literal for the '{@link sculptorguimetamodel.impl.PopupPanelBehaviorImpl <em>Popup Panel Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptorguimetamodel.impl.PopupPanelBehaviorImpl
		 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getPopupPanelBehavior()
		 * @generated
		 */
		EClass POPUP_PANEL_BEHAVIOR = eINSTANCE.getPopupPanelBehavior();

		/**
		 * The meta object literal for the '<em><b>View</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POPUP_PANEL_BEHAVIOR__VIEW = eINSTANCE.getPopupPanelBehavior_View();

		/**
		 * The meta object literal for the '<em><b>Panel Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POPUP_PANEL_BEHAVIOR__PANEL_NAME = eINSTANCE.getPopupPanelBehavior_PanelName();

		/**
		 * The meta object literal for the '{@link sculptorguimetamodel.impl.GuiDtoOptionsImpl <em>Gui Dto Options</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptorguimetamodel.impl.GuiDtoOptionsImpl
		 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getGuiDtoOptions()
		 * @generated
		 */
		EClass GUI_DTO_OPTIONS = eINSTANCE.getGuiDtoOptions();

		/**
		 * The meta object literal for the '<em><b>Skip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUI_DTO_OPTIONS__SKIP = eINSTANCE.getGuiDtoOptions_Skip();

		/**
		 * The meta object literal for the '{@link sculptorguimetamodel.impl.PropertyPathElementImpl <em>Property Path Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptorguimetamodel.impl.PropertyPathElementImpl
		 * @see sculptorguimetamodel.impl.SculptorguimetamodelPackageImpl#getPropertyPathElement()
		 * @generated
		 */
		EClass PROPERTY_PATH_ELEMENT = eINSTANCE.getPropertyPathElement();

		/**
		 * The meta object literal for the '<em><b>Remaining Path</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_PATH_ELEMENT__REMAINING_PATH = eINSTANCE.getPropertyPathElement_RemainingPath();

		/**
		 * The meta object literal for the '<em><b>For Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_PATH_ELEMENT__FOR_ATTRIBUTE = eINSTANCE.getPropertyPathElement_ForAttribute();

		/**
		 * The meta object literal for the '<em><b>For Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_PATH_ELEMENT__FOR_REFERENCE = eINSTANCE.getPropertyPathElement_ForReference();

	}

} //SculptorguimetamodelPackage
