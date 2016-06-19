/*
 * Copyright (c) 2016 Jamison Bryant (http://jamisonbryant.com). All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you may redistribute it and/or modify it under the terms of the
 * MIT License only, as published by the Massachusetts Institute of Technology (MIT).
 *
 * This code is distributed with the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See
 * the MIT License for more details (a copy of the license is included in the LICENSE.md file
 * that accompanies this code).
 *
 * Please contact Jamison Bryant (contact@jamisonbryant.com) or visit http://jamisonbryant.com if
 * you need additional information or have any questions.
 */

package com.jamisonbryant.getcomfy.util;

import java.util.regex.Pattern;

/**
 * A utility class for getting operating system details.
 *
 * @author Jamison Bryant (robojamison@gmail.com)
 * @since  0.1.0
 */
public class OS
{
    /**
     * Returns if the operating system type is a version of Windows.
     *
     * @return <tt>true</tt> if the operating system type is some version of Windows
     */
    public static boolean isWindows()
    {
        return System.getProperty("os.name").toLowerCase().contains("win");
    }

    /**
     * Returns if the operating system type is a distribution of Linux.
     *
     * @return <tt>true</tt> if the operating system type is some distribution of Linux
     */
    public static boolean isLinux()
    {
        Pattern pattern = Pattern.compile("nix|nux|aix");
        return pattern.matcher(System.getProperty("os.name").toLowerCase()).find();
    }

    /**
     * Returns if the operating system type is a version of Mac OS.
     *
     * @return <tt>true</tt> if the operating system type is some version of Mac OS
     */
    public static boolean isMacOs()
    {
        return System.getProperty("os.name").toLowerCase().contains("mac");
    }
}
