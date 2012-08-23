/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.taobao.innovation.mywebx.web.multipart;

import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author Lee Ye
 */
public interface MultipartRequest {

    	/**
	 * Return an {@link java.util.Iterator} of String objects containing the
	 * parameter names of the multipart files contained in this request. These
	 * are the field names of the form (like with normal parameters), not the
	 * original file names.
	 * @return the names of the files
	 */
	Iterator getFileNames();

	/**
	 * Return the contents plus description of an uploaded file in this request,
	 * or <code>null</code> if it does not exist.
	 * @param name a String specifying the parameter name of the multipart file
	 * @return the uploaded content in the form of a {@link org.springframework.web.multipart.MultipartFile} object
	 */
	MultipartFile getFile(String name);

	/**
	 * Return a {@link java.util.Map} of the multipart files contained in this request.
	 * @return a map containing the parameter names as keys, and the
	 * {@link org.springframework.web.multipart.MultipartFile} objects as values
	 * @see MultipartFile
	 */
	Map getFileMap();

}
