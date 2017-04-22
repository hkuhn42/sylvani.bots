package org.sylvani.bot;

/**
 * A bot session A session is generally created for one chat or thread (depending on the implementation) with one or
 * more other entities (usually other bots or people
 * 
 * @author Harald Kuhn
 */
public interface ISession extends IContext {

	/**
	 * send the given activity to this session (This is a convenience method to send on the connector)
	 * 
	 * @param activity
	 */
	public void send(IActivity activity);

	/**
	 * access the global bot context
	 * 
	 * @return
	 */
	public IBot getBot();

	public void setTyping(boolean b);

	public boolean isTyping();

}
