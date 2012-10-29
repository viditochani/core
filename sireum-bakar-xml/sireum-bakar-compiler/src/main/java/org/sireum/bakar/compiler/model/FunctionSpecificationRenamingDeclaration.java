/******************************************************************************
 * Copyright (c) 2009 Robby, Kansas State University, and others.             *
 * All rights reserved. This program and the accompanying materials           *
 * are made available under the terms of the Eclipse Public License v1.0      *
 * which accompanies this distribution, and is available at                   *
 * http://www.eclipse.org/legal/epl-v10.html                                  *
 ******************************************************************************/
package org.sireum.bakar.compiler.model;

public final class FunctionSpecificationRenamingDeclaration extends
    SubProgramRenamingDeclaration {
  protected FunctionSpecification theFunctionSpecification;

  protected Name theName;

  public final static int DESCRIPTOR = 127;

  public FunctionSpecificationRenamingDeclaration() {
  }

  @Override
  public final int getDescriptor() {
    return FunctionSpecificationRenamingDeclaration.DESCRIPTOR;
  }

  public final FunctionSpecification getTheFunctionSpecification() {
    return this.theFunctionSpecification;
  }

  public final Name getTheName() {
    return this.theName;
  }

  /**
   * <ul>
   * <li>{@code NonNull}</li>
   * </ul>
   */
  public final void setTheFunctionSpecification(
      final FunctionSpecification theFunctionSpecification) {
    assert theFunctionSpecification != null;
    this.theFunctionSpecification = theFunctionSpecification;
  }

  /**
   * <ul>
   * <li>{@code NonNull}</li>
   * </ul>
   */
  public final void setTheName(final Name theName) {
    assert theName != null;
    this.theName = theName;
  }
}