/*
 * Copyright (C) 2023 Team Gateship-One
 * (Hendrik Borghorst & Frederik Luetkes)
 *
 * The AUTHORS.md file contains a detailed contributors list:
 * <https://github.com/gateship-one/odyssey/blob/master/AUTHORS.md>
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
 *
 */

package org.gateshipone.odyssey.utils;


import org.gateshipone.odyssey.models.FileModel;

public class PlaylistParserFactory {
    public static PlaylistParser getParser(FileModel playlistFile) {
        String path = playlistFile.getPath();
        if (path.toLowerCase().endsWith("m3u")) {
            return new M3UParser(playlistFile);
        } else if (path.toLowerCase().endsWith("pls")) {
            return new PLSParser(playlistFile);
        }
        return null;
    }
}
