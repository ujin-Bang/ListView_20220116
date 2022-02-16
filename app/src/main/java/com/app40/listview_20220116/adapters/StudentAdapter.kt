package com.app40.listview_20220116.adapters

import android.content.Context
import android.widget.ArrayAdapter
import com.app40.listview_20220116.datas.StudentData

class StudentAdapter(
    val mContext: Context,
    val resId: Int,
    val mList: ArrayList<StudentData>
): ArrayAdapter<StudentData>( mContext,resId,mList) {
}