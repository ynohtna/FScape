/*
 *  RenderConsumer.java
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
 *		14-Jul-05   created from de.sciss.meloncillo.render.RenderConsumer
 *		??-???-??	copied from eisenkraut
 */

//package de.sciss.eisenkraut.render;
package de.sciss.fscape.render;

import java.io.*;

/**
 *	Classes implementing this interface
 *	state that they can consume rendered
 *	and transformed streaming data. Its
 *	just like <code>RenderPlugIn</code> but
 *	from the reverse perspective. However
 *	unlike <code>RenderPlugIn</code>, the
 *	consumer cannot specify itself which
 *	data it wishes to receive (pull)
 *	but is provided with a preconfigured
 *	source object and requests (push).
 *
 *  @author		Hanns Holger Rutz
 *  @version	0.56, 15-Sep-05
 */
public interface RenderConsumer
{
	/**
	 *	Initiates the consumation.
	 *	The consumer should check the source's
	 *	request fields to find out which
	 *	data is to be written out.
	 *
	 *	@param	context	render context
	 *	@param	source	render source featuring
	 *					the target requests
	 *	@return	<code>false</code> if an error occurs
	 *			and consumation should be aborted
	 *
	 *	@throws	IOException	if a read/write error occurs
	 */
	public boolean consumerBegin( RenderContext context, RenderSource source )
	throws IOException;

	/**
	 *	Requests the consumer to consume a block of rendered data.
	 *
	 *	@param	context	render context
	 *	@param	source	render source featuring
	 *					the target requests and the rendered data block.
	 *	@return	<code>false</code> if an error occurs
	 *			and consumation should be aborted
	 *
	 *	@throws	IOException	if a read/write error occurs
	 */
	public boolean consumerRender( RenderContext context, RenderSource source )
	throws IOException;

	/**
	 *	Tells the consumer to finish consumption.
	 *	i.e. close files, end compound edits etc.
	 *
	 *	@param	context	render context
	 *	@param	source	render source
	 *	@return	<code>false</code> if an error occurs
	 *			and consumation should be aborted
	 *
	 *	@throws	IOException	if a read/write error occurs
	 */
	public boolean consumerFinish( RenderContext context, RenderSource source )
	throws IOException;

	/**
	 *	Tells the consumer that the rendering was
	 *	aborted and it should cancel any unfinished edits.
	 *
	 *	@param	context	render context
	 *	@param	source	render source
	 *
	 *	@throws	IOException	if a read/write error occurs
	 */
	public void consumerCancel( RenderContext context, RenderSource source )
	throws IOException;
}
