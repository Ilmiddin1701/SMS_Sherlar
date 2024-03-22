package com.example.smssherlar.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.smssherlar.MySharedPreference
import com.example.smssherlar.R
import com.example.smssherlar.adapters.Adapter1
import com.example.smssherlar.databinding.CustomDialog1Binding
import com.example.smssherlar.databinding.FragmentListBinding
import com.example.smssherlar.models.Data1
import com.google.android.material.bottomsheet.BottomSheetDialog

class ListFragment : Fragment() {
    private val binding by lazy { FragmentListBinding.inflate(layoutInflater) }
    lateinit var adapter1: Adapter1

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        MySharedPreference.init(requireActivity())
        val yangilarList = MySharedPreference.yangilarList
        val saqlanganlarList = MySharedPreference.saqlanganlarList
        val sevgiList = MySharedPreference.sevgiList
        val soginchList = MySharedPreference.soginchList
        val tabrikList = MySharedPreference.tabrikList
        val otaOnaList = MySharedPreference.otaOnaList
        val dostlikList = MySharedPreference.dostlikList
        val hazilList = MySharedPreference.hazilList

        binding.apply {
            btnBack.setOnClickListener {
                findNavController().popBackStack()
            }
            when (arguments?.getInt("keyPosition")) {
                1 -> {
                    try {
                        adapter1 = Adapter1(object : Adapter1.RvAction{
                            override fun itemClick(data1: Data1, position: Int) {
                                if (data1.like3 == false){
                                    val dialog1 = BottomSheetDialog(activity!!, R.style.NewDialog)
                                    val customItem = CustomDialog1Binding.inflate(layoutInflater)
                                    customItem.img.setImageResource(R.drawable.ic_delete)
                                    customItem.cardView4.setOnClickListener {
                                        yangilarList.removeAt(position)
                                        MySharedPreference.yangilarList = yangilarList
                                        adapter1.notifyItemRemoved(position)
                                        dialog1.cancel()
                                        Toast.makeText(context, "O'chirildi", Toast.LENGTH_SHORT).show()
                                        findNavController().popBackStack()
                                    }
                                    customItem.tvTitle1.text = data1.tvTitle1
                                    customItem.tvAbout.text = data1.tvAbout
                                    customItem.customLike.setImageResource(R.drawable.ic_like3)
                                    dialog1.setContentView(customItem.root)
                                    dialog1.show()
                                }else{
                                    val dialog1 = BottomSheetDialog(activity!!, R.style.NewDialog)
                                    val customItem = CustomDialog1Binding.inflate(layoutInflater)
                                    customItem.img.setImageResource(R.drawable.ic_delete)
                                    customItem.cardView4.setOnClickListener {
                                        yangilarList.removeAt(position)
                                        MySharedPreference.yangilarList = yangilarList
                                        adapter1.notifyItemRemoved(position)
                                        dialog1.cancel()
                                        Toast.makeText(context, "O'chirildi", Toast.LENGTH_SHORT).show()
                                        findNavController().popBackStack()
                                    }
                                    customItem.tvTitle1.text = data1.tvTitle1
                                    customItem.tvAbout.text = data1.tvAbout
                                    customItem.customLike.setImageResource(R.drawable.ic_like2)
                                    dialog1.setContentView(customItem.root)
                                    dialog1.show()
                                }

                            }
                            override fun likeClick(data1: Data1,position: Int) {
                                if (yangilarList[position].like3 == false){
                                    yangilarList[position].like3 = true
                                    MySharedPreference.yangilarList = yangilarList
                                }else if (yangilarList[position].like3 == true){
                                    yangilarList[position].like3 = false
                                    MySharedPreference.yangilarList = yangilarList
                                }
                            }
                        },MySharedPreference.yangilarList)
                        rv.adapter = adapter1
                    }catch (e:Exception){
                        Toast.makeText(context, "Ro'yxat bo'sh", Toast.LENGTH_SHORT).show()
                    }
                    tvTitle.text = "YANGI\nSHE'RLAR"
                }
                2 -> {
                    try {
                        adapter1 = Adapter1(object : Adapter1.RvAction{
                            override fun itemClick(data1: Data1, position: Int) {
                                if (data1.like3 == false){
                                    val dialog1 = BottomSheetDialog(activity!!, R.style.NewDialog)
                                    val customItem = CustomDialog1Binding.inflate(layoutInflater)
                                    customItem.img.setImageResource(R.drawable.ic_nusxalash)
                                    customItem.tvTitle1.text = data1.tvTitle1
                                    customItem.tvAbout.text = data1.tvAbout
                                    customItem.customLike.setImageResource(R.drawable.ic_like3)
                                    dialog1.setContentView(customItem.root)
                                    dialog1.show()
                                }else{
                                    val dialog1 = BottomSheetDialog(activity!!, R.style.NewDialog)
                                    val customItem = CustomDialog1Binding.inflate(layoutInflater)
                                    customItem.tvTitle1.text = data1.tvTitle1
                                    customItem.tvAbout.text = data1.tvAbout
                                    customItem.customLike.setImageResource(R.drawable.ic_like2)
                                    dialog1.setContentView(customItem.root)
                                    dialog1.show()
                                }
                            }

                            override fun likeClick(data1: Data1,position: Int) {
                                MySharedPreference.init(activity!!)
                                saqlanganlarList.removeAt(position)
                                MySharedPreference.saqlanganlarList = saqlanganlarList
                                adapter1.notifyItemRemoved(position)
                                when (data1.position2) {
                                    1-> {
                                        for (item in sevgiList) {
                                            if (item.position1 == data1.position1) {
                                                item.like3 = false
                                                MySharedPreference.sevgiList = sevgiList
                                                break
                                            }
                                        }
                                    }
                                    2->{
                                        for (item in soginchList) {
                                            if (item.position1 == data1.position1) {
                                                item.like3 = false
                                                MySharedPreference.soginchList = soginchList
                                                break
                                            }
                                        }
                                    }
                                    3->{
                                        for (item in tabrikList) {
                                            if (item.position1 == data1.position1) {
                                                item.like3 = false
                                                MySharedPreference.tabrikList = tabrikList
                                                break
                                            }
                                        }
                                    }
                                    4->{
                                        for (item in otaOnaList) {
                                            if (item.position1 == data1.position1) {
                                                item.like3 = false
                                                MySharedPreference.otaOnaList = otaOnaList
                                                break
                                            }
                                        }
                                    }
                                    5->{
                                        for (item in dostlikList) {
                                            if (item.position1 == data1.position1) {
                                                item.like3 = false
                                                MySharedPreference.dostlikList = dostlikList
                                                break
                                            }
                                        }
                                    }
                                    6->{
                                        for (item in hazilList) {
                                            if (item.position1 == data1.position1) {
                                                item.like3 = false
                                                MySharedPreference.hazilList = hazilList
                                                break
                                            }
                                        }
                                    }
                                }
                                Toast.makeText(context, "Saqlanganlardan olib tashlandi", Toast.LENGTH_SHORT).show()
                                findNavController().popBackStack()
                            }
                        },saqlanganlarList)
                        rv.adapter = adapter1
                    }catch (e:Exception){
                        Toast.makeText(context, "Ro'yxat bo'sh", Toast.LENGTH_SHORT).show()
                    }
                        tvTitle.text = "SAQLANGAN\nSHE'RLAR"
                }
                3 -> {
                    adapter1 = Adapter1(object : Adapter1.RvAction{
                        override fun itemClick(data1: Data1, position: Int) {
                            if (data1.like3 == false){
                                val dialog1 = BottomSheetDialog(activity!!, R.style.NewDialog)
                                val customItem = CustomDialog1Binding.inflate(layoutInflater)
                                customItem.tvTitle1.text = data1.tvTitle1
                                customItem.tvAbout.text = data1.tvAbout
                                customItem.customLike.setImageResource(R.drawable.ic_like3)
                                dialog1.setContentView(customItem.root)
                                dialog1.show()
                            }else{
                                val dialog1 = BottomSheetDialog(activity!!, R.style.NewDialog)
                                val customItem = CustomDialog1Binding.inflate(layoutInflater)
                                customItem.tvTitle1.text = data1.tvTitle1
                                customItem.tvAbout.text = data1.tvAbout
                                customItem.customLike.setImageResource(R.drawable.ic_like2)
                                dialog1.setContentView(customItem.root)
                                dialog1.show()
                            }
                        }
                        override fun likeClick(data1: Data1,position: Int) {
                            MySharedPreference.init(activity!!)
                            if (MySharedPreference.sevgiList[position].like3 == false){
                                sevgiList[position].like3 = true
                                MySharedPreference.sevgiList = sevgiList
                                val data3 = Data1(
                                    sevgiList[position].tvTitle1,
                                    sevgiList[position].like3,
                                    sevgiList[position].tvAbout,
                                    sevgiList[position].position1,
                                    sevgiList[position].position2
                                )
                                saqlanganlarList.add(data3)
                                MySharedPreference.saqlanganlarList = saqlanganlarList
                            }else{
                                MySharedPreference.init(activity!!)
                                sevgiList[position].like3 = false
                                MySharedPreference.sevgiList = sevgiList
                                val iterator = saqlanganlarList.iterator()
                                while (iterator.hasNext()) {
                                    val item = iterator.next()
                                    if (item.position1 == MySharedPreference.sevgiList[position].position1) {
                                        iterator.remove()
                                        MySharedPreference.saqlanganlarList = saqlanganlarList
                                    }
                                }
                            }
                        }
                    },MySharedPreference.sevgiList)
                    rv.adapter = adapter1
                    tvTitle.text = "SEVGI\nSHE'RLARI"
                }

                4 -> {
                    adapter1 = Adapter1(object : Adapter1.RvAction{
                        override fun itemClick(data1: Data1, position: Int) {
                            if (data1.like3 == false){
                                val dialog1 = BottomSheetDialog(activity!!, R.style.NewDialog)
                                val customItem = CustomDialog1Binding.inflate(layoutInflater)
                                customItem.tvTitle1.text = data1.tvTitle1
                                customItem.tvAbout.text = data1.tvAbout
                                customItem.customLike.setImageResource(R.drawable.ic_like3)
                                dialog1.setContentView(customItem.root)
                                dialog1.show()
                            }else{
                                val dialog1 = BottomSheetDialog(activity!!, R.style.NewDialog)
                                val customItem = CustomDialog1Binding.inflate(layoutInflater)
                                customItem.tvTitle1.text = data1.tvTitle1
                                customItem.tvAbout.text = data1.tvAbout
                                customItem.customLike.setImageResource(R.drawable.ic_like2)
                                dialog1.setContentView(customItem.root)
                                dialog1.show()
                            }
                        }
                        override fun likeClick(data1: Data1,position: Int) {
                            MySharedPreference.init(activity!!)
                            if (soginchList[position].like3 == false){
                                soginchList[position].like3 = true
                                MySharedPreference.soginchList = soginchList
                                val data4 = Data1(
                                    soginchList[position].tvTitle1,
                                    soginchList[position].like3,
                                    soginchList[position].tvAbout,
                                    soginchList[position].position1,
                                    soginchList[position].position2
                                )
                                saqlanganlarList.add(data4)
                                MySharedPreference.saqlanganlarList = saqlanganlarList
                            }else{
                                MySharedPreference.init(activity!!)
                                soginchList[position].like3 = false
                                MySharedPreference.soginchList = soginchList
                                val iterator = saqlanganlarList.iterator()
                                while (iterator.hasNext()) {
                                    val item = iterator.next()
                                    if (item.position1 == MySharedPreference.soginchList[position].position1) {
                                        iterator.remove()
                                        MySharedPreference.saqlanganlarList = saqlanganlarList
                                    }
                                }
                            }
                        }
                    },MySharedPreference.soginchList)
                    rv.adapter = adapter1
                    tvTitle.text = "SOG'INCH\nARMON"
                }
                5 -> {
                    adapter1 = Adapter1(object : Adapter1.RvAction{
                        override fun itemClick(data1: Data1, position: Int) {
                            if (data1.like3 == false){
                                val dialog1 = BottomSheetDialog(activity!!, R.style.NewDialog)
                                val customItem = CustomDialog1Binding.inflate(layoutInflater)
                                customItem.tvTitle1.text = data1.tvTitle1
                                customItem.tvAbout.text = data1.tvAbout
                                customItem.customLike.setImageResource(R.drawable.ic_like3)
                                dialog1.setContentView(customItem.root)
                                dialog1.show()
                            }else{
                                val dialog1 = BottomSheetDialog(activity!!, R.style.NewDialog)
                                val customItem = CustomDialog1Binding.inflate(layoutInflater)
                                customItem.tvTitle1.text = data1.tvTitle1
                                customItem.tvAbout.text = data1.tvAbout
                                customItem.customLike.setImageResource(R.drawable.ic_like2)
                                dialog1.setContentView(customItem.root)
                                dialog1.show()
                            }
                        }
                        override fun likeClick(data1: Data1,position: Int) {
                            MySharedPreference.init(activity!!)
                            if (tabrikList[position].like3 == false){
                                tabrikList[position].like3 = true
                                MySharedPreference.tabrikList = tabrikList
                                val data5 = Data1(
                                    tabrikList[position].tvTitle1,
                                    tabrikList[position].like3,
                                    tabrikList[position].tvAbout,
                                    tabrikList[position].position1,
                                    tabrikList[position].position2
                                )
                                saqlanganlarList.add(data5)
                                MySharedPreference.saqlanganlarList = saqlanganlarList
                            }else{
                                MySharedPreference.init(activity!!)
                                tabrikList[position].like3 = false
                                MySharedPreference.tabrikList = tabrikList
                                val iterator = saqlanganlarList.iterator()
                                while (iterator.hasNext()) {
                                    val item = iterator.next()
                                    if (item.position1 == tabrikList[position].position1) {
                                        iterator.remove()
                                        MySharedPreference.saqlanganlarList = saqlanganlarList
                                    }
                                }
                            }
                        }
                    },MySharedPreference.tabrikList)
                    rv.adapter = adapter1
                    tvTitle.text = "TABRIK\nSHE'RLARI"
                }
                6 -> {
                    adapter1 = Adapter1(object : Adapter1.RvAction{
                        override fun itemClick(data1: Data1, position: Int) {
                            if (data1.like3 == false){
                                val dialog1 = BottomSheetDialog(activity!!, R.style.NewDialog)
                                val customItem = CustomDialog1Binding.inflate(layoutInflater)
                                customItem.tvTitle1.text = data1.tvTitle1
                                customItem.tvAbout.text = data1.tvAbout
                                customItem.customLike.setImageResource(R.drawable.ic_like3)
                                dialog1.setContentView(customItem.root)
                                dialog1.show()
                            }else{
                                val dialog1 = BottomSheetDialog(activity!!, R.style.NewDialog)
                                val customItem = CustomDialog1Binding.inflate(layoutInflater)
                                customItem.tvTitle1.text = data1.tvTitle1
                                customItem.tvAbout.text = data1.tvAbout
                                customItem.customLike.setImageResource(R.drawable.ic_like2)
                                dialog1.setContentView(customItem.root)
                                dialog1.show()
                            }
                        }
                        override fun likeClick(data1: Data1,position: Int) {
                            MySharedPreference.init(activity!!)
                            if (otaOnaList[position].like3 == false){
                                otaOnaList[position].like3 = true
                                MySharedPreference.otaOnaList = otaOnaList
                                val data6 = Data1(
                                    otaOnaList[position].tvTitle1,
                                    otaOnaList[position].like3,
                                    otaOnaList[position].tvAbout,
                                    otaOnaList[position].position1,
                                    otaOnaList[position].position2
                                )
                                saqlanganlarList.add(data6)
                                MySharedPreference.saqlanganlarList = saqlanganlarList
                            }else{
                                MySharedPreference.init(activity!!)
                                otaOnaList[position].like3 = false
                                MySharedPreference.otaOnaList = otaOnaList
                                val iterator = saqlanganlarList.iterator()
                                while (iterator.hasNext()) {
                                    val item = iterator.next()
                                    if (item.position1 == otaOnaList[position].position1) {
                                        iterator.remove()
                                        MySharedPreference.saqlanganlarList = saqlanganlarList
                                    }
                                }
                            }
                        }
                    },MySharedPreference.otaOnaList)
                    rv.adapter = adapter1
                    tvTitle.text = "OTA-ONA\nHAQIDA"
                }
                7 -> {
                    adapter1 = Adapter1(object : Adapter1.RvAction{
                        override fun itemClick(data1: Data1, position: Int) {
                            if (data1.like3 == false){
                                val dialog1 = BottomSheetDialog(activity!!, R.style.NewDialog)
                                val customItem = CustomDialog1Binding.inflate(layoutInflater)
                                customItem.tvTitle1.text = data1.tvTitle1
                                customItem.tvAbout.text = data1.tvAbout
                                customItem.customLike.setImageResource(R.drawable.ic_like3)
                                dialog1.setContentView(customItem.root)
                                dialog1.show()
                            }else{
                                val dialog1 = BottomSheetDialog(activity!!, R.style.NewDialog)
                                val customItem = CustomDialog1Binding.inflate(layoutInflater)
                                customItem.tvTitle1.text = data1.tvTitle1
                                customItem.tvAbout.text = data1.tvAbout
                                customItem.customLike.setImageResource(R.drawable.ic_like2)
                                dialog1.setContentView(customItem.root)
                                dialog1.show()
                            }
                        }
                        override fun likeClick(data1: Data1,position: Int) {
                            MySharedPreference.init(activity!!)
                            if (dostlikList[position].like3 == false){
                                dostlikList[position].like3 = true
                                MySharedPreference.dostlikList = dostlikList
                                val data7 = Data1(
                                    dostlikList[position].tvTitle1,
                                    dostlikList[position].like3,
                                    dostlikList[position].tvAbout,
                                    dostlikList[position].position1,
                                    dostlikList[position].position2
                                )
                                saqlanganlarList.add(data7)
                                MySharedPreference.saqlanganlarList = saqlanganlarList
                            }else{
                                MySharedPreference.init(activity!!)
                                dostlikList[position].like3 = false
                                MySharedPreference.dostlikList = dostlikList
                                val iterator = saqlanganlarList.iterator()
                                while (iterator.hasNext()) {
                                    val item = iterator.next()
                                    if (item.position1 == dostlikList[position].position1) {
                                        iterator.remove()
                                        MySharedPreference.saqlanganlarList = saqlanganlarList
                                    }
                                }
                            }
                        }
                    },MySharedPreference.dostlikList)
                    rv.adapter = adapter1
                    tvTitle.text = "DO'STLIK\nSHE'RLARI"
                }
                8 -> {
                    adapter1 = Adapter1(object : Adapter1.RvAction{
                        override fun itemClick(data1: Data1, position: Int) {
                            if (data1.like3 == false){
                                val dialog1 = BottomSheetDialog(activity!!, R.style.NewDialog)
                                val customItem = CustomDialog1Binding.inflate(layoutInflater)
                                customItem.tvTitle1.text = data1.tvTitle1
                                customItem.tvAbout.text = data1.tvAbout
                                customItem.customLike.setImageResource(R.drawable.ic_like3)
                                dialog1.setContentView(customItem.root)
                                dialog1.show()
                            }else{
                                val dialog1 = BottomSheetDialog(activity!!, R.style.NewDialog)
                                val customItem = CustomDialog1Binding.inflate(layoutInflater)
                                customItem.tvTitle1.text = data1.tvTitle1
                                customItem.tvAbout.text = data1.tvAbout
                                customItem.customLike.setImageResource(R.drawable.ic_like2)
                                dialog1.setContentView(customItem.root)
                                dialog1.show()
                            }
                        }
                        override fun likeClick(data1: Data1,position: Int) {
                            MySharedPreference.init(activity!!)
                            if (hazilList[position].like3 == false){
                                hazilList[position].like3 = true
                                MySharedPreference.hazilList = hazilList
                                val data8 = Data1(
                                    hazilList[position].tvTitle1,
                                    hazilList[position].like3,
                                    hazilList[position].tvAbout,
                                    hazilList[position].position1,
                                    hazilList[position].position2
                                )
                                saqlanganlarList.add(data8)
                                MySharedPreference.saqlanganlarList = saqlanganlarList
                            }else{
                                MySharedPreference.init(activity!!)
                                hazilList[position].like3 = false
                                MySharedPreference.hazilList = hazilList
                                val iterator = saqlanganlarList.iterator()
                                while (iterator.hasNext()) {
                                    val item = iterator.next()
                                    if (item.position1 == hazilList[position].position1) {
                                        iterator.remove()
                                        MySharedPreference.saqlanganlarList = saqlanganlarList
                                    }
                                }
                            }
                        }
                    },MySharedPreference.hazilList)
                    rv.adapter = adapter1
                    tvTitle.text = "Hazil\nSHE'RLAR"
                }
            }
        }

        return binding.root

    }
}