/*
 * Copyright (c) 2018 by k3b.
 *
 * This file is part of #APhotoManager (https://github.com/k3b/APhotoManager/)
 *              and #toGoZip (https://github.com/k3b/ToGoZip/).
 *
 * This program is free software: you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License
 *
 * for more details.
 * You should have received a copy of the GNU General Public License along with
 * this program. If not, see <http://www.gnu.org/licenses/>
 */
package de.k3b.io;

/**
 * Created by k3b on 22.12.2017.
 */

public class StringUtils {
    /// @Deprecated use Verson with CharSequence parameter instead of string
    @Deprecated
    public static int length(String str) {
        return (str != null) ? str.length() : 0;
    }

    /// @Deprecated use Verson with CharSequence parameter instead of string
    @Deprecated
    public static boolean isNullOrEmpty(String str) {
        return (0 == length(str));
    }

    public static int length(CharSequence str) {
        return (str != null) ? str.length() : 0;
    }
    public static boolean isNullOrEmpty(CharSequence str) {
        return (0 == length(str));
    }

}
