package com.arthuramorim.n3prog.utils;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import com.arthuramorim.n3prog.entity.Modality;
import com.arthuramorim.n3prog.resources.ModalityRn;

@FacesConverter(forClass = Modality.class)
public class ModalityConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String value) {
		ModalityRn modalityRn = new ModalityRn();
		Long id = Long.parseLong(value);
		return modalityRn.queryId(id);
	}

	@Override
	public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object value) {
		Modality modality = (Modality) value;
		return String.valueOf(modality.getId());
	}

}
