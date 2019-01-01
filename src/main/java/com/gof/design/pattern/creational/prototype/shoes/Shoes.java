package com.gof.design.pattern.creational.prototype.shoes;

import java.io.*;

public abstract class Shoes implements Serializable, Cloneable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4665015229865334016L;
	
	abstract void wear();
	
	public Object shallowCloning() throws CloneNotSupportedException{
		return this.clone();
	}
	
	public Object deepCloning() throws IOException, ClassNotFoundException {
        //Serialization of object
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(bos);
        out.writeObject(this);
        //De-serialization of object
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream in = new ObjectInputStream(bis);
        Shoes clonedShoes = (Shoes) in.readObject();
        return clonedShoes;
    }

}
