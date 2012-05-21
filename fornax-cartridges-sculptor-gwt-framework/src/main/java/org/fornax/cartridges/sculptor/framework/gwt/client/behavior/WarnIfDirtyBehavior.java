package org.fornax.cartridges.sculptor.framework.gwt.client.behavior;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.fornax.cartridges.sculptor.framework.gwt.client.HasDirtyFlags;
import org.fornax.cartridges.sculptor.framework.gwt.client.PresentsConfirmationMessage;
import org.fornax.cartridges.sculptor.framework.gwt.client.behavior.BehaviorDispatcher.Event;

public class WarnIfDirtyBehavior implements Behavior {
    private static final Logger LOG =
        Logger.getLogger(WarnIfDirtyBehavior.class.getName());

    protected String name;
	protected HasDirtyFlags hasDirty;
	protected PresentsConfirmationMessage presentsConfirmation;
	protected String message;
	
	public WarnIfDirtyBehavior(String name, String message, HasDirtyFlags hasDirty, PresentsConfirmationMessage presentsConfirmation) {
		this.name = name;
		this.message = message;
		this.hasDirty = hasDirty;
		this.presentsConfirmation = presentsConfirmation;
	}
	
	@Override
	public void invoke(BehaviorCompletion completion, Event event) {
		boolean dirty = hasDirty.isDirty();
		if(LOG.isLoggable(Level.FINE)) {
			LOG.fine(name + " invoke() isDirty = " + dirty);
		}
		if(dirty) {
			completion.complete(presentsConfirmation.showConfirmation(message), event);			
		} else {
			completion.complete(true, event);
		}
	}

}