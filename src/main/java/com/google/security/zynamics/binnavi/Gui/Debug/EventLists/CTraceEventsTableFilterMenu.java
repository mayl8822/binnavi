// Copyright 2011-2016 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.security.zynamics.binnavi.Gui.Debug.EventLists;

import javax.swing.JPopupMenu;
import javax.swing.JTextField;

import com.google.security.zynamics.binnavi.Gui.Debug.EventLists.Actions.CFilterByMemoryAction;
import com.google.security.zynamics.binnavi.Gui.Debug.EventLists.Actions.CFilterByRegisterAction;


/**
 * Context menu of trace event filter fields.
 */
public final class CTraceEventsTableFilterMenu extends JPopupMenu {
  /**
   * Used for serialization.
   */
  private static final long serialVersionUID = 5620992386867848694L;

  /**
   * Creates a new menu object.
   *
   * @param filterField The filter field the context menu belongs to.
   */
  public CTraceEventsTableFilterMenu(final JTextField filterField) {
    add(new CFilterByMemoryAction(filterField));
    add(new CFilterByRegisterAction(filterField));
  }
}
