package org.roaringbitmap.buffer;

public interface PointableArray extends Cloneable {
	MappeableContainerPointer getContainerPointer();
	MappeableContainer getContainer(short x);
	MappeableContainer getContainerAtIndex(int i); 
	
	PointableArray clone();
}