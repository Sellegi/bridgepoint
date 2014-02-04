package com.mentor.nucleus.bp.core.ui.preferences;

import org.eclipse.jface.preference.PreferenceNode;
import org.osgi.service.prefs.Preferences;

public class BridgePointProjectActionLanguagePreferenceNode extends PreferenceNode {
	Preferences node = null;

	public BridgePointProjectActionLanguagePreferenceNode(Preferences node) {
		super("com.mentor.nucleus.bp.project.preferences",
				"Action Language", null, "");
		this.node = node;
	}

	public void createPage() {
		BridgePointProjectActionLanguagePreferences page = new BridgePointProjectActionLanguagePreferences(
				node);
		page.setTitle(getLabelText());
		setPage(page);
	}
}
