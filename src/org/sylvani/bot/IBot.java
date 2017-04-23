package org.sylvani.bot;

import java.util.List;

import org.sylvani.bot.dialogs.IDialog;

/**
 * Defines a generic bot
 * 
 * A bot is both listener and emitter of activities and acts like the controller of a conversation it keeps track of the
 * conversations via sessions and delegates the activities to dialogs based on the IRecognizers results
 * 
 * The actual handling and creation of Activities is normally done by instances of IDialog
 * 
 * The acutal connection to a messaging service is handled by a {@link IConnector}. Multiple connectors can be
 * associated with one bot but a connector may not be shared between different bots
 * 
 * @author Harald Kuhn
 */
public interface IBot extends IContext {

	/**
	 * Called for received activities
	 * 
	 * @param activity
	 */
	public void receive(IActivity activity);

	/**
	 * Send the activity
	 * 
	 * @param activity
	 */
	public void send(IActivity activity);

	/**
	 * the the welcome / default dialog
	 * 
	 * @return
	 */
	public IDialog getWelcome();

	/**
	 * get default dialogs
	 * 
	 * @return
	 */
	public List<IDialog> getGlobals();

	public IBotConfig getBotConfig();
}
