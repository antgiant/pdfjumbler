package net.sourceforge.pdfjumbler.i18n;

import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.ListResourceBundle;

import javax.swing.KeyStroke;

/**
 * @author Martin Gropp <martin.gropp@googlemail.com>
 */
public class PdfJumblerResources extends ListResourceBundle {
	@Override
	protected Object[][] getContents() {
		return new Object[][] {
			{ "OPEN_DOCUMENT",            "Open document" },
			{ "SAVE_DOCUMENT",            "Save document" },
			{ "FILE_FILTER_PDF",          "PDF documents (*.pdf)" },
			{ "OVERWRITE_FILE_TITLE",     "Overwrite?" },
			{ "OVERWRITE_FILE_TEXT",      "The file %s already exists. Overwrite?" },
			{ "ZOOM_OUT",                 "Zoom out" },
			{ "ZOOM_IN",                  "Zoom in" },
			{ "CLEAR_LIST",               "Clear list" },
			{ "DELETE",                   "Delete" },
			{ "ABOUT",                    "About" },
			{ "LIST_DROP_PDFS_TO_EDIT",   "Drag PDF documents here!" },
			{ "LIST_CLIPBOARD_EMPTY",     "Clipboard\n(empty)" },
			{ "CONFIRM_CLEAR_LIST_TITLE", "Confirm" },
			{ "CONFIRM_CLEAR_LIST_TEXT",  "Delete all pages?" },
			{ "NO_PDF_EDITOR_TITLE",      "Error" },
			{ "NO_PDF_EDITOR_TEXT",       "Failed to load a PDF editor plugin." },
			{ "NO_PDF_RENDERER_TITLE",    "Error" },
			{ "NO_PDF_RENDERER_TEXT",     "Failed to load a PDF renderer plugin." },
			{ "PDF_PAGE_TITLE",           "%d (%s)" },
			{ "WRENCH",                   "Settings" },
			{ "WRENCH_EDITOR",            "PDF Editor" },
			{ "WRENCH_RENDERER",          "PDF Renderer" },
			{ "MOVE_UP",                  "Move up" },
			{ "MOVE_DOWN",                "Move down" },
			{ "PROGRESS_ABORT",           "Abort" },
			{ "UNDO",                     "Undo" },
			{ "REDO",                     "Redo" },
			{ "UNDO_ADD",                 "Add" },
			{ "UNDO_MOVE",                "Move" },
			{ "UNDO_DELETE",              "Delete" },
			{ "ACCELERATOR:OPEN",         KeyStroke.getKeyStroke('O', InputEvent.CTRL_DOWN_MASK) },
			{ "ACCELERATOR:SAVE",         KeyStroke.getKeyStroke('S', InputEvent.CTRL_DOWN_MASK) },
			{ "ACCELERATOR:ZOOM_IN",      KeyStroke.getKeyStroke('+') },
			{ "ACCELERATOR:ZOOM_OUT",     KeyStroke.getKeyStroke('-') },
			{ "ACCELERATOR:MOVE_UP",      KeyStroke.getKeyStroke(KeyEvent.VK_UP, InputEvent.ALT_DOWN_MASK) },
			{ "ACCELERATOR:MOVE_DOWN",    KeyStroke.getKeyStroke(KeyEvent.VK_DOWN, InputEvent.ALT_DOWN_MASK) },
			{ "ACCELERATOR:DELETE",       KeyStroke.getKeyStroke(KeyEvent.VK_DELETE, 0) },
			{ "ACCELERATOR:UNDO",         KeyStroke.getKeyStroke('Z', InputEvent.CTRL_DOWN_MASK) },
			{ "ACCELERATOR:REDO",         KeyStroke.getKeyStroke('Y', InputEvent.CTRL_DOWN_MASK) },
			{ "ABOUT_TITLE",              "About" },
			{ "PLUGIN_ERROR_TITLE",       "Plugin Error" },
			{
				"PLUGIN_ERROR_VERSION_INCOMPATIBLE",
				"This plugin requires PdfJumbler version %s."
			},
			{	
				"ABOUT_TEXT",
				"PdfJumbler %s \nCopyright (C) 2017 Martin Gropp\n" +
				"\n" +
				"PDF Editor: %s\n" +
				"PDF Renderer: %s\n" +
				"\n" +
				"This program is free software; you can redistribute it and/or modify it\n" +
				"under the terms of the GNU Affero General Public License as published by the\n" +
				"Free Software Foundation; either version 3 of the License, or (at your\n" +
				"option) any later version.\n\n" +
				"This program is distributed in the hope that it will be useful, but\n" +
				"WITHOUT ANY WARRANTY; without even the implied warranty of\n" +
				"MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.\n" +
				"See the GNU Affero General Public License for more details.\n\n" +
				"You should have received a copy of the GNU Affero General Public License along\n" +
				"with this program; if not, see http://www.gnu.org/licenses/.\n" +
				"\n" +
				"This software may include (among others) the following third party programs:\n" +
				"iText - Copyright iText Software Corp. (Affero GPL license)\n" +
				"PdfBox - Copyright Apache Foundation (Apache license)\n" +
				"JPedal - Copyright IDR Solutions (LGPL license)\n" +
				"JPod - Copyright intarsys (BSD style license)\n" +
				"Oxygen Icons - The Oxygen Team (LGPL/CC by-sa)\n"
			}
		};
	}
}
