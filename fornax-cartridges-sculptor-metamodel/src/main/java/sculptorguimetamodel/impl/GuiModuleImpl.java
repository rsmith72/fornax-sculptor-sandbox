/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sculptorguimetamodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import sculptorguimetamodel.GuiApplication;
import sculptorguimetamodel.GuiEvent;
import sculptorguimetamodel.GuiModule;
import sculptorguimetamodel.SculptorguimetamodelPackage;
import sculptorguimetamodel.UserTask;

import sculptorguimetamodel.View;
import sculptormetamodel.Module;
import sculptormetamodel.Service;
import sculptormetamodel.impl.NamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gui Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sculptorguimetamodel.impl.GuiModuleImpl#getUserTasks <em>User Tasks</em>}</li>
 *   <li>{@link sculptorguimetamodel.impl.GuiModuleImpl#getBasePackage <em>Base Package</em>}</li>
 *   <li>{@link sculptorguimetamodel.impl.GuiModuleImpl#getApplication <em>Application</em>}</li>
 *   <li>{@link sculptorguimetamodel.impl.GuiModuleImpl#getFor <em>For</em>}</li>
 *   <li>{@link sculptorguimetamodel.impl.GuiModuleImpl#getViews <em>Views</em>}</li>
 *   <li>{@link sculptorguimetamodel.impl.GuiModuleImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link sculptorguimetamodel.impl.GuiModuleImpl#getServiceDependencies <em>Service Dependencies</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GuiModuleImpl extends NamedElementImpl implements GuiModule {
	/**
	 * The cached value of the '{@link #getUserTasks() <em>User Tasks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserTasks()
	 * @generated
	 * @ordered
	 */
	protected EList userTasks;

	/**
	 * The default value of the '{@link #getBasePackage() <em>Base Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasePackage()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_PACKAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBasePackage() <em>Base Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasePackage()
	 * @generated
	 * @ordered
	 */
	protected String basePackage = BASE_PACKAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFor() <em>For</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getFor()
	 * @generated
	 * @ordered
	 */
    protected Module for_;

    /**
	 * The cached value of the '{@link #getViews() <em>Views</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViews()
	 * @generated
	 * @ordered
	 */
	protected EList views;

				/**
	 * The cached value of the '{@link #getEvents() <em>Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected EList events;

				/**
	 * The cached value of the '{@link #getServiceDependencies() <em>Service Dependencies</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceDependencies()
	 * @generated
	 * @ordered
	 */
	protected EList serviceDependencies;

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GuiModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SculptorguimetamodelPackage.Literals.GUI_MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getUserTasks() {
		if (userTasks == null) {
			userTasks = new EObjectContainmentWithInverseEList(UserTask.class, this, SculptorguimetamodelPackage.GUI_MODULE__USER_TASKS, SculptorguimetamodelPackage.USER_TASK__MODULE);
		}
		return userTasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBasePackage() {
		return basePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasePackage(String newBasePackage) {
		String oldBasePackage = basePackage;
		basePackage = newBasePackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptorguimetamodelPackage.GUI_MODULE__BASE_PACKAGE, oldBasePackage, basePackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuiApplication getApplication() {
		if (eContainerFeatureID() != SculptorguimetamodelPackage.GUI_MODULE__APPLICATION) return null;
		return (GuiApplication)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApplication(GuiApplication newApplication, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newApplication, SculptorguimetamodelPackage.GUI_MODULE__APPLICATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplication(GuiApplication newApplication) {
		if (newApplication != eInternalContainer() || (eContainerFeatureID() != SculptorguimetamodelPackage.GUI_MODULE__APPLICATION && newApplication != null)) {
			if (EcoreUtil.isAncestor(this, newApplication))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newApplication != null)
				msgs = ((InternalEObject)newApplication).eInverseAdd(this, SculptorguimetamodelPackage.GUI_APPLICATION__MODULES, GuiApplication.class, msgs);
			msgs = basicSetApplication(newApplication, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptorguimetamodelPackage.GUI_MODULE__APPLICATION, newApplication, newApplication));
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Module getFor() {
		if (for_ != null && for_.eIsProxy()) {
			InternalEObject oldFor = (InternalEObject)for_;
			for_ = (Module)eResolveProxy(oldFor);
			if (for_ != oldFor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SculptorguimetamodelPackage.GUI_MODULE__FOR, oldFor, for_));
			}
		}
		return for_;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Module basicGetFor() {
		return for_;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setFor(Module newFor) {
		Module oldFor = for_;
		for_ = newFor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptorguimetamodelPackage.GUI_MODULE__FOR, oldFor, for_));
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getViews() {
		if (views == null) {
			views = new EObjectContainmentWithInverseEList(View.class, this, SculptorguimetamodelPackage.GUI_MODULE__VIEWS, SculptorguimetamodelPackage.VIEW__MODULE);
		}
		return views;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getEvents() {
		if (events == null) {
			events = new EObjectContainmentWithInverseEList(GuiEvent.class, this, SculptorguimetamodelPackage.GUI_MODULE__EVENTS, SculptorguimetamodelPackage.GUI_EVENT__GUI_MODULE);
		}
		return events;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getServiceDependencies() {
		if (serviceDependencies == null) {
			serviceDependencies = new EObjectResolvingEList(Service.class, this, SculptorguimetamodelPackage.GUI_MODULE__SERVICE_DEPENDENCIES);
		}
		return serviceDependencies;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SculptorguimetamodelPackage.GUI_MODULE__USER_TASKS:
				return ((InternalEList)getUserTasks()).basicAdd(otherEnd, msgs);
			case SculptorguimetamodelPackage.GUI_MODULE__APPLICATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetApplication((GuiApplication)otherEnd, msgs);
			case SculptorguimetamodelPackage.GUI_MODULE__VIEWS:
				return ((InternalEList)getViews()).basicAdd(otherEnd, msgs);
			case SculptorguimetamodelPackage.GUI_MODULE__EVENTS:
				return ((InternalEList)getEvents()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SculptorguimetamodelPackage.GUI_MODULE__USER_TASKS:
				return ((InternalEList)getUserTasks()).basicRemove(otherEnd, msgs);
			case SculptorguimetamodelPackage.GUI_MODULE__APPLICATION:
				return basicSetApplication(null, msgs);
			case SculptorguimetamodelPackage.GUI_MODULE__VIEWS:
				return ((InternalEList)getViews()).basicRemove(otherEnd, msgs);
			case SculptorguimetamodelPackage.GUI_MODULE__EVENTS:
				return ((InternalEList)getEvents()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case SculptorguimetamodelPackage.GUI_MODULE__APPLICATION:
				return eInternalContainer().eInverseRemove(this, SculptorguimetamodelPackage.GUI_APPLICATION__MODULES, GuiApplication.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SculptorguimetamodelPackage.GUI_MODULE__USER_TASKS:
				return getUserTasks();
			case SculptorguimetamodelPackage.GUI_MODULE__BASE_PACKAGE:
				return getBasePackage();
			case SculptorguimetamodelPackage.GUI_MODULE__APPLICATION:
				return getApplication();
			case SculptorguimetamodelPackage.GUI_MODULE__FOR:
				if (resolve) return getFor();
				return basicGetFor();
			case SculptorguimetamodelPackage.GUI_MODULE__VIEWS:
				return getViews();
			case SculptorguimetamodelPackage.GUI_MODULE__EVENTS:
				return getEvents();
			case SculptorguimetamodelPackage.GUI_MODULE__SERVICE_DEPENDENCIES:
				return getServiceDependencies();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SculptorguimetamodelPackage.GUI_MODULE__USER_TASKS:
				getUserTasks().clear();
				getUserTasks().addAll((Collection)newValue);
				return;
			case SculptorguimetamodelPackage.GUI_MODULE__BASE_PACKAGE:
				setBasePackage((String)newValue);
				return;
			case SculptorguimetamodelPackage.GUI_MODULE__APPLICATION:
				setApplication((GuiApplication)newValue);
				return;
			case SculptorguimetamodelPackage.GUI_MODULE__FOR:
				setFor((Module)newValue);
				return;
			case SculptorguimetamodelPackage.GUI_MODULE__VIEWS:
				getViews().clear();
				getViews().addAll((Collection)newValue);
				return;
			case SculptorguimetamodelPackage.GUI_MODULE__EVENTS:
				getEvents().clear();
				getEvents().addAll((Collection)newValue);
				return;
			case SculptorguimetamodelPackage.GUI_MODULE__SERVICE_DEPENDENCIES:
				getServiceDependencies().clear();
				getServiceDependencies().addAll((Collection)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case SculptorguimetamodelPackage.GUI_MODULE__USER_TASKS:
				getUserTasks().clear();
				return;
			case SculptorguimetamodelPackage.GUI_MODULE__BASE_PACKAGE:
				setBasePackage(BASE_PACKAGE_EDEFAULT);
				return;
			case SculptorguimetamodelPackage.GUI_MODULE__APPLICATION:
				setApplication((GuiApplication)null);
				return;
			case SculptorguimetamodelPackage.GUI_MODULE__FOR:
				setFor((Module)null);
				return;
			case SculptorguimetamodelPackage.GUI_MODULE__VIEWS:
				getViews().clear();
				return;
			case SculptorguimetamodelPackage.GUI_MODULE__EVENTS:
				getEvents().clear();
				return;
			case SculptorguimetamodelPackage.GUI_MODULE__SERVICE_DEPENDENCIES:
				getServiceDependencies().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SculptorguimetamodelPackage.GUI_MODULE__USER_TASKS:
				return userTasks != null && !userTasks.isEmpty();
			case SculptorguimetamodelPackage.GUI_MODULE__BASE_PACKAGE:
				return BASE_PACKAGE_EDEFAULT == null ? basePackage != null : !BASE_PACKAGE_EDEFAULT.equals(basePackage);
			case SculptorguimetamodelPackage.GUI_MODULE__APPLICATION:
				return getApplication() != null;
			case SculptorguimetamodelPackage.GUI_MODULE__FOR:
				return for_ != null;
			case SculptorguimetamodelPackage.GUI_MODULE__VIEWS:
				return views != null && !views.isEmpty();
			case SculptorguimetamodelPackage.GUI_MODULE__EVENTS:
				return events != null && !events.isEmpty();
			case SculptorguimetamodelPackage.GUI_MODULE__SERVICE_DEPENDENCIES:
				return serviceDependencies != null && !serviceDependencies.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (basePackage: ");
		result.append(basePackage);
		result.append(')');
		return result.toString();
	}

} //GuiModuleImpl
