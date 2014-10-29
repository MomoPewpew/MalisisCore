/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014 Ordinastie
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package net.malisis.core.client.gui.component.control;

import net.malisis.core.client.gui.GuiRenderer;
import net.malisis.core.client.gui.component.UIComponent;
import net.malisis.core.client.gui.event.KeyboardEvent;

/**
 * IControlledComponent are special components designed to affect other {@link UIComponent}.
 *
 * @author Ordinastie
 *
 */
public interface IControlComponent
{
	/**
	 * Sets the {@link UIComponent} controlled by this {@link IControlComponent}.
	 *
	 * @return
	 */
	public void setParent(UIComponent component);

	/**
	 * Gets the {@link UIComponent} controlled by this {@link IControlComponent}.
	 *
	 * @return
	 */
	public UIComponent getParent();

	/**
	 * Gets the component at the specified coordinates. See {@link UIComponent#getComponentAt(int, int)}.
	 *
	 * @param x
	 * @param y
	 * @return
	 */
	public UIComponent getComponentAt(int x, int y);

	/**
	 * Fires an event for this {@link IControlComponent}. See {@link UIComponent#fireKeyboardEvent(KeyboardEvent)}.
	 *
	 * @param event
	 */
	public boolean fireKeyboardEvent(KeyboardEvent event);

	/**
	 * Draws this {@link IControlComponent}. See {@link UIComponent#draw(GuiRenderer, int, int, float)}.
	 *
	 * @param renderer
	 * @param mouseX
	 * @param mouseY
	 * @param partialTick
	 */
	public void draw(GuiRenderer renderer, int mouseX, int mouseY, float partialTick);

}