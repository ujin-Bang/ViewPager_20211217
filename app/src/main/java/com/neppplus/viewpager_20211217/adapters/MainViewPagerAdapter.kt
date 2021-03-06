package com.neppplus.viewpager_20211217.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.neppplus.viewpager_20211217.fragments.HelloFragment
import com.neppplus.viewpager_20211217.fragments.IntroduceFragment
import com.neppplus.viewpager_20211217.fragments.NameFragment

class MainViewPagerAdapter(fm: FragmentManager): FragmentPagerAdapter(fm) {
    override fun getCount(): Int {
        return 3

    }

    override fun getItem(position: Int): Fragment {
        if(position == 0) {
            return HelloFragment()
        }
        else if(position == 1){
            return NameFragment()
        }
        else{
            return IntroduceFragment()
        }

    }

    override fun getPageTitle(position: Int): CharSequence? {

        return when(position){

            0->"인사"
            1->"이름"
            else -> "소개"
        }
    }
}