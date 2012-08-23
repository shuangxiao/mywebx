/**
 * 
 */
package com.taobao.innovation.mywebx.web.util;

/**
 * @author wuxiang
 *
 * 2009-2-28--StringUtil.java
 * 2009-3-25 ���Ӷ༶Ŀ¼��ӳ��
 * 2009-12-12 bug fixed
 */
public class StringUtil {

    /**
     * ����ĸ���д
     *
     * @param str
     * @return
     */
    public static String upFristChar(String str) {
        if (str == null) {
            return str;
        }

        StringBuffer sb = new StringBuffer();
        char a = Character.toUpperCase(str.charAt(0));
        sb.append(a);
        sb.append(str.substring(1));
        return sb.toString();

    }

    private static String urlMapping(String str) {
        String afterStr = null;
        if (str == null) {
            return afterStr;
        // ����Ҫthrow
        }
        if (str.indexOf("/") > 0) {
            String[] split = str.split("/");
            // ȫ�����Сд
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < split.length; i++) {
                //sb.append(split[i].toLowerCase());
            	sb.append(downFristChar(split[i]));
                sb.append(".");
            }
            afterStr = sb.toString();
            // ȥ���ռ��������
            int m = afterStr.lastIndexOf(".");
            afterStr = afterStr.substring(0, m);
            // ��д���
            int j = afterStr.lastIndexOf(".");
            String needTop = afterStr.substring(0, j);
            String needUpStr = upFristChar(afterStr.substring(j + 1));

            afterStr = needTop + "." + needUpStr;

        } else {
            // ֱ�ӹ淶
            afterStr = upFristChar(str);
        }
        return afterStr;
    }

    /**
     * ����ĸ��Сд
     *
     * @param str
     * @return
     */
    public static String downFristChar(String str) {
        if (str == null) {
            return str;
        }
        StringBuffer sb = new StringBuffer();
        char a = Character.toLowerCase(str.charAt(0));
        sb.append(a);
        sb.append(str.substring(1));
        return sb.toString();
    }

    /**
     * �������Ҫ�Ľ���Ҫ��Ȼ��ӳ�����ͺܲ����
     *
     * @param requestURI
     * @return
     */
    public static String paser(String requestURI) {

        if (requestURI == null) {
            return null;
        }

        int i = requestURI.indexOf(".");
        String paserStr = requestURI.substring(0, i);

        return paserStr;
    }

    /**
     * ���ַ���Ŀǰֻ֧��
     * �õ����������
     *
     * @param paserStr
     * @return
     */
    public static String getWant(String paserStr) {
        String result = null;
        if (paserStr == null) {
            return result;
        }
        // ���ܻ���/myTest
        // Ҳ������/project/myTest
        int j = paserStr.indexOf("/");
        result = paserStr.substring(j + 1);
        return result;
    }

    public static String getRealBean(String requestURI) {
        // �ص�.my�ĺ�׺
        String leftStr = paser(requestURI);
        // ȡ����Ҫ�ֶ�
        String middleStr = getWant(leftStr);
        // ��д��ת���շ�淶
        String finalStr = urlMapping(middleStr);
        return finalStr;
    }

    public static String getTemplateView(String requestURI) {
        // �ص�.my�ĺ�׺
        String leftStr = paser(requestURI);
        // ȡ����Ҫ�ֶ�
        String middleStr = getWant(leftStr);
        // ��д��ת���շ�淶
        String finalStr = TemplateViewMapping(middleStr);
        return finalStr;
    }

    /**
     * �õ�ģ��view
     *
     * @param obj
     * @return
     */
    public static String getControllerName(Object obj) {
        String name = obj.getClass().getSimpleName();
        return convert2Small(name) + ".vm";
    }

    /**
     * ����ĸ���Сд
     *
     * @param str
     * @return
     */
    public static String convert2Small(String str) {
        /*StringBuffer sb = new StringBuffer();
        for (int i=0; i<str.length(); i++) {
        char n = Character.toLowerCase(str.charAt(i));
        sb.append(n);
        }
        return sb.toString();*/
        return downFristChar(str);
    }


    private static String TemplateViewMapping(String str) {
        String afterStr = null;
        if (str == null) {
            return afterStr;
        // ����Ҫthrow
        }
        if (str.indexOf("/") > 0) {
            String[] split = str.split("/");
            // ȫ�����Сд
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < split.length; i++) {
            	sb.append(downFristChar(split[i]));
                sb.append("/");
            }
            afterStr = sb.toString();
            // ȥ���ռ������/��
            int m = afterStr.lastIndexOf("/");
            afterStr = afterStr.substring(0, m);
            // ��д���
            int j = afterStr.lastIndexOf("/");
            String needTop = afterStr.substring(0, j);
            String needdownStr = downFristChar(afterStr.substring(j + 1));

            afterStr = needTop + "/" + needdownStr;

        } else {
            // ֱ�ӹ淶
            afterStr = downFristChar(str);
        }
        return afterStr;
    }

    public static void main(String[] args) {
        String a = "/test/test/test/bcD.my";
        // System.out.println(paser(a));
        // System.out.println(getWant(paser(a)));
        //System.out.println(getTemplateView(a));
       // System.out.println(downFristChar("A abc"));
        
        System.out.println(urlMapping(a));
        
    }
}
