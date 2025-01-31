// The "DrawGraphics" interface.
package com.company.hsa;

import java.awt.Graphics;

interface DrawGraphics
{
    public abstract void drawWindowToGraphics (Graphics g);
    public abstract void drawWindowToGraphics (Graphics g, int pageWidth,
	    int pageHeight);
    public abstract int getMargin ();
} // DrawGraphics interface
