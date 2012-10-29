/******************************************************************************
 * Copyright (c) 2009 Robby, Kansas State University, and others.             *
 * All rights reserved. This program and the accompanying materials           *
 * are made available under the terms of the Eclipse Public License v1.0      *
 * which accompanies this distribution, and is available at                   *
 * http://www.eclipse.org/legal/epl-v10.html                                  *
 ******************************************************************************/
package org.sireum.bakar.compiler.symboltable.model;

public abstract class SymAnnotation extends Symbol {
  protected SymObject theObject;

  public SymAnnotation() {
  }

  public final SymObject getTheObject() {
    return this.theObject;
  }

  /**
   * <ul>
   * <li>{@code NonNull}</li>
   * </ul>
   */
  public final void setTheObject(final SymObject theObject) {
    assert theObject != null;
    this.theObject = theObject;
  }

}