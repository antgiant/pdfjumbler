package net.sourceforge.pdfjumbler.i18n;

import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.ListResourceBundle;

import javax.swing.KeyStroke;

/**
 * @author Andres Yesid Diaz Pinto
 */
public class PdfJumblerResources_es extends ListResourceBundle {
	@Override
	protected Object[][] getContents() {
		return new Object[][] {
			{ "OPEN_DOCUMENT",            "Abrir documento" },  
			{ "SAVE_DOCUMENT",            "Guardar documento" },
			{ "FILE_FILTER_PDF",          "Documentos PDF  (*.pdf)" },
			{ "OVERWRITE_FILE_TITLE",     "¿Sobreescribir?" },
			{ "OVERWRITE_FILE_TEXT",      "El fichero ya existe, ¿lo desea sobreescribir?" },
			{ "ZOOM_OUT",                 "Zoom out" },
			{ "ZOOM_IN",                  "Zoom in" },
			{ "CLEAR_LIST",               "Borrar lista" },
			{ "DELETE",                   "Eliminar" },
			{ "ABOUT",                    "Acerca de" },
			{ "LIST_DROP_PDFS_TO_EDIT",   "¡Arrastrar documentos PDF aquí!" },
			{ "LIST_CLIPBOARD_EMPTY",     "Portapapeles\n(vacío)" },
			{ "CONFIRM_CLEAR_LIST_TITLE", "Confirmar" },
			{ "CONFIRM_CLEAR_LIST_TEXT",  "¿Eliminar todas las páginas?" },
			{ "NO_PDF_EDITOR_TITLE",      "Error" },
			{ "NO_PDF_EDITOR_TEXT",       "Error al cargar el plugin para editar PDF." },
			{ "NO_PDF_RENDERER_TITLE",    "Error" },
			{ "NO_PDF_RENDERER_TEXT",     "Error al cargar el plugin para mostrar PDF." },
			{ "PDF_PAGE_TITLE",           "%d (%s)" },
			{ "WRENCH",                   "Configuración" },
			{ "WRENCH_EDITOR",            "Plugin para editar PDF" },
			{ "WRENCH_RENDERER",          "Plugin para mostrar PDF" },
			{ "MOVE_UP",                  "Mover arriba" },
			{ "MOVE_DOWN",                "Mover abajo" },
			{ "PROGRESS_ABORT",           "Detener" },
			{ "UNDO",                     "Deshacer" },
			{ "REDO",                     "Rehacer" },
			{ "UNDO_ADD",                 "Añadir" },
			{ "UNDO_MOVE",                "Mover" },
			{ "UNDO_DELETE",              "Eliminar" },
			{ "ACCELERATOR:OPEN",         KeyStroke.getKeyStroke('O', InputEvent.CTRL_DOWN_MASK) },
			{ "ACCELERATOR:SAVE",         KeyStroke.getKeyStroke('S', InputEvent.CTRL_DOWN_MASK) },
			{ "ACCELERATOR:ZOOM_IN",      KeyStroke.getKeyStroke('+') },
			{ "ACCELERATOR:ZOOM_OUT",     KeyStroke.getKeyStroke('-') },
			{ "ACCELERATOR:MOVE_UP",      KeyStroke.getKeyStroke(KeyEvent.VK_UP, InputEvent.ALT_DOWN_MASK) },
			{ "ACCELERATOR:MOVE_DOWN",    KeyStroke.getKeyStroke(KeyEvent.VK_DOWN, InputEvent.ALT_DOWN_MASK) },
			{ "ACCELERATOR:DELETE",       KeyStroke.getKeyStroke(KeyEvent.VK_DELETE, 0) },
			{ "ACCELERATOR:UNDO",         KeyStroke.getKeyStroke('Z', InputEvent.CTRL_DOWN_MASK) },
			{ "ACCELERATOR:REDO",         KeyStroke.getKeyStroke('Y', InputEvent.CTRL_DOWN_MASK) },
			{ "ABOUT_TITLE",              "Acerca de" },
			{ "PLUGIN_ERROR_TITLE",       "Error Plugin" },
			{
				"PLUGIN_ERROR_VERSION_INCOMPATIBLE",
				"Este plugin requiere la versión %s de PdfJumbler."
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
				"Este programa puede incluir,entre otros, las siguientes partes de software de terceros:\n" + 
				"iText - Copyright iText Software Corp. (Affero GPL license)\n" +
				"PdfBox - Copyright Apache Foundation (Apache license)\n" +
				"JPedal - Copyright IDR Solutions (LGPL license)\n" +
				"JPod - Copyright intarsys (BSD style license)\n" +
				"Oxygen Icons - The Oxygen Team (LGPL/CC by-sa)\n"
			}
		};
	}
}
