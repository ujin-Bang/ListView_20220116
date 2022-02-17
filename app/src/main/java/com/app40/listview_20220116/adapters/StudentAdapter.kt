package com.app40.listview_20220116.adapters

import android.content.Context
import android.inputmethodservice.Keyboard
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.app40.listview_20220116.R
import com.app40.listview_20220116.datas.StudentData

class StudentAdapter(
    val mContext: Context,
    val resId: Int,
    val mList: ArrayList<StudentData>
): ArrayAdapter<StudentData>( mContext,resId,mList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView
        if( tempRow == null) {
            tempRow = LayoutInflater.from(mContext).inflate(R.layout.student_list_item, null)

        }
        val row = tempRow!!

        val data = mList[position]

        val txtStudentName = row.findViewById<TextView>(R.id.txtStudentName)
        val txtAge = row.findViewById<TextView>(R.id.txtAge)
        val txtAddress = row.findViewById<TextView>(R.id.txtAddress)

        txtStudentName.text = data.name
        txtAddress.text = data.address
        

        txtAge.text = "(${data.getKoreanAge(2022)}세)"

        return row

    }
}