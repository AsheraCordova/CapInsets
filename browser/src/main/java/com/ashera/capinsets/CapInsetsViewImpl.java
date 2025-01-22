package com.ashera.capinsets;
//start - imports
import java.util.*;

import r.android.content.Context;
import r.android.os.Build;
import r.android.view.View;
import r.android.annotation.SuppressLint;
import r.android.annotation.SuppressLint;

import com.ashera.widget.*;
import com.ashera.converter.*;


import static com.ashera.widget.IWidget.*;
//end - imports

import r.android.view.ViewGroup;
import androidx.core.view.ViewCompat;
public class CapInsetsViewImpl implements com.ashera.widget.IAttributable {
	// start - body
	public final static String LOCAL_NAME = "CapInsetsView"; 
	private IWidget w;
	private CapInsetsViewImpl(IWidget widget) {
		this.w = widget;
	}
	
	public String getLocalName() {
		return LOCAL_NAME;
	}
	
	public CapInsetsViewImpl() {
	}
	
	@Override
	public com.ashera.widget.IAttributable newInstance(IWidget widget) {
		CapInsetsViewImpl newIntance = new CapInsetsViewImpl(widget);
		
		return newIntance;
	}
	
	
	@SuppressLint("NewApi")
	@Override
	public void loadAttributes(String localName) {

		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("backgroundCapInsets").withType("dimensiondppx").withOrder(-10));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("backgroundCapInsetsTop").withType("dimensiondppx").withOrder(-10));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("backgroundCapInsetsBottom").withType("dimensiondppx").withOrder(-10));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("backgroundCapInsetsLeft").withType("dimensiondppx").withOrder(-10));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("backgroundCapInsetsRight").withType("dimensiondppx").withOrder(-10));
	}

	@SuppressLint("NewApi")
	@Override
	public void setAttribute(WidgetAttribute key, String strValue, Object objValue, ILifeCycleDecorator decorator) {
		View view = (View) w.asWidget();
		org.teavm.jso.dom.html.HTMLElement hTMLElement = (org.teavm.jso.dom.html.HTMLElement) w.asNativeWidget();
		switch (key.getAttributeName()) {
		case "backgroundCapInsets": {


		 applyCapInsets(w, objValue);



			}
			break;
		case "backgroundCapInsetsTop": {


		 applyCapInsetsTop(w, objValue);



			}
			break;
		case "backgroundCapInsetsBottom": {


		 applyCapInsetsBottom(w, objValue);



			}
			break;
		case "backgroundCapInsetsLeft": {


		 applyCapInsetsLeft(w, objValue);



			}
			break;
		case "backgroundCapInsetsRight": {


		 applyCapInsetsRight(w, objValue);



			}
			break;
		default:
			break;
		}
	}
	
	@SuppressLint("NewApi")
	@Override
	public Object getAttribute(WidgetAttribute key, ILifeCycleDecorator decorator) {
		View view = (View) w.asWidget();
		org.teavm.jso.dom.html.HTMLElement hTMLElement = (org.teavm.jso.dom.html.HTMLElement) w.asNativeWidget();
		switch (key.getAttributeName()) {
		}
		return null;
	}
	
	
 
	private void applyForegroundCapInsets(IWidget w, Object objValue) {
		applyForegroundCapInsetsRight(w, objValue);
		applyForegroundCapInsetsLeft(w, objValue);
		applyForegroundCapInsetsTop(w, objValue);
		applyForegroundCapInsetsBottom(w, objValue);
	}
	private void applyForegroundCapInsetsRight(IWidget w, Object objValue) {
		String capInsetsKey = "capInsetsRight";
		if (isRTLayoutCapInsets(w)) {
			capInsetsKey = "capInsetsLeft";
		}
		w.applyAttributeCommand("foreground", "capInsets", new String[] {"foregroundCapInsetsTop", "foregroundCapInsetsBottom", "foregroundCapInsetsLeft", "foregroundCapInsetsRight"}, true, capInsetsKey, objValue);
	}

	private void applyForegroundCapInsetsLeft(IWidget w, Object objValue) {
		String capInsetsKey = "capInsetsLeft";
		if (isRTLayoutCapInsets(w)) {
			capInsetsKey = "capInsetsRight";
		}
		
		w.applyAttributeCommand("foreground", "capInsets", new String[] {"foregroundCapInsetsTop", "foregroundCapInsetsBottom", "foregroundCapInsetsLeft", "foregroundCapInsetsRight"}, true, capInsetsKey, objValue);
	}

	private void applyForegroundCapInsetsBottom(IWidget w, Object objValue) {
		w.applyAttributeCommand("foreground", "capInsets", new String[] {"foregroundCapInsetsTop", "foregroundCapInsetsBottom", "foregroundCapInsetsLeft", "foregroundCapInsetsRight"}, true, "capInsetsBottom", objValue);
	}

	private void applyForegroundCapInsetsTop(IWidget w, Object objValue) {
		w.applyAttributeCommand("foreground", "capInsets", new String[] {"foregroundCapInsetsTop", "foregroundCapInsetsBottom", "foregroundCapInsetsLeft", "foregroundCapInsetsRight"}, true, "capInsetsTop", objValue);
	}
	private void applyCapInsets(IWidget w, Object objValue) {
		applyCapInsetsRight(w, objValue);
		applyCapInsetsLeft(w, objValue);
		applyCapInsetsTop(w, objValue);
		applyCapInsetsBottom(w, objValue);
	}
	
	private void applyCapInsetsRight(IWidget w, Object objValue) {
		String capInsetsKey = "capInsetsRight";
		if (isRTLayoutCapInsets(w)) {
			capInsetsKey = "capInsetsLeft";
		}
		w.applyAttributeCommand("background", "capInsets", new String[] {"capInsetsTop", "capInsetsBottom", "capInsetsLeft", "capInsetsRight"}, true, capInsetsKey, objValue);
	}

	private void applyCapInsetsLeft(IWidget w, Object objValue) {
		String capInsetsKey = "capInsetsLeft";
		if (isRTLayoutCapInsets(w)) {
			capInsetsKey = "capInsetsRight";
		}
		
		w.applyAttributeCommand("background", "capInsets", new String[] {"capInsetsTop", "capInsetsBottom", "capInsetsLeft", "capInsetsRight"}, true, capInsetsKey, objValue);
	}

	private void applyCapInsetsBottom(IWidget w, Object objValue) {
		w.applyAttributeCommand("background", "capInsets", new String[] {"capInsetsTop", "capInsetsBottom", "capInsetsLeft", "capInsetsRight"}, true, "capInsetsBottom", objValue);
	}

	private void applyCapInsetsTop(IWidget w, Object objValue) {
		w.applyAttributeCommand("background", "capInsets", new String[] {"capInsetsTop", "capInsetsBottom", "capInsetsLeft", "capInsetsRight"}, true, "capInsetsTop", objValue);
	}

	private boolean isRTLayoutCapInsets(IWidget w) {
		if (com.ashera.layout.ViewImpl.isRTLLayoutDirection(w)) {
			return true;
		}
		
		View view  =(View) w.asWidget();
		if (!ViewCompat.isLayoutDirectionResolved(view)) {
			ViewGroup parent = (ViewGroup) view.getParent();
			while (parent != null) {
				if (ViewCompat.getLayoutDirection(parent) == ViewCompat.LAYOUT_DIRECTION_RTL) {
					return true;
				}
				parent = (ViewGroup) parent.getParent();
			}
		}
		return false;
	}	
	


	// end - body
}
