package com.app40.listview_20220116

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.app40.listview_20220116.datas.StudentData

class MainActivity : AppCompatActivity() {

    val mStudentList = ArrayList<StudentData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mStudentList.add( StudentData("조경진",1988,"서울시 동대문구"))
        mStudentList.add( StudentData("고재천",1988,"서울시 동대문구"))
        mStudentList.add( StudentData("방우진",1983,"서울시 동대문구"))
        mStudentList.add( StudentData("서정민",1984,"서울시 동대문구"))
        mStudentList.add( StudentData("고재천",1988,"서울시 동대문구"))
        mStudentList.add( StudentData("고재천",1988,"서울시 동대문구"))
        mStudentList.add( StudentData("고재천",1988,"서울시 동대문구"))
        mStudentList.add( StudentData("고재천",1988,"서울시 동대문구"))
        mStudentList.add( StudentData("고재천",1988,"서울시 동대문구"))
        mStudentList.add( StudentData("고재천",1988,"서울시 동대문구"))
    }
}