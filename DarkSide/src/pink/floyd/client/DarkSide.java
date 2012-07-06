package pink.floyd.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootLayoutPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class DarkSide implements EntryPoint {
	
	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
	    DarkSideScreen screen = new DarkSideScreen();
	    RootLayoutPanel.get().add(screen);
	}
}
