package com.jmeter.boot.util;

import com.jmeter.boot.exceptions.ServiceException;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 提供常用操作
 */
public class Util
{
    
    /**
     * 行分隔符
     */
    public static final String LINE_SEP = System.getProperty("line.separator");
    
    /**
     * 文件分隔符
     */
    public static final String FILE_SEP = System.getProperty("file.separator");
    
    /**
     * 防止外部实例化该类
     */
    private Util()
    {
    }
    
    /**
     * 给字符串去掉空格
     *
     * @param arg 传入的字符串
     * @return String 处理后的字符串
     */
    public static String trim(String arg)
    {
        if (null == arg)
        {
            return "";
        }
        else
        {
            return arg.trim();
        }
    }
    
    /**
     * 删除字符串两端的空格，如果字符串为空串则返回指定的缺省值
     *
     * @param arg 指定的字符串
     * @param def 指定的缺省值
     * @return 处理后的字符串
     */
    public static String trim(String arg, String def)
    {
        if (isEmpty(arg))
        {
            return def;
        }
        else
        {
            return arg.trim();
        }
    }
    
    /**
     * 检查字符串是否为空，字符串为null，或者长度为0都认为为空
     *
     * @param str 传入的字符串
     * @return boolean 是否为空
     */
    public static boolean isEmpty(String str)
    {
        if (null == str)
        {
            return true;
        }
        
        if (0 == str.trim().length())
        {
            return true;
        }
        
        return false;
    }
    
    /**
     * 是否非空
     *
     * @author yangrui
     * @param str 待判断的字符串
     * @return 非空返回true，否则返回false
     */
    public static boolean isNotEmpty(String str)
    {
        return !isEmpty(str);
    }
    
    /**
     * 判断指定的对象是否为空
     *
     * @param obj 传入的对象
     * @return boolean 是否为空
     */
    public static boolean isNull(Object obj)
    {
        if (null == obj)
        {
            return true;
        }
        return false;
    }
    
    /**
     * 判断指定的对象是否非空
     *
     * @author yangrui
     * @param obj 指定的对象
     * @return 非空返回true，否则返回false
     */
    public static boolean isNotNull(Object obj)
    {
        return !isNull(obj);
    }
    
    /**
     * 判断指定的对象是否为空
     *
     * @param map 传入的Map对象
     * @return boolean 是否为空
     */
    public static boolean isEmpty(Map<?, ?> map)
    {
        if ((null == map) || (map.isEmpty()))
        {
            return true;
        }
        
        return false;
    }
    
    /**
     * 判断指定的对象是否非空
     *
     * @author l65566
     * @param map 指定的对象
     * @return 指定的对象为空返回true，否则返回false
     */
    public static boolean isNotEmpty(Map<?, ?> map)
    {
        return !isEmpty(map);
    }
    
    /**
     * 判断指定的字符串数组是否为空或长度为0
     *
     * @param strArr 字符串数组
     * @return boolean 是否为空或长度为0
     */
    public static boolean isEmpty(String[] strArr)
    {
        if ((null == strArr) || (strArr.length < 1))
        {
            return true;
        }
        return false;
    }
    
    /**
     *
     * 判断指定的字符串数组是否非空
     *
     * @param strArr 字符串数组
     * @return 是否非空
     */
    public static boolean isNotEmpty(String[] strArr)
    {
        return !isEmpty(strArr);
    }
    
    /**
     * 判断指定的对象数组是否为空
     *
     * @param objArr 对象数组
     * @return boolean 是否为空
     */
    public static boolean isEmpty(Object[] objArr)
    {
        if ((null == objArr) || (objArr.length < 1))
        {
            return true;
        }
        return false;
    }
    
    /**
     *
     * 判断指定的对象数组是否非空
     *
     * @param objArr 对象数组
     * @return boolean 是否为空
     */
    public static boolean isNotEmpty(Object[] objArr)
    {
        return !isEmpty(objArr);
    }
    
    /**
     * 判断指定的对象列表是否为空
     *
     * @param lst 指定的对象列表
     * @return boolean 是否为空
     */
    public static boolean isEmpty(List<?> lst)
    {
        if ((null == lst) || (lst.isEmpty()))
        {
            return true;
        }
        return false;
    }
    
    /**
     * 判断指定的对象列表是否非空
     *
     * @param lst 指定的对象列表
     * @return boolean 是否非空
     */
    public static boolean isNotEmpty(List<?> lst)
    {
        return !isEmpty(lst);
    }
    
    /**
     * 判断指定对象集合是否为空
     *
     * @param set 指定对象集合
     * @return boolean 是否为空
     */
    public static boolean isEmpty(Set<?> set)
    {
        if ((null == set) || (set.isEmpty()))
        {
            return true;
        }
        return false;
    }
    
    /**
     * 判断指定对象集合是否非空
     *
     * @param set 指定对象集合
     * @return boolean 是否非空
     */
    public static boolean isNotEmpty(Set<?> set)
    {
        return !isEmpty(set);
    }
    
    /**
     *
     * 判断两个字符串内容是否相同
     *
     * @author yangrui
     * @param str1 字符串1
     * @param str2 字符串2
     * @return boolean 是否相同
     */
    public static boolean isEquals(String str1, String str2)
    {
        if (isNotEmpty(str1) && isNotEmpty(str2) && str1.equals(str2))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    /**
     * 校验字符串的非空性，若通过返回其trim结果
     * 
     * @param str 要校验的字符串
     * @param exceptionKey 报错
     * @return 结果
     */
    public static String assertNotEmpty(String exceptionKey, String str) throws ServiceException
    {
        String s = trim(str);
        if (s == null || s.length() == 0)
        {
            throw new ServiceException(exceptionKey);
        }
        return s;
    }
    
    /**
     * 校验字符串List的非空性_抛出对应提示语异常
     *
     * @param strList
     * @param exceptionKey
     * @return
     */
    public static void assertNotEmpty(String exceptionKey, String... strList) throws ServiceException
    {
        for (String str : strList)
        {
            if (isEmpty(str))
            {
                throw new ServiceException(exceptionKey);
            }
        }
    }
    
    /**
     * 校验对象的非空性_抛出对应提示语异常
     *
     * @param object
     * @param exceptionKey
     * @return
     */
    public static void assertNotEmpty(String exceptionKey, Object object) throws ServiceException
    {
        if (isNull(object))
        {
            throw new ServiceException(exceptionKey);
        }
    }
    
    /**
     * 校验对象List的非空性_抛出对应提示语异常
     *
     * @param objList
     * @param exceptionKey
     * @return
     */
    public static void assertNotEmpty(String exceptionKey, Object... objList) throws ServiceException
    {
        for (Object object : objList)
        {
            if (isNull(object))
            {
                throw new ServiceException(exceptionKey);
            }
        }
    }

}
