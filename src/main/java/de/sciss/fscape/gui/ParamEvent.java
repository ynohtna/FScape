/*
 *  ParamEvent.java
 *  (FScape)
 *
 *  Copyright (c) 2001-2015 Hanns Holger Rutz. All rights reserved.
 *
 *  This software is published under the GNU General Public License v3+
 *
 *
 *	For further information, please contact Hanns Holger Rutz at
 *	contact@sciss.de
 *
 *
 *  Changelog:
 *		21-May-05	created from de.sciss.meloncillo.gui.NumberEvent
 */

package de.sciss.fscape.gui;

import de.sciss.fscape.util.Param;
import de.sciss.fscape.util.ParamSpace;

import de.sciss.app.BasicEvent;

/**
 *  @author		Hanns Holger Rutz
 *  @version	0.68, 21-May-05
 */
public class ParamEvent
extends BasicEvent
{
// --- ID values ---
	public static final int CHANGED		= 0;

	private final Param			param;
	private final ParamSpace	space;

	/**
	 */
	public ParamEvent( Object source, int ID, long when, Param param, ParamSpace space )
	{
		super( source, ID, when );
	
		this.param	= param;
		this.space	= space;
	}
	
	public Param getParam()
	{
		return param;
	}

	public ParamSpace getSpace()
	{
		return space;
	}

	public boolean incorporate( BasicEvent oldEvent )
	{
		if( oldEvent instanceof ParamEvent &&
			this.getSource() == oldEvent.getSource() &&
			this.getID() == oldEvent.getID() ) {
			
			return true;

		} else return false;
	}
}
