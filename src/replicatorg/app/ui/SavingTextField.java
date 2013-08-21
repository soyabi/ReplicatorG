package replicatorg.app.ui;

import replicatorg.app.Base;

public class SavingTextField extends ActionTextField {
	private static final long serialVersionUID = 1L;
	
	final String parameterName;
	
	public SavingTextField(String parameterName, String text, int columns) {
		super(text, columns, null);

		this.parameterName = parameterName;
	}

	@Override
	public void doSaveEvent() {
		String value = getText();
		Base.logger.fine("here: " + parameterName + "=" + value);
		Base.preferences.put(parameterName, value);
	}

}
