// Generated by esidl 0.4.0.

package org.w3c.dom.html;

import org.w3c.dom.file.FileCallback;

public interface HTMLCanvasElement extends HTMLElement
{
    // HTMLCanvasElement
    public int getWidth();
    public void setWidth(int width);
    public int getHeight();
    public void setHeight(int height);
    public String toDataURL();
    public String toDataURL(String type, Object... args);
    public void toBlob(FileCallback callback);
    public void toBlob(FileCallback callback, String type, Object... args);
    public Object getContext(String contextId, Object... args);
}
