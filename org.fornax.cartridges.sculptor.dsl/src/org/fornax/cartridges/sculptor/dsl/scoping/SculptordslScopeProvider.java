/*
 * generated by Xtext
 */
package org.fornax.cartridges.sculptor.dsl.scoping;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.fornax.cartridges.sculptor.dsl.sculptordsl.DslDomainObject;
import org.fornax.cartridges.sculptor.dsl.sculptordsl.DslOppositeHolder;
import org.fornax.cartridges.sculptor.dsl.sculptordsl.DslReference;
import org.fornax.cartridges.sculptor.dsl.sculptordsl.DslRepository;
import org.fornax.cartridges.sculptor.dsl.sculptordsl.DslRepositoryOperation;
import org.fornax.cartridges.sculptor.dsl.sculptordsl.DslResourceOperationDelegate;
import org.fornax.cartridges.sculptor.dsl.sculptordsl.DslService;
import org.fornax.cartridges.sculptor.dsl.sculptordsl.DslServiceOperation;
import org.fornax.cartridges.sculptor.dsl.sculptordsl.DslServiceOperationDelegate;
import org.fornax.cartridges.sculptor.dsl.sculptordsl.DslServiceRepositoryOption;

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#scoping on
 * how and when to use it
 * 
 */
public class SculptordslScopeProvider extends AbstractDeclarativeScopeProvider {
    // private final static Logger LOG =
    // Logger.getLogger(sculptordslScopeProvider.class);

    IScope scope_DslOppositeHolder_opposite(DslOppositeHolder ctx, EReference ref) {
        Scope scope = new Scope();
        List<IEObjectDescription> elements = new ArrayList<IEObjectDescription>();
        scope.setElements(elements);
        DslDomainObject domainObject = (DslDomainObject) ((DslReference) ctx.eContainer()).getDomainObjectType();
        List<DslReference> references = domainObject.getReferences();
        for (DslReference reference : references) {
            if (reference.eContainer() != null) {
                elements.add(new EObjectDescription(reference.getName(), reference, null));
            }
        }
        return scope;
    }

    IScope scope_DslServiceOperationDelegate_delegateOperation(DslServiceOperationDelegate ctx, EReference ref) {
        Scope scope = new Scope();
        List<IEObjectDescription> elements = new ArrayList<IEObjectDescription>();
        DslServiceRepositoryOption option = ctx.getDelegate();
        if (option != null) {
            if (option instanceof DslRepository) {
                List<DslRepositoryOperation> operations = ((DslRepository) option).getOperations();
                for (DslRepositoryOperation operation : operations) {
                    elements.add(new EObjectDescription(operation.getName(), operation, null));
                }
            } else {
                List<DslServiceOperation> operations = ((DslService) option).getOperations();
                for (DslServiceOperation operation : operations) {
                    elements.add(new EObjectDescription(operation.getName(), operation, null));
                }
            }
        }
        scope.setElements(elements);
        return scope;
    }

    IScope scope_DslResourceOperationDelegate_delegateOperation(DslResourceOperationDelegate ctx, EReference ref) {
        Scope scope = new Scope();
        List<IEObjectDescription> elements = new ArrayList<IEObjectDescription>();
        DslService option = ctx.getDelegate();
        if (option != null) {
            List<DslServiceOperation> operations = (option).getOperations();
            for (DslServiceOperation operation : operations) {
                elements.add(new EObjectDescription(operation.getName(), operation, null));
            }
        }
        scope.setElements(elements);
        return scope;
    }

    IScope scope_DslReference2_domainObjectType(DslReference ctx, EReference ref) {
        IScope scope = super.getScope(ctx, ref);
        // List<IEObjectDescription> elements = new
        // ArrayList<IEObjectDescription>();

        // scope.setElements(elements);
        return scope;
    }
}
