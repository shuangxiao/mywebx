/**
 * 
 */
package com.taobao.innovation.mywebx.web.control;

import com.taobao.innovation.mywebx.web.view.RunData;
import com.taobao.innovation.mywebx.web.view.Template;

/**
 *
 * @author chenxiong Feb 12, 2009
 */
public interface IdeaControl {
	
	// URLBrokerע��
	
       // ע��ʽ��
	public void handle(RunData rundata, Template context);
         // �õ���������
	//��������õ�����
	// ����context
}
