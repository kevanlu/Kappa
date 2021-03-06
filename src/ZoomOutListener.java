/** KAPPA - Curvature Analysis Software for Biological Images
 * =========================================================================== 
 * @author Kevan Lu
 * @version April 2013
 * This file is part of Kappa.
 *
 * Copyright (c) 2011-2013 Kevan Lu
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to 
 * deal in the Software without restriction, including without limitation the
 * rights to use, copy, modify, merge, publish, distribute, sublicense, and/or
 * sell copies of the Software, and to permit persons to whom the Software is 
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in 
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, 
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL
 * THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING 
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS
 * IN THE SOFTWARE.
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ZoomOutListener implements ActionListener
{
	public void actionPerformed(ActionEvent e){
		double scale = ControlPanel.scaleSlider.getValue ()/100.0;

		//If we are at the min scaling increment or lower, we can't zoom out
		if (scale <= ControlPanel.SCALE_INCREMENTS[0]) return;

		//Finds the next smallest scaling increment and sets the scale to that.
		int i = 1;
		while (i < ControlPanel.SCALE_INCREMENTS.length && ControlPanel.SCALE_INCREMENTS [i] < scale) i++;
		ControlPanel.scaleSlider.setValue((int)Math.floor(100.0*ControlPanel.SCALE_INCREMENTS[--i]));
	}
}
