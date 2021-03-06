/*
 * Copyright (C) 2007-2013 Crafter Software Corporation.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.craftercms.core.xml.mergers.impl.resolvers;

import org.craftercms.core.xml.mergers.DescriptorMergeStrategy;
import org.craftercms.core.xml.mergers.DescriptorMergeStrategyResolver;
import org.dom4j.Document;
import org.springframework.beans.factory.annotation.Required;

/**
 * {@link DescriptorMergeStrategyResolver} that always returns the same {@link DescriptorMergeStrategy} for
 * all descriptors
 *
 * @author Alfonso Vásquez
 */
public class SingleMergeStrategyResolver implements DescriptorMergeStrategyResolver {

    private DescriptorMergeStrategy strategy;

    @Required
    public void setStrategy(DescriptorMergeStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * Returns always the same {@link DescriptorMergeStrategy}, defined in the <code>strategy</code> property.
     *
     * @param descriptorUrl the URL that identifies the descriptor
     * @param descriptorDom the XML DOM of the descriptor (optional)
     * @return the value of the <code>strategy</code> property
     */
    @Override
    public DescriptorMergeStrategy getStrategy(String descriptorUrl, Document descriptorDom) {
        return strategy;
    }

}
