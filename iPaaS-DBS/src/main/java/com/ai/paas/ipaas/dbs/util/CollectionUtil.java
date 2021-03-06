package com.ai.paas.ipaas.dbs.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CollectionUtil {
    
    @SuppressWarnings("rawtypes")
	public static boolean isEmpty(Collection collection) {
        if (null == collection) {
            return true;
        } else {
            return collection.isEmpty();
        }
    }
    
    public static boolean isEmpty(Object[] objects){
        return (objects==null || objects.length==0)?true:false;
    }
    
    /**
     * 数组转换为List
     * @param arr
     * @return
     */
    @SuppressWarnings("rawtypes")
	public static List arrayToList(Object[] arr) { 
            List list = new ArrayList(); 
            if (arr == null) return list; 
            list = Arrays.asList(arr); 
            return list; 
    }

}
