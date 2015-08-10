/**
 * Copyright 2013 Joan Zapata
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package zhuxiaohao.com.cn.universaladapter.listview;

import android.content.Context;

import static zhuxiaohao.com.cn.universaladapter.listview.BaseAdapterHelper.get;

/**
 * Abstraction class of a BaseAdapter in which you only need to provide the
 * convert() implementation.<br/>
 * Using the provided BaseAdapterHelper, your code is minimalist.
 * 
 * @param <T>
 *            The type of the items in the list.
 */
public abstract class QuickAdapter<T> extends
		BaseQuickAdapter<T, BaseAdapterHelper>
{

	/**
	 * Create a QuickAdapter.
	 * 
	 * @param context
	 *            The context.
	 * @param layoutResId
	 *            The layout resource id of each item.
	 */
	public QuickAdapter(Context context, int layoutResId)
	{
		super(context, layoutResId);
	}

	/**
	 * Same as QuickAdapter#QuickAdapter(Context,int) but with some
	 * initialization data.
	 * 
	 * @param context
	 *            The context.
	 * @param layoutResId
	 *            The layout resource id of each item.
	 * @param data
	 *            A new list is created out of this one to avoid mutable list
	 */
	public QuickAdapter(Context context, int layoutResId, java.util.List<T> data)
	{
		super(context, layoutResId, data);
	}

	public QuickAdapter(Context context, java.util.ArrayList<T> data,
			MultiItemTypeSupport<T> multiItemSupport)
	{
		super(context, data, multiItemSupport);
	}

	protected BaseAdapterHelper getAdapterHelper(int position,
			android.view.View convertView, android.view.ViewGroup parent)
	{

		if (mMultiItemSupport != null)
		{
			return get(
					context,
					convertView,
					parent,
					mMultiItemSupport.getLayoutId(position, data.get(position)),
					position);
		} else
		{
			return get(context, convertView, parent, layoutResId, position);
		}
	}

}
