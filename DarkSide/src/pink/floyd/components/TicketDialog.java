package pink.floyd.components;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Widget;

public class TicketDialog extends Composite implements HasText {

	private static TicketDialogUiBinder uiBinder = GWT
			.create(TicketDialogUiBinder.class);

	interface TicketDialogUiBinder extends UiBinder<Widget, TicketDialog> {
	}

	public TicketDialog() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@UiField
	Button okButton;

	public TicketDialog(String firstName) {
		initWidget(uiBinder.createAndBindUi(this));
		okButton.setText(firstName);
	}

	@UiHandler("okButton")
	void onClick(ClickEvent e) {
		Window.alert("Hello!");
	}

	public void setText(String text) {
		okButton.setText(text);
	}

	public String getText() {
		return okButton.getText();
	}

}
