/*
 * Copyright 2007 The Fornax Project Team, including the original
 * author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.fornax.cartridges.sculptor.framework.accessimpl.jpahibernate;

import javax.persistence.Query;

import org.fornax.cartridges.sculptor.framework.accessapi.FindByQueryAccess;
import org.fornax.cartridges.sculptor.framework.accessimpl.jpa.JpaFindByQueryAccessImpl;

/**
 * <p>
 * Implementation of Access command FindByQueryAccess.
 * </p>
 * <p>
 * Command design pattern.
 * </p>
 */
public class JpaHibFindByQueryAccessImpl<T> extends JpaFindByQueryAccessImpl<T> implements FindByQueryAccess<T> {

    public JpaHibFindByQueryAccessImpl() {
    }

    public JpaHibFindByQueryAccessImpl(Class<T> persistentClass) {
        super(persistentClass);
    }

    @Override
    protected void prepareHints(Query query) {
        if (isCache()) {
            query.setHint("org.hibernate.cacheable", "true");
            query.setHint("org.hibernate.cacheRegion", getCacheRegion());
        }
    }
}