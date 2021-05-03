package de.hska.iwi.ads.solution.generics;

import de.hska.iwi.ads.generics.Box;

public class Cardbox<T> extends Box<T> {
	
		
	public Cardbox(int volume, T content) {
		super(volume, content);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compareTo(Box<T> o) {
		if (this.volume < o.getVolume())
		return 0;
		else if(this.volume == o.getVolume()) 
		return 1;
		else 
		return 2;
		
	}

}
