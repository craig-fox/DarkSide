package pink.floyd.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.Widget;

public class RadDialog extends Composite {

	private static RadDialogUiBinder uiBinder = GWT
			.create(RadDialogUiBinder.class);

	interface RadDialogUiBinder extends UiBinder<Widget, RadDialog> {
	}

	@UiField
	DialogBox rad;
	
	@UiField
	Button cancelButton;
	
	/**
	 * @return the rad
	 */
	public DialogBox getRad() {
		return rad;
	}
	
	@UiHandler("cancelButton")
	void onClick(ClickEvent e) {
		rad.hide();
	}

	public RadDialog() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	public RadDialog(String firstName) {
		initWidget(uiBinder.createAndBindUi(this));
	}


}
