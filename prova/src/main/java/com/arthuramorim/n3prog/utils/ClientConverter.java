package com.arthuramorim.n3prog.utils;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import com.arthuramorim.n3prog.entity.Client;
import com.arthuramorim.n3prog.resources.ClientRn;

@FacesConverter(forClass = Client.class)
public class ClientConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String value) {
		ClientRn clienteRn = new ClientRn();
		Long id = Long.parseLong(value);
		return clienteRn.queryId(id);
	}

	@Override
	public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object value) {
		Client client = (Client) value;
		return String.valueOf(client.getId());
	}

}
