package com.neppplus.jickbangcopy_20220227

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import com.neppplus.jickbangcopy_20220227.adapters.RoomAdapter
import com.neppplus.jickbangcopy_20220227.datas.RoomData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val mRoomList = ArrayList<RoomData>()

    lateinit var mRoomAdapter : RoomAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mRoomList.add( RoomData(8000, "서울시 동대문구", 7, "1번째 방입니다.") )
        mRoomList.add( RoomData(15000, "서울시 동대문구", 1, "2번째 방입니다.") )
        mRoomList.add( RoomData(27000, "서울시 동대문구", -2, "3번째 방입니다.") )
        mRoomList.add( RoomData(6500, "서울시 서대문구", 0, "4번째 방입니다.") )
        mRoomList.add( RoomData(3800, "서울시 서대문구", 8, "5번째 방입니다.") )
        mRoomList.add( RoomData(79000, "서울시 서대문구", 0, "6번째 방입니다.") )
        mRoomList.add( RoomData(16500, "서울시 강남구", -1, "7번째 방입니다.") )
        mRoomList.add( RoomData(21500, "서울시 강남구", 6, "8번째 방입니다.") )
        mRoomList.add( RoomData(153000, "서울시 강북구", 12, "9번째 방입니다.") )
        mRoomList.add( RoomData(125000, "서울시 강북구", 8, "10번째 방입니다.") )

        mRoomAdapter = RoomAdapter(this, R.layout.room_list_item, mRoomList)
        roomListView.adapter = mRoomAdapter

        roomListView.setOnItemClickListener { adapterView, view, position, l ->

            val clickedRoom = mRoomList[position]

            val myIntent = Intent( this, ViewRoomDetailActivity::class.java )
            startActivity(myIntent)

        }

    }
}