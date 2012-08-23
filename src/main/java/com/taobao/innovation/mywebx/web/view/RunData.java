/**
 * 
 */
package com.taobao.innovation.mywebx.web.view;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 *  2009-03-27 �����ض���
 *  �Ƿ���Ҫ��Ⱦģ��
 *
 * @author chenxiong Feb 12, 2009
 */
public interface RunData {
	
    public HttpServletRequest getHttpServletRequest();
    
    public HttpServletResponse getHttpServletResponse();
    
    public String getParameter(String str);

    public String getStringParameter(String str, String defaultValue);

    public int getIntParameter(String str, int defaultValue);

    public int getIntParameter(String str);

    public int[] getIntParameters(String str);

    public long getLongParameter(String para, long defaultValue);

    public long getLongParameter(String para);

    public long[] getLongParameters(String para);


    /**
     * �ض������µ�URL
     *
     * @param URL
     * @return
     */
    public void redirect(String URL);

    /**
     * 
     * @param templateView
     */
    public void reTemplateDirect(String reTemplateView);

    public boolean isNeedTemplate();

    public void setIsNeedTemplate(Boolean isNeedTemplate);

    /**
     * �õ���Ⱦ��ģ����
     *
     * @return
     */
    public String getTemplateView();
    
}
