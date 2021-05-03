package de.hska.iwi.ads.solution.interfaces;

import de.hska.iwi.ads.interfaces.AbstractCircle;
import de.hska.iwi.ads.interfaces.Scaleable;
import de.hska.iwi.ads.interfaces.Shape;
import de.hska.iwi.ads.interfaces.Vector;

public class Circle extends AbstractCircle implements Scaleable, Shape {

	public Circle(double radius) {
		super(radius);
		// TODO Auto-generated constructor stub
	}

	public Circle(Vector middlePoint, double radius) {
		super(middlePoint, radius);
		if(radius <0) {
			this.radius =radius*(-1);
		}
		// TODO Auto-generated constructor stub
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void scale(double factor) {
		// TODO Auto-generated method stub

	}

	@Override
	public double getDimension() {
		// TODO Auto-generated method stub
		return 0;
	}

}
