/**
 *  Tracer - plugin for JOSM
 *  Jan Bilak, Marian Kyral, Martin Svec
 *
 *  This program is free software; you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation; either version 2 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License along
 *  with this program; if not, write to the Free Software Foundation, Inc.,
 *  51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 */

package org.openstreetmap.josm.plugins.tracer.connectways;

import org.openstreetmap.josm.data.osm.Relation;
import org.openstreetmap.josm.data.osm.Way;

public class NegatedAreaPredicate implements IEdAreaPredicate {

    private final IEdAreaPredicate m_filter;

    public NegatedAreaPredicate (IEdAreaPredicate filter) {
        m_filter = filter;
    }

    @Override
    public boolean evaluate(EdWay way) {
        return !m_filter.evaluate(way);
    }

    @Override
    public boolean evaluate(Way way) {
        return !m_filter.evaluate(way);
    }

    @Override
    public boolean evaluate(EdMultipolygon mp) {
        return !m_filter.evaluate(mp);
    }

    @Override
    public boolean evaluate(Relation mp) {
        return !m_filter.evaluate(mp);
    }
}
