/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later
 * See the lgpl.txt file in the root directory or http://www.gnu.org/licenses/lgpl-2.1.html
 */
package org.hibernate.cache.spi.support;

import org.hibernate.cache.spi.DirectAccessRegion;
import org.hibernate.cache.spi.RegionFactory;

/**
 * @author Steve Ebersole
 */
public abstract class DirectAccessRegionTemplate extends AbstractRegion implements DirectAccessRegion {
	public DirectAccessRegionTemplate(String name, RegionFactory regionFactory) {
		super( name, regionFactory );
	}
}
