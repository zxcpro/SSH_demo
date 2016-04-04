package com.lqh.common.model;

import java.lang.reflect.Field;

public abstract class AbstractBaseModel implements Model {
	private static final long serialVersionUID = -4147766806307158099L;

	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		
		try {
			for(Field field : this.getClass().getDeclaredFields()) {
				final String name = field.getName();
				field.setAccessible(true);
				Object value = field.get(this);
				
				buffer.append(name + ":" + value + ", ");
			}
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		
		return buffer.substring(0, buffer.length()-2);
	}
}
