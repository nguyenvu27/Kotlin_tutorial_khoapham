package com.example.kotlin_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv.text  = "hahahaha"
        btn.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?) {
//                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                Toast.makeText(this@MainActivity, "haha", Toast.LENGTH_LONG).show()
            }

        })

        chuyenManHinh.setOnClickListener{
            var intent : Intent = Intent(this, Main2Activity::class.java )
            startActivity(intent)
        }


        //*khai bao
//        var a : String = ""
//        val b : String = "haha"
        //var có thể thay đổi giá trị, còn val thì chỉ có 1 giá trị chuyền vào
///////////////////////////////////////////////////////////////////////////////////////////
        //*null
//        var name : String? = "haha"
//          var name : String? = "haha"!!
//        name = null
        //đặt dấu ? ở sau kiểu dữ liệu để đưa hàm về null, đặt dấu !! sau hàm để không thể đưa giá trị về null
///////////////////////////////////////////////////////////////////////////////////////////
//      *if else trong kotlin
//        var a: Int = 100
//        var b: Int = 200
//        if ( a > b ){
//            Log.d("AAA", "Số lớn nhất là"+a )
//        }else{
//            Log.d("AAA", "Số lớn nhất là"+b)
//        }
///////////////////////////////////////////////////////////////////////////////////////////
//        *câu lệnh rẽ nhánh when
//        var a: String = "haha"
//        when (a) {
//            "hihi" -> Log.d("AAA", "Sai rồi")
//            "haha" -> Log.d("AAA", "Chính xác ")
//            "hehe" -> Log.d("AAA", "Sai rồi ")
//        }
//        var a : Int = 15
//        when(a){
////            1,2,3 -> Log.d("AAA", "Quý 1")
////            4,5,6 -> Log.d("AAA", "Quý 2")
////            7,8,9 -> Log.d("AAA", "Quý 3")
////            10,11,12 -> Log.d("AAA", "Quý 4")
//
//            in 1..3 -> Log.d("AAA", "Quý 1")
//            in 4..6 -> Log.d("AAA", "Quý 2")
//            in 7..9 -> Log.d("AAA", "Quý 3")
//            in 10..12 -> Log.d("AAA", "Quý 4")
//
//            else -> Log.d("AAA", "Không có giá trị a nào")
//
//        }
////////////////////////////////////////////////////////////////////////////////////////////
//        *vòng lặp while

//        var a : Int  = 5
//        while(a < 10){
//            Log.d("AAA", "Lặp lần thứ: "+a)
//            a++
//        }
///////////////////////////////////////////////////////////////////////////////////////////
//        *vòng lặp for

//        for(i in 0..10){
//            Log.d("AAA","Lặp đến:"+i)
//        }

//        var a : Int = 5
////        for (i in 0 until a){
////            Log.d("AAA", "Show")
////        }

//        var a : Int = 5
//        for (i in a downTo  0){
//            Log.d("BBB", "Show"+i)
//        }


//        var a: Int = 10
//        for (i in 0..a step 3) {
//            Log.d("BBB", "Show" + i)
//        }
/////////////////////////////////////////////////////////////////////////////////////////////
//        *mảng Array
//        -cách 1:
//        var a : IntArray = intArrayOf(1,2,3,4,5,6,7,8,9,10)
//        a.get(9)

        //-cách 2:
//        var a : List<String> = listOf("haha", "hehe", "hoho")
//        a.get(1)
        //-cách 3:
//        var mangten: ArrayList<String> = ArrayList()
//        thêm phần từ trong mảng
//        mangten.add("haha")
//        mangten.add("hihi")
//        mangten.add("hoho")

//        kiểm tra phần tử trong mảng
//        mangten.size
//        xóa phần tử
//        mangten.remove("haha")
//        mangten.removeAt(3)
//        sửa giá trị trong mảng
//        mangten.set(2, "Bỉn")
//        Log.d("AAA", mangten.size.toString())
//        Log.d("AAA", mangten.get(2))
///////////////////////////////////////////////////////////////////////////////////////////////
//            *Hàm (function)
//        showName("Vũ")
/////////////////////////////////////////////////////////////////////////////////////////////
//        *OOP - Khai báo và gọi class
        var  student : Student = Student()
        student.name = "Nguyễn Vũ"
        student.Address = "Hà Nội"
        student.birth = 20
        Log.d("AAA", student.name + "-" + student.Address + "-" + student.birth)
    }

    fun showName(name: String) {
        Log.d("AAA", "Your name: " + name)
    }
}
