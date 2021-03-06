/*******************************************************************************
 * Copyright (c) 2015 Ricardo Gladwell
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

package me.gladwell.eclipse.m2e.android.configuration;

import org.apache.maven.artifact.Artifact;
import org.eclipse.jdt.core.IClasspathEntry;

interface EntryAttacher {

    IClasspathEntry attach(IClasspathEntry entry, Artifact artifact);
    boolean isAttached(IClasspathEntry entry);

}
