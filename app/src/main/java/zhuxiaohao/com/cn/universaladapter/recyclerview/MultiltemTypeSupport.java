package zhuxiaohao.com.cn.universaladapter.recyclerview;

/**
 * Project Name:zhuxiaohao.com.cn.universaladapter.recyclerview
 * File Name: UniversalAdapter
 * Date:15/8/10下午2:4308
 * blog:http://blog.csdn.net/qq718799510?viewmode=contents
 * Copyright (c) 2015, zhuxiaohao All Rights Reserved.
 */
public interface MultiltemTypeSupport<T> {

    int gerLayoutId(int position, T t);

    int getViewTypeCount();

    int getItemViewType(int position, T t);

}
