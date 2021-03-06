/**
 *  Copyright (C) 2002-2011  The FreeCol Team
 *
 *  This file is part of FreeCol.
 *
 *  FreeCol is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 2 of the License, or
 *  (at your option) any later version.
 *
 *  FreeCol is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with FreeCol.  If not, see <http://www.gnu.org/licenses/>.
 */

package net.sf.freecol.client.gui.action;

import java.awt.event.ActionEvent;


import net.sf.freecol.client.FreeColClient;

/**
 * An action for loading a game or map.
 */
public class OpenAction extends FreeColAction {

    public static final String id = "openAction";


    /**
     * Creates a new <code>OpenAction</code>.
     *
     * @param freeColClient The main controller object for the client.
     */
    OpenAction(FreeColClient freeColClient) {
        super(freeColClient, id);
    }

    /**
     * Applies this action.
     *
     * @param e The <code>ActionEvent</code>.
     */
    public void actionPerformed(ActionEvent e) {
        if (!freeColClient.isMapEditor()) {
            freeColClient.getInGameController().loadGame();
        } else {
            freeColClient.getMapEditorController().loadGame();
        }
    }
}
