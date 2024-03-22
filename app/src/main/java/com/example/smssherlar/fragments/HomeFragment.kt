package com.example.smssherlar.fragments

import android.app.AlertDialog
import android.os.Bundle
import android.text.style.ClickableSpan
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import com.example.smssherlar.MySharedPreference
import com.example.smssherlar.R
import com.example.smssherlar.databinding.CustomDialog2Binding
import com.example.smssherlar.databinding.FragmentHomeBinding
import com.example.smssherlar.models.Data1

class HomeFragment : Fragment() {
    private val binding by lazy { FragmentHomeBinding.inflate(layoutInflater) }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding.apply {
            btnNew.setOnClickListener {
                MySharedPreference.init(requireContext())
                val yangilarList = MySharedPreference.yangilarList
                val dialog = AlertDialog.Builder(context, R.style.NewDialog).create()
                val customItem = CustomDialog2Binding.inflate(layoutInflater)
                customItem.btnSave.setOnClickListener {
                    val data1 = Data1(
                        customItem.edtSherNomi.text.toString(),
                        false,
                        customItem.edtSherMatni.text.toString(),
                        position2 = 0
                    )
                    if (customItem.edtSherNomi.text.isNotEmpty() && customItem.edtSherMatni.text.isNotEmpty()){
                        yangilarList.add(data1)
                        MySharedPreference.yangilarList = yangilarList
                        dialog.cancel()

                        val navOption = NavOptions.Builder()
                        navOption.setEnterAnim(R.anim.anim_1)
                        navOption.setExitAnim(R.anim.anim_2)
                        navOption.setPopEnterAnim(R.anim.anim_1)
                        navOption.setPopExitAnim(R.anim.anim_2)

                        findNavController().navigate(R.id.listFragment,bundleOf("keyPosition" to 1),navOption.build())
                    }
                }
                dialog.setView(customItem.root)
                dialog.show()
            }

            card1.setOnClickListener {
                val navOption = NavOptions.Builder()
                navOption.setEnterAnim(R.anim.anim_1)
                navOption.setExitAnim(R.anim.anim_2)
                navOption.setPopEnterAnim(R.anim.anim_1)
                navOption.setPopExitAnim(R.anim.anim_2)

                findNavController().navigate(
                    R.id.listFragment,
                    bundleOf("keyPosition" to 1),
                    navOption.build()
                )
            }
            card2.setOnClickListener {
                val navOption = NavOptions.Builder()
                navOption.setEnterAnim(R.anim.anim_1)
                navOption.setExitAnim(R.anim.anim_2)
                navOption.setPopEnterAnim(R.anim.anim_1)
                navOption.setPopExitAnim(R.anim.anim_2)

                findNavController().navigate(
                    R.id.listFragment,
                    bundleOf("keyPosition" to 2),
                    navOption.build()
                )
            }
            btnLike.setOnClickListener {
                val navOption = NavOptions.Builder()
                navOption.setEnterAnim(R.anim.anim_1)
                navOption.setExitAnim(R.anim.anim_2)
                navOption.setPopEnterAnim(R.anim.anim_1)
                navOption.setPopExitAnim(R.anim.anim_2)

                findNavController().navigate(
                    R.id.listFragment,
                    bundleOf("keyPosition" to 2),
                    navOption.build()
                )
            }
            card3.setOnClickListener {
                val navOption = NavOptions.Builder()
                navOption.setEnterAnim(R.anim.anim_1)
                navOption.setExitAnim(R.anim.anim_2)
                navOption.setPopEnterAnim(R.anim.anim_1)
                navOption.setPopExitAnim(R.anim.anim_2)

                findNavController().navigate(
                    R.id.listFragment,
                    bundleOf("keyPosition" to 3),
                    navOption.build()
                )
            }
            card4.setOnClickListener {
                val navOption = NavOptions.Builder()
                navOption.setEnterAnim(R.anim.anim_1)
                navOption.setExitAnim(R.anim.anim_2)
                navOption.setPopEnterAnim(R.anim.anim_1)
                navOption.setPopExitAnim(R.anim.anim_2)

                findNavController().navigate(
                    R.id.listFragment,
                    bundleOf("keyPosition" to 4),
                    navOption.build()
                )
            }
            card5.setOnClickListener {
                val navOption = NavOptions.Builder()
                navOption.setEnterAnim(R.anim.anim_1)
                navOption.setExitAnim(R.anim.anim_2)
                navOption.setPopEnterAnim(R.anim.anim_1)
                navOption.setPopExitAnim(R.anim.anim_2)

                findNavController().navigate(
                    R.id.listFragment,
                    bundleOf("keyPosition" to 5),
                    navOption.build()
                )
            }
            card6.setOnClickListener {
                val navOption = NavOptions.Builder()
                navOption.setEnterAnim(R.anim.anim_1)
                navOption.setExitAnim(R.anim.anim_2)
                navOption.setPopEnterAnim(R.anim.anim_1)
                navOption.setPopExitAnim(R.anim.anim_2)

                findNavController().navigate(
                    R.id.listFragment,
                    bundleOf("keyPosition" to 6),
                    navOption.build()
                )
            }
            card7.setOnClickListener {
                val navOption = NavOptions.Builder()
                navOption.setEnterAnim(R.anim.anim_1)
                navOption.setExitAnim(R.anim.anim_2)
                navOption.setPopEnterAnim(R.anim.anim_1)
                navOption.setPopExitAnim(R.anim.anim_2)

                findNavController().navigate(
                    R.id.listFragment,
                    bundleOf("keyPosition" to 7),
                    navOption.build()
                )
            }
            card8.setOnClickListener {
                val navOption = NavOptions.Builder()
                navOption.setEnterAnim(R.anim.anim_1)
                navOption.setExitAnim(R.anim.anim_2)
                navOption.setPopEnterAnim(R.anim.anim_1)
                navOption.setPopExitAnim(R.anim.anim_2)

                findNavController().navigate(
                    R.id.listFragment,
                    bundleOf("keyPosition" to 8),
                    navOption.build()
                )
            }
            try {
                MySharedPreference.init(requireActivity())
                binding.yCounter.text = MySharedPreference.yangilarList.size.toString()
                binding.sCounter.text = MySharedPreference.saqlanganlarList.size.toString()
            } catch (e: Exception) {
                binding.yCounter.text = "0"
                binding.sCounter.text = "0"
            }

//            appName.setOnClickListener {
                MySharedPreference.init(requireActivity())
//
//                val sevgiList = MySharedPreference.sevgiList
//                sevgiList.add(Data1("Oshiq derlar meni1",false,"Sizni birinchi bor ko'rganimdayoq menga yoqib qolgansiz, lekin bu tuyg'u sevgiga aylanadi deb o'ylamagandim...",1, 1))
//                sevgiList.add(Data1("Oshiq derlar meni2",false,"Ko'zlarin ko'r bo'lsa, ko'rmasdim seni,\nYuragim tosh bo'lsa sevmasdim seni,\nMayli xijron azobi qiynasin meni,\nO'lsam ham baribir sevaman seni!",2,1))
//                sevgiList.add(Data1("Oshiq derlar meni3",false,"Sizni birinchi bor ko'rganimdayoq menga yoqib qolgansiz, lekin bu tuyg'u sevgiga aylanadi deb o'ylamagandim...",3, 1))
//                sevgiList.add(Data1("Oshiq derlar meni4",false,"Ko'zlarin ko'r bo'lsa, ko'rmasdim seni,\nYuragim tosh bo'lsa sevmasdim seni,\nMayli xijron azobi qiynasin meni,\nO'lsam ham baribir sevaman seni!",4,1))
//                sevgiList.add(Data1("Oshiq derlar meni5",false,"Sizni birinchi bor ko'rganimdayoq menga yoqib qolgansiz, lekin bu tuyg'u sevgiga aylanadi deb o'ylamagandim...",5, 1))
//                sevgiList.add(Data1("Oshiq derlar meni6",false,"Ko'zlarin ko'r bo'lsa, ko'rmasdim seni,\nYuragim tosh bo'lsa sevmasdim seni,\nMayli xijron azobi qiynasin meni,\nO'lsam ham baribir sevaman seni!",6,1))
//                MySharedPreference.sevgiList = sevgiList
//
//                val soginchList = MySharedPreference.soginchList
//                soginchList.add(Data1("Oshiq derlar meni1",false,"Sizni birinchi bor ko'rganimdayoq menga yoqib qolgansiz, lekin bu tuyg'u sevgiga aylanadi deb o'ylamagandim...",7,2))
//                soginchList.add(Data1("Oshiq derlar meni2",false,"Ko'zlarin ko'r bo'lsa, ko'rmasdim seni,\nYuragim tosh bo'lsa sevmasdim seni,\nMayli xijron azobi qiynasin meni,\nO'lsam ham baribir sevaman seni!",8,2))
//                soginchList.add(Data1("Oshiq derlar meni3",false,"Sizni birinchi bor ko'rganimdayoq menga yoqib qolgansiz, lekin bu tuyg'u sevgiga aylanadi deb o'ylamagandim...",9,2))
//                soginchList.add(Data1("Oshiq derlar meni4",false,"Ko'zlarin ko'r bo'lsa, ko'rmasdim seni,\nYuragim tosh bo'lsa sevmasdim seni,\nMayli xijron azobi qiynasin meni,\nO'lsam ham baribir sevaman seni!",10,2))
//                soginchList.add(Data1("Oshiq derlar meni5",false,"Sizni birinchi bor ko'rganimdayoq menga yoqib qolgansiz, lekin bu tuyg'u sevgiga aylanadi deb o'ylamagandim...",11,2))
//                soginchList.add(Data1("Oshiq derlar meni6",false,"Ko'zlarin ko'r bo'lsa, ko'rmasdim seni,\nYuragim tosh bo'lsa sevmasdim seni,\nMayli xijron azobi qiynasin meni,\nO'lsam ham baribir sevaman seni!",12,2))
//                MySharedPreference.soginchList = soginchList
//
//                val tabrikList = MySharedPreference.tabrikList
//                tabrikList.add(Data1("Oshiq derlar meni1",false,"Sizni birinchi bor ko'rganimdayoq menga yoqib qolgansiz, lekin bu tuyg'u sevgiga aylanadi deb o'ylamagandim...",13,3))
//                tabrikList.add(Data1("Oshiq derlar meni2",false,"Ko'zlarin ko'r bo'lsa, ko'rmasdim seni,\nYuragim tosh bo'lsa sevmasdim seni,\nMayli xijron azobi qiynasin meni,\nO'lsam ham baribir sevaman seni!",14,3))
//                tabrikList.add(Data1("Oshiq derlar meni3",false,"Sizni birinchi bor ko'rganimdayoq menga yoqib qolgansiz, lekin bu tuyg'u sevgiga aylanadi deb o'ylamagandim...",15,3))
//                tabrikList.add(Data1("Oshiq derlar meni4",false,"Ko'zlarin ko'r bo'lsa, ko'rmasdim seni,\nYuragim tosh bo'lsa sevmasdim seni,\nMayli xijron azobi qiynasin meni,\nO'lsam ham baribir sevaman seni!",16,3))
//                tabrikList.add(Data1("Oshiq derlar meni5",false,"Sizni birinchi bor ko'rganimdayoq menga yoqib qolgansiz, lekin bu tuyg'u sevgiga aylanadi deb o'ylamagandim...",17,3))
//                tabrikList.add(Data1("Oshiq derlar meni6",false,"Ko'zlarin ko'r bo'lsa, ko'rmasdim seni,\nYuragim tosh bo'lsa sevmasdim seni,\nMayli xijron azobi qiynasin meni,\nO'lsam ham baribir sevaman seni!",18,3))
//                MySharedPreference.tabrikList = tabrikList
//
//                val otaOnaList = MySharedPreference.otaOnaList
//                otaOnaList.add(Data1("Oshiq derlar meni1",false,"Sizni birinchi bor ko'rganimdayoq menga yoqib qolgansiz, lekin bu tuyg'u sevgiga aylanadi deb o'ylamagandim...",19,4))
//                otaOnaList.add(Data1("Oshiq derlar meni2",false,"Ko'zlarin ko'r bo'lsa, ko'rmasdim seni,\nYuragim tosh bo'lsa sevmasdim seni,\nMayli xijron azobi qiynasin meni,\nO'lsam ham baribir sevaman seni!",20,4))
//                otaOnaList.add(Data1("Oshiq derlar meni3",false,"Sizni birinchi bor ko'rganimdayoq menga yoqib qolgansiz, lekin bu tuyg'u sevgiga aylanadi deb o'ylamagandim...",21,4))
//                otaOnaList.add(Data1("Oshiq derlar meni4",false,"Ko'zlarin ko'r bo'lsa, ko'rmasdim seni,\nYuragim tosh bo'lsa sevmasdim seni,\nMayli xijron azobi qiynasin meni,\nO'lsam ham baribir sevaman seni!",22,4))
//                otaOnaList.add(Data1("Oshiq derlar meni5",false,"Sizni birinchi bor ko'rganimdayoq menga yoqib qolgansiz, lekin bu tuyg'u sevgiga aylanadi deb o'ylamagandim...",23,4))
//                otaOnaList.add(Data1("Oshiq derlar meni6",false,"Ko'zlarin ko'r bo'lsa, ko'rmasdim seni,\nYuragim tosh bo'lsa sevmasdim seni,\nMayli xijron azobi qiynasin meni,\nO'lsam ham baribir sevaman seni!",24,4))
//                MySharedPreference.otaOnaList = otaOnaList
//
//                val dostlikList = MySharedPreference.dostlikList
//                dostlikList.add(Data1("Oshiq derlar meni1",false,"Sizni birinchi bor ko'rganimdayoq menga yoqib qolgansiz, lekin bu tuyg'u sevgiga aylanadi deb o'ylamagandim...",25,5))
//                dostlikList.add(Data1("Oshiq derlar meni2",false,"Ko'zlarin ko'r bo'lsa, ko'rmasdim seni,\nYuragim tosh bo'lsa sevmasdim seni,\nMayli xijron azobi qiynasin meni,\nO'lsam ham baribir sevaman seni!",26,5))
//                dostlikList.add(Data1("Oshiq derlar meni3",false,"Sizni birinchi bor ko'rganimdayoq menga yoqib qolgansiz, lekin bu tuyg'u sevgiga aylanadi deb o'ylamagandim...",27,5))
//                dostlikList.add(Data1("Oshiq derlar meni4",false,"Ko'zlarin ko'r bo'lsa, ko'rmasdim seni,\nYuragim tosh bo'lsa sevmasdim seni,\nMayli xijron azobi qiynasin meni,\nO'lsam ham baribir sevaman seni!",28,5))
//                dostlikList.add(Data1("Oshiq derlar meni5",false,"Sizni birinchi bor ko'rganimdayoq menga yoqib qolgansiz, lekin bu tuyg'u sevgiga aylanadi deb o'ylamagandim...",29,5))
//                dostlikList.add(Data1("Oshiq derlar meni6",false,"Ko'zlarin ko'r bo'lsa, ko'rmasdim seni,\nYuragim tosh bo'lsa sevmasdim seni,\nMayli xijron azobi qiynasin meni,\nO'lsam ham baribir sevaman seni!",30,5))
//                MySharedPreference.dostlikList = dostlikList
//
//                val hazilList = MySharedPreference.hazilList
//                hazilList.add(Data1("Oshiq derlar meni1",false,"Sizni birinchi bor ko'rganimdayoq menga yoqib qolgansiz, lekin bu tuyg'u sevgiga aylanadi deb o'ylamagandim...",31,6))
//                hazilList.add(Data1("Oshiq derlar meni2",false,"Ko'zlarin ko'r bo'lsa, ko'rmasdim seni,\nYuragim tosh bo'lsa sevmasdim seni,\nMayli xijron azobi qiynasin meni,\nO'lsam ham baribir sevaman seni!",32,6))
//                hazilList.add(Data1("Oshiq derlar meni3",false,"Sizni birinchi bor ko'rganimdayoq menga yoqib qolgansiz, lekin bu tuyg'u sevgiga aylanadi deb o'ylamagandim...",33,6))
//                hazilList.add(Data1("Oshiq derlar meni4",false,"Ko'zlarin ko'r bo'lsa, ko'rmasdim seni,\nYuragim tosh bo'lsa sevmasdim seni,\nMayli xijron azobi qiynasin meni,\nO'lsam ham baribir sevaman seni!",34,6))
//                hazilList.add(Data1("Oshiq derlar meni5",false,"Sizni birinchi bor ko'rganimdayoq menga yoqib qolgansiz, lekin bu tuyg'u sevgiga aylanadi deb o'ylamagandim...",35,6))
//                hazilList.add(Data1("Oshiq derlar meni6",false,"Ko'zlarin ko'r bo'lsa, ko'rmasdim seni,\nYuragim tosh bo'lsa sevmasdim seni,\nMayli xijron azobi qiynasin meni,\nO'lsam ham baribir sevaman seni!",36,6))
//                MySharedPreference.hazilList = hazilList
//
//            }
        }

        return binding.root
    }
}