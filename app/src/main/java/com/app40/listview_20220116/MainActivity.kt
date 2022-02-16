package com.app40.listview_20220116

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.app40.listview_20220116.adapters.StudentAdapter
import com.app40.listview_20220116.datas.StudentData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

//    테스트용 주석입니다
    
//    어댑터를 나중에 대입할 변수
    lateinit var mAdapter: StudentAdapter
    val mStudentList = ArrayList<StudentData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mStudentList.add( StudentData("조경진",1988,"서울시 동대문구"))
        mStudentList.add( StudentData("고재천",1988,"서울시 중랑구"))
        mStudentList.add( StudentData("방우진",1983,"서울시 고양시"))
        mStudentList.add( StudentData("서정민",1984,"서울시 광명시"))
        mStudentList.add( StudentData("이승민",1994,"서울시 안양시"))
        mStudentList.add( StudentData("고재천",1988,"서울시 강서구"))
        mStudentList.add( StudentData("고재천",1988,"서울시 송파구"))
        mStudentList.add( StudentData("고재천",1988,"서울시 동대문구"))
        mStudentList.add( StudentData("고재천",1988,"서울시 동대문구"))
        mStudentList.add( StudentData("고재천",1988,"서울시 동대문구"))

        mAdapter = StudentAdapter(this,R.layout.student_list_item,mStudentList)
        studentListView.adapter = mAdapter

        studentListView.setOnItemClickListener { adapterView, view, position, l ->

            val clickedStudent = mStudentList[position]

            Toast.makeText(this, "${clickedStudent.name}학생 클릭됨", Toast.LENGTH_SHORT).show()

        }

        studentListView.setOnItemLongClickListener { adapterView, view, position, l ->

            val longClickedStudent = mStudentList[position]

           val alert = AlertDialog.Builder(this)
                .setTitle("학생 삭제")
                .setMessage("정말 ${ longClickedStudent.name}학생을 삭제하시겠습니까?")
                .setPositiveButton("확인", DialogInterface.OnClickListener { dialogInterface, i ->

                    mStudentList.remove(longClickedStudent)

                    mAdapter.notifyDataSetChanged()

                })
                .setNegativeButton("취소", null)
                .show()


            return@setOnItemLongClickListener true

        }

    }
}