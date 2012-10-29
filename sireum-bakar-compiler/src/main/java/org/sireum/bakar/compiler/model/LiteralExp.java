/******************************************************************************
 * Copyright (c) 2009 Robby, Kansas State University, and others.             *
 * All rights reserved. This program and the accompanying materials           *
 * are made available under the terms of the Eclipse Public License v1.0      *
 * which accompanies this distribution, and is available at                   *
 * http://www.eclipse.org/legal/epl-v10.html                                  *
 ******************************************************************************/
package org.sireum.bakar.compiler.model;

public final class LiteralExp extends Exp {
  protected Literal theLiteral;

  public final static int DESCRIPTOR = 64;

  public LiteralExp() {
  }

  @Override
  public final int getDescriptor() {
    return LiteralExp.DESCRIPTOR;
  }

  public final Literal getTheLiteral() {
    return this.theLiteral;
  }

  /**
   * <ul>
   * <li>{@code NonNull}</li>
   * </ul>
   */
  public final void setTheLiteral(final Literal theLiteral) {
    assert theLiteral != null;
    this.theLiteral = theLiteral;
  }
}